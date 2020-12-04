/**
 * 
 */
package com.orm.spring.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orm.spring.dao.IEmployeeDAO;
import com.orm.spring.model.Employee;

/**
 * @author siva
 *
 */
@Repository
@Transactional
public class EmployeeDAOImpl implements IEmployeeDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub

		template.save(emp);

	}

	@Override
	public Employee findEmployee(Integer empno) {
		// TODO Auto-generated method stub

		return template.get(Employee.class, empno);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return template.loadAll(Employee.class);
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		template.update(emp);
	}

	@Override
	public void deleteEmployee(Integer empno) {
		// TODO Auto-generated method stub

		Employee e = template.get(Employee.class, empno);

		if (e != null) {
			template.delete(e);
		}

	}

}
