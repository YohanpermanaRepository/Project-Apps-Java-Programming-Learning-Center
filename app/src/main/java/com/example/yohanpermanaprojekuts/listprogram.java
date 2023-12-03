package com.example.yohanpermanaprojekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class listprogram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listprogram);
    }

    public void konsepjava (View view){
        Intent detiljava = new Intent(listprogram.this, detailpembelajaran.class);
        startActivity(detiljava);
    }

    public void oop(View view) {
        Intent detiljava2 = new Intent(listprogram.this, detailpembelajaran.class);
        startActivity(detiljava2);
    }

    public void stdata(View view) {
        Intent detiljava3 = new Intent(listprogram.this, detailpembelajaran.class);
        startActivity(detiljava3);
    }

    public void EH(View view) {
        Intent detiljava4 = new Intent(listprogram.this, detailpembelajaran.class);
        startActivity(detiljava4);
    }



    public void Backehome(View view) {

        Intent bhome = new Intent(listprogram.this, MainActivity.class);
        startActivity(bhome);
    }
}
