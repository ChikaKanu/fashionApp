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
    @JoinColumn(name = "userDetail_id")
    private UserDetail userDetail;

    public Tailor(){};

    public Tailor(String firstName, String surname, String companyName) {
        super(firstName, surname);
        this.companyName = companyName;
        this.userDetail = userDetail;
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

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
}
