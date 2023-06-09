package com.NationalPark.serviceImpl;

import com.NationalPark.dao.BlogRepository;
import com.NationalPark.models.Blog;
import com.NationalPark.service.BlogService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository repo;

	@Override
	public Blog saveBlog(Blog blog) {
		blog.setTimestamp(String.valueOf(new Date()));
		return repo.save(blog);
	}

	@Override
	public List<Blog> getblogs() {
		return repo.findAll();
	}

	@Override
	public Optional<Blog> getblog(String id) {
		Long idlong = Long.parseLong(id);
		return repo.findById(idlong);
	}

	@Override
	public void update(Blog blog) {
		repo.update(blog.getId(),blog.getImage(),blog.getContent(),blog.getTimestamp(),blog.getTitle());
	}

	@Override
	public void delete(String id) {
		Long idlong = Long.parseLong(id);
		repo.deleteById(idlong);
	}
}
