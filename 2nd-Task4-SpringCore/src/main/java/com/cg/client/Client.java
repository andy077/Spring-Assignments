package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.service.ICurrencyService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("Main starts");
		ICurrencyService ref= context.getBean("serviceBean",ICurrencyService.class);
		
		System.out.println(ref.ConvertToINR(100));
		System.out.println(ref.currentState());
}

}