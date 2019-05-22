package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Booking;
import com.example.codeclan.fashion.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = Customer.class)
public interface CustomerProjection {
    long getId();
    String getFirstName();
    String getSurname();
    String getAddress();
    String getContact();
    String getGender();
    double getBill();
    List<Booking> getBookings();
}
