package com.priya.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.priya.model.CountryModel;

@Service
public class CountryService {
	
	public List<CountryModel> getCountries() {  
		
		final String uri = "https://restcountries.eu/rest/v2/alpha?codes=col;no;ee";     
	    RestTemplate restTemplate = new RestTemplate();
	    CountryModel[] result = restTemplate.getForObject(uri, CountryModel[].class);
	    Arrays.asList(result);
	    return Arrays.asList(result);
	     

	}
	
public List<CountryModel> getCountriesByName(String lname) {  
		final String uri = "https://restcountries.eu/rest/v2/name/"+lname;     
	    RestTemplate restTemplate = new RestTemplate();
	    CountryModel[] result = restTemplate.getForObject(uri, CountryModel[].class);
	    Arrays.asList(result);
	    return Arrays.asList(result);
	     

	}
	
}
