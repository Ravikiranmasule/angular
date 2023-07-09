package com.jbk.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Registration;
import com.jbk.service.RegistrationService;
@CrossOrigin
@RestController
@RequestMapping("/registration")
public class RegistrationController {
	@Autowired
	RegistrationService service;
	
	@PostMapping("/reg")
	public Map<String, Object> login(@RequestBody Registration reg) {
		
		Map<String,Object> user=service.login(reg);
		return user;
	}

}
