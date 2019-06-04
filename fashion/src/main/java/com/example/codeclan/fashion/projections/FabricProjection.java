package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Booking;
import com.example.codeclan.fashion.models.Fabric;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = Fabric.class)
public interface FabricProjection {
    long getId();
    String getName();
    String getPicture();
    double getFabricCost();
    String getColour();
    double getQuantity();
    Booking getBooking();
}
