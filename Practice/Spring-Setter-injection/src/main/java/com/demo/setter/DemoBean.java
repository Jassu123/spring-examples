package com.demo.setter;

public class DemoBean {
	
	private String message;

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void displayMessage() {
		
		System.out.println("the value of message:::::::: "+message);
	}

}
