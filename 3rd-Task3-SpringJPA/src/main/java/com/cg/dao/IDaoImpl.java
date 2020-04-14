package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.entity.Account;

@Repository("mydao")
public class IDaoImpl implements IDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean editAccount(Account acc) {
		em.merge(acc);
		return true;
	}

	@Override
	public boolean addAccount(Account acc) {
		em.persist(acc);
		return true;
	}

	@Override
	public Account getAccount(int id) {
		Account ac= em.find(Account.class,id);
		return ac;
	}

}