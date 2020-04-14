package com.cg.service;

import java.util.List;

import com.cg.entity.Account;

public interface IService {

	boolean addAccount(List<Account> lst);
	boolean addAccount(Account account);
	boolean transferFund(int from, int to, double amt);
	Account viewAccount(int id);
}