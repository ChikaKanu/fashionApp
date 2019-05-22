package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = Booking.class)
public interface BookingProjection {
    long getId();
    String getDate();
    Style getStyle();
    List<Fabric> getFabrics();
    Customer getCustomer();
    Measurement getMeasurement();
    double getTotalCost();
    Tailor getTailor();
}
