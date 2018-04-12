package com.example.grzesiek.projektinzynierka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CircuitActivity extends AppCompatActivity {
    Button buttonCircuitList, buttonSaveCircuit, buttonDeleteCircuit;
    EditText dayEditText, monthEditText, yearEditText, chestEditText, waistEditText;
    int day, month, year;
    double chest, waist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circuit);
        buttonCircuitList = (Button) findViewById(R.id.buttonCircuitList);
        buttonSaveCircuit = (Button) findViewById(R.id.buttonSaveCircuit);
        buttonDeleteCircuit = (Button) findViewById(R.id.buttonDeleteCircuit);

        dayEditText = (EditText) findViewById(R.id.dayEditText);
        monthEditText = (EditText) findViewById(R.id.monthEditText);
        yearEditText = (EditText) findViewById(R.id.yearEditText);
        chestEditText = (EditText) findViewById(R.id.chestEditText);
        waistEditText = (EditText) findViewById(R.id.waistEditText);

        buttonCircuitList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CircuitActivity.this, activity_circuitList.class));

                //dodać wykres z pomiarów i pod nim listView z pomiarami
            }
        });

        buttonSaveCircuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                day = Integer.parseInt(dayEditText.getText().toString());
                month = Integer.parseInt(monthEditText.getText().toString());
                year = Integer.parseInt(yearEditText.getText().toString());
                chest = Double.parseDouble(chestEditText.getText().toString());
                waist = Double.parseDouble(waistEditText.getText().toString());

                //dodawanie do bazy danych

            }
        });

        buttonDeleteCircuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                day = Integer.parseInt(dayEditText.getText().toString());
                month = Integer.parseInt(monthEditText.getText().toString());
                year = Integer.parseInt(yearEditText.getText().toString());
                chest = Double.parseDouble(chestEditText.getText().toString());
                waist = Double.parseDouble(waistEditText.getText().toString());

                //usuwanie z bazy danych
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
        startActivity(new Intent(CircuitActivity.this, MainActivity.class));
    }

    public void loadWeight() {
        startActivity(new Intent(CircuitActivity.this, WeightActivity.class));
    }

    public void loadCircuit() {
        startActivity(new Intent(CircuitActivity.this, CircuitActivity.class));
    }

    public void loadInformation() {
        startActivity(new Intent(CircuitActivity.this, InformationActivity.class));
    }


    public void loadAuthor() {
        startActivity(new Intent(CircuitActivity.this, AuthorActivity.class));
    }

}
