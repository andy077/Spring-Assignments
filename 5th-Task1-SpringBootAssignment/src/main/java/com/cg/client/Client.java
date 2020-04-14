package com.cg.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cg.service.IService;


@SpringBootApplication
@ComponentScan(basePackages= {"com.cg.service", "com.cg.dao"})
public class Client implements CommandLineRunner{
	@Autowired
	private IService ser;
	
	public static void main(String[] args) {
		SpringApplication.run(Client.class,args);
	}

	@Override
	public void run(String... args) throws Exception {
	System.out.println(ser.viewName());	
	}
}