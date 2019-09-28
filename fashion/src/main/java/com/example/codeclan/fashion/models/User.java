package com.example.codeclan.fashion.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    private String id;
    private String firstName;
    private String surname;
    private String email;
    private String password;
    private String accessGroup;

    @OneToOne
    @JoinColumn(name = "userDetail_id")
    private UserDetail userDetail;

}
