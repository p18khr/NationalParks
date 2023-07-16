package com.NationalPark.serviceImpl;

import com.NationalPark.dao.HotelRepository;
import com.NationalPark.models.hotel;
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
	public hotel saveHotel(hotel hotel) {
		return repo.save(hotel);
	}

	@Override
	public List<hotel> getHotels() {
		List<hotel> list = repo.findAll();
		return list;
	}

	@Override
	public Optional<hotel> getHotel(Long idnew) {
		return repo.findById(idnew);
	}

	@Override
	public List<hotel> getHotelById(Long id) {
		List<hotel> list = repo.findHById(id);
		return list;
	}

	@Override
	public List<hotel> sortHotel(String park_id) {
		List<hotel> list = repo.sort(park_id);
		return list;
	}

	@Override
	public List<hotel> reverseHotel(String park_id) {
		List<hotel> list = repo.reverse(park_id);
		return list;
	}

	@Override
	public void update(hotel hotel) {
		repo.update(hotel.getId(),hotel.getAbout(),hotel.getImage1(),hotel.getImage2(),hotel.getImage3(),hotel.getImage4(),hotel.getImage5(),hotel.getImage6(),hotel.getImage7(),hotel.getImage8(),hotel.getImage9(),hotel.getImage10(),hotel.getName(),hotel.getAc(),hotel.getLaundry(),hotel.getLocation(),hotel.getPool(),hotel.getWifi(),hotel.getPrice());
	}

	@Override
	public void delete(String id) {
		Long idlong = Long.parseLong(id);
		repo.deleteById(idlong);
	}
}
