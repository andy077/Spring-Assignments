package com.cg.dao;

public class IDaoJDBCImpl implements IDao{

	public IDaoJDBCImpl() {
		System.out.println("JDBC Constructor");
	}
	
	@Override
	public String getName() {
		return "JDBC implementation";
	}

}
