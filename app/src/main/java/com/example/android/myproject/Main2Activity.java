package com.example.android.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    List<Items> lstItem ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lstItem = new ArrayList<>();
        lstItem.add(new Items("Lifestyle", "22/12/17", 2570));
        lstItem.add(new Items("MAX", "12/02/17", 750));
        lstItem.add(new Items("Wills Lifestyle", "22/08/17", 570));
        lstItem.add(new Items(" new Lifestyle", "23/12/17", 1570));
        lstItem.add(new Items("Lifestyle", "22/12/17", 2570));
        lstItem.add(new Items("MAX", "12/02/17", 750));

        RecyclerView myrv = findViewById(R.id.recycler_view_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstItem);
        myrv.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        myrv.setAdapter(myAdapter);




    }
}
