/**
 * 
 */
package com.siva.spring.core.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author siva
 *
 */
@Service
public class TripManagement {
	@Value("${trip.source}")
	private String source;

	@Value("${trip.destination}")
	private String destination;

	@Value("${trip.bill}")
	private String bill;

	@Autowired
	private PassangerBean passangerBean;
	@Autowired
	private DriverBean driverBean;

	public void tripCompleted() {
		System.out.println("source :" + source);
		System.out.println("destination :" + destination);
		System.out.println("bill :" + bill);
		System.out.println("Passanger info :" + passangerBean);
		System.out.println("Driver info :" + driverBean);
	}

}
