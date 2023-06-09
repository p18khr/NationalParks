package com.NationalPark.controller;

import com.NationalPark.models.FilterBody;
import com.NationalPark.models.Park;
import com.NationalPark.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Filter;

@CrossOrigin({"http://localhost:3000/","http://localhost:3001/"})
@RestController
@RequestMapping("/park-api")
public class ParkController {

	@Autowired
	private ParkService service;

	@PostMapping
    public Park savePark(@RequestBody Park park){
		service.savepark(park);
		return park;
    }

	@GetMapping("/{id}")
	public Optional<Park> getPark(@PathVariable String id){
		Long idlong = Long.parseLong(id);
		return service.Get(idlong);
	}

	@GetMapping
	public List<Park> getAllPark(){
		List<Park> list = service.getAll();
		return list;
	}

	@GetMapping("/state/{state_name}")
	public List<Park> getState(@PathVariable String state_name){
		List<Park> list = service.getState(state_name);
		return list;
	}

	@GetMapping("/state")
	public List<String> getStateName(){
		List<String> list = service.getSname();
		return list;
	}

	@GetMapping("/park")
	public List<String> getParkName(){
		List<String> list = service.getPname();
		return list;
	}


	@GetMapping("/city")
	public List<String> getCityName(){
		List<String> list = service.getCname();
		return list;
	}

	@GetMapping("/city/{city_name}")
	public List<Park> getCity(@PathVariable String city_name){
		List<Park> list = service.getCity(city_name);
		return list;
	}

    @PostMapping("/filter")
	public List<Park> filter(@RequestBody FilterBody filter){
       List<Park> list = service.Filter(filter);
	   return list;
	}

	@PutMapping
	public Park updatePark(@RequestBody Park park){
		service.Update(park);
		return park;
	}

	@DeleteMapping("/{id}")
	public void deletePark(@PathVariable String id){
		Long idnew = Long.parseLong(id);
		service.delete(idnew);
	}


}
