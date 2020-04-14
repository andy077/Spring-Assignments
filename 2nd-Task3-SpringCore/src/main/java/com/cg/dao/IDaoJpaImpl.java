package com.cg.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jpadao")
@Lazy(true)
public class IDaoJpaImpl implements IDao{

	public IDaoJpaImpl(){
		System.out.println("Jpa constructor");
	}
	@Override
	public String getName() {
		return "jpa implementation";
	}

}