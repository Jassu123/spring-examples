package com.pack.constructor;

public class TestBean {
	
	
	private String message;
	
	
	
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}



	public TestBean(String message) {
		this.message=message;
	}
	
	
	
	public void dispayMessage() {
		
		System.out.println(message);
	}

}
