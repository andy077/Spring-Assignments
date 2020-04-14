package com.cg.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("serviceBean")
public class ICurrencyServiceImpl implements ICurrencyService{

	@Value("${state}")
	private String msg;
	
	@Value("${crate}")
	private double rate;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double ConvertToINR(double usd) {
		return rate*usd;
	}

	@Override
	public String currentState() {
		return msg+ " current rate id "+rate;
	}

}