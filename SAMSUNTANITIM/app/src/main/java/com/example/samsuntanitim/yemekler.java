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

public class yemekler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemekler);

        ListView yemekler = findViewById(R.id.yemekler_MMS);
        List<String> liste = new ArrayList<>();
        liste.add("KEŞKEK");
        liste.add("PİDE");
        liste.add("ÇAKALLI MENEMENİ");
        liste.add("SİMİT");
        liste.add("BAKLALI SARMA");
        liste.add("OYMAAĞAÇ KEBABI");
        liste.add("HALUÇKA");
        liste.add("YAZI PANCARI");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,liste);
        yemekler.setAdapter(arrayAdapter);

        yemekler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    startActivity(new Intent(yemekler.this,keskek.class));
                }else if(position==1) {
                    startActivity(new Intent(yemekler.this,pide.class));
                }else if(position==2) {
                    startActivity(new Intent(yemekler.this,cakallimenemeni.class));
                }else if(position==3){
                    startActivity(new Intent(yemekler.this,simit.class));
                }else if(position==4){
                    startActivity(new Intent(yemekler.this,baklalisarma.class));
                }else if(position==5) {
                    startActivity(new Intent(yemekler.this,oymaagackebabi.class));
                }else if(position==6) {
                    startActivity(new Intent(yemekler.this,halucka.class));
                }else if(position==7){
                    startActivity(new Intent(yemekler.this,yazipancari.class));
                }
            }
        });
    }
}