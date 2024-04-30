package com.grace.onlinebooking.city.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grace.onlinebooking.city.model.City;



@Repository//DB connection
public interface CityRepository extends JpaRepository<City, Integer> {
	
	
		
}

    
