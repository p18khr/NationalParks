package com.NationalPark.service;

import com.NationalPark.models.hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

	hotel saveHotel(hotel hotel);

	List<hotel> getHotels();

	Optional<hotel> getHotel(Long idnew);

	List<hotel> getHotelById(Long id);

	List<hotel> sortHotel(String park_id);

	List<hotel> reverseHotel(String park_id);

	void update(hotel hotel);

	void delete(String id);
}
