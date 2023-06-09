package com.NationalPark.service;

import com.NationalPark.models.FilterBody;
import com.NationalPark.models.Park;

import java.util.List;
import java.util.Optional;

public interface ParkService {

	Park savepark(Park park);

	Optional<Park> Get(Long id);

	List<Park> getAll();

	void Update(Park park);

	void delete(Long id);

	List<Park> getState(String state_name);

	List<Park> getCity(String city_name);

	List<String> getSname();

	List<String> getCname();

	List<String> getPname();

	List<Park> Filter(FilterBody filter);
}
