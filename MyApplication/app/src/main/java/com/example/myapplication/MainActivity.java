package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OneShotPreDrawListener;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
             Button CalBtn=(Button) findViewById(R.id.CalBtn);
             CalBtn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Intent Intent1=new Intent(getApplicationContext(),CalculatorActivity.class);
                     startActivity(Intent1);
                 }
             });
             Button ArrayBtn=(Button)findViewById(R.id.ArrayBtn);
             ArrayBtn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Intent Intent2= new Intent(getApplicationContext(),ArrayActivity.class);
                     startActivity(Intent2);
                 }
             });

     }
}