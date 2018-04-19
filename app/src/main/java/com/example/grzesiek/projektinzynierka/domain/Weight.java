package com.example.grzesiek.projektinzynierka.domain;



public class Weight {
    private int id;
    private int year;
    private int _month;
    private int _day;
    private double _weight;


    public Weight() {
    }

    public Weight(int id, int year, int month, int day, double weight){
        this.id = id;
        this.year = year;
        this._month = month;
        this._day = day;
        this._weight = weight;
    }
    public Weight(int year, int month, int day, double weight){
        this.year = year;
        this._month = month;
        this._day = day;
        this._weight = weight;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this._month;
    }

    public void setMonth(int month) {
        this._month = month;
    }

    public int getDay() {
        return this._day;
    }

    public void setDay(int day) {
        this._day = day;
    }

    public double getWeight() {
        return this._weight;
    }

    public void setWeight(double weight) {
        this._weight = weight;
    }
}