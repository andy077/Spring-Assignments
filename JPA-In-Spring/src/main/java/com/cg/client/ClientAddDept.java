package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Dept;
import com.cg.entity.Emp;

public class ClientAddDept {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		IEmpDao daoObject= context.getBean("mydao",IEmpDao.class);
		Dept deptObject= new Dept();
		deptObject.setDeptName("abcd");
		daoObject.addDept(deptObject);
		System.out.println("Dept added");
		
	}
}