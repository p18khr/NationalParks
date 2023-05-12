package com.NationalPark.service;

import com.NationalPark.models.Park;

import java.util.List;
import java.util.Optional;

public interface ParkService {

	Park savePark(Park park);

	Optional<Park> Get(String id);

	List<Park> getAll();

	void Update(Park park);

	void delete(String id);

	List<Park> getState(String state_name);

	List<Park> getCity(String city_name);
}
