package com.NationalPark.controller;

import com.NationalPark.models.Hotel;
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
	public Hotel saveHotel(@RequestBody Hotel hotel){
		Hotel hotel1 = service.saveHotel(hotel);
		return hotel1;
	}

	@GetMapping
	public List<Hotel> getAll(){
		List<Hotel> list = service.getHotels();
		return list;
	}

	@GetMapping("/park/{park_id}")
	public List<Hotel> getAllByPark(@PathVariable String park_id){
		Long idlong = Long.parseLong(park_id);
		return service.getHotelById(idlong);
	}

	@GetMapping("/{id}")
	public Optional<Hotel> get(@PathVariable String id){
		Long idlong = Long.parseLong(id);
		return service.getHotel(idlong);
	}

	@GetMapping("/sort/{park_id}")
	public List<Hotel> sort(@PathVariable String park_id){
		List<Hotel> list = service.sortHotel(park_id);
		return list;
	}

	@GetMapping("/reverse/{park_id}")
	public List<Hotel> reverse(@PathVariable String park_id){
		List<Hotel> list = service.reverseHotel(park_id);
		return list;
	}

	@PutMapping
	public void update(@RequestBody Hotel hotel){
		service.update(hotel);

	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable String id){
		service.delete(id);
	}
}
