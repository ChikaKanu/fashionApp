package com.example.codeclan.fashion.repository.styles;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class StyleRepositoryImpl implements StyleRepositoryCustom{

    @Autowired
    EntityManager entityManager;
}
