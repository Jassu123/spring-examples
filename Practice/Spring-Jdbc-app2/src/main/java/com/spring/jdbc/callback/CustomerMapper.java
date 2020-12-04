/**
 * 
 */
package com.spring.jdbc.callback;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.model.Customer;

/**
 * @author siva
 *
 */
public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

		Customer customer = new Customer();
		customer.setCustomerId(rs.getInt(1));
		customer.setCustomerName(rs.getString(2));
		customer.setMobileNumber(rs.getLong(3));
		// TODO Auto-generated method stub
		return customer;
	}

}
