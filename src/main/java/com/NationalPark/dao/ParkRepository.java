package com.NationalPark.dao;

import com.NationalPark.models.Park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ParkRepository extends JpaRepository<Park, String> {

	@Modifying
	@Query(value="update Park u set u.about = :about, u.activity = :activity, u.city = :city, u.hotel = :hotel, u.image = :image, u.name = :name, u.state = :state where u.id = :id ")
	void updateById(@Param(value = "id") String id,@Param(value = "about") String about,@Param(value = "activity") String activity,@Param(value = "city") String city,@Param(value = "hotel") String hotel,@Param(value = "image") String image,@Param(value = "name") String name,@Param(value = "state") String state);

	@Query(value = "select * from Park u where u.state = :state")
	List<Park> filterState(@Param(value = "state") String state);

	@Query(value = "select * from Park u where u.city = :city")
	List<Park> filterCity(@Param(value = "city")String city_name);
}
