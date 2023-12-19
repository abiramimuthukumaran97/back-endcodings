package com.example.tripbooking.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.controller.UserController;
import com.example.tripbooking.service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public User login( @RequestHeader String emailid ,@RequestHeader String password) {
		
		return ((UserController) userService).login( emailid, password); 
	}
	
	@PostMapping("/post")
	public User addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@PutMapping("/update")
	public User update(@RequestHeader String emailid , @RequestBody User User ) {
		
		return userService.updated(emailid,User);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String emailid) {
		userService.Delete(emailid);
		return "data deleted";
	}
	
	
}
