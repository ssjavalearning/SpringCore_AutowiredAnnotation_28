package com.suraj.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private Integer employeeId;
	private String employeeName;
	
	//this Autowired annotation can be used before for field,method and constructor and mandatory dependency
	//@Autowired
	//required false tells if not matched then inject null but don't throw exception
	@Autowired(required=false)
	private Pancard pancard;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
}
