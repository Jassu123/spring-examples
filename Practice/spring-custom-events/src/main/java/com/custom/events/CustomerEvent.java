package com.custom.events;

import org.springframework.context.ApplicationEvent;

public class CustomerEvent extends ApplicationEvent {

	public CustomerEvent(Object source) {
		super(source);

	}

}
