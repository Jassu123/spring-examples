package com.siva.spring.core.annotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class DriverBean  {
	@Value("${driver.name}")
	private String passangerName;

	@Value("${driver.vehicle.numer}")
	private String passangerEmail;

	@Value("${driver.mobileNo}")
	private String passangerMobileNumber;

	@Override
	public String toString() {
		return "DriverBean [passangerName=" + passangerName + ", passangerEmail=" + passangerEmail
				+ ", passangerMobileNumber=" + passangerMobileNumber + "]";
	}
	
	

}
