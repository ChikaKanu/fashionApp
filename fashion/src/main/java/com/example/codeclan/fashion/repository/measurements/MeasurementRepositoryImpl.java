package com.example.codeclan.fashion.repository.measurements;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class MeasurementRepositoryImpl {
    @Autowired
    EntityManager entityManager;
}
