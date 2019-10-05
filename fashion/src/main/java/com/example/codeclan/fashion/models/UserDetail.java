package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userDetails")
public class UserDetail extends Resource implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "gender")
    private String gender;

    @Column(name = "bill")
    private double bill;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @JsonIgnoreProperties("bookings")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "userDetail", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    @JsonIgnoreProperties("measurements")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "userDetail", fetch = FetchType.LAZY)
    private List<Measurement> measurements;

    @JsonIgnoreProperties("selectedStyles")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "userDetail", fetch = FetchType.LAZY)
    private List<SelectedStyle> selectedStyles;

    public UserDetail(String firstName, String surname, Address address, String gender) {
        super(firstName, surname);
        this.address = address;
        this.gender = gender;
        this.user = user;
        this.bill = bill;
        this.bookings = new ArrayList<>();
        this.measurements = new ArrayList<>();
        this.selectedStyles = new ArrayList<>();
    }

    public UserDetail(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public double getBill() {
        double customerBill = 0.00;
        for (Booking booking : this.bookings) {
            customerBill += booking.getBookingCost();
        }
        return customerBill;
    }

    public void setBill() {
        this.bill = getBill();
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    public void removeBooking(Booking booking) {
        this.bookings.remove(booking);
    }

    public List<Measurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<Measurement> measurements) {
        this.measurements = measurements;
    }

    public List<SelectedStyle> getSelectedStyles() {
        return selectedStyles;
    }

    public void setSelectedStyles(List<SelectedStyle> selectedStyles) {
        this.selectedStyles = selectedStyles;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
