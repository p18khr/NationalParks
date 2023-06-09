package com.NationalPark.dao;

import com.NationalPark.models.Activity;
import com.NationalPark.models.UpdateActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity,Long> {

	@Query(value = "select * from Activity u where u.type like '%safari%' ",nativeQuery = true)
	List<Activity> findSafari();

	@Query(value = "select * from Activity u where u.type like '%other%'  ",nativeQuery = true)
	List<Activity> findOthers();

	@Query(value = "select * from Activity u where u.type like '%safari%' and u.id = :id",nativeQuery = true)
	List<Activity> findSafariById(@Param(value = "id") Long idlong);

	@Query(value = "select * from Activity u where u.type like '%safari%' and u.park_id = :id",nativeQuery = true)
	List<Activity> findSafariByParkId(@Param(value = "id") String park_id);

	@Query(value = "select * from Activity u where u.type like '%other%' and u.park_id = :id",nativeQuery = true)
	List<Activity> findOthersByParkId(@Param(value = "id") String park_id);

	@Query(value = "select * from Activity u where u.type like '%other%' and u.id = :id",nativeQuery = true)
	List<Activity> findOthersById(@Param(value = "id") String id);

	@Query(value = "select distinct(u.name) from Activity u",nativeQuery = true)
	List<String> findName();

	@Modifying
	@Query(value = "update Activity u set u.about = :about, u.name = :name, u.price = :price, u.image = :image where u.id = :id ")
	void update(@Param(value = "id")Long id, @Param(value = "about") String about, @Param(value = "name") String name, @Param(value = "price") double price,@Param(value = "image") String image);

	@Query(value = "select * from Activity u where u.park_id = :park_id",nativeQuery = true)
	List<Activity> getAll(@Param(value = "park_id") String park_id);
}
