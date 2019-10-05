package com.example.codeclan.fashion.models;

public abstract class Resource {

    private String firstName;
    private String surname;

    public Resource(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public Resource() {};

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(User user) {
        this.firstName = user.getFirstName();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(User user) {
        this.surname = user.getSurname();
    }

}
