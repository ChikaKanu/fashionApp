package com.example.codeclan.fashion.repository.tailors;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class TailorRepositoryImpl implements TailorRepositoryCustom {

    @Autowired
    EntityManager entityManager;

}
