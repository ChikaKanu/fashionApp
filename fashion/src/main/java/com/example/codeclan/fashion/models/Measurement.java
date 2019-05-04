package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "measurements")
public class Measurement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bust")
    private Float bust;

    @Column(name = "underBust")
    private Float underBust;

    @Column(name = "waist")
    private Float waist;

    @Column(name = "hip")
    private Float hip;

    @Column(name = "shoulder")
    private Float shoulder;

    @Column(name = "armLength")
    private Float armLength;

    @Column(name = "neck")
    private Float neck;

    @Column(name = "bicep")
    private Float bicep;

    @Column(name = "wrist")
    private Float wrist;

    @Column(name = "bustHeight")
    private Float bustHeight;

    @Column(name = "shoulderToWaistFront")
    private Float shoulderToWaistFront;

    @Column(name = "bustSeparation")
    private Float bustSeparation;

    @Column(name = "shoulderToWaistBack")
    private Float shoulderToWaistBack;

    @Column(name = "backWidth")
    private Float backWidth;

    @Column(name = "hipHeight")
    private Float hipHeight;

    @Column(name = "thigh")
    private Float thigh;

    @Column(name = "calf")
    private Float calf;

    @Column(name = "legLength")
    private Float legLength;

    @Column(name = "waistToFloor")
    private Float waistToFloor;

    @Column(name = "neckToFloor")
    private Float neckToFloor;

    @Column(name = "totalHeight")
    private Float totalHeight;

    @JsonIgnoreProperties("bookings")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "measurement", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public Measurement(Float bust, Float underBust, Float waist, Float hip, Float shoulder, Float armLength, Float neck, Float bicep, Float wrist, Float bustHeight, Float shoulderToWaistFront, Float bustSeparation, Float shoulderToWaistBack, Float backWidth, Float hipHeight, Float thigh, Float calf, Float legLength, Float waistToFloor, Float neckToFloor, Float totalHeight) {
        this.bust = bust;
        this.underBust = underBust;
        this.waist = waist;
        this.hip = hip;
        this.shoulder = shoulder;
        this.armLength = armLength;
        this.neck = neck;
        this.bicep = bicep;
        this.wrist = wrist;
        this.bustHeight = bustHeight;
        this.shoulderToWaistFront = shoulderToWaistFront;
        this.bustSeparation = bustSeparation;
        this.shoulderToWaistBack = shoulderToWaistBack;
        this.backWidth = backWidth;
        this.hipHeight = hipHeight;
        this.thigh = thigh;
        this.calf = calf;
        this.legLength = legLength;
        this.waistToFloor = waistToFloor;
        this.neckToFloor = neckToFloor;
        this.totalHeight = totalHeight;
        this.bookings = new ArrayList<>();
    }

    public Measurement(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getBust() {
        return bust;
    }

    public void setBust(Float bust) {
        this.bust = bust;
    }

    public Float getUnderBust() {
        return underBust;
    }

    public void setUnderBust(Float underBust) {
        this.underBust = underBust;
    }

    public Float getWaist() {
        return waist;
    }

    public void setWaist(Float waist) {
        this.waist = waist;
    }

    public Float getHip() {
        return hip;
    }

    public void setHip(Float hip) {
        this.hip = hip;
    }

    public Float getShoulder() {
        return shoulder;
    }

    public void setShoulder(Float shoulder) {
        this.shoulder = shoulder;
    }

    public Float getArmLength() {
        return armLength;
    }

    public void setArmLength(Float armLength) {
        this.armLength = armLength;
    }

    public Float getNeck() {
        return neck;
    }

    public void setNeck(Float neck) {
        this.neck = neck;
    }

    public Float getBicep() {
        return bicep;
    }

    public void setBicep(Float bicep) {
        this.bicep = bicep;
    }

    public Float getWrist() {
        return wrist;
    }

    public void setWrist(Float wrist) {
        this.wrist = wrist;
    }

    public Float getBustHeight() {
        return bustHeight;
    }

    public void setBustHeight(Float bustHeight) {
        this.bustHeight = bustHeight;
    }

    public Float getShoulderToWaistFront() {
        return shoulderToWaistFront;
    }

    public void setShoulderToWaistFront(Float shoulderToWaistFront) {
        this.shoulderToWaistFront = shoulderToWaistFront;
    }

    public Float getBustSeparation() {
        return bustSeparation;
    }

    public void setBustSeparation(Float bustSeparation) {
        this.bustSeparation = bustSeparation;
    }

    public Float getShoulderToWaistBack() {
        return shoulderToWaistBack;
    }

    public void setShoulderToWaistBack(Float shoulderToWaistBack) { this.shoulderToWaistBack = shoulderToWaistBack; }

    public Float getBackWidth() {
        return backWidth;
    }

    public void setBackWidth(Float backWidth) { this.backWidth = backWidth; }

    public Float getHipHeight() {
        return hipHeight;
    }

    public void setHipHeight(Float hipHeight) {
        this.hipHeight = hipHeight;
    }

    public Float getThigh() {
        return thigh;
    }

    public void setThigh(Float thigh) {
        this.thigh = thigh;
    }

    public Float getCalf() {
        return calf;
    }

    public void setCalf(Float calf) { this.calf = calf; }

    public Float getLegLength() {
        return legLength;
    }

    public void setLegLength(Float legLength) {
        this.legLength = legLength;
    }

    public Float getWaistToFloor() {
        return waistToFloor;
    }

    public void setWaistToFloor(Float waistToFloor) {
        this.waistToFloor = waistToFloor;
    }

    public Float getNeckToFloor() {
        return neckToFloor;
    }

    public void setNeckToFloor(Float neckToFloor) {
        this.neckToFloor = neckToFloor;
    }

    public Float getTotalHeight() {
        return totalHeight;
    }

    public void setTotalHeight(Float totalHeight) {
        this.totalHeight = totalHeight;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    public void removeBooking(Booking booking) {
        this.bookings.remove(booking);
    }
}
