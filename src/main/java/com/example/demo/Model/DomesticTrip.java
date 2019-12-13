package com.example.demo.Model;

import lombok.Data;

@Data
public class DomesticTrip extends Trip {

    private int ownArrivalDiscount;

    public DomesticTrip(MyDate start, MyDate end, String destination) {
        super(start, end, destination);
    }

    public void setOwnArrivalDiscount(int ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public int getPrice() {
        return super.getPrice() - ownArrivalDiscount;
    }
}
