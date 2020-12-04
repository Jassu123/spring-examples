package com.custom.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.custom.events.CustomerEvent;

@Component
public class CustomerBean {
	
	@Autowired
	 ApplicationEventPublisher publisher;
	
	public void createCustomer() {
		System.out.println("new Customer Event got published");
		
		try {
			Thread.sleep(10000);
		} catch(Exception  e) {
			
		}
		
		publisher.publishEvent(new CustomerEvent(this));
	}

}
