package com.jbk.daoIMPL;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.dao.EmployeeDao;
import com.jbk.entity.Country;
import com.jbk.entity.Employee;
@Repository
public class EmployeeDaoIMPL implements EmployeeDao {
	@Autowired
	SessionFactory sf;
Session session=null;
	@Override
	public String postEmployeeData(Employee emp) {
		String msg=null;
		try {
			 session=sf.openSession();
			 System.out.println(emp+"in dao");
			 Transaction tr=session.beginTransaction();
				session.save(emp);
				tr.commit();
			msg="isAdded";
				return msg;
		} catch (Exception e) {
			e.printStackTrace();
			msg ="data already exists";
			return msg;
		}
	
		
	}

	@Override
	public List<Employee> getAllEmp() {
		Session session=null;
		try {
			session=sf.openSession();
			Criteria criteria=session.createCriteria(Employee.class);
			List<Employee> list=criteria.list();
			return list;
		
		} catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public String updateEmp(Employee emp) {
		Session session=null;
		String msg=null;
		try {
			session=sf.openSession();
			Transaction tr=session.beginTransaction();
			session.update(emp);
			tr.commit();
			msg="isUpdated";
			return msg;
			
		} catch (Exception e) {
			msg="not updated";
			return msg;
		}
	
	}

	@Override
	public String deleteEmp(Long id) {
		Session session=null;
		String msg=null;
		
		try {
			session=sf.openSession();
			Transaction tr=session.beginTransaction();
			Employee emp=session.get(Employee.class, id);
			System.out.println(id+"id");
			
			session.delete(emp);
			System.out.println(emp);
			tr.commit();
			msg="successfully deleted";
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			msg="data not deleted";
			return msg;
		}
		
	}

	@Override
	public Employee getEmpById(Long id) {
		Session session=null;
		try {
			session=sf.openSession();
			Employee emp=session.get(Employee.class, id);
			
			return emp;
		} catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public List<Employee> getEmpByStatus(String status) {
		Session session=null;
		try {
			session=sf.openSession();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	
}
