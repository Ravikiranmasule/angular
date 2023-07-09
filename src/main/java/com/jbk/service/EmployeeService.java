package com.jbk.service;

import java.util.List;

import com.jbk.entity.Country;
import com.jbk.entity.Employee;

public interface EmployeeService {
	public String postEmployeeData(Employee emp); // => employee created successfully

	public List<Employee> getAllEmp(); // => list of empl

	public String updateEmp(Employee emp);// => employee emp name is updated successfully

	public String deleteEmp(Long id); // => employee empname is deleted successfully

	public Employee getEmpById(Long id);// => employee object

	public List<Employee> getEmpByStatus(String status); // => List of employee object

	
	

	 // => 
//=> {
//	id:..,
//	name : ...
//	...
//	country :{
//		cid:1
//		cname:'India'
	
}


