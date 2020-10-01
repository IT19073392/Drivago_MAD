package com.example.myapplication.drivago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

public class redirect extends AppCompatActivity {
    private Spinner spinner;
    private static final String[] paths = {"choose", "Teacher", "Admin"};
    RadioButton rdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirect);


        rdo = findViewById(R.id.radioButton);
        rdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(redirect.this, MainActivity.class);
                startActivity(i);
            }
        });

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(redirect.this,
                android.R.layout.simple_list_item_1, paths);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, android.view.View view, int i, long l) {
                switch (i) {
                    case 0:

                        break;
                    case 1:
                        Button ok = (Button) findViewById(R.id.ok);
                        ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent i = new Intent(redirect.this, HomeActivity.class);
                                startActivity(i);
                            }
                        });
                        break;
                    case 2:
                        Button ok1 = (Button) findViewById(R.id.ok);
                        ok1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent i = new Intent(redirect.this, MainActivity.class);
                                startActivity(i);
                            }
                        });
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }
}