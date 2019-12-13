package com.example.demo.Model;

import lombok.Data;

@Data
public class AbroadTrip extends Trip {

    private int insurance;

    public AbroadTrip(MyDate start, MyDate end, String destination) {
        super(start, end, destination);
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + insurance;
    }
}
