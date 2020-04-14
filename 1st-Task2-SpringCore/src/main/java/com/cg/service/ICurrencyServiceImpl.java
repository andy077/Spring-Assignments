package com.cg.service;

public class ICurrencyServiceImpl implements ICurrencyService{

	private String msg;
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