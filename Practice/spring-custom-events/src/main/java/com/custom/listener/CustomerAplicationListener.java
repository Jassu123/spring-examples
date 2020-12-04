package com.custom.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.custom.events.CustomerEvent;

@Component
public class CustomerAplicationListener {

	@EventListener
	public void handleEvent(CustomerEvent ce) {

		System.out.println("Customer event is handled");

	}

}
