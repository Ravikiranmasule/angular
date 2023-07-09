package com.jbk.daoIMPL;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.dao.CountryDao;
import com.jbk.entity.Country;
@Repository
public class CountryDaoIMPL implements CountryDao {
@Autowired
SessionFactory sf;
	@Override
	public List<Country> getAllCountry() {
		Session session=null;
		try {
			session=sf.openSession();
			Criteria cr=session.createCriteria(Country.class);
			List<Country> list=cr.list();
		    return list;
		} catch (Exception e) {
			return null;
		}
		
		
	}

	@Override
	public String postCountry(Country country) {
		Session session=null;
		String msg=null;
		try {
		    session=sf.openSession();
		    Transaction tr=session.beginTransaction();
		    session.save(country);
		    tr.commit();
		    msg="isAdded";
		    return msg;
		    
		} catch (Exception e) {
			msg="data not added";
			return msg;
		}
		
	}

	@Override
	public String updateCountry(Country country) {
		Session session=null;
		String msg=null;
		try {
			session=sf.openSession();
			Transaction tr=session.beginTransaction();
			session.update(country);
			tr.commit();
			msg="isUpdated";
			return msg;
		} catch (Exception e) {
			msg="isnotUpdated";
			return msg;
		}
	
	}

	@Override
	public String deleteCountry(int cid) {
		Session session=null;
		String msg=null;
		System.out.println("in dao 11111");
	 try {
		session=sf.openSession();
		Country country=getCountryById(cid);
		System.out.println(country+"in dao");
		Transaction tr=session.beginTransaction();
		System.out.println(country+"in dao222222");
		session.delete(country);
		System.out.println(country+"in dao333333");
		tr.commit();
		
		msg="isDeleted";
		return msg;
	} catch (Exception e) {
		e.printStackTrace();
		msg="isnotDeleted";
		return msg;
	}
	
	}

	@Override
	public Country getCountryById(int cid) {
		Session session=null;
		try {
			session=sf.openSession();
			Country country=session.get(Country.class, cid);
			return country;
		} catch (Exception e) {
			return null;
		}
		
	}

}
