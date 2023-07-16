package com.NationalPark.dao;

import com.NationalPark.models.hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HotelRepository extends JpaRepository<hotel,Long> {

	@Query(value = "select * from hotel u where u.park_id = :id",nativeQuery = true)
	List<hotel> findHById(@Param(value = "id") Long id);

	@Query(value = "select * from hotel u where u.park_id = :id order by u.price asc",nativeQuery = true)
	List<hotel> sort(@Param(value = "id") String park_id);

	@Query(value = "select * from hotel u where u.park_id = :id order by u.price desc",nativeQuery = true)
	List<hotel> reverse(@Param(value = "id") String park_id);

	@Modifying
	@Query(value = "update hotel u set u.about = :about, u.image1 = :image1, u.image2 = :image2, u.image3 = :image3, u.image4 = :image4, u.image5 = :image5, u.image6 = :image6, u.image7 = :image7, u.image8 = :image8, u.image9 = :image9, u.image10 = :image10, u.name = :name, u.price = :price, u.ac = :ac, u.laundry= :laundry, u.location = :location, u.pool = :pool, u.wifi = :wifi where u.id = :id ")
	void update(@Param(value = "id")Long id,@Param(value = "about") String about,@Param(value = "image1") String image1,@Param(value = "image2") String image2,@Param(value = "image3") String image3,@Param(value = "image4") String image4,@Param(value = "image5") String image5,@Param(value = "image6") String image6,@Param(value = "image7") String image7,@Param(value = "image8") String image8,@Param(value = "image9") String image9,@Param(value = "image10") String image10,@Param(value = "name") String name,@Param(value = "ac") String ac,@Param(value = "laundry") String laundry,@Param(value = "location") String location,@Param(value = "pool") String pool,@Param(value = "wifi") String wifi,@Param(value = "price") double price);
}
