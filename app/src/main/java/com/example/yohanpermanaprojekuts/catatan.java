package com.example.yohanpermanaprojekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class catatan extends AppCompatActivity {

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listview;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan);


        listview = findViewById(R.id.listview);
        button = findViewById(R.id.button_list);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);
            }

        });

        items = PreferenceUtils.getArrayList(this);
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        listview.setAdapter(itemsAdapter);

        setUpListViewListener();


    }

    private void setUpListViewListener() {
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Context context=getApplicationContext();
                Toast.makeText(context, "ITEM TERHAPUS", Toast.LENGTH_SHORT).show();
                items.remove(i);
                itemsAdapter.notifyDataSetChanged();
                PreferenceUtils.saveArrayList(catatan.this, items); //simpan perubahan pada SharedPreferences
                return true;
            }
        });
    }

    private void addItem(View view) {
        EditText input = findViewById(R.id.EnterItem);
        String itemText = input.getText().toString();

        if(!(itemText.equals(""))){
            itemsAdapter.add(itemText);
            input.setText("");
            PreferenceUtils.saveArrayList(this, items); //simpan perubahan pada SharedPreferences
        } else{
            Toast.makeText(this, "Silahkan Tulis", Toast.LENGTH_SHORT).show();
        }
    }

}