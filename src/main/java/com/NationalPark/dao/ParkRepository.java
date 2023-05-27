package com.NationalPark.dao;

import com.NationalPark.models.Park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ParkRepository extends JpaRepository<Park, Long> {

	@Modifying
	@Query(value="update Park u set u.about = :about, u.city = :city, u.image = :image, u.name = :name, u.state = :state where u.id = :id ")
	void updateById(@Param(value = "id") Long id,@Param(value = "about") String about,@Param(value = "city") String city,@Param(value = "image") String image,@Param(value = "name") String name,@Param(value = "state") String state);

	@Query(value = "select * from Park u where u.state = :state",nativeQuery = true)
	List<Park> filterState(@Param(value = "state") String state);

	@Query(value = "select * from Park u where u.city = :city",nativeQuery = true)
	List<Park> filterCity(@Param(value = "city")String city_name);

	@Query(value = "select u.city from Park u",nativeQuery = true)
	List<String> getCities();

	@Query(value = "select u.state from Park u",nativeQuery = true)
	List<String> getStates();

	@Query(value = "select u.name from Park u",nativeQuery = true)
	List<String> getParks();
}
