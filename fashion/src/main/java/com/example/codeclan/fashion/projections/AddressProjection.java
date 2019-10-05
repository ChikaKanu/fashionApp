package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Address;
import com.example.codeclan.fashion.models.Resource;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedded", types = Address.class)
public interface AddressProjection {
    long getId();
    String getAddress1();
    String getAddress2();
    String getPostcode();
    String getCounty();
    String getCountry();
    Resource getResource();
}
