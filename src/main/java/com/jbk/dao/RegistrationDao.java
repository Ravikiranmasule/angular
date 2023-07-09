package com.jbk.dao;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.jbk.entity.Registration;

public interface RegistrationDao {
	public Object login(@RequestBody Registration reg) ;

}
