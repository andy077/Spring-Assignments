package com.cg.dao;

public class IDaoJpaImpl implements IDao {

	public IDaoJpaImpl() {
		System.out.println("Jpa constructor");
	}
	@Override
	public String getName() {
		return "Jpa implementation";
	}

}