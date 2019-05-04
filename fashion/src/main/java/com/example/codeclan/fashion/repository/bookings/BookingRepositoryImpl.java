package com.example.codeclan.fashion.repository.bookings;

import com.example.codeclan.fashion.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> allBookings(){
        List<Booking> bookings = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Booking.class);
            bookings = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return bookings;
    }


}
