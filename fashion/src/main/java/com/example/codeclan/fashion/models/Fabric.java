package com.example.codeclan.fashion.models;

import com.example.codeclan.fashion.controller.BookingController;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
    private Float fabricCost;

    @Column(name = "colour")
    private String colour;

    @Column(name = "quantity")
    private String quantity;

    @JsonIgnoreProperties("bookings")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "fabric", fetch = FetchType.LAZY)
    private List<Booking> bookings;


    public Fabric(String name, String picture, Float fabricCost, String colour, String quantity) {
        this.name = name;
        this.picture = picture;
        this.fabricCost = fabricCost;
        this.colour = colour;
        this.quantity = quantity;
        this.bookings = new ArrayList<>();
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

    public Float getFabricCost() {
        return fabricCost;
    }

    public void setFabricCost(Float fabricCost) {
        this.fabricCost = fabricCost;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }


}
