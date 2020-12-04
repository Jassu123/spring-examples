/**
 * 
 */
package com.spring.jdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.config.AppConfig;
import com.spring.jdbc.dao.CustomerDAO;
import com.spring.jdbc.dao.impl.CustomerDAOImpl;
import com.spring.jdbc.model.Customer;

/**
 * @author siva
 *
 */
public class RowMapperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerDAO dao = context.getBean("customerDAOImpl", CustomerDAOImpl.class);
		List<Customer> customerList = dao.getCustomers();
		
		System.out.println("Number of customers:"+customerList.size());
		     customerList.forEach(customer->{
		    	 
		    	 System.out.println("customer id:"+customer.getCustomerId());
		    	 System.out.println("customer name:"+customer.getCustomerName());
		    	 System.out.println("customer mobileNumber:"+customer.getMobileNumber());
		    	 
		    	 System.out.println("===============================================");
		    	
		    	 
		     });
		     List<Customer> customerExtarctList=dao.extractResultCustomerData();
		     
		     customerExtarctList.forEach(custExtarctList->{
		    	 System.out.println("customer extracted ID::"+custExtarctList.getCustomerName());
		     });
		     

	}

}
