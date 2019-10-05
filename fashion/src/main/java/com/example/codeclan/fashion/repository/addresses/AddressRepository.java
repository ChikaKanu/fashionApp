package com.example.codeclan.fashion.repository.addresses;

import com.example.codeclan.fashion.models.Address;
import com.example.codeclan.fashion.projections.AddressProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = AddressProjection.class)
public interface AddressRepository extends JpaRepository<Address, Long> {
}
