package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bookings")
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JsonIgnoreProperties("styles")
    @ManyToOne
    @JoinColumn(name = "style_id", nullable = false)
    private Style style;


    @JsonIgnoreProperties("fabrics")
    @ManyToOne
    @JoinColumn(name = "fabric_id", nullable = false)
    private Fabric fabric;

    @JsonIgnoreProperties("customers")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;


    @JsonIgnoreProperties("measurements")
    @ManyToOne
    @JoinColumn(name = "measurement_id", nullable = false)
    private Measurement measurement;

    @Column(name = "totalCost")
    private Float totalCost;

    @JsonIgnoreProperties("tailors")
    @ManyToOne
    @JoinColumn(name = "tailor_id", nullable = false)
    private Tailor tailor;

    public Booking(Style style, Fabric fabric, Customer customer, Measurement measurement, Float totalCost, Tailor tailor) {
        this.style = style;
        this.fabric = fabric;
        this.customer = customer;
        this.measurement = measurement;
        this.totalCost = totalCost;
        this.tailor = tailor;
    }

    public Booking(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    public Tailor getTailor() {
        return tailor;
    }

    public void setTailor(Tailor tailor) {
        this.tailor = tailor;
    }
}
