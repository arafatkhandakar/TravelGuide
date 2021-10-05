package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt1,bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.simpleButton1);
        bt2 = (Button)findViewById(R.id.simpleButton2);
        bt3 = (Button)findViewById(R.id.simpleButton3);


bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent = new  Intent(getBaseContext(), Bd_travel_places.class);
        startActivity(intent);

    }
});

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new  Intent(getBaseContext(), Tourist_Attraction.class);
                startActivity(intent);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new  Intent(getBaseContext(), Hotel.class);
                startActivity(intent);
            }
        });

    }
}