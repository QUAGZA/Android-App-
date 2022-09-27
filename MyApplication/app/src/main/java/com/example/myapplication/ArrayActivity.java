package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ArrayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
         final EditText PersonName=(EditText)findViewById(R.id.PersonName);
        Button ArBtn1=(Button)findViewById(R.id.ArBtn1);
        Button ArBtn2=(Button)findViewById(R.id.ArBtn2);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
         final int n =1000;
         final EditText[] a=new EditText[n-1];
         ArBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0; i<n; i++){
                    if(i<n){
                        a[i] =PersonName;
                        textView2.setText("ADDED");
                        break;
                    }
                }
            }
        });
         ArBtn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 for(int j=0;j<n;j++){
                     if(PersonName==a[j]){
                         textView2.setText("ELEMENT PRESENT");
                         break;
                     }
                     else if(j==n-1){
                         textView2.setText("ELEMENT ABSENT");
                         break;
                     }
                 }

             }
         });


    }
}