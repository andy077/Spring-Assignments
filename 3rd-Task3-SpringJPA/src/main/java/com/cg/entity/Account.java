package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Account")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Account {

	@Id
	@Column(name="acc_id")
	private int accountId;
	
	@Column(name="customer_name", length=25)
	private String customerName;
	
	private double balance;

	public Account() {
		System.out.println("Account constructor");
	};
	
	public Account(int accountId, String customerName, double balance) {
		super();
		this.accountId = accountId;
		this.customerName = customerName;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accId=" + accountId + ", custName=" + customerName + ", balance=" + balance + "]";
	}
	
	
}