package com.example.codeclan.fashion.repository.customers;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;
}
