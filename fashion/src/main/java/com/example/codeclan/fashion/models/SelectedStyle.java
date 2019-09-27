package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="selectedStyles")
public class SelectedStyle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "style_id")
    private Style style;

    @OneToOne
    @JoinColumn(name = "tailor_id")
    private Tailor tailor;

    @JsonIgnoreProperties("fabrics")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "selectedStyle", fetch = FetchType.LAZY)
    private List<Fabric> fabrics;

    @JsonIgnoreProperties("measurements")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "selectedStyle", fetch = FetchType.LAZY)
    private List<Measurement> measurements;

    @JsonIgnoreProperties("booking")
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @Column(name = "status")
    private String status;

    @Column(name = "remarks")
    private String remarks;

    public SelectedStyle(Style style, Tailor tailor, String status, String remarks){
        this.style = style;
        this.tailor = tailor;
        this.status = status;
        this.remarks = remarks;
        this.booking = booking;
        this.measurements = new ArrayList<>();
        this.fabrics = new ArrayList<>();
    }

    public SelectedStyle(){};

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

    public Tailor getTailor() {
        return tailor;
    }

    public void setTailor(Tailor tailor) {
        this.tailor = tailor;
    }

    public List<Fabric> getFabrics() {
        return fabrics;
    }

    public double getTotalStyleCost() {
        double fabricCostForQuantity = 0.00;
        for (Fabric fabric : this.fabrics) {
            fabricCostForQuantity += fabric.getFabricCost() * fabric.getQuantity();
        }
        return fabricCostForQuantity + this.getStyle().getLabourCost();
    }

    public void setFabrics(List<Fabric> fabrics) {
        this.fabrics = fabrics;
    }

    public void addFabric(Fabric fabric){
        this.fabrics.add(fabric);
    }

    public void removeFabric(Fabric fabric){
        this.fabrics.remove(fabric);
    }

    public List<Measurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<Measurement> measurements) {
        this.measurements = measurements;
    }

    public void addMeasurement(Measurement measurement) {
        this.measurements.add(measurement);
    }

    public void removeMeasurement(Measurement measurement){
        this.measurements.remove(measurement);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}

