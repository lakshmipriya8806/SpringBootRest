package com.priya.model;

import java.io.Serializable;

public class CountrieResponse implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CountryModel[] countries;

	public CountryModel[] getCountries() {
		return countries;
	}

	public void setCountries(CountryModel[] countries) {
		this.countries = countries;
	}

	
}
