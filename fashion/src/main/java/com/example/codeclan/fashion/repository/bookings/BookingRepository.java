package com.example.codeclan.fashion.repository.bookings;

import com.example.codeclan.fashion.models.Booking;
import com.example.codeclan.fashion.projections.BookingProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = BookingProjection.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
