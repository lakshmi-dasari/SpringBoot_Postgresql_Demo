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
import com.anandchinte.springboot.pgexample.springbootpgexample.repo.CustomRepo;



@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomRepo customRepo;
	
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	
	@PostMapping("/customers")
	public Customer CreateUser(@Valid @RequestBody Customer customers) {
		return customerRepository.save(customers);
		
	}
	
	//@CrossOrigin(origins = "*")
	@GetMapping("/customers/{email}")
	public List<Customer> getPasswordByEmail(@PathVariable(value="email") String email){
		return customRepo.getPasswordByUsername(email);
	}
	
	//changing here

	//anand comment

	//another comment

}
