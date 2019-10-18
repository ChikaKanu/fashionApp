package com.example.codeclan.fashion.models;

import javax.persistence.*;


@Entity
@Table(name="addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name="address1")
    private String address1;
    @Column(name="address2")
    private String address2;
    @Column(name="postcode")
    private String postcode;
    @Column(name="county")
    private String county;
    @Column(name="country")
    private String country;

    @OneToOne
    @JoinColumn(name = "userDetail_id")
    private UserDetail userDetail;

    public Address(String address1, String address2, String postcode, String county, String country, UserDetail userDetail) {
        this.id = id;
        this.address1 = address1;
        this.address2 = address2;
        this.postcode = postcode;
        this.county = county;
        this.country = country;
        this.userDetail = userDetail;
    }

    public Address(){};

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

}
