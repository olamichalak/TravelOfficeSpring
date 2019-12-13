package com.example.demo.Model;

import lombok.Data;

@Data
public class Customer {

    private long id;
    private String name;
    private Address address;
    private Trip trip;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(long id, String name, Address address, Trip trip) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "id = " + id +
                "name = '" + name +
                ", address = " + address +
                ", trip = " + trip;
    }
}
