/**
 * 
 */
package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.model.Customer;

/**
 * @author siva
 *
 */
public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
	public List<Customer> extractResultCustomerData();

}
