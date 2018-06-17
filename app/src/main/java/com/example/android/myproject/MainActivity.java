package com.example.android.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static final String FILENAME = "MyPreferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File preferenceFile = new File("/data/data/" + getPackageName() +  "/shared_prefs/" + FILENAME + ".xml");
        if(preferenceFile.exists()){
            Toast.makeText(getApplicationContext(), "pref file exists", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ViewBills.class);
            startActivity(intent);
            finish();

        }
        else{
            Toast.makeText(getApplicationContext(), "pref file does not exist", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
