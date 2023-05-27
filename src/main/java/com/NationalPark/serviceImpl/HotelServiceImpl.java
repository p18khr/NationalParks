package com.NationalPark.serviceImpl;

import com.NationalPark.dao.HotelRepository;
import com.NationalPark.models.Hotel;
import com.NationalPark.service.HotelService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository repo;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		return repo.save(hotel);
	}

	@Override
	public List<Hotel> getHotels() {
		List<Hotel> list = repo.findAll();
		return list;
	}

	@Override
	public Optional<Hotel> getHotel(Long idnew) {
		return repo.findById(idnew);
	}

	@Override
	public List<Hotel> getHotelById(Long id) {
		List<Hotel> list = repo.findHById(id);
		return list;
	}
}
