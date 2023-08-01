package com.example.employeeactivities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeactivities.entity.User;

public interface UserRespository extends JpaRepository<User, Long> {
	public User findByUsername(String username);
}
