package com.countryinfo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.countryinfo.api.requestmodel.Country;
import com.countryinfo.api.service.CountryInfoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/country-info")
@RequiredArgsConstructor
public class CountryInfoController {

	@Autowired
	private CountryInfoService countryInfoService;
	
	@PostMapping(path = "/get-capital",
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	public String getCapital(@RequestBody Country country){
		String capital = countryInfoService.getCountryCapital(country);
		return capital;
	}
	
	@GetMapping("/getAllCountries")
	public ResponseEntity<List<String>> getAllCountries() {
		List<String> countryList = countryInfoService.getAllCountries();
		return new ResponseEntity<List<String>>(countryList, HttpStatusCode.valueOf(200));
	}
}
