package com.NationalPark.controller;

import com.NationalPark.models.Activity;
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
	private Optional<Activity> getActivity(@PathVariable String id){
		Long idlong = Long.parseLong(id);
		return service.getActivity(idlong);
	}

	// get all type of activities
	@GetMapping
	private List<Activity> getActivities(){
		List<Activity> list = service.getActivities();
		return list;
	}

	// get 'safari' type activities
	@GetMapping(value = "/safari")
	private List<Activity> getSafari(){
		List<Activity> list = service.getSafari();
		return list;
	}


	// get 'safari' type activities with id
	@GetMapping(value = "/safari/{id}")
	private List<Activity> getSafariById(@PathVariable String id){
		Long idlong = Long.parseLong(id);
		List<Activity> list = service.getSafariById(idlong);
		return list;
	}

	// get 'safari' type activities with park_id
	@GetMapping(value = "/safari/park/{park_id}")
	private List<Activity> getSafariByParkId(@PathVariable String park_id){
		List<Activity> list = service.getSafariByParkId(park_id);
		return list;
	}

	// get 'other' type activities with park_id
	@GetMapping(value = "/others/park/{park_id}")
	private List<Activity> getOthersByParkId(@PathVariable String park_id){
		List<Activity> list = service.getOthersByParkId(park_id);
		return list;
	}

	@GetMapping(value = "/park/{park_id}")
	private List<Activity> getAllActivitiesByParkId(@PathVariable String park_id){
		List<Activity> list = service.getAllByParkId(park_id);
		return list;
	}

	// get 'other' type activities
	@GetMapping(value = "/others")
	private List<Activity> getOthers(){
		List<Activity> list = service.getOther();
		return list;
	}

	// get 'other' type activity with id
	@GetMapping(value = "/others/{id}")
	private List<Activity> getOthersById(@PathVariable String id){
		List<Activity> list = service.getOtherById(id);
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
	private Activity saveActivity(@RequestBody Activity activity){
		Activity activity1 = service.saveActivity(activity);
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
