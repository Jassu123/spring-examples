/**
 * 
 */
package com.siva.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.siva.config.AppConfig;

/**
 * @author siva
 *
 */
public class ListenerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(10000);
		} catch(Exception e) {
			
		}
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		try {
			Thread.sleep(10000);
		} catch(Exception e) {
			
		}
		
		ctx.start();
		
		try {
			Thread.sleep(10000);
		} catch(Exception e) {
			
		}
		
		ctx.stop();

	}

}
