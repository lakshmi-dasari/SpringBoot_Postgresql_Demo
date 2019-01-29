package com.anandchinte.springboot.pgexample.springbootpgexample.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anandchinte.springboot.pgexample.springbootpgexample.exception.ResourceNotFoundException;
import com.anandchinte.springboot.pgexample.springbootpgexample.model.Customer;
import com.anandchinte.springboot.pgexample.springbootpgexample.repo.CustomerRepository;



@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		
		return customerRepository.findAll();
	}
	
	
	
	

}
