package com.example.android.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewBills extends AppCompatActivity {

    Button newBill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_bills);

        newBill = (Button) findViewById(R.id.new_bill);
        newBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewBills.this, GetLocation.class);
                startActivity(intent);
            }
        });
    }
}
