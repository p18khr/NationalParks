package com.NationalPark.dao;

import com.NationalPark.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel,Long> {

	@Query(value = "select * from Hotel u where u.park_id = :id",nativeQuery = true)
	List<Hotel> findHById(@Param(value = "id") Long id);
}
