package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.IDao;

@Component("myser")
public class IServiceImpl implements IService{

	private IDao dao;
	public IServiceImpl() {
		System.out.println("Service constructor");
	}
	
	@Autowired
	@Qualifier("jpadao")
	public void setDao(IDao dao) {
		System.out.println("Injecting the dependency");
		this.dao = dao;
	}

	@Override
	public String viewName() {
		return dao.getName();
	}

}