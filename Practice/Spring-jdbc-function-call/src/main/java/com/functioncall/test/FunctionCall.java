package com.functioncall.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.config.AppConfig;
import com.spring.jdbc.dao.IExampleDAO;
import com.spring.jdbc.dao.impl.ExampleDAOImpl;

public class FunctionCall {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		IExampleDAO dao = ctx.getBean("exampleDAOImpl", ExampleDAOImpl.class);
		            dao.callDBFunction();
		
	}
}
