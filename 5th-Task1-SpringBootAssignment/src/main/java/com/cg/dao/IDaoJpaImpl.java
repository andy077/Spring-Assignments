package com.cg.dao;

import org.springframework.stereotype.Component;

@Component("JpaDao")
public class IDaoJpaImpl implements IDao {

	public IDaoJpaImpl() {
		System.out.println("Jpa constructor");
	}
	@Override
	public String getName() {
		return "Jpa implementation";
	}

}