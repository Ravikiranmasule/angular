package com.jbk.service;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.jbk.entity.Registration;

public interface RegistrationService {
	public Map<String, Object> login(@RequestBody Registration reg) ;

}
