package com.grace.onlinebooking.city.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grace.onlinebooking.city.dao.CityRepository;
import com.grace.onlinebooking.city.model.City;



@Service
public class CityService {

  @Autowired
  private CityRepository cityRepository;


  public Iterable<City> findAllCities() {
		return cityRepository.findAll();
	}

  public City createCity(City cityobj) {
		return cityRepository.save(cityobj);
	}
	
}
