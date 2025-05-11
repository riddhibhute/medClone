package com.example.medClone.controller;

import com.example.medClone.entity.Customer;
import com.example.medClone.repo.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Customer> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return repository.save(customer);
    }
}