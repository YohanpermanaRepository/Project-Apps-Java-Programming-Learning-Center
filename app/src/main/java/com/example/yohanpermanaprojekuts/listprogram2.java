package com.example.yohanpermanaprojekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class listprogram2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listprogram2);
    }


    public void vdt (View view){
        Intent vdtkotlin = new Intent(this,detailpembelajaran2.class);
        startActivity(vdtkotlin);
    }

    public void fungsi(View view) {
        Intent fgs = new Intent(listprogram2.this,detailpembelajaran2.class);
        startActivity(fgs);
    }

    public void skt(View view) {
            Intent stktr = new Intent(listprogram2.this,detailpembelajaran2.class);
            startActivity(stktr);
    }

    public void ns(View view) {
        Intent nullset = new Intent(listprogram2.this,detailpembelajaran2.class);
        startActivity(nullset);
    }


    public void Backehome2(View view) {
        Intent bhome2 = new Intent(listprogram2.this,MainActivity.class);
        startActivity(bhome2);
    }
}