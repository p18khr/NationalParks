package com.NationalPark.serviceImpl;

import com.NationalPark.dao.ParkRepository;
import com.NationalPark.models.FilterBody;
import com.NationalPark.models.park;
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
	public park savepark(park park) {
		return repo.save(park);
	}

	@Override
	public Optional<park> Get(Long id) {
		return repo.findById(id);
	}

	@Override
	public List<park> getAll() {
		return repo.findAll();
	}

	@Override
	public void Update(park park) {
		repo.updateById(park.getId(),park.getAbout(),park.getCity(),park.getImage(),park.getName(),park.getState());
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}

	@Override
	public List<park> getState(String state_name) {
		List<park> list = repo.filterState(state_name);
		return list;
	}

	@Override
	public List<park> getCity(String city_name) {
		List<park> list = repo.filterCity(city_name);
		return list;
	}

	@Override
	public List<String> getSname() {
		List<String> list = repo.getStates();
		return list;
	}

	@Override
	public List<String> getCname() {
		List<String> list = repo.getCities();
		return list;
	}

	@Override
	public List<String> getPname() {
		List<String> list = repo.getParks();
		return list;
	}

	@Override
	public List<park> Filter(FilterBody filter) {
		return repo.filterAll(filter.getActivity_name(),filter.getPark_name(),filter.getCity(),filter.getState());
	}

	@Override
	public List<park> getAnimal(String animal_name) {
		return repo.animal(animal_name);
	}


}
