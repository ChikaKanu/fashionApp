package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.*;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = UserDetail.class)
public interface UserDetailProjection {
    long getId();
    String getFirstName();
    String getSurname();
    User getUser();
    Tailor getTailor();
    FabricSupplier getFabricSupplier();
    Address getAddress();
    String getGender();
    double getBill();
    List<Booking> getBookings();
    List<Measurement> getMeasurements();
    List<SelectedStyle> getSelectedStyles();
}