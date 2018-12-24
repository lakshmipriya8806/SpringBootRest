package com.priya;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priya.model.CountryModel;

@RestController
public class CountryController {
	
	
	/**
	 * This method gets the list of countries
	 * @return
	 */
	@GetMapping("/countries")
	public String getCountries() {
		return "hello";
	}
	
	
	/**
	 * This method gets the countryByName
	 * @param name
	 * @return
	 */
	@GetMapping("/countriesbyName")
	public String getCountrieByName(@RequestParam(name="name") String name) {
		return "hello"+ name;
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
