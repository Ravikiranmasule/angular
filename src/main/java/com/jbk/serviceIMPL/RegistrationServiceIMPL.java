package com.jbk.serviceIMPL;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.RegistrationDao;
import com.jbk.entity.Registration;
import com.jbk.service.RegistrationService;
@Service
public class RegistrationServiceIMPL implements RegistrationService {
@Autowired
RegistrationDao dao;
	@Override
	public Map<String, Object> login(Registration reg) {
		Object user=dao.login(reg);
		System.out.println(user);
		Map<String,Object> map=new HashMap<>();
		if(user!=null) {
			map.put("msg", "valid user");
			map.put("user", user);
		}else {
			map.put("msg", "invalid user");
		}
		return map;
	}

}
