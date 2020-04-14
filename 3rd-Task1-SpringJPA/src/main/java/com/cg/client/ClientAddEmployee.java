package com.cg.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

public class ClientAddEmployee {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		IEmpDao daoObject= context.getBean("mydao",IEmpDao.class);
		
		//Adding Employee
		Emp empObject = new Emp();
		empObject.setEmpId(100);
		empObject.setEmpName("Shashwat");
		empObject.setEmpSal(3.8);
		empObject.setDoj(LocalDate.of(2019,03,02));
		empObject.getDept().setDeptId(3);
		daoObject.addEmp(empObject);
		System.out.println("Employee added");
		
	}
}
