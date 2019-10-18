package com.example.codeclan.fashion.components;

import com.example.codeclan.fashion.models.*;
import com.example.codeclan.fashion.repository.UserRepository;
import com.example.codeclan.fashion.repository.addresses.AddressRepository;
import com.example.codeclan.fashion.repository.bookings.BookingRepository;
import com.example.codeclan.fashion.repository.fabricSuppliers.FabricSupplierRepository;
import com.example.codeclan.fashion.repository.fabrics.FabricRepository;
import com.example.codeclan.fashion.repository.measurements.MeasurementRepository;
import com.example.codeclan.fashion.repository.selectedStyles.SelectedStyleRepository;
import com.example.codeclan.fashion.repository.styles.StyleRepository;
import com.example.codeclan.fashion.repository.tailors.TailorRepository;
import com.example.codeclan.fashion.repository.userDetails.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    StyleRepository styleRepository;

    @Autowired
    UserDetailRepository userDetailRepository;

    @Autowired
    FabricRepository fabricRepository;

    @Autowired
    MeasurementRepository measurementRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    TailorRepository tailorRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    FabricSupplierRepository fabricSupplierRepository;

    @Autowired
    SelectedStyleRepository selectedStyleRepository;

    public DataLoader(){};

    public void run(ApplicationArguments arg) {


        Style style1 = new Style("Ashabi", "url",5000.00, "Gabriel Designs", "male");
        styleRepository.save(style1);
        Style style2 = new Style("Kroka", "url",4000.00, "Gabriel Designs", "female");
        styleRepository.save(style2);
        Style style3 = new Style("Afoja", "url",6000.00, "Gabriel Designs", "female");
        styleRepository.save(style3);
        Style style4 = new Style("Jonny", "url",10000.00, "Gabriel Designs", "female");
        styleRepository.save(style4);
        Style style5 = new Style("Shaba", "url",6000.00, "Onjor Designs", "female");
        styleRepository.save(style5);


        User user1 = new User("1", "Chika", "Kanu", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
        userRepository.save(user1);
        UserDetail userDetail1 = new UserDetail("Okon", "Odio",user1,"male");
        userDetailRepository.save(userDetail1);
        Address address1 = new Address("23 Hubby Crescent", "vfd", "EH113NU", "Edinburgh", "United Kingdom", userDetail1);
        addressRepository.save(address1);

        User user2 = new User("2", "Okey", "Onkaro", "chika@yahoo.com", "04023840928", "tryhbdgr23", "customer", null);
        userRepository.save(user2);
        UserDetail userDetail2 = new UserDetail("Okey", "Onkaro", user2,  "female");
        userDetailRepository.save(userDetail2);
        Address address2 = new Address( "10 columbia", "gwaso", "EH175NU", "Edinburgh", "United Kingdom", userDetail2);
        addressRepository.save(address2);


        User user3 = new User("3", "Jack", "Marbro", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
        userRepository.save(user3);
        UserDetail userDetail3 = new UserDetail("Jack", "Marbro",user3, "male");
        userDetailRepository.save(userDetail3);
        Address address3 = new Address("10 Clan Crescent", "Tombol", "EH141SH", "Edinburgh", "United Kingdom", userDetail3);
        addressRepository.save(address3);


        User user4 = new User("4", "Mary", "Ojoms", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
        userRepository.save(user4);
        UserDetail userDetail4 = new UserDetail("Jack", "Marbro",user4, "male");
        userDetailRepository.save(userDetail4);
        Address address4 = new Address("50 Lan Crescent", "balwern", "EH198SH", "Edinburgh", "United Kingdom", userDetail4);
        addressRepository.save(address4);
        FabricSupplier fabricSupplier11 = new FabricSupplier("Mary", "Ojoms", "Johny Fabrics Ltd");
        fabricSupplier11.setUserDetail(userDetail4);
        fabricSupplierRepository.save(fabricSupplier11);

        User user5 = new User("5", "Omini", "Vorous", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
        userRepository.save(user5);
        UserDetail userDetail5 = new UserDetail("Jack", "Marbro",user5, "male");
        userDetailRepository.save(userDetail5);
        Address address5 = new Address("20 Clan Crescent", "Tombol", "EH141SH", "Edinburgh", "United Kingdom", userDetail5);
        addressRepository.save(address5);
        FabricSupplier fabricSupplier12 = new FabricSupplier("Omini", "Vorous","Omni Ltd");
        fabricSupplier12.setUserDetail(userDetail5);
        fabricSupplierRepository.save(fabricSupplier12);

        User user6 = new User("6", "Constance", "Manor", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
        userRepository.save(user6);
        UserDetail userDetail6 = new UserDetail("Jack", "Marbro",user6, "male");
        userDetailRepository.save(userDetail6);
        Address address6 = new Address("100 Jonom Crescent", "Jonom", "EH157SH", "Edinburgh", "United Kingdom", userDetail6);
        addressRepository.save(address6);
        FabricSupplier fabricSupplier13 = new FabricSupplier("Constance", "Manor","Const Ltd");
        fabricSupplier13.setUserDetail(userDetail6);
        fabricSupplierRepository.save(fabricSupplier13);

        User user7 = new User("7","John", "Sade", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
        userRepository.save(user7);
        UserDetail userDetail7 = new UserDetail("Jack", "Marbro",user7, "male");
        userDetailRepository.save(userDetail7);
        Address address7 = new Address( "1 frow rd", null, "EH100SH", "Edinburgh", "United Kingdom", userDetail7);
        addressRepository.save(address7);
        Tailor tailor1 = new Tailor("John", "Sade",  "capita One Ltd");
        tailor1.setUserDetail(userDetail7);
        tailorRepository.save(tailor1);

        User user8 = new User("8", "Ngozi", "Nwafor", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
        userRepository.save(user8);
        UserDetail userDetail8 = new UserDetail("Jack", "Marbro",user8, "male");
        userDetailRepository.save(userDetail8);
        Address address8 = new Address("90 Crewe", "Stenhouse", "EH113ER", "Edinburgh", "United Kingdom", userDetail8);
        addressRepository.save(address8);
        Tailor tailor2 = new Tailor("Ngozi", "Nwafor", "Crossburn Ltd");
        tailor2.setUserDetail(userDetail8);
        tailorRepository.save(tailor2);

        User user9 = new User("9", "Craze", "Full", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
        userRepository.save(user9);
        UserDetail userDetail9 = new UserDetail("Jack", "Marbro",user9, "male");
        userDetailRepository.save(userDetail9);
        Address address9 = new Address("7685 Cross way", null, "EH176PT", "Edinburgh", "United Kingdom", userDetail9);
        addressRepository.save(address9);
        Tailor tailor3 = new Tailor("Craze", "Full", "jacko Interprise");
        tailor3.setUserDetail(userDetail9);
        tailorRepository.save(tailor3);


        Fabric fabric1 = new Fabric("Creshe", "url", 1200.00, "blue", 3.00, fabricSupplier11);
        fabricRepository.save(fabric1);
        Fabric fabric2 = new Fabric("Jonx", "url", 2000.00, "green", 5.00, fabricSupplier12);
        fabricRepository.save(fabric2);
        Fabric fabric3 = new Fabric("Bruz", "url", 1500.00, "red", 3.15, fabricSupplier13);
        fabricRepository.save(fabric3);

        Measurement measurement1 = new Measurement("Mary",20.03, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30,userDetail1);
        measurementRepository.save(measurement1);
        Measurement measurement2 = new Measurement("Jane",19.50, 24.00, 34.50, 42.30, 18.27, 19.00, 22.20, 16.20, 10.00,43.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30, userDetail1);
        measurementRepository.save(measurement2);
        Measurement measurement3 = new Measurement("Ify",23.03, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30, userDetail3);
        measurementRepository.save(measurement3);
        Measurement measurement4 = new Measurement("Ifun",21.20, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30,  userDetail1);
        measurementRepository.save(measurement4);
        Measurement measurement5 = new Measurement("Divine",22.00, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30, userDetail3);
        measurementRepository.save(measurement5);

        SelectedStyle selectedStyle1 = new SelectedStyle(style1, tailor1, "complete", "Completed without hitches", userDetail1);
        selectedStyle1.addFabric(fabric1);
        selectedStyle1.addFabric(fabric2);
        selectedStyle1.addMeasurement(measurement1);
        selectedStyle1.addMeasurement(measurement2);
        selectedStyleRepository.save(selectedStyle1);
        fabric1.addSelectedStyle(selectedStyle1);
        fabric2.addSelectedStyle(selectedStyle1);
        fabricRepository.save(fabric1);
        fabricRepository.save(fabric2);
        measurement1.addSelectedStyle(selectedStyle1);
        measurement2.addSelectedStyle(selectedStyle1);
        measurementRepository.save(measurement1);
        measurementRepository.save(measurement2);
        SelectedStyle selectedStyle2 = new SelectedStyle(style2,tailor2, "complete", null, userDetail2);
        selectedStyle2.addFabric(fabric3);
        selectedStyleRepository.save(selectedStyle2);
        fabric3.addSelectedStyle(selectedStyle2);
        SelectedStyle selectedStyle3 = new SelectedStyle(style3,tailor3, "complete", null, userDetail3);
        selectedStyleRepository.save(selectedStyle3);

        Booking booking1 = new Booking(userDetail1, "Incomplete", "Awaiting supply of Buttons to complete sowing");
        booking1.addSelectedStyle(selectedStyle1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking(userDetail2, "Completed", null);
        booking2.addSelectedStyle(selectedStyle2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking(userDetail3,"Incomplete", "Just received");
        booking3.addSelectedStyle(selectedStyle3);
        bookingRepository.save(booking3);


    }

}
