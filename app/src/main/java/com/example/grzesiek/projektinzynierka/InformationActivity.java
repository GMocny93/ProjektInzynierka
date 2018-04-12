package com.example.grzesiek.projektinzynierka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        final DatabaseHandler db = new DatabaseHandler(this);

    buttonSaveData = (Button) findViewById(R.id.buttonSaveData);

    nameEditText = (EditText) findViewById(R.id.nameEditText);
    heightEditText = (EditText) findViewById(R.id.heightEditText);
    heightEditText.setFilters(new InputFilter[]{new InputFilterMinMax("1","280")});
    weightEditText = (EditText) findViewById(R.id.weightEditText);
    targetWeightEditText = (EditText) findViewById(R.id.targetWeightEditText);
    ageEditText = (EditText) findViewById(R.id.ageEditText);
    ageEditText.setFilters(new InputFilter[]{new InputFilterMinMax("1","100")});

    buttonSaveData.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try {
                name = (String) nameEditText.getText().toString();
                height = Integer.parseInt(heightEditText.getText().toString());
                weight = Double.parseDouble(weightEditText.getText().toString());
                targetWeight = Double.parseDouble(targetWeightEditText.getText().toString());
                age = Integer.parseInt(ageEditText.getText().toString());

                db.addInformation(new information(name, height, weight, targetWeight, age));

                Toast toast = Toast.makeText(InformationActivity.this, "Operacja dodawania przebiegła pomyślnie", Toast.LENGTH_SHORT);
                toast.show();
            }catch (Exception e) {
                Toast toast = Toast.makeText(InformationActivity.this, "Nastąpił bład przy dodawaniu danych", Toast.LENGTH_SHORT);
                toast.show();
                }
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

