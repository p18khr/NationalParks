package com.NationalPark.service;

import com.NationalPark.models.FilterBody;
import com.NationalPark.models.park;

import java.util.List;
import java.util.Optional;

public interface ParkService {

	park savepark(park park);

	Optional<park> Get(Long id);

	List<park> getAll();

	void Update(park park);

	void delete(Long id);

	List<park> getState(String state_name);

	List<park> getCity(String city_name);

	List<String> getSname();

	List<String> getCname();

	List<String> getPname();

	List<park> Filter(FilterBody filter);

	List<park> getAnimal(String animal_name);
}
