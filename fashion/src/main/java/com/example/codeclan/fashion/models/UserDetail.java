package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userDetails")
public class UserDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address1", nullable = false)
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "postCode")
    private String postCode;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

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

    public UserDetail(User user, String postCode, String address1, String address2, String phoneNumber, String gender) {
        this.user = user;
        this.address1 = address1;
        this.address2 = address2;
        this.postCode = postCode;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.bill = bill;
        this.bookings = new ArrayList<>();
    }

    public UserDetail() {
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
