package com.NationalPark.serviceImpl;

import com.NationalPark.dao.ParkRepository;
import com.NationalPark.models.Park;
import com.NationalPark.service.ParkService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ParkServiceImpl implements ParkService {

	@Autowired
	private ParkRepository repo;

	@Override
	public Park savePark(Park park) {
		return repo.save(park);
	}

	@Override
	public Optional<Park> Get(String id) {
		return repo.findById(id);
	}

	@Override
	public List<Park> getAll() {
		return repo.findAll();
	}

	@Override
	public void Update(Park park) {
		repo.updateById(park.getId(),park.getAbout(),park.getActivity(),park.getCity(),park.getHotel(),park.getImage(),park.getName(),park.getState());
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);
	}

	@Override
	public List<Park> getState(String state_name) {
		List<Park> list = repo.filterState(state_name);
		return list;
	}

	@Override
	public List<Park> getCity(String city_name) {
		List<Park> list = repo.filterCity(city_name);
		return list;
	}


}