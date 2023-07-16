package com.NationalPark.controller;


import com.NationalPark.models.Enquiry;
import com.NationalPark.models.HotelEnquiry;
import com.NationalPark.models.SafariEnquiry;
import com.NationalPark.service.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin({"http://localhost:3000/","http://localhost:3001/"})
@RestController
@RequestMapping("/enquiry-api")
public class EnquiryController {

	@Autowired
	private EnquiryService service;


	// api for general enquiry without hotel and any activity
	@PostMapping
	public Enquiry saveGeneralEnquiry(@RequestBody Enquiry enquiry){
		Enquiry enquiry1 = service.saveEnquiry(enquiry);
		return enquiry1;
	}

	// api for enquiry with hotel and any activity from hotel-form
	@PostMapping(value = "/hotel-enquiry")
	public HotelEnquiry saveHotelEnquiry(@RequestBody HotelEnquiry enquiry){
		HotelEnquiry enquiry1 = service.saveHotelEnquiry(enquiry);
		return enquiry1;
	}

	// api for enquiry with safari and any activity from safari-form
	@PostMapping(value = "/safari-enquiry")
	public SafariEnquiry saveSafariEnquiry(@RequestBody SafariEnquiry enquiry){
		SafariEnquiry enquiry1 = service.saveSafariEnquiry(enquiry);
		return enquiry1;
	}

	// get all hotel Enquiry
	@GetMapping(value = "/hotel-enquiry")
	public List<HotelEnquiry> getAllHotelEnquiry(){
		List<HotelEnquiry> list = service.getAllHotel();
		return list;
	}

	// get all Safari Enquiry
	@GetMapping(value = "/safari-enquiry")
	public List<SafariEnquiry> getAllSafariEnquiry(){
		List<SafariEnquiry> list = service.getAllSafari();
		return list;
	}

	// get all General Enquiry
	@GetMapping
	public List<Enquiry> getAllEnquiry(){
		List<Enquiry> list = service.getAll();
		return list;
	}
}
