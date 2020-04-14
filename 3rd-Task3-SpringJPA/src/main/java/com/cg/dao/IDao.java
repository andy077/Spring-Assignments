package com.cg.dao;

import com.cg.entity.Account;

public interface IDao {

	boolean editAccount(Account acc);
	boolean addAccount(Account acc);
	Account getAccount(int id);
}
