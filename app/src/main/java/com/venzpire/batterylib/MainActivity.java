package com.venzpire.batterylib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    AppCompatImageView batteryImage1;
    AppCompatImageView batteryImage2;
    AppCompatImageView batteryImage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryImage1 = findViewById(R.id.battery1);
        batteryImage2 = findViewById(R.id.battery2);
        batteryImage3 = findViewById(R.id.battery3);


    }

    public void setBattery1Level(int level) {
        setLevel(batteryImage1, level);
    }

    public void setBattery1Leve2(int level) {
        setLevel(batteryImage2, level);
    }

    public void setBattery1Leve3(int level) {
        setLevel(batteryImage3, level);
    }

    private void setLevel(AppCompatImageView iv, int level) {
        if (level == 0) {
            iv.setImageResource(R.drawable.ic_b1);
        } else if (level <= 20) {
            iv.setImageResource(R.drawable.ic_b2);
        } else if (level <= 50) {
            iv.setImageResource(R.drawable.ic_b3);
        } else if (level <= 70) {
            iv.setImageResource(R.drawable.ic_b4);
        } else if (level <= 100) {
            iv.setImageResource(R.drawable.ic_b5);
        }
    }
}