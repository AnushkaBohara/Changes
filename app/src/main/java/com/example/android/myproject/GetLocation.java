package com.example.android.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GetLocation extends AppCompatActivity {

    public static final String storeString = "Store";
    EditText store;
    Button StartBilling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_location);

        store = (EditText) findViewById(R.id.store);
        StartBilling = (Button) findViewById(R.id.start_billing);
        StartBilling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GetLocation.this, BillingActivity.class);
                intent.putExtra(storeString, store.toString());
                startActivity(intent);
            }
        });
    }
}
