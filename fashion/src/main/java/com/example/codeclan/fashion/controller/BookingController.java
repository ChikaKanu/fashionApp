package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.Booking;
import com.example.codeclan.fashion.models.Fabric;
import com.example.codeclan.fashion.repository.bookings.BookingRepository;
import com.example.codeclan.fashion.repository.fabrics.FabricRepository;
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

    @PutMapping(value = "/{id}")
    public void updateAddBooking(@PathVariable long id) {
        Booking booking = bookingRepository.getOne(id);
        bookingRepository.save(booking);
    }

    @PutMapping(value="/{id}/fabric/{fabricId}")
    public void updateAddBooking(@PathVariable long id, @PathVariable long fabricId){
        Booking booking = bookingRepository.getOne(id);
        Fabric fabric = fabricRepository.getOne(fabricId);
        booking.addFabrics(fabric);
        bookingRepository.save(booking);
    }


}
