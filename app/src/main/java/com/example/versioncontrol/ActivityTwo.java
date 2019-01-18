package com.example.versioncontrol;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date(System.currentTimeMillis()));
        TextView timetv = (TextView) findViewById(R.id.time);
        timetv.setText(time);

        SimpleDateFormat sdfd = new SimpleDateFormat("EEE, MMM d, yyyy");
        String date = sdfd.format(new Date(System.currentTimeMillis()));

        TextView tvDate = (TextView) findViewById(R.id.date);
        tvDate.setText(date);

    }
}
