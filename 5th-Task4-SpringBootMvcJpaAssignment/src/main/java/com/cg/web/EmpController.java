package com.cg.web;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

@Controller
@EnableTransactionManagement
public class EmpController {

	@Autowired
	private IEmpDao dao;
	
	@GetMapping("/viewall")
	public String viewAll(Model model) {
		model.addAttribute("elist", dao.viewEmp());
		return "EmpView";
	}	
	
	@GetMapping("/viewbyid")
	public String viewById() {
		return "ViewIdPage";
	}
	
	@GetMapping("/searchbyid")
	public String searchById(@RequestParam("txteid") int eid,Model model) {
		model.addAttribute("emodel", dao.viewEmp(eid));
		return "ViewIdPage";
	}
	
	@GetMapping("/viewbydept")
	public String viewByDept(Model model) {
		model.addAttribute("dlist", dao.viewDepts());
		return "ViewDeptPage";
	}
	
	@GetMapping("/showaddform")
	public String showAddEmployee(Model model) {
		model.addAttribute("dlist", dao.viewDepts());
		return "AddEmpPage";
	}
	
	
	@PostMapping("/add")
	public String addEmployee(@RequestParam("empId") int eid ,@RequestParam("empName") String ename, 
			@RequestParam("empSal") double  esal, Model model) {
		Emp emp=new Emp();
		emp.setEmpId(eid);
		emp.setEmpName(ename);
		emp.setEmpSal(esal);
		emp.getDept().setDeptId(1);
		emp.setDoj(LocalDate.of(2018, 2, 11));
		System.out.println("Id is "+eid);
		try {
			dao.addEmp(emp);
			model.addAttribute("msg","Employee Added");
			return "HomePage";
		}
		catch(Exception ex) {
			System.out.println("message "+ex.getMessage());
			model.addAttribute("dlist", dao.viewDepts());
			model.addAttribute("msg", "ID already exist");
			return "AddEmpPage";
		}
		
	}
}