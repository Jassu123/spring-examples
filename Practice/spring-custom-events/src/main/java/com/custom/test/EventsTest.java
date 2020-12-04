package com.custom.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.custom.bean.CustomerBean;
import com.custom.config.ApplicationConfig;

public class EventsTest {

	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		CustomerBean cBean = ctx.getBean("customerBean", CustomerBean.class);
		
		cBean.createCustomer();
	
	}

}
