package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.demo.DemoBean;

public class Test {
	
	public static void main(String...args) {
		
//		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		
		            Object obj=ctx.getBean("demoBean");
		                                    		
		      		            DemoBean db=(DemoBean)obj;
		                     db.showMessage();
		            
		
	}
	

}
