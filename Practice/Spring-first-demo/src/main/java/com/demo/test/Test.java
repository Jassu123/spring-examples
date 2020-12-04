package com.demo.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.demo.TestBean;

public class Test {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));

		Object object = factory.getBean("testBean");

		TestBean tb = (TestBean) object;// type casting
		tb.display();

	}

}
