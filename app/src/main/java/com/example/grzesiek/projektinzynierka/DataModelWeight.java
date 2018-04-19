package com.example.grzesiek.projektinzynierka;

public class DataModelWeight {
    int year;
    int month;
    int day;
    double weight;


    public DataModelWeight(int year, int month, int day, double weight) {
        this.year=year;
        this.month=month;
        this.day=day;
        this.weight=weight;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public double getWeight(){
        return weight;
    }


}