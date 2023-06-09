package com.NationalPark.service;

import com.NationalPark.models.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
	Blog saveBlog(Blog blog);

	List<Blog> getblogs();

	Optional<Blog> getblog(String id);

	void update(Blog blog);

	void delete(String id);
}
