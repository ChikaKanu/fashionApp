package com.example.codeclan.fashion.repository.fabrics;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class FabricRepositoryImpl implements FabricRepositoryCustom{

    @Autowired
    EntityManager entityManager;
}
