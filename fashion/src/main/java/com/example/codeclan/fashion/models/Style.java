package com.example.codeclan.fashion.models;

import javax.persistence.*;
import java.io.Serializable;

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
    private double labourCost;

    @Column(name = "source")
    private String source;

    @Column(name = "gender")
    private String gender;

    @Column(name="styleCategory")
    private String styleCategory;

//    @JsonIgnoreProperties("selectedStyles")
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
//    @OneToMany(mappedBy = "style", fetch = FetchType.LAZY)
//    private List<Measurement> requiredMeasurements;
//
//    @JsonIgnoreProperties("selectStyles")
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
//    @OneToMany(mappedBy = "style", fetch = FetchType.LAZY)
//    private List<Fabric> recommendedFabrics;
//


    @OneToOne(mappedBy = "style")
    private SelectedStyle selectedStyle;

    public Style(String name, String image, double labourCost, String source, String gender) {
        this.name = name;
        this.image = image;
        this.labourCost = labourCost;
        this.source = source;
        this.gender = gender;
        this.styleCategory = styleCategory;
//        this.recommendedFabrics = new ArrayList<>();
//        this.requiredMeasurements = new ArrayList<>();
        this.selectedStyle = selectedStyle;
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

    public double getLabourCost() {
        return labourCost;
    }

    public void setLabourCost(double labourCost) {
        this.labourCost = labourCost;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//
//    public List<Measurement> getRequiredMeasurements() {
//        return requiredMeasurements;
//    }
//
//    public void setRequiredMeasurements(List<Measurement> requiredMeasurements) {
//        this.requiredMeasurements = requiredMeasurements;
//    }
//
//    public void addRequiredMeasurement(Measurement measurementProperty){
//        this.requiredMeasurements.add(measurementProperty);
//    }
//
//    public void removeRequiredMeasurement(Measurement measurementProperty){
//        this.requiredMeasurements.remove(measurementProperty);
//    }
//    public List<Fabric> getRecommendedFabrics() {
//        return recommendedFabrics;
//    }
//
//    public void setRecommendedFabrics(List<Fabric> recommendedFabrics) {
//        this.recommendedFabrics = recommendedFabrics;
//    }
//
//    public void addRecommendedFabrics(Fabric fabricType){
//        this.recommendedFabrics.add(fabricType);
//    }
//
//    public void removeRecommendedFabrics(Fabric fabricType){
//        this.recommendedFabrics.add(fabricType);
//    }

    public SelectedStyle getSelectedStyle() {
        return selectedStyle;
    }

    public void setSelectedStyle(SelectedStyle selectedStyle) {
        this.selectedStyle = selectedStyle;
    }

    public String getStyleCategory() {
        return styleCategory;
    }

    public void setStyleCategory(String styleCategory) {
        this.styleCategory = styleCategory;
    }
}
