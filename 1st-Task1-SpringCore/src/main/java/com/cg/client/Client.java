package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.IService;

public class Client {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("Main starts");
	IService object= context.getBean("serviceBean",IService.class);
	
	System.out.println(object.viewName());
}
}
