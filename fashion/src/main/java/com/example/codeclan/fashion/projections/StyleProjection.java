package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Booking;
import com.example.codeclan.fashion.models.Style;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = Style.class)
public interface StyleProjection {
    long getId();
    String getName();
    String getImage();
    double getLabourCost();
    String getSource();
    List<Booking> getBookings();
}
