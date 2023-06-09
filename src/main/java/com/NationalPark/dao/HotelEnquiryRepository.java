package com.NationalPark.dao;

import com.NationalPark.models.HotelEnquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelEnquiryRepository extends JpaRepository<HotelEnquiry,Long> {
}
