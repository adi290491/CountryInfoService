package com.countryinfo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.countryinfo.api.util.CountryUtil;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class CountryInfoServiceApplication {

	@Autowired
	private CountryUtil countryUtil;
	
	public static void main(String[] args) {
		SpringApplication.run(CountryInfoServiceApplication.class, args);
	}

	@Bean
	public void initMap() {
		countryUtil.init();
	}
}
