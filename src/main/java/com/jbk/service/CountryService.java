package com.jbk.service;

import java.util.List;

import com.jbk.entity.Country;

public interface CountryService {
	public List<Country> getAllCountry(); // => list of country

	public String postCountry(Country country); // => country created successfully

	public String updateCountry(Country country);// => country updated

	public String deleteCountry(int cid); // => country deleted

	public Country getCountryById(int cid);// => 
}
