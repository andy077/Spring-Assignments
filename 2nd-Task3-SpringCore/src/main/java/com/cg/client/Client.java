package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.IService;

public class Client {
public static void main(String[] args) {
	ApplicationContext con= new AnnotationConfigApplicationContext(MyConfig.class);
	IService ref= con.getBean("myser",IService.class);
	
	System.out.println(ref.viewName());
			
}
}