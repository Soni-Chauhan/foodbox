package com.foodboxspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodboxspring.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String>{

	Admin findByusername(String username);

}