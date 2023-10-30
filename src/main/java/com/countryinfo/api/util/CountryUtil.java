package com.countryinfo.api.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component
public class CountryUtil {

	private Map<String, String> countryCapitalMap;
	
	public String getCapital(String countryName) {
		return countryCapitalMap.getOrDefault(countryName, "Country Not Found");
	}

	public void init() {
		countryCapitalMap = new HashMap<>();
		countryCapitalMap.put("india", "New Delhi");
		countryCapitalMap.put("china", "Beijing");
		countryCapitalMap.put("usa", "Washington D.C.");
		countryCapitalMap.put("israel", "Jerusalem");
		countryCapitalMap.put("australia", "Canberra");
		countryCapitalMap.put("indonesia", "Jakarta");
		countryCapitalMap.put("brazil", "Brasilia");
		countryCapitalMap.put("canada", "Ottawa");
		countryCapitalMap.put("germany", "Berlin");
		countryCapitalMap.put("russia", "Moscow");
		countryCapitalMap.put("uk", "London");
		countryCapitalMap.put("mexico", "Mexico City");
	}

	public List<String> getListOfCountries() {
		// TODO Auto-generated method stub
		return new ArrayList<>(countryCapitalMap.keySet());
	}
}
