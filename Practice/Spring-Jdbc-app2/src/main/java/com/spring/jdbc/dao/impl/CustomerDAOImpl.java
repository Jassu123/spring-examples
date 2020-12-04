/**
 * 
 */
package com.spring.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.callback.CustomerDataExtractor;
import com.spring.jdbc.callback.CustomerMapper;
import com.spring.jdbc.dao.CustomerDAO;
import com.spring.jdbc.model.Customer;

/**
 * @author siva
 *
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	JdbcTemplate template;

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return template.query("select * from customers", new CustomerMapper());
	}

	@Override
	public List<Customer> extractResultCustomerData() {
		// TODO Auto-generated method stub
		return template.query("select * from customers", new CustomerDataExtractor());
	}
	
	

}
