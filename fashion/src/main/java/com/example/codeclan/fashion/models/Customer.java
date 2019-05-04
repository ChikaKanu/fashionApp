package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "address")
    private String address;

    @Column(name = "contact")
    private String contact;

    @Column(name = "gender")
    private String gender;

    @Column(name = "bill")
    private Double bill;

    @JsonIgnoreProperties("bookings")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public Customer(String firstName, String surname, String address, String contact, String gender) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.contact = contact;
        this.gender = gender;
        this.bill = bill;
        this.bookings = new ArrayList<>();
    }

    public Customer() {
    };

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public void setBill() {
        Double customerBill = 0.00;
        for (Booking booking : this.bookings) {
            customerBill += booking.getTotalCost();
        }
       this.bill = customerBill;
    }

    public Double getBill() {
        return bill;
    }




}

