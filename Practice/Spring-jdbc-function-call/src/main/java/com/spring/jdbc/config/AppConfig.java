package com.spring.jdbc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

@ComponentScan("com.spring.jdbc")
public class AppConfig {
	@Autowired
	SimpleJdbcCall sjc;

	@Bean
	public SimpleJdbcCall sjc() {
		return new SimpleJdbcCall(dataSource());
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/sakila?");
		dmds.setUsername("root");
		dmds.setPassword("root");

		return dmds;
	}
}
