/**
 * 
 */
package com.spring.jdbc.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.dao.EmployeeDAO;

/**
 * @author siva
 *
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	JdbcTemplate template;

	@Override
	public void saveEmployee(int empNumber, String empName, double salary, int deptNumber) {
		// TODO Auto-generated method stub
		template.update("insert into EMPLOYEE_DETAILS  values(?,?,?,?)", empNumber, empName, salary, deptNumber);
	}

	@Override
	public void updateEmployee(int empNumber, double salary) {
		// TODO Auto-generated method stub
		template.update("update EMPLOYEE_DETAILS  set salary=? where EMPID=?", salary, empNumber);

	}

	@Override
	public void deleteEmployee(int empNumber) {
		// TODO Auto-generated method stub
		template.update("delete  from  EMPLOYEE_DETAILS  where EMPID=?", empNumber);
	}

	@Override
	public Map findByEmployeeId(int empNumber) {
		// TODO Auto-generated method stub
		return template.queryForMap("select * from EMPLOYEE_DETAILS where EMPID=?", empNumber);
	}

	@Override
	public List findEmployeesDept(int deptNumber) {
		// TODO Auto-generated method stub
		return template.queryForList("select * from EMPLOYEE_DETAILS where DEPTNUMBER=?", deptNumber);
	}

}
