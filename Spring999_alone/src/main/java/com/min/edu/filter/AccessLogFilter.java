package com.min.edu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccessLogFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("////////////// 필터 생성  ///////////////");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest)request;
		
		String url = StringUtils.defaultIfEmpty(req.getRequestURL().toString(), "-");
		String queryString = StringUtils.defaultIfEmpty(req.getQueryString(), "-");
		String remoteAddr = StringUtils.defaultIfEmpty(req.getRemoteAddr(), "-");
		
		String userAgent = StringUtils.defaultIfEmpty(req.getHeader("User-Agent"), "-");
		String referer = StringUtils.defaultIfEmpty(req.getHeader("Referer"), "-");
		
		
		StringBuffer bf = new StringBuffer();
		bf.append(url).append("\t")
		.append(queryString).append("\n")
		.append(remoteAddr).append("\n")
		.append(userAgent).append("\n")
		.append(referer);
		
		log.info("[Logger] : {}" ,bf);
		
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		log.info("(●'◡'●)(●'◡'●)  필터 소멸  (●'◡'●)(●'◡'●)");
	}

}
