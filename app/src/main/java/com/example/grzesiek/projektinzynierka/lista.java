package com.example.grzesiek.projektinzynierka;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class lista extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        DatabaseHandler db = new DatabaseHandler(this);
/*
        db.addInformation(new information("Grzesiek", 184, 120.5, 100.5, 25));
        db.addWeight(new weight(2018, 3, 8, 119.5));
        db.addWeight(new weight(2018, 4, 10, 129.5));
        db.addWeight(new weight(2018, 5, 12, 139.5));
        db.addWeight(new weight(2018, 6, 15, 149.5));
        db.addCircuit(new circuit(2018, 4, 10, 116.0, 117.5));
*/
        List<String> dane = new ArrayList<String>();

        List<weight> weights = db.getAllWeight();
        for (weight wg : weights) {
            String log = wg.getYear() + "." + wg.getMonth() + "." + wg.getDay() + " waga: " + wg.getWeight() + "\n";
            dane.add(log);
            // Writing Contacts to log
            Log.d("dane: ", String.valueOf(dane));
            Log.i("dane: ", String.valueOf(dane));
            //   Log.v("dane: ", log);
        }
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, dane));
    }

}