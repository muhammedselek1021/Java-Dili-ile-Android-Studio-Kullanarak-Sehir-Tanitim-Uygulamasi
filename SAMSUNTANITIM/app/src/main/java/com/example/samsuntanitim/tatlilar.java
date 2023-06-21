package com.example.samsuntanitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class tatlilar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatlilar);

        ListView tatlilar = findViewById(R.id.tatlilar_MMS);
        List<String> liste = new ArrayList<>();
        liste.add("KIVRATMA");
        liste.add("NOKUL");
        liste.add("KOCAKARI GERDANI");
        liste.add("PALÜZE");
        liste.add("FIRINDA KABAK");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,liste);
        tatlilar.setAdapter(arrayAdapter);

        tatlilar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    startActivity(new Intent(tatlilar.this,kivratma.class));
                }else if(position==1) {
                    startActivity(new Intent(tatlilar.this,nokul.class));
                }else if(position==2) {
                    startActivity(new Intent(tatlilar.this,kocakarigerdani.class));
                }else if(position==3){
                    startActivity(new Intent(tatlilar.this,paluze.class));
                }else if(position==4){
                    startActivity(new Intent(tatlilar.this,firindakabak.class));
                }
            }
        });
    }
}