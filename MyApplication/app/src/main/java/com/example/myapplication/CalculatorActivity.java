package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
       final EditText firstEditText=(EditText)findViewById(R.id.firstEditText);
       EditText secondEditText=(EditText)findViewById(R.id.secondEditText);
        final int num1= Integer.parseInt(firstEditText.getText().toString());
        final int num2=Integer.parseInt(secondEditText.getText().toString());
         final TextView textView = (TextView)findViewById(R.id.textView);

        Button btn=(Button)findViewById(R.id.btn);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
           int result=num1+num2;
           textView.setText(result+"");
           }
       });
        Button btn2=(Button)findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result=num1*num2;
                textView.setText(result+"");
            }
        });
        Button btn3=(Button)findViewById(R.id.btn3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result=num1-num2;
                textView.setText(result+"");
            }
        });
        Button btn4=(Button)findViewById(R.id.btn4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result=num1/num2;
                textView.setText(result+"");
            }
        });

    }
}