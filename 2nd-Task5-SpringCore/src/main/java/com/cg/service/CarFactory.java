package com.cg.service;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<CarService> {

	@Override
	public CarService getObject() throws Exception {
		return new CarService();
	}

	@Override
	public Class<?> getObjectType() {
		return CarService.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}