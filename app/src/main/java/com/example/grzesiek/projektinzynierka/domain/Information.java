package com.example.grzesiek.projektinzynierka.domain;


public class Information {

    private int _id;
    private String _name;
    private int _height;
    private double _weight;
    private double _targetWeight;
    private int _age;

    //empty constructor
    public Information() {
    }

    //all main Information
    public Information(int id, String name, int height, double weight, double targetWeight, int age) {
        this._id = id;
        this._name = name;
        this._height = height;
        this._weight = weight;
        this._targetWeight = targetWeight;
        this._age = age;
    }

    //all main Information, no id
    public Information(String name, int height, double weight, double targetWeight, int age) {
        this._name = name;
        this._height = height;
        this._weight = weight;
        this._targetWeight = targetWeight;
        this._age = age;
    }

    //GETTERS SETTERS
    //id
    public int getId() {
        return this._id;
    }

    public void setId(int id) {
        this._id = id;
    }

    //name
    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    //height
    public int getHeight() {
        return this._height;
    }

    public void setHeight(int height) {
        this._height = height;
    }

    //Weight
    public double getWeight() {
        return this._weight;
    }

    public void setWeight(double weight) {
        this._weight = weight;
    }

    //targetWeight
    public double getTargetWeight() {
        return this._targetWeight;
    }

    public void setTargetWeight(double targetWeight) {
        this._targetWeight = targetWeight;
    }

    //age
    public int getAge() {
        return this._age;
    }

    public void setAge(int age) {
        this._age = age;
    }
}

