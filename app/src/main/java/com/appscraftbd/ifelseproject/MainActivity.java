package com.appscraftbd.ifelseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button hw1,hw2,hw3,hw4,hw5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hw1 = findViewById(R.id.hw1);
        hw2 = findViewById(R.id.hw2);
        hw3 = findViewById(R.id.hw3);
        hw4 = findViewById(R.id.hw4);
        hw5 = findViewById(R.id.hw5);

        hw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, work1.class);
                startActivity(intent);


            }
        });

        hw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, work2.class);
                startActivity(intent);


            }
        });

        hw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, work3.class);
                startActivity(intent);


            }
        });

        hw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, work4.class);
                startActivity(intent);


            }
        });

        hw5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, work5.class);
                startActivity(intent);


            }
        });











    }
}