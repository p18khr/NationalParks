package com.NationalPark.controller;

import com.NationalPark.models.blog;
import com.NationalPark.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin({"http://localhost:3000/","http://localhost:3001/"})
@RestController
@RequestMapping("/blog-api")
public class BlogController {

	@Autowired
	private BlogService service;

	@PostMapping
	public blog saveBlog(@RequestBody blog blog){
		com.NationalPark.models.blog blog1 = service.saveBlog(blog);
		return blog1;
	}

	@GetMapping
	public List<blog> getBlogs(){
		List<blog> list = service.getblogs();
		return list;
	}

	@GetMapping(value = "/{id}")
	public Optional<blog> getBlog(@PathVariable String id){
		Optional<blog> blog = service.getblog(id);
		return blog;
	}

	@PutMapping
	public void updateBlog(@RequestBody blog blog){
		service.update(blog);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteBlog(@PathVariable String id){
		service.delete(id);
	}
}
