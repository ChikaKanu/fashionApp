package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Booking;
import com.example.codeclan.fashion.models.User;
import com.example.codeclan.fashion.models.UserDetail;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = UserDetail.class)
public interface UserDetailProjection {
    long getId();
    User getUser();
    String getAddress1();
    String getAddress2();
    String getPostCode();
    String getPhoneNumber();
    String getGender();
    double getBill();
    List<Booking> getBookings();
}