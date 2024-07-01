package com.edu.test;

import static org.junit.Assert.*;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/**/*.xml"})
public class Spring_JUnitTest {

	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private SqlSessionFactoryBean bean;
	
	@Test
	public void test() {
		BasicDataSource dataSource = context.getBean("dataSource", BasicDataSource.class);
//		SqlSessionFactoryBean factory = context.getBean("sqlSessionFactoryBean", SqlSessionFactoryBean.class);
		SqlSessionTemplate template = context.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
		
		
		assertNotNull(dataSource);
		assertNotNull(bean);
		assertNotNull(template);
	}

}
