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

public class mekanlar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mekanlar);

        ListView mekanlar = findViewById(R.id.mekanlar_MMS);
        List<String> liste = new ArrayList<>();
        liste.add("MÜZELER");
        liste.add("DOĞAL GÜZELLİKLER");
        liste.add("TABİAT PARKLARI");
        liste.add("ALIŞVERİŞ MERKEZLERİ");
        liste.add("SAHİL");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,liste);
        mekanlar.setAdapter(arrayAdapter);

        mekanlar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    startActivity(new Intent(mekanlar.this,muzeler.class));
                }else if(position==1) {
                    startActivity(new Intent(mekanlar.this,dogal_guzellikler.class));
                }else if(position==2) {
                    startActivity(new Intent(mekanlar.this,tabiat_parklari.class));
                }else if(position==3){
                    startActivity(new Intent(mekanlar.this,alisverismerkezleri.class));
                }else if(position==4){
                    startActivity(new Intent(mekanlar.this,sahil.class));
                }
            }
        });

    }
}