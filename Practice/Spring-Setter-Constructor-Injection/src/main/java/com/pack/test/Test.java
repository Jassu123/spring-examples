/**
 * 
 */
package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.ReportService;

/**
 * @author siva
 *
 */
public class Test {

	private static ApplicationContext contex;

	public static void main(String[] args) {

		contex = new ClassPathXmlApplicationContext("spring-config.xml");
		ReportService service = contex.getBean("reportService", ReportService.class);
		service.printReport();

	}

}
