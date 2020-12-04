/**
 * 
 */
package com.siva.lookup.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author siva
 *
 */
@Service
@Scope("prototype")
public class PlaceOrder {

	public PlaceOrder() {
		System.out.println("PlaceOrder Object is created");
	}

	public void senOrder() {
		System.out.println("Order placed Successfully");
	}
}
