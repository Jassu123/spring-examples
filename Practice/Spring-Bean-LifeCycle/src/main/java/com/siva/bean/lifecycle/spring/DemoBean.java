/**
 * 
 */
package com.siva.bean.lifecycle.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Siva Nadupuru
 *
 */
public class DemoBean
		implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	private String message;

	public DemoBean() {
		System.out.println(" constructor is called");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("set bean name methos is invoked");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) {
		// TODO Auto-generated method stub

		System.out.println("set Bean factory method is called");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		// TODO Auto-generated method stub

		System.out.println("set Application context method is called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("afterPropertiesSet() method is called");

	}

	public void printMessage() {
		System.out.println("print message" + message);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy() is called");
	}

	public void close() {
		System.out.println("Custom destroy methos is called");
	}

	public void setup() {
		System.out.println("Custom init method is called is called");
	}
}
