package com.NationalPark.controller;

import com.NationalPark.models.hotel;
import com.NationalPark.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin({"http://localhost:3000/","http://localhost:3001/"})
@RestController
@RequestMapping("/hotel-api")
public class HotelController {

	@Autowired
	private HotelService service;


	@PostMapping
	public hotel saveHotel(@RequestBody hotel hotel){
		com.NationalPark.models.hotel hotel1 = service.saveHotel(hotel);
		return hotel1;
	}

	@GetMapping
	public List<hotel> getAll(){
		List<hotel> list = service.getHotels();
		return list;
	}

	@GetMapping("/park/{park_id}")
	public List<hotel> getAllByPark(@PathVariable String park_id){
		Long idlong = Long.parseLong(park_id);
		return service.getHotelById(idlong);
	}

	@GetMapping("/{id}")
	public Optional<hotel> get(@PathVariable String id){
		Long idlong = Long.parseLong(id);
		return service.getHotel(idlong);
	}

	@GetMapping("/sort/{park_id}")
	public List<hotel> sort(@PathVariable String park_id){
		List<hotel> list = service.sortHotel(park_id);
		return list;
	}

	@GetMapping("/reverse/{park_id}")
	public List<hotel> reverse(@PathVariable String park_id){
		List<hotel> list = service.reverseHotel(park_id);
		return list;
	}

	@PutMapping
	public void update(@RequestBody hotel hotel){
		service.update(hotel);

	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable String id){
		service.delete(id);
	}
}
