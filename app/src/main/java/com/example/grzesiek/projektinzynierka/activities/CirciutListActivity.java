package com.example.grzesiek.projektinzynierka.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.grzesiek.projektinzynierka.R;

public class CirciutListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circuit_list);

/*
        DatabaseHandler db = new DatabaseHandler(this);

        db.addInformation(new Information("Grzesiek", 184, 120.5, 100.5, 25));
        db.addWeight(new Weight(2018, 3, 8, 119.5));
        db.addWeight(new Weight(2018, 4, 10, 129.5));
        db.addWeight(new Weight(2018, 5, 12, 139.5));
        db.addWeight(new Weight(2018, 6, 15, 149.5));
        db.addCircuit(new Circuit(2018, 4, 10, 116.0, 117.5));
        db.addCircuit(new Circuit(2018, 5, 8, 110.0, 115.6));
        db.addCircuit(new Circuit(2018, 6, 12, 112.0, 114.7));
        List<String> dane = new ArrayList<String>();

        List<Circuit> circuits = db.getAllCircuit();
        for (Circuit ct : circuits) {
            String log = ct.getYear() + "." + ct.getMonth() + "." + ct.getDay() + " klatka: " + ct.getChest() + " pas: " + ct.getWaist() + "\n";
            dane.add(log);
            // Writing Contacts to log
            Log.d("dane: ", String.valueOf(dane));
            Log.i("dane: ", String.valueOf(dane));
            //   Log.v("dane: ", log);
        }
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.row, dane));
*/

    }

}