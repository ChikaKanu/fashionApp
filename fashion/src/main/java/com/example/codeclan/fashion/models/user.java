package com.example.codeclan.fashion.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class user {

    @Id
    private String id;
    private String firstName;
    private String surname;
    private String email;
}
