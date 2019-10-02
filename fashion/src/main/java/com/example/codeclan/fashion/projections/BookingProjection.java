package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.*;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDateTime;
import java.util.List;

@Projection(name = "embedded", types = Booking.class)
public interface BookingProjection {
    long getId();
    LocalDateTime getCreateDateTime();
    LocalDateTime getUpdateDateTime();
    UserDetail getUserDetail();
    double getBookingCost();
    String getStatus();
    String getRemarks();
    List<SelectedStyle> getSelectedStyles();

}