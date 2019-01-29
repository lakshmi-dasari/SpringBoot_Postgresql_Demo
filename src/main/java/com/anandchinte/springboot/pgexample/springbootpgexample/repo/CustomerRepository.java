package com.anandchinte.springboot.pgexample.springbootpgexample.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anandchinte.springboot.pgexample.springbootpgexample.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
