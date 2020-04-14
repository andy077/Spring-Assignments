package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.service.CarService;

public class Client {
public static void main(String[] args) {
	ApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
	
	CarService ref= con.getBean("bean2",CarService.class);
	ref.drive();
	
	CarService ref2= con.getBean("bean1",CarService.class);
	ref.drive();
	
}
}