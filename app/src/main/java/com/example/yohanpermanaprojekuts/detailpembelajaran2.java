package com.example.yohanpermanaprojekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class detailpembelajaran2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpembelajaran2);
    }

    public void kembali(View view) {
        Intent kblt2 = new Intent(this, listprogram2.class);
        startActivity(kblt2);
    }
}