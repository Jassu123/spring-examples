/**
 * 
 */
package com.spring.jdbc.dao;

import java.util.List;
import java.util.Map;

/**
 * @author siva
 *
 */
public interface EmployeeDAO {
	
	void saveEmployee(int empNumber,String empName,double salary, int deptNumber);
	void updateEmployee(int empNumber,double Salary);
	void deleteEmployee(int empNumber);
	Map findByEmployeeId(int empNumber);
	List findEmployeesDept(int deptNumber);

}
