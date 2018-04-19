package com.example.grzesiek.projektinzynierka;



public class Weight {

    private int _id;
    private int _year;
    private int _month;
    private int _day;
    private double _weight;


    public Weight() {
    }

    public Weight(int id, int year, int month, int day, double weight){
        this._id = id;
        this._year = year;
        this._month = month;
        this._day = day;
        this._weight = weight;
    }
    public Weight(int year, int month, int day, double weight){
        this._year = year;
        this._month = month;
        this._day = day;
        this._weight = weight;
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
    public double getWeight() {
        return this._weight;
    }

    public void setWeight(double weight) {
        this._weight = weight;
    }


}