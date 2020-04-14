package com.cg.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cg.service.IService;

public class ClientBeanFactory {

	static BeanFactory fac;
	
	static {
		Resource res= new ClassPathResource("beans.xml");
		fac= new XmlBeanFactory(res);
	}
	
	public static void main(String[] args) {
		System.out.println("Main starts");
		IService object = fac.getBean("serviceBean", IService.class);
		System.out.println(object.viewName());
	}
}