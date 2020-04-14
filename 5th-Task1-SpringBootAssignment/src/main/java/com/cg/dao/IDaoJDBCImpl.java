package com.cg.dao;

import org.springframework.stereotype.Component;

@Component("JdbcDao")
public class IDaoJDBCImpl implements IDao{

	public IDaoJDBCImpl() {
		System.out.println("JDBC Constructor");
	}
	
	@Override
	public String getName() {
		return "JDBC implementation";
	}

}