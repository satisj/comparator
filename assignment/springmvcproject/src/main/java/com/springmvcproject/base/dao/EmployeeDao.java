package com.springmvcproject.base.dao;

import org.springframework.data.repository.CrudRepository;

import com.springmvcproject.base.dto.EmployeeDetails;

public interface EmployeeDao extends CrudRepository<EmployeeDetails, Integer> {

	public EmployeeDetails findByEmpName(String username); 
	
	public EmployeeDetails findByEmpId(Integer empId); 
}
