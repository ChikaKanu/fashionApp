package com.example.codeclan.fashion.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tailors")
public class Tailor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @OneToOne(mappedBy = "tailor")
    private SelectedStyle selectedStyle;

    public Tailor(String firstName, String surname, String phone, String address, SelectedStyle selectedStyle) {
        this.firstName = firstName;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
        this.selectedStyle = selectedStyle;
    }

    public Tailor(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setContact(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SelectedStyle getSelectedStyle() {
        return selectedStyle;
    }

    public void setSelectedStyle(SelectedStyle selectedStyle) {
        this.selectedStyle = selectedStyle;
    }
}
