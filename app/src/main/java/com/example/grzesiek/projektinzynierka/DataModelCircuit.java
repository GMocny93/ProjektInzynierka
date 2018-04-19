package com.example.grzesiek.projektinzynierka;

public class DataModelCircuit {
    private int year;
    private int month;
    private int day;
    private double chest;
    private double waist;


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