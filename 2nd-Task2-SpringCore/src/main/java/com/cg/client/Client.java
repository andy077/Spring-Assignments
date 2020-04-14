package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.entity.Emp;
import com.cg.service.IService;

public class Client {
public static void main(String[] args) {
	ApplicationContext con= new ClassPathXmlApplicationContext("beans.xml","beans2.xml");
	System.out.println("Main starts");
	IService ref= con.getBean("serviceBean",IService.class);
	for(Emp i: ref.getEmployees()) {
		System.out.println(i.getEmpId());
		System.out.println(i.getEmpName());
		System.out.println(i.getEmpSal());
		System.out.println(i.getDoj());
	}
}
}