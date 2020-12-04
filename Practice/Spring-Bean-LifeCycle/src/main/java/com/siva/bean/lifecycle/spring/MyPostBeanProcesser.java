/**
 * 
 */
package com.siva.bean.lifecycle.spring;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author siva
 *
 */
public class MyPostBeanProcesser implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		// TODO Auto-generated method stub

		System.out.println("postProcessBeforeInitialization() is called");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization() is called");
		return bean;
	}

}
