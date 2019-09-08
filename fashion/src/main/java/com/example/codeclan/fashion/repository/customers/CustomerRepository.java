package com.example.codeclan.fashion.repository.customers;

import com.example.codeclan.fashion.models.Customer;
import com.example.codeclan.fashion.projections.CustomerProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = CustomerProjection.class)
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    Customer findByFirstName(String firstname);
}
