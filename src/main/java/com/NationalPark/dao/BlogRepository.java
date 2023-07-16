package com.NationalPark.dao;

import com.NationalPark.models.blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BlogRepository extends JpaRepository<blog, Long> {


	@Modifying
	@Query(value = "update blog u set u.title = :title, u.content = :content, u.image = :image, u.timestamp = :timestamp where u.id = :id ")
	void update(@Param(value = "id") Long id,@Param(value = "image") String image,@Param(value = "content") String content,@Param(value = "timestamp") String timestamp,@Param(value = "title") String title);
}
