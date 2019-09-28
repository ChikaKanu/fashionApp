package com.example.codeclan.fashion.repository.selectedStyles;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class SelectedStyleRepositoryImpl {

    @Autowired
    EntityManager entityManager;
}
