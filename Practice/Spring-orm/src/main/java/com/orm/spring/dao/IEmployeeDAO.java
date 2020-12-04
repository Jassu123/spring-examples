/**
 * 
 */
package com.orm.spring.dao;

import java.util.List;

import com.orm.spring.model.Employee;

/**
 * @author siva
 *
 */
public interface IEmployeeDAO {

	void saveEmployee(Employee emp);

	Employee findEmployee(Integer empno);

	List<Employee> findAll();

	void updateEmployee(Employee emp);
	
	void deleteEmployee(Integer empno);

}
