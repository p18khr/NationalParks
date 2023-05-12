package com.NationalPark.controller;

import com.NationalPark.models.Park;
import com.NationalPark.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/park-api")
public class ParkController {

	@Autowired
	private ParkService service;

	@PostMapping
    public Park savePark(Park park){
		Park park1 = service.savePark(park);
		return park1;
    }

	@GetMapping("/{id}")
	public Optional<Park> getPark(@PathVariable String id){
		return service.Get(id);
	}

	@GetMapping()
	public List<Park> getAllPark(){
		List<Park> list = service.getAll();
		return list;
	}

	@GetMapping("/state/{state_name}")
	public List<Park> getState(@PathVariable String state_name){
		List<Park> list = service.getState(state_name);
		return list;
	}

	@GetMapping("/city/{city_name}")
	public List<Park> getCity(@PathVariable String city_name){
		List<Park> list = service.getCity(city_name);
		return list;
	}



	@PutMapping
	public Park updatePark(@RequestBody Park park){
		service.Update(park);
		return park;
	}

	@DeleteMapping("/{id}")
	public String deletePark(@PathVariable String id){
		service.delete(id);
		return "park entry with id "+id+"deleted";
	}


}
