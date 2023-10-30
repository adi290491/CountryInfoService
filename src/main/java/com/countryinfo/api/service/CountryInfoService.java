package com.countryinfo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.countryinfo.api.requestmodel.Country;
import com.countryinfo.api.util.CountryUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CountryInfoService {

	@Autowired
	private CountryUtil countryUtil;
	
	public String getCountryCapital(Country country) {
		
		return countryUtil.getCapital(country.getCountryName().toLowerCase());
		
	}

	public List<String> getAllCountries() {
		// TODO Auto-generated method stub
		return countryUtil.getListOfCountries();
	}
}
