package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Country;
import com.jbk.entity.Employee;
import com.jbk.service.EmployeeService;
@CrossOrigin
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/postemp")
	public String postEmployeeData(@RequestBody Employee emp) {
		System.out.println(emp+"in controller");
		String msg=service.postEmployeeData(emp);
	
		return msg;}
	

		@GetMapping("/getall")
		public List<Employee> getAllEmp()
		{
			List<Employee> list=service.getAllEmp();
			//System.out.println(list);
			return list;
		}

		@PutMapping("/updateemp")
		public String updateEmp(@RequestBody Employee emp) {
		String msg	=service.updateEmp(emp);
			
			return msg;
		}

		@DeleteMapping("/deleteempbyid/{id}")
		public String deleteEmp(@PathVariable Long id) {
			String msg=service.deleteEmp(id);
			return msg;
		}

	@GetMapping("/getempbyid/{id}")
		public Employee getEmpById(@PathVariable Long id) {
			Employee emp=service.getEmpById(id);
			return emp;
		}
//
		@GetMapping("/getempbystatus/{status}")
		public List<Employee> getEmpByStatus(@PathVariable String status) {
			service.getEmpByStatus(status);
			return null;
		}
//
//		
//		
	}


