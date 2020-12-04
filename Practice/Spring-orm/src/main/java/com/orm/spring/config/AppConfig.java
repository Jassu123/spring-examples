package com.orm.spring.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.orm.spring.model.Employee;

@Configuration
@ComponentScan(basePackages = "com.orm.spring")
@EnableTransactionManagement
public class AppConfig {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
		dmds.setUsername("root");
		dmds.setPassword("root");

		return dmds;
	}

	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {

		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setAnnotatedClasses(Employee.class);
		Properties props = new Properties();
		props.setProperty("dialect", "org.hibernate.dialect.MySqlDialect");
		props.setProperty("hibernate.show_sq", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		factoryBean.setHibernateProperties(props);
		return factoryBean;

	}

	@Bean
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate template = new HibernateTemplate();
		template.setSessionFactory(localSessionFactoryBean().getObject());
		return template;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		return new HibernateTransactionManager(localSessionFactoryBean().getObject());
	}

}
