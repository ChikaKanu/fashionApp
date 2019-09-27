package com.example.codeclan.fashion.repository.userDetails;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class UserDetailRepositoryImpl implements UserDetailRepositoryCustom {

    @Autowired
    EntityManager entityManager;
}
