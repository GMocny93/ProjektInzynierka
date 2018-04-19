package com.example.grzesiek.projektinzynierka.domain;


public class Circuit {
    private int _id;
    private int _year;
    private int _month;
    private int _day;
    private double _chest;
    private double _waist;


    public Circuit() {
    }

    public Circuit(int id, int year, int month, int day, double chest, double waist){
        this._id = id;
        this._year = year;
        this._month = month;
        this._day = day;
        this._chest = chest;
        this._waist = waist;
    }
    public Circuit(int year, int month, int day, double chest, double waist){
        this._year = year;
        this._month = month;
        this._day = day;
        this._chest = chest;
        this._waist = waist;
    }

    //GETTERS SETTERS

    public int getId() {
        return this._id;
    }
    public void setId(int id) {
        this._id = id;
    }

    //year
    public int getYear() {
        return this._year;
    }

    public void setYear(int year) {
        this._year = year;
    }

    //month
    public int getMonth() {
        return this._month;
    }

    public void setMonth(int month) {
        this._month = month;
    }

    //day
    public int getDay() {
        return this._day;
    }

    public void setDay(int day) {
        this._day = day;
    }

    //WGweight
    public double getChest() {
        return this._chest;
    }

    public void setChest(double chest) {
        this._chest = chest;
    }

    public double getWaist() {
        return this._waist;
    }

    public void setWaist(double waist) {
        this._waist = waist;
    }


}
