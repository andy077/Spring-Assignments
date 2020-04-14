package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IDaoImpl;
import com.cg.entity.Account;

@Service("myser")
@Transactional
public class IServiceImpl implements IService{

	@Autowired
	private IDaoImpl dao;
	
	@Override
	public boolean addAccount(List<Account> lst) {
		lst.forEach(acc->dao.addAccount(acc));
		return true;
	}

	@Override
	public boolean addAccount(Account account) {
		return dao.addAccount(account);
	}

	@Override
	public boolean transferFund(int from, int to, double amt) {
		Account fromAccount=dao.getAccount(from);
		Account toAccount=dao.getAccount(to);
		
		fromAccount.setBalance(fromAccount.getBalance()-amt);
		toAccount.setBalance(toAccount.getBalance()+amt);
		
		dao.editAccount(fromAccount);
		dao.editAccount(toAccount);
		
		return true;
	}

	@Override
	@Transactional(readOnly=true)
	public Account viewAccount(int id) {
		return dao.getAccount(id);
	}

}