package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.IService;

public class Client {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
	IService ref= context.getBean("serviceBean",IService.class);
	
	System.out.println(ref.getEmployee(123).geteId());
			
}
}