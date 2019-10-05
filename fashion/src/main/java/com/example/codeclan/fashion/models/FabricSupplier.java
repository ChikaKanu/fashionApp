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
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public FabricSupplier(String firstName, String surname, Address address, String companyName) {
        super(firstName, surname);
        this.user = user;
        this.address = address;
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
