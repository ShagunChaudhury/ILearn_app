package com.example.android.bvp2;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1, b2, b3;
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent aboutactivity = new Intent(MainActivity.this, AboutActivity.class);
                        startActivity(aboutactivity);
                        }
                }

        );
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent faqactivity = new Intent(MainActivity.this, FaqActivity.class);
                        startActivity(faqactivity);
                    }
                }

        );
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent nextactivity = new Intent(MainActivity.this, NextActivity.class);
                        startActivity(nextactivity);
                    }
                }

        );


    }
}
