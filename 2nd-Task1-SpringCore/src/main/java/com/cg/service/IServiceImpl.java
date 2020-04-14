package com.cg.service;

import java.util.Properties;

public class IServiceImpl implements IService{

	private Properties props;
	
	public IServiceImpl(Properties props) {
		this.props=props;
	}
	@Override
	public String getData(String property) {
		return props.getProperty(property);
	}

}