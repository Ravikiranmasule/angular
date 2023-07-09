package com.jbk.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmployeeDao;
import com.jbk.entity.Country;
import com.jbk.entity.Employee;
import com.jbk.service.EmployeeService;
@Service
public class EmployeeServiceIMPL implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	@Override
	public String postEmployeeData(Employee emp) {
		System.out.println(emp+"in service");
		String msg=dao.postEmployeeData(emp);
		return msg ;
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee> list=dao.getAllEmp();
		return list;
	}

	@Override
	public String updateEmp(Employee emp) {
		String msg=dao.updateEmp(emp);
		return msg;
	}

	@Override
	public String deleteEmp(Long id) {
		String msg=dao.deleteEmp(id);
		return msg;
	}

	@Override
	public Employee getEmpById(Long id) {
		
		Employee emp=dao.getEmpById(id);
		return emp;
	}

	@Override
	public List<Employee> getEmpByStatus(String status) {
	
		dao.getEmpByStatus(status);
		return null;
	}



}
