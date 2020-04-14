package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.service.IService;

public class CientTransferFunds {
public static void main(String[] args) {
	ApplicationContext con= new AnnotationConfigApplicationContext(JpaConfiguration.class);
	IService ref= con.getBean("myser",IService.class);
	
	ref.transferFund(123, 124, 256);
	
	System.out.println("Funds transferred.");
}
}
