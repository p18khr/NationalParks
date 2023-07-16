package com.NationalPark.dao;

import com.NationalPark.models.park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ParkRepository extends JpaRepository<park, Long> {

	@Modifying
	@Query(value="update park u set u.about = :about, u.city = :city, u.image = :image, u.name = :name, u.state = :state where u.id = :id ")
	void updateById(@Param(value = "id") Long id,@Param(value = "about") String about,@Param(value = "city") String city,@Param(value = "image") String image,@Param(value = "name") String name,@Param(value = "state") String state);

	@Query(value = "select * from park u where u.state = :state",nativeQuery = true)
	List<park> filterState(@Param(value = "state") String state);

	@Query(value = "select * from park u where u.city = :city",nativeQuery = true)
	List<park> filterCity(@Param(value = "city")String city_name);

	@Query(value = "select distinct(u.city) from park u",nativeQuery = true)
	List<String> getCities();

	@Query(value = "select distinct(u.state) from park u",nativeQuery = true)
	List<String> getStates();

	@Query(value = "select distinct(u.name),u.id from park u",nativeQuery = true)
	List<String> getParks();

    @Query(value = "select distinct(u.name),u.id,u.image,u.city,u.state,u.about from park u inner join activity a on u.id = a.park_id where u.name like %:park_name% and u.state like %:state% and u.city like %:city% and a.name like %:activity_name%",nativeQuery = true)
	List<park> filterAll(@Param(value = "activity_name")String activity_name, @Param(value = "park_name") String park_name, @Param(value = "city") String city, @Param(value = "state") String state);

	@Query(value = "select * from park u where u.animal like %:animal_name% ",nativeQuery = true)
	List<park> animal(@Param(value = "animal_name")String animal_name);
}
