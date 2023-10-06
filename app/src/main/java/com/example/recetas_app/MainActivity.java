package com.example.recetas_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerCategory;
    private Spinner spinnerFood;
    private Button btnShowDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCategory = findViewById(R.id.spinnerCategory);
        spinnerFood = findViewById(R.id.spinnerFood);
        btnShowDetails = findViewById(R.id.btnShowDetails);

        ArrayAdapter<CharSequence> categoryAdapter = ArrayAdapter.createFromResource(this,
                R.array.food_categories, android.R.layout.simple_spinner_item);
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategory.setAdapter(categoryAdapter);

        spinnerCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                actualizarSpinnerComida(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });

        btnShowDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDetallesComida();
            }
        });
    }

    private void actualizarSpinnerComida(int categoryIndex) {
        int foodArrayId = -1;
        switch (categoryIndex) {
            case 0:
                foodArrayId = R.array.desayunos;
                break;
            case 1:
                foodArrayId = R.array.almuerzos;
                break;
            case 2:
                foodArrayId = R.array.cenas;
                break;
            case 3:
                foodArrayId = R.array.postres;
                break;
        }

        if (foodArrayId != -1) {
            ArrayAdapter<CharSequence> foodAdapter = ArrayAdapter.createFromResource(this,
                    foodArrayId, android.R.layout.simple_spinner_item);
            foodAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerFood.setAdapter(foodAdapter);
        }
    }

    private void mostrarDetallesComida() {
        String category = spinnerCategory.getSelectedItem().toString();
        String food = spinnerFood.getSelectedItem().toString();

        Intent intent = new Intent(this, ComidaDetailsActivity.class);
        intent.putExtra("category", category);
        intent.putExtra("food", food);
        startActivity(intent);
    }
}