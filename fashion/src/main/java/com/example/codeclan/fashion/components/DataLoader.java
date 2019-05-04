package com.example.codeclan.fashion.components;

import com.example.codeclan.fashion.models.Customer;
import com.example.codeclan.fashion.models.Fabric;
import com.example.codeclan.fashion.models.Style;
import com.example.codeclan.fashion.repository.bookings.BookingRepository;
import com.example.codeclan.fashion.repository.customers.CustomerRepository;
import com.example.codeclan.fashion.repository.fabrics.FabricRepository;
import com.example.codeclan.fashion.repository.measurements.MeasurementRepository;
import com.example.codeclan.fashion.repository.styles.StyleRepository;
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

        Fabric fabric1 = new Fabric();

    }

}
