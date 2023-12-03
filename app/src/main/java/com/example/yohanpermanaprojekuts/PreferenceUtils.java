package com.example.yohanpermanaprojekuts;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

public class PreferenceUtils {

    public static final String SHARED_PREF_NAME = "my_shared_pref";
    public static final String KEY_ITEMS = "items";

    public static void saveArrayList(Context context, ArrayList<String> list){
        SharedPreferences prefs = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("size", list.size());
        for(int i=0;i<list.size();i++)
            editor.putString(KEY_ITEMS+i, list.get(i));
        editor.apply();
    }

    public static ArrayList<String> getArrayList(Context context){
        SharedPreferences prefs = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        ArrayList<String> list = new ArrayList<>();
        int size = prefs.getInt("size", 0);
        for(int i=0;i<size;i++)
            list.add(prefs.getString(KEY_ITEMS+i, null));
        return list;
    }
}


