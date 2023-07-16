package com.NationalPark.service;

import com.NationalPark.models.blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
	blog saveBlog(blog blog);

	List<blog> getblogs();

	Optional<blog> getblog(String id);

	void update(blog blog);

	void delete(String id);
}
