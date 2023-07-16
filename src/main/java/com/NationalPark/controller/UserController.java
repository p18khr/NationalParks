//package com.NationalPark.controller;
//
//
//import com.NationalPark.models.User;
//import com.NationalPark.service.UserService;
//import org.springframework.web.bind.annotation.*;
//
//@CrossOrigin({"http://localhost:3000/","http://localhost:3001/"})
//@RestController
//@RequestMapping("/user-api")
//public class UserController {
//
//	private UserService service;
//
//	@PostMapping(value = "/auth")
//	public boolean getUser(@RequestBody User user){
//       boolean val = service.get(user);
//	   return val;
//	}
//}
