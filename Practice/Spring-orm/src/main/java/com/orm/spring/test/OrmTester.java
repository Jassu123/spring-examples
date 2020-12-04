/**
 * 
 */
package com.orm.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.orm.spring.config.AppConfig;
import com.orm.spring.dao.IEmployeeDAO;
import com.orm.spring.model.Employee;

/**
 * @author siva
 *
 */
public class OrmTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		IEmployeeDAO dao = (IEmployeeDAO) context.getBean("employeeDAOImpl");

		dao.saveEmployee(new Employee(222, "XYZ", 50000.0, 20));

		 System.out.println(dao.findAll());
		System.out.println(dao.findEmployee(111));
		 dao.updateEmployee(new Employee(111,"ABC",600000.0,20));

	            dao.deleteEmployee(888);

	}

}
