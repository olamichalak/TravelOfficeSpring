package com.example.demo.Model;

import lombok.Data;

@Data
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date:" +
                " year=" + year +
                ", month=" + month +
                ", day=" + day;
    }
}
