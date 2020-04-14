package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.dao.IEmpDao;

public class ClientViewAll {

	public static void main(String[] args) {

		ApplicationContext con = new AnnotationConfigApplicationContext(JpaConfiguration.class);
		IEmpDao ob= con.getBean("mydao",IEmpDao.class);
		
		System.out.println(ob.viewEmp());
	}
}
