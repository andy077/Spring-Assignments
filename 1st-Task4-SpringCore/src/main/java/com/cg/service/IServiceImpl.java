package com.cg.service;

import java.util.Map;

import com.cg.entity.Emp;

public class IServiceImpl implements IService {

	private Map<Integer, Emp> emap;
	
	
	public void setEmap(Map<Integer, Emp> emap) {
		this.emap = emap;
	}


	@Override
	public Emp getEmployee(int id) {
		return emap.get(id);
	}

}