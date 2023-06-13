package com.prog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog.entity.Employee;
import com.prog.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	
    @Autowired
	private EmpService service;
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}

	@GetMapping("/addemp")
	public String addEmpForm()
	{
		return "addemp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e)
	{
		service.addEmp(e);
		return "redirect:/";
	}
	
}
