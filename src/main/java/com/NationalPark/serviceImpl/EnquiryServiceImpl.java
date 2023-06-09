package com.NationalPark.serviceImpl;

import com.NationalPark.dao.EnquiryRepository;
import com.NationalPark.dao.HotelEnquiryRepository;
import com.NationalPark.dao.SafariEnquiryRepository;
import com.NationalPark.models.Enquiry;
import com.NationalPark.models.HotelEnquiry;
import com.NationalPark.models.SafariEnquiry;
import com.NationalPark.service.EnquiryService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiryRepository repo;

	@Autowired
	private HotelEnquiryRepository hotelRepo;

	@Autowired
	private SafariEnquiryRepository safariRepo;

	@Override
	public Enquiry saveEnquiry(Enquiry enquiry) {
		return repo.save(enquiry);
	}

	@Override
	public List<Enquiry> getAll() {
		return repo.findAll();
	}

	@Override
	public HotelEnquiry saveHotelEnquiry(HotelEnquiry enquiry) {
		return hotelRepo.save(enquiry);
	}

	@Override
	public List<HotelEnquiry> getAllHotel() {
		return hotelRepo.findAll();
	}

	@Override
	public SafariEnquiry saveSafariEnquiry(SafariEnquiry enquiry) {
		return safariRepo.save(enquiry);
	}

	@Override
	public List<SafariEnquiry> getAllSafari() {
		return safariRepo.findAll();
	}
}
