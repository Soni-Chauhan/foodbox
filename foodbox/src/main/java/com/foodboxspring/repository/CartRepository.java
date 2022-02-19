package com.foodboxspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodboxspring.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}