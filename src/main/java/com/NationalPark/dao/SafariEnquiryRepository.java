package com.NationalPark.dao;

import com.NationalPark.models.SafariEnquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SafariEnquiryRepository extends JpaRepository<SafariEnquiry, Long> {
}
