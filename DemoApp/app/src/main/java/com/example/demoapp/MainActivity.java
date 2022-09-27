package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button sendButton = (Button) findViewById(R.id.send1);
        sendButton.setOnClickListener(
                view->  Log.i("MainActivity", "Button Send gedrückt -> Lambda.")
        );
    }
  }