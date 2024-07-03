package com.min.edu.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//CCC의 집합(Advice)
//대상
public class DaoLogAdvice {

	public void before(JoinPoint j) {
		Logger log = LoggerFactory.getLogger(j.getTarget()+"");
		log.info("메소드 시작");
		Object[] args = j.getArgs();
		if(args != null) {
			log.info("메소드 : " + j.getSignature().getName());
			for (int i = 0; i < args.length; i++) {
				log.info(i+"번째 입력 값: " + args[i]);
			}
		}
	}
	
	public void afterReturning(JoinPoint j, Object returnVal) {
		Logger log = LoggerFactory.getLogger(j.getTarget()+"");
		log.info("[Logger 반환 결과] : {}", returnVal);
	}
	
	public void afterThrowing(JoinPoint j, Exception error) {
		Logger log = LoggerFactory.getLogger(j.getTarget()+"");
		log.info("[Logger error] : {}", error);
	}
	
}
