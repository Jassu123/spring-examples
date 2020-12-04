package com.siva.bean.lifecycle.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siva.bean.lifecycle.spring.DemoBean;

public class BeanLifeCycleTest {
	

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansLifeCycle.xml");

		DemoBean obj = context.getBean("demoBean", DemoBean.class);
		obj.printMessage();
		
		context.close();
	}
}
