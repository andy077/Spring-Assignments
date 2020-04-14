package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.entity.Account;
import com.cg.service.IService;

public class ClientAddAccount {
	public static void main(String[] args) {
		ApplicationContext con= new AnnotationConfigApplicationContext(JpaConfiguration.class);
		IService obj= con.getBean("myser",IService.class);
		
		Account shashAcc = new Account(123,"Shashwat",3000.00);
		Account prateekAcc = new Account(124, "Prateek",500.00);
		
		obj.addAccount(shashAcc);
		obj.addAccount(prateekAcc);
	}

}