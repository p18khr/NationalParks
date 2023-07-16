package com.NationalPark.controller;

import com.NationalPark.models.activity;
import com.NationalPark.models.UpdateActivity;
import com.NationalPark.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin({"http://localhost:3000/","http://localhost:3001/"})
@RestController
@RequestMapping("/activity-api")
public class ActivityController {

	@Autowired
	private ActivityService service;


	// get all type of activities with id
	@GetMapping("/{id}")
	private Optional<activity> getActivity(@PathVariable String id){
		Long idlong = Long.parseLong(id);
		return service.getActivity(idlong);
	}

	// get all type of activities
	@GetMapping
	private List<activity> getActivities(){
		List<activity> list = service.getActivities();
		return list;
	}

	// get 'safari' type activities
	@GetMapping(value = "/safari")
	private List<activity> getSafari(){
		List<activity> list = service.getSafari();
		return list;
	}


	// get 'safari' type activities with id
	@GetMapping(value = "/safari/{id}")
	private List<activity> getSafariById(@PathVariable String id){
		Long idlong = Long.parseLong(id);
		List<activity> list = service.getSafariById(idlong);
		return list;
	}

	// get 'safari' type activities with park_id
	@GetMapping(value = "/safari/park/{park_id}")
	private List<activity> getSafariByParkId(@PathVariable String park_id){
		List<activity> list = service.getSafariByParkId(park_id);
		return list;
	}

	// get 'other' type activities with park_id
	@GetMapping(value = "/others/park/{park_id}")
	private List<activity> getOthersByParkId(@PathVariable String park_id){
		List<activity> list = service.getOthersByParkId(park_id);
		return list;
	}

	@GetMapping(value = "/park/{park_id}")
	private List<activity> getAllActivitiesByParkId(@PathVariable String park_id){
		List<activity> list = service.getAllByParkId(park_id);
		return list;
	}

	// get 'other' type activities
	@GetMapping(value = "/others")
	private List<activity> getOthers(){
		List<activity> list = service.getOther();
		return list;
	}

	// get 'other' type activity with id
	@GetMapping(value = "/others/{id}")
	private List<activity> getOthersById(@PathVariable String id){
		List<activity> list = service.getOtherById(id);
		return list;
	}

	// find just the name of all the activities
	@GetMapping(value="/name")
	private List<String> getActivityName(){
		List<String> list = service.getActivityName();
		return list;
	}

    // save a activity
	@PostMapping
	private activity saveActivity(@RequestBody activity activity){
		com.NationalPark.models.activity activity1 = service.saveActivity(activity);
		return  activity1;
	}

	@PutMapping
	private void update(@RequestBody UpdateActivity activity){
		service.updateActivity(activity);
	}

	@DeleteMapping(value = "/{id}")
	private void delete(@PathVariable String id){
		service.delete(id);
	}
}
