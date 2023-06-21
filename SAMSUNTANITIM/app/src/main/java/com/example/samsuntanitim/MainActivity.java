package com.example.samsuntanitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.List;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView anamenu = findViewById(R.id.anamenu_MMS);
        List<String> liste = new ArrayList<>();
        liste.add("TARİHÇE");
        liste.add("GEZİLECEK MEKANLAR");
        liste.add("MEŞHUR YEMEKLER");
        liste.add("MEŞHUR TATLILAR");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,liste);
        anamenu.setAdapter(arrayAdapter);

        anamenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    startActivity(new Intent(MainActivity.this,gecmis.class));
                }else if(position==1) {
                    startActivity(new Intent(MainActivity.this,mekanlar.class));
                }else if(position==2) {
                    startActivity(new Intent(MainActivity.this,yemekler.class));
                }else if(position==3){
                    startActivity(new Intent(MainActivity.this,tatlilar.class));
                }
            }
        });
    }



}