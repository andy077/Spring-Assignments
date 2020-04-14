package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.ISearcher;

public class Client {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("Main starts");
	
	ISearcher ref= context.getBean("serviceBean",ISearcher.class);
	System.out.println(ref.search("D"));
	System.out.println(ref.searchStartWith("Jh"));
	System.out.println(ref.displayAll());
	
}
}