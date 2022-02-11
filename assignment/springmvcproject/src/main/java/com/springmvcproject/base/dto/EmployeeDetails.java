package com.springmvcproject.base.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmployeeDetails implements Serializable {
	@Id
	private Integer empId;
	private String empName;
	private String empPassword;
	private String empRole;

}
