package com.codemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemy.model.Product;

public interface ProductRepo extends JpaRepository<Product , Integer>{

}
