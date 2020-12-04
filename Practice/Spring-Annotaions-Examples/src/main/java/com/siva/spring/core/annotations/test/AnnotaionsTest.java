/**
 * 
 */
package com.siva.spring.core.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.siva.spring.core.annotations.beans.TripManagement;
import com.siva.spring.core.annotations.beans.config.AppConfig;

/**
 * @author siva
 *
 */
public class AnnotaionsTest {
	
	public static void main(String...args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		TripManagement tripMgmt=   ctx.getBean("tripManagement",TripManagement.class);
		tripMgmt.tripCompleted();
		                   
	}

}
