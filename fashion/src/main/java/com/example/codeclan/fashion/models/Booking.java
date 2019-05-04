package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private String date;

    @JsonIgnoreProperties("styles")
    @ManyToOne
    @JoinColumn(name = "style_id", nullable = false)
    private Style style;

    @JsonIgnoreProperties("fabrics")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    private List<Fabric> fabrics;

    @JsonIgnoreProperties("customers")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;


    @JsonIgnoreProperties("measurements")
    @ManyToOne
    @JoinColumn(name = "measurement_id", nullable = false)
    private Measurement measurement;

    @Column(name = "totalCost")
    private Double totalCost;

    @JsonIgnoreProperties("tailors")
    @ManyToOne
    @JoinColumn(name = "tailor_id", nullable = false)
    private Tailor tailor;

    public Booking(String date, Style style, Customer customer, Measurement measurement, Tailor tailor) {
        this.date = date;
        this.style = style;
        this.customer = customer;
        this.measurement = measurement;
        this.tailor = tailor;
        this.totalCost = totalCost;
        this.fabrics = new ArrayList<>();
    }

    public Booking(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
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

    public void setTotalCost() {
        Double fabricCostForQuantity = 0.00;
        for (Fabric fabric : this.fabrics) {
            Double cost = fabric.getFabricCost() * fabric.getQuantity();
            fabricCostForQuantity += cost;
        }
        this.totalCost = fabricCostForQuantity + this.getStyle().getLabourCost();
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public Tailor getTailor() {
        return tailor;
    }

    public void setTailor(Tailor tailor) {
        this.tailor = tailor;
    }

    public void setFabrics(List<Fabric> fabrics) {
        this.fabrics = fabrics;
    }

    public List<Fabric> getFabrics() {
        return fabrics;
    }

    public void addFabrics(Fabric fabric) {
        this.fabrics.add(fabric);
    }

    public void removeFabrics(Fabric fabric) {
        this.fabrics.remove(fabric);
    }

}
