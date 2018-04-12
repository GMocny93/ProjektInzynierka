package com.example.grzesiek.projektinzynierka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InformationActivity extends AppCompatActivity {
    Button buttonSaveData;
    EditText nameEditText, heightEditText, weightEditText, targetWeightEditText, ageEditText;
    String name;
    int height, age;
    double weight, targetWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

    buttonSaveData = (Button) findViewById(R.id.buttonSaveData);
    nameEditText = (EditText) findViewById(R.id.nameEditText);
    heightEditText = (EditText) findViewById(R.id.heightEditText);
    weightEditText = (EditText) findViewById(R.id.weightEditText);
    targetWeightEditText = (EditText) findViewById(R.id.targetWeightEditText);
    ageEditText = (EditText) findViewById(R.id.ageEditText);

    buttonSaveData.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name = (String) nameEditText.getText().toString();
            height = Integer.parseInt(heightEditText.getText().toString());
            weight = Double.parseDouble(weightEditText.getText().toString());
            targetWeight = Double.parseDouble(targetWeightEditText.getText().toString());
            age = Integer.parseInt(ageEditText.getText().toString());

            //dodawanie do bazy danych

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
        startActivity(new Intent(InformationActivity.this, MainActivity.class));
    }

    public void loadWeight() {
        startActivity(new Intent(InformationActivity.this, WeightActivity.class));
    }

    public void loadCircuit() {
        startActivity(new Intent(InformationActivity.this, CircuitActivity.class));
    }

    public void loadInformation() {
        startActivity(new Intent(InformationActivity.this, InformationActivity.class));
    }


    public void loadAuthor() {
        startActivity(new Intent(InformationActivity.this, AuthorActivity.class));
    }

}

