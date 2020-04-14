package com.cg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cg.entity.Emp;

@Controller
public class SalaryController {

	@GetMapping("/salform")
	public String displaySalForm() {
		return "SalFormPage";
	}
	
	@GetMapping("/calcsal")
	public String displaySalForm(@ModelAttribute("emodel") Emp emp, Model model) {
		double pf=emp.getEsal()*.12;
		double al=emp.getEsal()*0.4;
		double net=emp.getEsal()+al-pf;
		
		model.addAttribute("pf",pf);
		model.addAttribute("allowances", al);
		model.addAttribute("netsal", net);
		
		return "SalSubmitPage";
	}
	
}