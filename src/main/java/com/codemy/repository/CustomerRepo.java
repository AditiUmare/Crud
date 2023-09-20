package com.codemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemy.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer , Integer> {

}
