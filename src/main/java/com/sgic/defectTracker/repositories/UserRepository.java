package com.sgic.defectTracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.defectTracker.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserById(int userId);
}
