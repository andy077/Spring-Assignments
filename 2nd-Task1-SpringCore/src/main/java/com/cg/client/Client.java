package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.IService;

public class Client {
public static void main(String[] args) {
	ApplicationContext con= new ClassPathXmlApplicationContext("beans.xml");
	IService res= con.getBean("serviceBean",IService.class);
	
	System.out.println(res.getData("uname"));
}
}