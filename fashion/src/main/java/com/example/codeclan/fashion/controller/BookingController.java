package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.Booking;
import com.example.codeclan.fashion.repository.bookings.BookingRepository;
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

    @PutMapping(value = "/{id}")
    public void updateAddBooking(@PathVariable long id) {
        Booking booking = bookingRepository.getOne(id);
        bookingRepository.save(booking);
    }


}
