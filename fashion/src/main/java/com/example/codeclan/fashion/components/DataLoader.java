package com.example.codeclan.fashion.components;

import com.example.codeclan.fashion.models.*;
import com.example.codeclan.fashion.repository.bookings.BookingRepository;
import com.example.codeclan.fashion.repository.customers.CustomerRepository;
import com.example.codeclan.fashion.repository.fabrics.FabricRepository;
import com.example.codeclan.fashion.repository.measurements.MeasurementRepository;
import com.example.codeclan.fashion.repository.styles.StyleRepository;
import com.example.codeclan.fashion.repository.tailors.TailorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    StyleRepository styleRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    FabricRepository fabricRepository;

    @Autowired
    MeasurementRepository measurementRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    TailorRepository tailorRepository;

    public DataLoader(){};

    public void run(ApplicationArguments arg) {

        Style style1 = new Style("Ashabi", "url",5000.00, "Gabriel Designs");
        styleRepository.save(style1);
        Style style2 = new Style("Kroka", "url",4000.00, "Gabriel Designs");
        styleRepository.save(style2);
        Style style3 = new Style("Afoja", "url",6000.00, "Gabriel Designs");
        styleRepository.save(style3);
        Style style4 = new Style("Jonny", "url",10000.00, "Gabriel Designs");
        styleRepository.save(style4);
        Style style5 = new Style("Shaba", "url",6000.00, "Onjor Designs");
        styleRepository.save(style5);

        Customer customer1 = new Customer("Mary", "Ojoms", "23 Hubby Crescent", "08035457997", "female");
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Jane", "Okoro", "10 Roseburn Crescent", "08774720998", "female");
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Ify", "Kay", "32 Clay Str", "01035477823", "female");
        customerRepository.save(customer3);
        Customer customer4 = new Customer("Ifun", "Favour", "8 Harlaw March", "07735457997", "female");
        customerRepository.save(customer4);
        Customer customer5 = new Customer("Divine", "Kan", "2 Cromtom Crescent", "08045757997", "female");
        customerRepository.save(customer5);

        Tailor tailor1 = new Tailor("John", "Sade", "04023840928", "address");
        tailorRepository.save(tailor1);
        Tailor tailor2 = new Tailor("Ngozi", "Nwafor", "02023840928", "address");
        tailorRepository.save(tailor2);
        Tailor tailor3 = new Tailor("Craze", "Full", "04023844234", "address");
        tailorRepository.save(tailor3);
        Tailor tailor4 = new Tailor("Laff", "Kri", "01022384092", "address");
        tailorRepository.save(tailor4);
        Tailor tailor5 = new Tailor("Kata", "Kay", "080568884098", "address");
        tailorRepository.save(tailor5);

        Measurement measurement1 = new Measurement("Mary",20.03, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30);
        measurementRepository.save(measurement1);
        Measurement measurement2 = new Measurement("Jane",19.50, 24.00, 34.50, 42.30, 18.27, 19.00, 22.20, 16.20, 10.00,43.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30);
        measurementRepository.save(measurement2);
        Measurement measurement3 = new Measurement("Ify",23.03, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30);
        measurementRepository.save(measurement3);
        Measurement measurement4 = new Measurement("Ifun",21.20, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30);
        measurementRepository.save(measurement4);
        Measurement measurement5 = new Measurement("Divine",22.00, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30);
        measurementRepository.save(measurement5);

        Booking booking1 = new Booking("23-04-2019", style1, customer1, measurement1, tailor1, "Incomplete", "Awaiting supply of Buttons to complete sowing");
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("20-04-2019", style2, customer2, measurement2, tailor2, "Completed", null);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("19-04-2019", style3, customer3, measurement3, tailor3,"Incomplete", "Just received");
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("18-04-2019", style4, customer5, measurement4, tailor4,"Incomplete", "Just received");
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("16-04-2019", style5, customer5, measurement5, tailor5, "Incomplete", null);
        bookingRepository.save(booking5);

        Fabric fabric1 = new Fabric("Creshe", "url", 1200.00, "blue", 3.00, booking1);
        fabricRepository.save(fabric1);
        Fabric fabric2 = new Fabric("Jonx", "url", 2000.00, "green", 5.00, booking2);
        fabricRepository.save(fabric2);
        Fabric fabric3 = new Fabric("Bruz", "url", 1500.00, "red", 3.15, booking3);
        fabricRepository.save(fabric3);
        Fabric fabric4 = new Fabric("Hules", "url", 3000.00, "white", 4.00, booking4);
        fabricRepository.save(fabric4);
        Fabric fabric5 = new Fabric("Joles", "url", 1340.00, "blue", 1.00, booking5);
        fabricRepository.save(fabric5);

    }

}
