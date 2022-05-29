package com.venzpire.batterylib;

import androidx.appcompat.widget.AppCompatImageView;

public class BatteryLib {

    AppCompatImageView batteryIv;

    public BatteryLib(AppCompatImageView batteryIv) {
        this.batteryIv = batteryIv;
    }

    private void setLevel(int level) {
        if (level == 0) {
            batteryIv.setImageResource(R.drawable.ic_b1);
        } else if (level <= 20) {
            batteryIv.setImageResource(R.drawable.ic_b2);
        } else if (level <= 50) {
            batteryIv.setImageResource(R.drawable.ic_b3);
        } else if (level <= 70) {
            batteryIv.setImageResource(R.drawable.ic_b4);
        } else if (level <= 100) {
            batteryIv.setImageResource(R.drawable.ic_b5);
        }
    }
}
