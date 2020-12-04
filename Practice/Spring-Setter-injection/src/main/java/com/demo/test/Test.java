package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.setter.DemoBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		                   DemoBean bean=(DemoBean) ctx.getBean("demo");
		                           bean.displayMessage();
		
		

	}

}
