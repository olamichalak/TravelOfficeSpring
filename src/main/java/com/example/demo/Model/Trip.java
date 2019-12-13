package com.example.demo.Model;

import lombok.Data;

@Data
public class Trip {
    private MyDate start;
    private MyDate end;
    private String destination;
    private int price;

    public Trip() {
    }

    public Trip(MyDate start, MyDate end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trip:" +
                " start = " + start +
                ", end = " + end +
                ", destination = " + destination +
                ", price = " + price;
    }
}
