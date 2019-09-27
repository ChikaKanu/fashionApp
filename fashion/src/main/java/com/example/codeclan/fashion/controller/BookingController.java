package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.*;
import com.example.codeclan.fashion.repository.bookings.BookingRepository;
import com.example.codeclan.fashion.repository.userDetails.UserDetailRepository;
import com.example.codeclan.fashion.repository.fabrics.FabricRepository;
import com.example.codeclan.fashion.repository.measurements.MeasurementRepository;
import com.example.codeclan.fashion.repository.styles.StyleRepository;
import com.example.codeclan.fashion.repository.tailors.TailorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    FabricRepository fabricRepository;

    @Autowired
    UserDetailRepository userDetailRepository;

    @Autowired
    MeasurementRepository measurementRepository;

    @Autowired
    TailorRepository tailorRepository;

    @Autowired
    StyleRepository styleRepository;

    @PutMapping(value = "/{id}")
    public void updateAddBooking(@PathVariable long id) {
        Booking booking = bookingRepository.getOne(id);
        bookingRepository.save(booking);
    }

    @PutMapping(value="/{id}/fabric/{fabricId}/customer/{customerId}/measurement/{measurementId}/style/{styleId}/tailor/{ tailorId}/ ")
    public void updateAddBooking(@PathVariable long id, @PathVariable long fabricId, @PathVariable long customerId, @PathVariable long measurementId, @PathVariable long styleId, @PathVariable long tailorId ){
        Booking booking = bookingRepository.getOne(id);
        Fabric fabric = fabricRepository.getOne(fabricId);
        UserDetail userDetail = userDetailRepository.getOne(customerId);
        Measurement measurement = measurementRepository.getOne(styleId);
        Style style = styleRepository.getOne(styleId);
        Tailor tailor = tailorRepository.getOne(tailorId);
        booking.setUserDetail(userDetail);
        bookingRepository.save(booking);
    }
//
//    @PutMapping(value="/{id}/fabric/{fabricId}"/)
//    public void updateAddBooking(@PathVariable long id, @PathVariable long fabricId){
//        Booking booking = bookingRepository.getOne(id);
//        Fabric fabric = fabricRepository.getOne(fabricId);
//        booking.addFabrics(fabric);
//        bookingRepository.save(booking);
//    }
//


}
