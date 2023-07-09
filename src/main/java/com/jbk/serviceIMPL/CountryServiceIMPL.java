package com.jbk.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.CountryDao;
import com.jbk.entity.Country;
import com.jbk.service.CountryService;
@Service
public class CountryServiceIMPL implements CountryService {

	@Autowired
	CountryDao dao;
	@Override
	public List<Country> getAllCountry() {
		List<Country> list=dao.getAllCountry();
		return list;
	}

	@Override
	public String postCountry(Country country) {
		String msg=dao.postCountry(country);
		return msg;
	}

	@Override
	public String updateCountry(Country country) {
		String msg=dao.updateCountry(country);
		return msg;
	}

	@Override
	public String deleteCountry(int cid) {
		String msg=dao.deleteCountry(cid);
		return msg;
	}

	@Override
	public Country getCountryById(int cid) {
		Country country=dao.getCountryById(cid);
		return country;
	}

}
