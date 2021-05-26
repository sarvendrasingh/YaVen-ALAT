package com.example.yaven_alat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AQI extends AppCompatActivity {
    private  Button mBack, mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_q_i);

        mBack = (Button) findViewById(R.id.back);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AQI.this, sensor.class);
                startActivity(intent);

            }
        });

        mMap = (Button) findViewById(R.id.locate);
        mMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AQI.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}