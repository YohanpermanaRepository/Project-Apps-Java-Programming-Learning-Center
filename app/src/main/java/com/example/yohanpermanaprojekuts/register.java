package com.example.yohanpermanaprojekuts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    Button buttonreg;

    TextView sudahreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        buttonreg = findViewById(R.id.registery);
        sudahreg = findViewById(R.id.ifsudahregistrasi);


        buttonreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis = new Intent(getApplicationContext(), login.class);
                startActivity(regis);}

        });
        sudahreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sulog = new Intent(getApplicationContext(), login.class);
                startActivity(sulog);}
        });

    }
}