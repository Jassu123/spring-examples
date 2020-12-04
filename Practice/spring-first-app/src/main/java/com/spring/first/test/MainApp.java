/**
 * 
 */
package com.spring.first.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.first.demo.DemoBean;

public class MainApp {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("BeansConfig.xml");

		DemoBean obj = context.getBean("demoBean", DemoBean.class);
		obj.showMessage();
	}
}
