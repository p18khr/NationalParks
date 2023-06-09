package com.NationalPark.controller;

import com.NationalPark.models.Blog;
import com.NationalPark.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@CrossOrigin({"http://localhost:3000/","http://localhost:3001/"})
@RestController
@RequestMapping("/blog-api")
public class BlogController {

	@Autowired
	private BlogService service;

	@PostMapping
	public Blog saveBlog(@RequestBody Blog blog){
		Blog blog1 = service.saveBlog(blog);
		return blog1;
	}

	@GetMapping
	public List<Blog> getBlogs(){
		List<Blog> list = service.getblogs();
		return list;
	}

	@GetMapping(value = "/{id}")
	public Optional<Blog> getBlog(@PathVariable String id){
		Optional<Blog> blog = service.getblog(id);
		return blog;
	}

	@PutMapping
	public void updateBlog(@RequestBody Blog blog){
		service.update(blog);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteBlog(@PathVariable String id){
		service.delete(id);
	}
}
