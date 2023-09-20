package com.codemy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemy.dto.OrderRequest;
import com.codemy.model.Customer;
import com.codemy.repository.CustomerRepo;
import com.codemy.repository.ProductRepo;

@RestController
public class OrderController {
	@Autowired
    private CustomerRepo customerRepo;
	@Autowired
	private ProductRepo productRepo;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepo.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer>findAllOrders(){
		return customerRepo.findAll();
		}
	
}
