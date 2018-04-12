package com.example.grzesiek.projektinzynierka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class WeightActivity extends AppCompatActivity  {
    Button buttonWeightList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        buttonWeightList = (Button) findViewById(R.id.buttonCircuitList);

        buttonWeightList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WeightActivity.this, activity_weightList.class));
            }
        });


    }




    // MENU
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.start:
                loadMain();
                return true;
            case R.id.waga:
                loadWeight();
                return true;
            case R.id.pomiary:
                loadCircuit();
                return true;
            case R.id.informacje:
                loadInformation();
                return true;
            case R.id.oAutorze:
                loadAuthor();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void loadMain() {
        startActivity(new Intent(WeightActivity.this, MainActivity.class));
    }

    public void loadWeight() {
        startActivity(new Intent(WeightActivity.this, WeightActivity.class));
    }

    public void loadCircuit() {
        startActivity(new Intent(WeightActivity.this, CircuitActivity.class));
    }

    public void loadInformation() {
        startActivity(new Intent(WeightActivity.this, InformationActivity.class));
    }


    public void loadAuthor() {
        startActivity(new Intent(WeightActivity.this, AuthorActivity.class));
    }

}

