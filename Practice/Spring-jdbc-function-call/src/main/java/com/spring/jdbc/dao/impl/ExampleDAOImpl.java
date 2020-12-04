package com.spring.jdbc.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.dao.IExampleDAO;

@Repository
public class ExampleDAOImpl implements IExampleDAO {

	@Autowired
	private SimpleJdbcCall jdbcCall;

	@Override
	public void callDBFunction() {
		// TODO Auto-generated method stub

		jdbcCall.withFunctionName("get_customer_balance");

		Map input = new HashMap();
		input.put("p_customer_id", 1);
		input.put("p_effective_date", new Date());

		Map output = jdbcCall.execute(input);

		System.out.println("bonus:" + output.get("return"));

	}

}
