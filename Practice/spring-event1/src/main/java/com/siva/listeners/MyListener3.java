/**
 * 
 */
package com.siva.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * @author siva
 *
 */
@Component
public class MyListener3 implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("MyListener3-===========ContextStoppedEvent");
		
	}
	
	

}
