package com.NationalPark.dao;

import com.NationalPark.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel,Long> {

	@Query(value = "select * from Hotel u where u.park_id = :id",nativeQuery = true)
	List<Hotel> findHById(@Param(value = "id") Long id);

	@Query(value = "select * from Hotel u where u.park_id = :id order by u.price asc",nativeQuery = true)
	List<Hotel> sort(@Param(value = "id") String park_id);

	@Query(value = "select * from Hotel u where u.park_id = :id order by u.price desc",nativeQuery = true)
	List<Hotel> reverse(@Param(value = "id") String park_id);

	@Modifying
	@Query(value = "update Hotel u set u.about = :about, u.image = :image, u.name = :name, u.price = :price, u.ac = :ac, u.laundry= :laundry, u.location = :location, u.pool = :pool, u.wifi = :wifi where u.id = :id ")
	void update(@Param(value = "id")Long id,@Param(value = "about") String about,@Param(value = "image") String image,@Param(value = "name") String name,@Param(value = "ac") String ac,@Param(value = "laundry") String laundry,@Param(value = "location") String location,@Param(value = "pool") String pool,@Param(value = "wifi") String wifi,@Param(value = "price") double price);
}
