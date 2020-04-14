package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.IDao;

@Component("ser")
public class IServiceImpl implements IService{

	private IDao dao;
	
	public IServiceImpl() {
		System.out.println("Inject the dependencies");
		System.out.println("Service constructor");
	}
	
	@Autowired
	@Qualifier("JpaDao")
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public String viewName() {
		return dao.getName();
	}

}
