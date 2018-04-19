package com.example.grzesiek.projektinzynierka;

public class DataModelCircuit {
    int year;
    int month;
    int day;
    double chest;
    double waist;


    public DataModelCircuit(int year, int month, int day, double chest, double waist) {
        this.year=year;
        this.month=month;
        this.day=day;
        this.chest=chest;
        this.waist=waist;
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

    public double getChest(){
        return chest;
    }

    public double getWaist(){
        return waist;
    }


}