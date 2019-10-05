package com.example.codeclan.fashion.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tailors")
public class Tailor extends Resource implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "companyName")
    private String companyName;

    @OneToOne(mappedBy = "tailor")
    private SelectedStyle selectedStyle;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Tailor(){};

    public Tailor(String firstName, String surname, Address address, String companyName) {
        super(firstName, surname);
        this.user = user;
        this.companyName = companyName;
        this.address = address;
        this.selectedStyle = selectedStyle;
    }

    public SelectedStyle getSelectedStyle() {
        return selectedStyle;
    }

    public void setSelectedStyle(SelectedStyle selectedStyle) {
        this.selectedStyle = selectedStyle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
