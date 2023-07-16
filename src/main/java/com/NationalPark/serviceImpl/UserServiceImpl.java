//package com.NationalPark.serviceImpl;
//
//import com.NationalPark.dao.UserRepository;
//import com.NationalPark.models.User;
//import com.NationalPark.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//import java.util.Optional;
//
//public class UserServiceImpl implements UserService {
//
//	@Autowired
//	private UserRepository repo;
//
//	@Override
//	public boolean get(User user) {
//		List<User> list = repo.findAll();
//		for (User u:list) {
//			if(u.getUser_name().matches(user.getUser_name())){
//				if (u.getPassword().matches(user.getPassword())){
//					return true;
//				}
//			}
//		}
//		return false;
//	}
//}
