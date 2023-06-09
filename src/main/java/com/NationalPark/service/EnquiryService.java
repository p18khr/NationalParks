package com.NationalPark.service;

import com.NationalPark.models.Enquiry;
import com.NationalPark.models.HotelEnquiry;
import com.NationalPark.models.SafariEnquiry;

import java.util.List;

public interface EnquiryService {
	public Enquiry saveEnquiry(Enquiry enquiry);

	List<Enquiry> getAll();

	HotelEnquiry saveHotelEnquiry(HotelEnquiry enquiry);

	List<HotelEnquiry> getAllHotel();

	SafariEnquiry saveSafariEnquiry(SafariEnquiry enquiry);

	List<SafariEnquiry> getAllSafari();
}
