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
    private double fabricCost;

    @Column(name = "colour")
    private String colour;

    @Column(name = "quantity")
    private double quantity;

    @OneToOne
    @JoinColumn(name = "fabricSupplier_id")
    private FabricSupplier fabricSupplier;

    @JsonIgnoreProperties("fabrics")
    @ManyToOne
    @JoinColumn(name = "selectedStyle_id")
    private SelectedStyle selectedStyle;

    @JsonIgnoreProperties("fabrics")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "fabric_id", updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "selectedStyle_id", updatable = false)}
    )
    private List<SelectedStyle> selectedStyles;


    public Fabric(String name, String picture, double fabricCost, String colour, double quantity, FabricSupplier fabricSupplier) {
        this.name = name;
        this.picture = picture;
        this.fabricCost = fabricCost;
        this.colour = colour;
        this.fabricSupplier = fabricSupplier;
        this.quantity = quantity;
        this.selectedStyles = new ArrayList<>();
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


    public FabricSupplier getFabricSupplier() {
        return fabricSupplier;
    }

    public void setFabricSupplier(FabricSupplier fabricSupplier) {
        this.fabricSupplier = fabricSupplier;
    }

    public List<SelectedStyle> getSelectedStyles() {
        return selectedStyles;
    }

    public void setSelectedStyles(List<SelectedStyle> selectedStyles) {
        this.selectedStyles = selectedStyles;
    }

    public void addSelectedStyle(SelectedStyle selectedStyle){
        this.selectedStyles.add(selectedStyle);
    }

    public void removeSelectedStyle(SelectedStyle selectedStyle){
        this.selectedStyles.remove(selectedStyle);
    }

}
