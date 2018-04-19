package com.example.grzesiek.projektinzynierka.dao;

import com.example.grzesiek.projektinzynierka.domain.Weight;

import java.util.List;

public interface WeightDAO {
    void addWeight(Weight weight);
    Weight getWeight (int id);
    List<Weight> getAllWeight();
    int updateWeight(Weight weight);
    void deleteWeight(Weight weight);
}
