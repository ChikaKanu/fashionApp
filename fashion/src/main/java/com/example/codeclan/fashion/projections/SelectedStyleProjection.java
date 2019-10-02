package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types= SelectedStyle.class)
public interface SelectedStyleProjection {
    long getId();
    Style getStyle();
    Tailor getTailor();
    String getStatus();
    String getRemarks();
    Booking getBooking();
    List<Measurement> getMeasurements();
    List<Fabric> getFabrics();
}