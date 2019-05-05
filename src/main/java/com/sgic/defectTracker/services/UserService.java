package com.sgic.defectTracker.services;

import java.util.List;

import com.sgic.defectTracker.entities.User;

public interface UserService {
	
	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(int userId);

	User getUserById(int userId);

	List<User> getAllUsers();
}
