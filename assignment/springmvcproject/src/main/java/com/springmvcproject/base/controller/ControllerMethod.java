package com.springmvcproject.base.controller;

import java.security.Principal;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvcproject.base.dto.EmployeeDetails;
import com.springmvcproject.base.service.ServiceImplimentation;

@Controller
public class ControllerMethod {
    @Autowired
	private UserDetailsService service;
	
	@Autowired
	private ServiceImplimentation impli;

	@GetMapping("/loginform")
	public String loginForm() {
		return "loginform";
	}

	@GetMapping("/userlogin")
	public String userLogin() {
		return "welcomeuser";
	}

	@GetMapping("/adminlogin")
	public String adminLogin() {
		return "welcomeadmin";
	}

	@GetMapping("/welcome")
	public String authenticatioinUser(String username, ModelMap map) {
		UserDetails details = service.loadUserByUsername(username);
		if (details != null) {
			map.addAttribute("key", details.getUsername());
			return "welcomeuser";
		} else {
			map.addAttribute("err", "user not found");
			return "userlogin";
		}

	}

	@GetMapping("/welcomeadmin")
	public String authenticationAdmin() {
		return "welcomeadmin";
	}

	@GetMapping("/getdata")
	public String getData() {
		return "getdata";
	}

	@PostMapping("/getdata")
	public String getData(ModelMap map, Integer empId) {
		EmployeeDetails details = impli.getData(empId);
		map.addAttribute("data", details);
		return "getdata";

	}
}
