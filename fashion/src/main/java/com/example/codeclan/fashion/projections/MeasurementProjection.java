package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Booking;
import com.example.codeclan.fashion.models.Measurement;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedded", types = Measurement.class)
public interface MeasurementProjection {
    long getId();
    double getBust();
    double getUnderBust();
    double getWaist();
    double getHip();
    double getShoulder();
    double getArmLength();
    double getNeck();
    double getBicep();
    double getWrist();
    double getBustHeight();
    double getShoulderToWaistFront();
    double getBustSeparation();
    double getShoulderToWaistBack();
    double getBackWidth();
    double getHipHeight();
    double getThigh();
    double getCalf();
    double getLegLength();
    double getWaistToFloor();
    double getNeckToFloor();
    double getTotalHeight();
    List<Booking> getBookings();
}
