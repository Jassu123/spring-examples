/**
 * 
 */
package com.siva.lookup.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.siva.lookup.beans.OrderService;
import com.siva.lookup.beans.config.AppConfig;

/**
 * @author siva
 *
 */
public class LookUpTest {

	public static void main(String... strings) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderService ordService = ctx.getBean("ord1", OrderService.class);
		ordService.confirmOrder();
		System.out.println("=============================================================");
		ordService.confirmOrder();
	}

}
