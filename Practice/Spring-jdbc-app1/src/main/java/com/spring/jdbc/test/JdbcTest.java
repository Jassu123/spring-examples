package com.spring.jdbc.test;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.config.AppConfig;
import com.spring.jdbc.dao.EmployeeDAO;
import com.spring.jdbc.dao.impl.EmployeeDAOImpl;

public class JdbcTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeDAO edao = ctx.getBean("employeeDAOImpl", EmployeeDAOImpl.class);
		
//		edao.saveEmployee(104, "Kishore", 10000, 121);
//		
//		System.out.println("new Employee is created");
//
//		System.out.println("================");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}

//		edao.updateEmployee(103, 7500);
//
//		System.out.println("Employee is updated");

	System.out.println("================");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}

//		edao.deleteEmployee(101);
//	System.out.println("Employee is deleted");
//
//		System.out.println("================");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
//		Map empMap = edao.findByEmployeeId(103);

//		System.out.println(empMap);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		
		System.out.println(edao.findEmployeesDept(121));
	}

}
