package com.jbk.daoIMPL;

import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.dao.RegistrationDao;
import com.jbk.entity.Registration;
@Repository
public class RegistrationDaoIMPL implements RegistrationDao {
	@Autowired
	SessionFactory sf;

	@Override
	public Object login(Registration reg) {
		Session session=null;
		try {
			session=sf.openSession();
			Transaction tr=session.beginTransaction();
			Criteria cr=session.createCriteria(Registration.class);
			cr.add(Restrictions.eq("emailid", reg.getEmailid()));
			cr.add(Restrictions.eq("password", reg.getPassword()));
			
		Object	user=cr.uniqueResult();
			tr.commit();
			return user;
		} catch (Exception e) {
			return null;
		}
		
	}

}
