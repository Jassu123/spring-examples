/**
 * 
 */
package com.siva.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author siva
 *
 */
@Component
public class MyListener2 implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("My Listener2=====================ContextStartedEvent");
		
	}

}
