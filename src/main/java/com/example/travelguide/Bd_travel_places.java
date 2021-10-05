package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bd_travel_places extends AppCompatActivity {

    private Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_travel_places);

        bt1 = (Button)findViewById(R.id.b1);
        bt2 = (Button)findViewById(R.id.b2);
        bt3 = (Button)findViewById(R.id.b3);
        bt4 = (Button)findViewById(R.id.b4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new  Intent(getBaseContext(), CoxsBazar.class);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new  Intent(getBaseContext(), Khulna.class);
                startActivity(intent);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new  Intent(getBaseContext(), India.class);
                startActivity(intent);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new  Intent(getBaseContext(), India.class);
                startActivity(intent);
            }
        });
    }
}