package com.sgic.defectTracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defectTracker.entities.User;
import com.sgic.defectTracker.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public User getUserById(int userId) {
		return userRepository.findUserById(userId);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
	this.userRepository = userRepository;
	}
	
	

}
