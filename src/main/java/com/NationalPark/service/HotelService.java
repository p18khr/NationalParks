package com.NationalPark.service;

import com.NationalPark.models.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

	Hotel saveHotel(Hotel hotel);

	List<Hotel> getHotels();

	Optional<Hotel> getHotel(Long idnew);

	List<Hotel> getHotelById(Long id);
}
