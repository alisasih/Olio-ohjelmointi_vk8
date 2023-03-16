package com.example.testi1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText numberInput1;
    private EditText numberInput2;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput1 = findViewById(R.id.firstnr);
        numberInput2 = findViewById(R.id.secondnr);
        result = findViewById(R.id.output);
    }

    public void addNumber(View view) {
        int nr1 = Integer.parseInt(numberInput1.getText().toString());
        int nr2 = Integer.parseInt(numberInput2.getText().toString());

        int sum = nr1 + nr2;
        result.setText(String.valueOf(sum));
    }

    public void subtractNumber(View view) {
        int nr1 = Integer.parseInt(numberInput1.getText().toString());
        int nr2 = Integer.parseInt(numberInput2.getText().toString());

        int neg = nr1 - nr2;
        result.setText(String.valueOf(neg));
    }

    public void multiplyNumber(View view) {
        int nr1 = Integer.parseInt(numberInput1.getText().toString());
        int nr2 = Integer.parseInt(numberInput2.getText().toString());

        int multiplication = nr1*nr2;
        result.setText(String.valueOf(multiplication));
    }

    public void divideNumber(View view) {
        int nr1 = Integer.parseInt(numberInput1.getText().toString());
        int nr2 = Integer.parseInt(numberInput2.getText().toString());

        int division = nr1/nr2;
        result.setText(String.valueOf(division));
    }
}