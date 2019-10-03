package com.example.codeclan.fashion;

import com.example.codeclan.fashion.models.*;
import com.example.codeclan.fashion.repository.bookings.BookingRepository;
import com.example.codeclan.fashion.repository.selectedStyles.SelectedStyleRepository;
import com.example.codeclan.fashion.repository.userDetails.UserDetailRepository;
import com.example.codeclan.fashion.repository.fabrics.FabricRepository;
import com.example.codeclan.fashion.repository.measurements.MeasurementRepository;
import com.example.codeclan.fashion.repository.styles.StyleRepository;
import com.example.codeclan.fashion.repository.tailors.TailorRepository;
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


	@Test
	public void contextLoads() {
	}

	@Test
	public void canSetGetTotalCost() {

		Style style1 = new Style("Ashabi", "url",5000.00, "Gabriel Designs", "male");
		styleRepository.save(style1);
		UserDetail userDetail1 = new UserDetail("EH113NU", "23 Hubby Crescent", "Edinburgh", "08035457997", "female");
		userDetailRepository.save(userDetail1);
		Tailor tailor1 = new Tailor("John", "Sade", "04023840928", "address");
		tailorRepository.save(tailor1);
		Booking booking1 = new Booking(userDetail1, "Incomplete", "Awaiting supply of Buttons to complete sowing");
		SelectedStyle selectedStyle1 = new SelectedStyle(style1,  tailor1, "complete", "Completed without hitches", booking1, userDetail1);
		Measurement measurement1 = new Measurement("Mary",20.03, 34.00, 35.50, 40.30, 18.23, 20.00, 23.23, 14.02, 10.00,35.40, 43.20, 20.40, 32.50, 15.00, 34.00, 24.00, 18.23, 43.23, 22.00, 34.00,22.30, selectedStyle1, userDetail1);
		measurementRepository.save(measurement1);
		Fabric fabric1 = new Fabric("Creshe", "url", 1200.00, "blue", 3.00, selectedStyle1);
		fabricRepository.save(fabric1);


		selectedStyle1.addMeasurement(measurement1);
		selectedStyleRepository.save(selectedStyle1);
		bookingRepository.save(booking1);
		assertEquals(8600, booking1.getBookingCost(),2);
	}

}
