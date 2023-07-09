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
import com.jbk.service.CountryService;
@CrossOrigin
@RestController
@RequestMapping("/country")
public class CountryController {
	@Autowired
	CountryService service;
	@GetMapping("/getall")
	public List<Country> getAllCountry() {
		List<Country> list=service.getAllCountry();
		return list;
	}

	@PostMapping("/postcountry")
	public String postCountry(@RequestBody Country country) {
		String msg=service.postCountry(country);
		return msg;
	}

	@PutMapping("/updatecountry")
	public String updateCountry(@RequestBody Country country) {
		String msg=service.updateCountry(country);
		return msg;
	}

	@DeleteMapping("/deletecountrybyid/{cid}")
	public String deleteCountry(@PathVariable int cid) {
		String msg=service.deleteCountry(cid);
		return msg;
	}

     @GetMapping("/getcountrybyid/{cid}")
	public Country getCountryById(@PathVariable int cid) {
    	 
    	Country country=service.getCountryById(cid);
    	return country;
	}

}
