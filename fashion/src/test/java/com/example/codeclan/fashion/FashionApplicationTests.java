package com.example.codeclan.fashion;

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
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FashionApplicationTests {
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
	SelectedStyleRepository selectedStyleRepository;

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	FabricSupplierRepository fabricSupplierRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void canSetGetTotalCost() {

		Style style1 = new Style("Ashabi", "url",5000.00, "Gabriel Designs", "male");
		styleRepository.save(style1);
		User user1 = new User("1", "Chika", "Kanu", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
		userRepository.save(user1);
		UserDetail userDetail1 = new UserDetail("Okon", "Odio",user1,"male");
		userDetailRepository.save(userDetail1);
		Address address1 = new Address("23 Hubby Crescent", "vfd", "EH113NU", "Edinburgh", "United Kingdom", userDetail1);
		addressRepository.save(address1);
		Tailor tailor1 = new Tailor("John", "Sade",  "capita One Ltd");
		tailorRepository.save(tailor1);
		Booking booking1 = new Booking(userDetail1, "Incomplete", "Awaiting supply of Buttons to complete sowing");
		SelectedStyle selectedStyle1 = new SelectedStyle(style1, tailor1, "complete", "Completed without hitches", userDetail1);
		selectedStyle1.setBooking(booking1);
		Measurement measurement1 = new Measurement("Mary",20.03, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30,  userDetail1);
		measurementRepository.save(measurement1);
		User user2 = new User("1", "Chika", "Kanu", "chika@yahoo.com", "04023840928", "xthbdgr23", "customer", null);
		userRepository.save(user2);
		UserDetail userDetail2 = new UserDetail("Okon", "Odio",user2,"male");
		userDetailRepository.save(userDetail2);
		Address address2 = new Address("20 Clan Crescent", "Tombol", "EH141SH", "Edinburgh", "United Kingdom", userDetail2);
		addressRepository.save(address2);
		FabricSupplier fabricSupplier12 = new FabricSupplier("Omini", "Vorous","Omni Ltd");
		fabricSupplier12.setUserDetail(userDetail2);
		fabricSupplierRepository.save(fabricSupplier12);
		Fabric fabric1 = new Fabric("Creshe", "url", 1200.00, "blue", 3.00, fabricSupplier12);
		fabricRepository.save(fabric1);


		selectedStyle1.addMeasurement(measurement1);
		selectedStyleRepository.save(selectedStyle1);
		bookingRepository.save(booking1);
		assertEquals(8600, booking1.getBookingCost(),2);
	}

}
