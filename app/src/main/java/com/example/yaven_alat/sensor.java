package com.example.yaven_alat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class sensor extends AppCompatActivity {
    private ImageButton mNoise, mAQI, mSpeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        mSpeed = (ImageButton) findViewById(R.id.imageButton);

        mSpeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sensor.this, speed.class);
                startActivity(intent);

            }
        });

        mAQI = (ImageButton) findViewById(R.id.imageButton3);

        mAQI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sensor.this, AQI.class);
                startActivity(intent);

            }
        });
        mNoise = (ImageButton) findViewById(R.id.imageButton4);

        mNoise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sensor.this, noise.class);
                startActivity(intent);

            }
        });
    }
}