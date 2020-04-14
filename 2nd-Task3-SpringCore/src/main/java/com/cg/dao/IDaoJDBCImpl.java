package com.cg.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jdbcdao")
@Lazy(true)
public class IDaoJDBCImpl implements IDao{

	public IDaoJDBCImpl() {
		System.out.println("JDBC constructor");
	}
	@Override
	public String getName() {
		return "jdbc implementation";
	}

}
