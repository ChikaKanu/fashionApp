package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.Customer;
import com.example.codeclan.fashion.repository.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PutMapping(value = "/{id}")
    public void updateAddCustomer(@PathVariable long id) {
        Customer customer = customerRepository.getOne(id);
        customerRepository.save(customer);
    }
}
