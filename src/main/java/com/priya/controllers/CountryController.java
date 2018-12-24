package com.priya.controllers;

import java.util.List;

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
	
	@Autowired
	CountryService service;
	
	/**
	 * This method gets the list of countries
	 * @return
	 */
	@GetMapping("/countries")
	public List<CountryModel> getCountries() {
		List<CountryModel> model=service.getCountries();
		
		return model;
	}
	
	
	/**
	 * This method gets the countryByName
	 * @param name
	 * @return
	 */

	  @GetMapping("/countriesbyName")
	   public List<CountryModel>getCountrieByName(@RequestParam(value="name",required=false) String name) {
	    List<CountryModel> model=service.getCountriesByName(name); 
	    return model; 
	   }
	 
	
		
	/**
	 * This method is for saving the new country
	 * @param countryModel
	 * @return
	 */
	@PostMapping("/countries")
	public CountryModel postCountries(@RequestBody CountryModel countryModel) {
		
		return countryModel;
	}
	
	/**
	 * This method is for updating the country details
	 * @param countryModel
	 * @return
	 */
	@PutMapping("/countries")
	public CountryModel updateCountry(@RequestBody CountryModel countryModel) {
		
		return countryModel;
	}
	
	/**
	 * This is for delete a country based on id
	 * @param id
	 * @return
	 */
	@DeleteMapping("/countries/{id}")
	public String deleteCountry(@PathVariable(name="id") int id) {
		return "Deleted Id : "+id;
	}	

}
