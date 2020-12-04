/**
 * 
 */
package com.spring.jdbc.callback;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.spring.jdbc.model.Customer;

/**
 * @author siva
 *
 */
public class CustomerDataExtractor implements ResultSetExtractor<List<Customer>> {

	@Override
	public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Customer> custist = new ArrayList<Customer>();

		while (rs.next()) {
			Customer customer = new Customer();
			customer.setCustomerId(rs.getInt(1));
			customer.setCustomerName(rs.getString(2));
			customer.setMobileNumber(rs.getLong(3));
			custist.add(customer);
		}
		// TODO Auto-generated method stub
		return custist;
	}

}
