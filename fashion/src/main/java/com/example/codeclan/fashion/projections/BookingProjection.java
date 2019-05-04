package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Booking.class)
public interface BookingProjection {
    long getId();
    String getDate();
    Style getStyle();
    Fabric getFabric();
    Customer getCustomer();
    Measurement getMeasurement();
    Float getTotalCost();
    Tailor getTailor();
}
