package com.grace.onlinebooking.city.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grace.onlinebooking.city.model.City;
import com.grace.onlinebooking.city.service.CityService;


@RestController

public class CityController {

  @Autowired
  private CityService cityService;
//	
  @PostMapping(value="/createCity")
  public ResponseEntity<City> createCity(@RequestBody City city) {
    City createdCity = cityService.createCity(city);
    return new ResponseEntity<>(createdCity, HttpStatus.CREATED);
  }

//	
  @GetMapping(value="/allCities")
  public Iterable<City>getAllUsers(){
		return cityService.findAllCities();
	}
}





	