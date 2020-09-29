package com.example.myapplication.drivago;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class tip extends AppCompatActivity {
    ImageButton tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);


        tip = (ImageButton) findViewById(R.id.addTip);

        tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(tip.this, tipAdd.class);
                startActivity(i);


            }
        });
    }
}