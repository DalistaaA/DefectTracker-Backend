package com.sgic.defectTracker.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defectTracker.entities.User;
import com.sgic.defectTracker.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveUseer")
	public HttpStatus createUser(@Valid @RequestBody User user) {
		userService.saveUser(user);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllUsers")
	public List<User> findAllUsers(){
		return userService.getAllUsers();
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findUserById/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable("userId") int userId) {
		
		return new ResponseEntity<User>(userService.getUserById(userId),HttpStatus.OK);
	}
	
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user){
		userService.updateUser(user);
		return new ResponseEntity<User>(user, HttpStatus.NO_CONTENT);
	}
	
	@CrossOrigin("http://localhost:3000")
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<User> deleteUser(@PathVariable("userId") int userId){
		userService.deleteUser(userId);;
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		
	}
	
	
	
}
