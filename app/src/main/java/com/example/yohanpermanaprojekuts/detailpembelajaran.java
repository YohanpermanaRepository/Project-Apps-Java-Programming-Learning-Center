package com.example.yohanpermanaprojekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class detailpembelajaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpembelajaran);
    }

    public void Kembali(View view) {
        Intent kbl = new Intent(this, listprogram.class);
        startActivity(kbl);
    }
}