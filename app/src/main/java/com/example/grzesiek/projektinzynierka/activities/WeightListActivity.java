package com.example.grzesiek.projektinzynierka.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.grzesiek.projektinzynierka.dao.WeightDAO;
import com.example.grzesiek.projektinzynierka.dao.WeightDAOimpl;
import com.example.grzesiek.projektinzynierka.database.DatabaseHandler;
import com.example.grzesiek.projektinzynierka.R;
import com.example.grzesiek.projektinzynierka.domain.Circuit;
import com.example.grzesiek.projektinzynierka.domain.Information;
import com.example.grzesiek.projektinzynierka.domain.Weight;

import java.util.ArrayList;
import java.util.List;

public class WeightListActivity extends AppCompatActivity {
    private ListView list;
    private WeightDAO weightDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_list);
        DatabaseHandler db = new DatabaseHandler(this);
        weightDAO = new WeightDAOimpl(db);
        list = findViewById(R.id.weight_list);

        prepareData(db);
        List<String> dane = new ArrayList<>();

        List<Weight> weights = weightDAO.getAllWeight();

        for (Weight wg : weights) {
            String record = wg.getYear() + "." + wg.getMonth() + "." + wg.getDay() + " waga: " + wg.getWeight() + "\n";
            dane.add(record);
        }

        list.setAdapter(new ArrayAdapter<>(this, R.layout.list_item, R.id.row, dane));
    }

    private void prepareData(DatabaseHandler db) {
        db.addInformation(new Information("Grzesiek", 184, 120.5, 100.5, 25));
        weightDAO.addWeight(new Weight(2018, 3, 8, 119.5));
        weightDAO.addWeight(new Weight(2018, 4, 10, 129.5));
        weightDAO.addWeight(new Weight(2018, 5, 12, 139.5));
        weightDAO.addWeight(new Weight(2018, 6, 15, 149.5));
        db.addCircuit(new Circuit(2018, 4, 10, 116.0, 117.5));
        db.addCircuit(new Circuit(2018, 5, 8, 110.0, 115.6));
        db.addCircuit(new Circuit(2018, 6, 12, 112.0, 114.7));
    }
}