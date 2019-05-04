package com.example.codeclan.fashion.models;

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
    private Double fabricCost;

    @Column(name = "colour")
    private String colour;

    @Column(name = "quantity")
    private Double quantity;

//    @JsonIgnoreProperties("bookings")
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
//    @OneToMany(mappedBy = "fabric", fetch = FetchType.LAZY)
//    private List<Booking> bookings;


    public Fabric(String name, String picture, Double fabricCost, String colour, Double quantity) {
        this.name = name;
        this.picture = picture;
        this.fabricCost = fabricCost;
        this.colour = colour;
        this.quantity = quantity;
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

    public Double getFabricCost() {
        return fabricCost;
    }

    public void setFabricCost(Double fabricCost) {
        this.fabricCost = fabricCost;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
//
//    public List<Booking> getBookings() {
//        return bookings;
//    }
//
//    public void setBookings(List<Booking> bookings) {
//        this.bookings = bookings;
//    }


}
