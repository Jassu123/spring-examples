package com.siva.spring.core.annotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PassangerBean {

	@Value("${pass.name}")
	private String passangerName;

	@Value("${pass.email}")
	private String passangerEmail;

	@Value("${pass.mobile}")
	private String passangerMobileNumber;

	@Override
	public String toString() {
		return "PassangerBean [passangerName=" + passangerName + ", passangerEmail=" + passangerEmail
				+ ", passangerMobileNumber=" + passangerMobileNumber + "]";
	}

}
