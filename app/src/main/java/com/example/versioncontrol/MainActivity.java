package com.example.versioncontrol;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton datebutton;
    ImageButton callbutton;
    ImageButton chatbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        callbutton = findViewById(R.id.callbutton);
        chatbutton = findViewById(R.id.chatbutton);
        datebutton = findViewById(R.id.datebutton);

        datebutton.setOnClickListener(this);

        chatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I want to die", Toast.LENGTH_SHORT).show();
            }
        });

        final EditText phone = (EditText) findViewById(R.id.phonenumber);
        callbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNo = phone.getText().toString();
                if (!TextUtils.isEmpty(phoneNo)) {
                    String dial = "tel:" + phoneNo;
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.datebutton:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}