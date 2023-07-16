package com.NationalPark.controller;

import com.NationalPark.models.FilterBody;
import com.NationalPark.models.park;
import com.NationalPark.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin({"http://localhost:3000/","http://localhost:3001/"})
@RestController
@RequestMapping("/park-api")
public class ParkController {

	@Autowired
	private ParkService service;

	@PostMapping
    public park savePark(@RequestBody park park){
		service.savepark(park);
		return park;
    }

	@GetMapping("/{id}")
	public Optional<park> getPark(@PathVariable String id){
		Long idlong = Long.parseLong(id);
		return service.Get(idlong);
	}

	@GetMapping
	public List<park> getAllPark(){
		List<park> list = service.getAll();
		return list;
	}

	@GetMapping("/state/{state_name}")
	public List<park> getState(@PathVariable String state_name){
		List<park> list = service.getState(state_name);
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

   // get all city name
	@GetMapping("/city")
	public List<String> getCityName(){
		List<String> list = service.getCname();
		return list;
	}


    // get
	@GetMapping("/city/{city_name}")
	public List<park> getCity(@PathVariable String city_name){
		List<park> list = service.getCity(city_name);
		return list;
	}

	@GetMapping("/animal/{animal_name}")
	public List<park> getAnimal(@PathVariable String animal_name){
		List<park> list = service.getAnimal(animal_name);
		return list;
	}



    @PostMapping("/filter")
	public List<park> filter(@RequestBody FilterBody filter){
       List<park> list = service.Filter(filter);
	   return list;
	}

	@PutMapping
	public park updatePark(@RequestBody park park){
		service.Update(park);
		return park;
	}

	@DeleteMapping("/{id}")
	public void deletePark(@PathVariable String id){
		Long idnew = Long.parseLong(id);
		service.delete(idnew);
	}


}
