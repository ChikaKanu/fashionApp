package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "styles")
public class Style implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "labourCost")
    private Double labourCost;

    @Column(name = "source")
    private String source;

    @JsonIgnoreProperties("bookings")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "style", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public Style(String name, String image, Double labourCost, String source) {
        this.name = name;
        this.image = image;
        this.labourCost = labourCost;
        this.source = source;
        this.bookings = new ArrayList<>();
    }

    public Style () {};

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getLabourCost() {
        return labourCost;
    }

    public void setLabourCost(Double labourCost) {
        this.labourCost = labourCost;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
