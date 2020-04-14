package com.cg.service;

import com.cg.dao.IDao;

public class IServiceImpl implements IService{

	private IDao dao;
	
	
	public void setDao(IDao dao) {
		System.out.println("Injecting the dependencies");
		this.dao = dao;
	}


	@Override
	public String viewName() {
		return dao.getName();
	}

}