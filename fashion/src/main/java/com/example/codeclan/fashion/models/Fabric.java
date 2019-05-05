package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "fabrics")
public class Fabric implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;

    @Column(name = "fabricCost")
    private double fabricCost;

    @Column(name = "colour")
    private String colour;

    @Column(name = "quantity")
    private double quantity;

    @JsonIgnoreProperties("bookings")
    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    public Fabric(String name, String picture, double fabricCost, String colour, double quantity, Booking booking) {
        this.name = name;
        this.picture = picture;
        this.fabricCost = fabricCost;
        this.colour = colour;
        this.quantity = quantity;
        this.booking = booking;
    }

    public Fabric(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getFabricCost() {
        return fabricCost;
    }

    public void setFabricCost(double fabricCost) {
        this.fabricCost = fabricCost;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
