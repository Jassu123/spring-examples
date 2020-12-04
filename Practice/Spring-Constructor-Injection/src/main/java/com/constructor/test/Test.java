package com.constructor.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.constructor.TestBean;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		                  Object obj= ctx.getBean("testBean");
		                  
		                  TestBean tb=(TestBean)obj;
		                           tb.dispayMessage();

	}

}
