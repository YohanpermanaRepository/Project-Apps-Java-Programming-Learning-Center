package com.example.yohanpermanaprojekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> toDoList;
    ArrayAdapter<String> arrayAdapter;
    ListView listView;
    EditText editText;

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    SettingsFragment settingsFragment = new SettingsFragment();
    akun akun = new akun();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView  = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;
                    case R.id.catat:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, akun).commit();
                        return true;

                    case R.id.settings:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,settingsFragment).commit();
                        return true;
                }
                return false;
            }
        });

    }
    public void java(View view) {
        Intent kedua = new Intent(this, listprogram.class);
        startActivity(kedua);
    }

    public void kotlin(View view) {
        Intent ketiga = new Intent(this, listprogram2.class);
        startActivity(ketiga);
    }

    public void catat_sekarang(View view) {
        Intent catat = new Intent(this, catatan.class);
        startActivity(catat);
    }

    public void logout1(View view) {
        Intent logt = new Intent(this, register.class);
        startActivity(logt);
    }


    public void youtube(View view) {
        String videoId = "2h_NAgW9PvI"; // ID video YouTube yang ingin ditampilkan
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + videoId));
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=" + videoId));

        // Memeriksa apakah YouTube app terinstall di perangkat
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            // Jika tidak terinstall, membuka YouTube di browser
            startActivity(webIntent);
        }

    }
}
