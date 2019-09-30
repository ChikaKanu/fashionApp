package com.example.codeclan.fashion.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "measurements")
public class Measurement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="sizeOwner")
    private String sizeOwner;

    @Column(name = "bust")
    private double bust;

    @Column(name = "underBust")
    private double underBust;

    @Column(name = "waist")
    private double waist;

    @Column(name = "hip")
    private double hip;

    @Column(name = "shoulder")
    private double shoulder;

    @Column(name = "armLength")
    private double armLength;

    @Column(name = "neck")
    private double neck;

    @Column(name = "bicep")
    private double bicep;

    @Column(name = "wrist")
    private double wrist;

    @Column(name = "bustHeight")
    private double bustHeight;

    @Column(name = "shoulderToWaistFront")
    private double shoulderToWaistFront;

    @Column(name = "bustSeparation")
    private double bustSeparation;

    @Column(name = "shoulderToWaistBack")
    private double shoulderToWaistBack;

    @Column(name = "backWidth")
    private double backWidth;

    @Column(name = "hipHeight")
    private double hipHeight;

    @Column(name = "thigh")
    private double thigh;

    @Column(name = "calf")
    private double calf;

    @Column(name = "legLength")
    private double legLength;

    @Column(name = "waistToFloor")
    private double waistToFloor;

    @Column(name = "neckToFloor")
    private double neckToFloor;

    @Column(name = "totalHeight")
    private double totalHeight;

    @JsonIgnoreProperties("measurements")
    @ManyToOne
    @JoinColumn(name = "selectedStyle_id")
    private SelectedStyle selectedStyle;

    @JsonIgnoreProperties("measurements")
    @ManyToOne
    @JoinColumn(name = "style_id")
    private Style style;

    public Measurement(String sizeOwner, double bust, double underBust, double waist, double hip, double shoulder, double armLength, double neck, double bicep, double wrist, double bustHeight, double shoulderToWaistFront, double bustSeparation, double shoulderToWaistBack, double backWidth, double hipHeight, double thigh, double calf, double legLength, double waistToFloor, double neckToFloor, double totalHeight) {
        this.sizeOwner = sizeOwner;
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
        this.selectedStyle = selectedStyle;
        this.style = style;
    }

    public Measurement(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBust() {
        return bust;
    }

    public void setBust(double bust) {
        this.bust = bust;
    }

    public double getUnderBust() {
        return underBust;
    }

    public void setUnderBust(double underBust) {
        this.underBust = underBust;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public double getHip() {
        return hip;
    }

    public void setHip(double hip) {
        this.hip = hip;
    }

    public double getShoulder() {
        return shoulder;
    }

    public void setShoulder(double shoulder) {
        this.shoulder = shoulder;
    }

    public double getArmLength() {
        return armLength;
    }

    public void setArmLength(double armLength) {
        this.armLength = armLength;
    }

    public double getNeck() {
        return neck;
    }

    public void setNeck(double neck) {
        this.neck = neck;
    }

    public double getBicep() {
        return bicep;
    }

    public void setBicep(double bicep) {
        this.bicep = bicep;
    }

    public double getWrist() {
        return wrist;
    }

    public void setWrist(double wrist) {
        this.wrist = wrist;
    }

    public double getBustHeight() {
        return bustHeight;
    }

    public void setBustHeight(double bustHeight) {
        this.bustHeight = bustHeight;
    }

    public double getShoulderToWaistFront() {
        return shoulderToWaistFront;
    }

    public void setShoulderToWaistFront(double shoulderToWaistFront) {
        this.shoulderToWaistFront = shoulderToWaistFront;
    }

    public double getBustSeparation() {
        return bustSeparation;
    }

    public void setBustSeparation(double bustSeparation) {
        this.bustSeparation = bustSeparation;
    }

    public double getShoulderToWaistBack() {
        return shoulderToWaistBack;
    }

    public void setShoulderToWaistBack(double shoulderToWaistBack) { this.shoulderToWaistBack = shoulderToWaistBack; }

    public double getBackWidth() {
        return backWidth;
    }

    public void setBackWidth(double backWidth) { this.backWidth = backWidth; }

    public double getHipHeight() {
        return hipHeight;
    }

    public void setHipHeight(double hipHeight) {
        this.hipHeight = hipHeight;
    }

    public double getThigh() {
        return thigh;
    }

    public void setThigh(double thigh) {
        this.thigh = thigh;
    }

    public double getCalf() {
        return calf;
    }

    public void setCalf(double calf) { this.calf = calf; }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }

    public double getWaistToFloor() {
        return waistToFloor;
    }

    public void setWaistToFloor(double waistToFloor) {
        this.waistToFloor = waistToFloor;
    }

    public double getNeckToFloor() {
        return neckToFloor;
    }

    public void setNeckToFloor(double neckToFloor) {
        this.neckToFloor = neckToFloor;
    }

    public double getTotalHeight() {
        return totalHeight;
    }

    public void setTotalHeight(double totalHeight) {
        this.totalHeight = totalHeight;
    }

    public String getSizeOwner() {
        return sizeOwner;
    }

    public void setSizeOwner(String sizeOwner) {
        this.sizeOwner = sizeOwner;
    }

    public SelectedStyle getSelectedStyle() {
        return selectedStyle;
    }

    public void setSelectedStyle(SelectedStyle selectedStyle) {
        this.selectedStyle = selectedStyle;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
