package com.example.demo.Model;

import lombok.Data;

@Data
public class Address {
    private String street;
    private int zip;
    private String city;

    public Address() {
    }

    public Address(String street, int zip, String city) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address:" +
                " street = '" + street +
                ", zip = " + zip +
                ", city = '" + city;
    }
}
