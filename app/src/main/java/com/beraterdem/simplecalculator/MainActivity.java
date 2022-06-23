package com.beraterdem.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.Number1);
        number2=findViewById(R.id.Number2);
        result=findViewById(R.id.result);
    }
    public void sum(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")) {
            result.setText("Enter Number");
        }
        else {
            int Number1text = Integer.parseInt(number1.getText().toString());
            int Number2text = Integer.parseInt(number2.getText().toString());

            int Result = Number1text + Number2text;

            result.setText("Result:" + Result);
        }

    }
    public void divide(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")) {
            result.setText("Enter Number");
        }
        else if (Integer.parseInt(number1.getText().toString())==0){

            result.setText("You Can't Enter Zero");
        }
        else {
            double Number1text = Double.parseDouble(number1.getText().toString());
            double Number2text = Double.parseDouble(number2.getText().toString());
            double Result = Number1text / Number2text;
            result.setText("Result:" + Result);
        }

    }
    public void dudect(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")) {
            result.setText("Enter Number");
        }
        else {
            int Number1text = Integer.parseInt(number1.getText().toString());
            int Number2text = Integer.parseInt(number2.getText().toString());

            int Result = Number1text - Number2text;

            result.setText("Result:" + Result);
        }
    }
    public void multply(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")) {
            result.setText("Enter Number");
        }
        else {
            double Number1text = Double.parseDouble(number1.getText().toString());
            double Number2text = Double.parseDouble(number2.getText().toString());

            double Result = Number1text * Number2text;

            result.setText("Result:" + Result);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}