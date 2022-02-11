package com.springmvcproject.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springmvcproject.base.dao.EmployeeDao;
import com.springmvcproject.base.dto.EmployeeDetails;
import com.springmvcproject.base.dto.MyEmployeeDetails;

@Service
public class ServiceImplimentation implements UserDetailsService {
	@Autowired
	private EmployeeDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		EmployeeDetails details = dao.findByEmpName(username);
		if (details != null) {
			return new MyEmployeeDetails(details);
		} else {
			throw new UsernameNotFoundException("user not found");
		}

	}

	public EmployeeDetails getData(Integer empId) {
		return dao.findByEmpId(empId);
		
	}
}
