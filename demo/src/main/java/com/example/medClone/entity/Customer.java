package com.example.medClone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    // Getters and Setters
}
