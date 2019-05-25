package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Booking;
import com.example.codeclan.fashion.models.Tailor;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = Tailor.class)
public interface TailorProjection {
    long getId();
    String getFirstName();
    String getSurname();
    String getContact();
    List<Booking> getBookings();
}
