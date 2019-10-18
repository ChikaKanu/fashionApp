package com.example.codeclan.fashion.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "fabricSuppliers")
public class FabricSupplier extends Resource implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "companyName")
    private String companyName;

    @OneToOne(mappedBy = "fabricSupplier", cascade = CascadeType.ALL, orphanRemoval = true)
    private Fabric fabric;

    @OneToOne
    @JoinColumn(name = "userDetail_id")
    private UserDetail userDetail;

    public FabricSupplier(String firstName, String surname, String companyName) {
        super(firstName, surname);
        this.userDetail = userDetail;
        this.companyName = companyName;
        this.fabric = fabric;

    }

    public FabricSupplier(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

}
