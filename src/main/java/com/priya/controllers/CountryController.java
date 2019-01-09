package com.priya.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priya.model.CountryModel;
import com.priya.service.CountryService;

@RestController

public class CountryController {
	
	//Default logging present in the SpringBoot-sl4j
	public  Logger log=LoggerFactory.getLogger(CountryController.class);
	
	/*
	 * @Scheduled(fixedDelay = 1000) public void printScheduled() { log.info(new
	 * Date().toString()); }
	 */
	
	@Autowired
	CountryService service;
	
	/**
	 * This method gets the list of countries
	 * @return
	 */
	@GetMapping("/api/countries")
	public List<CountryModel> getCountries() {
		log.trace("getCountries TRACE Message");
		log.debug("getCountries DEBUG Message");
		log.info("getCountries INFO Message");
		log.warn("getCountries WARN Message");
		log.error("getCountries ERROR Message");
		List<CountryModel> model=service.getCountries();
			log.info("Countries are coming");
		
		if(model.isEmpty()) {
			log.error("No countries are present");
		}
		return model;
	}
	
	
	/**
	 * This method gets the countryByName
	 * @param name
	 * @return
	 */

	  @GetMapping("/api/countriesbyName")
	   public List<CountryModel>getCountrieByName(@RequestParam(value="name",required=false) String name) {
	    List<CountryModel> model=service.getCountriesByName(name); 
	    return model; 
	   }
	 
	
		
	/**
	 * This method is for saving the new country
	 * @param countryModel
	 * @return
	 */
	@PostMapping("/api/countries")
	public CountryModel postCountries(@RequestBody CountryModel countryModel) {
		
		return countryModel;
	}
	
	/**
	 * This method is for updating the country details
	 * @param countryModel
	 * @return
	 */
	@PutMapping("/api/countries")
	public CountryModel updateCountry(@RequestBody CountryModel countryModel) {
		
		return countryModel;
	}
	
	/**
	 * This is for delete a country based on id
	 * @param id
	 * @return
	 */
	@DeleteMapping("/api/countries/{id}")
	public String deleteCountry(@PathVariable(name="id") int id) {
		return "Deleted Id : "+id;
	}	

}
