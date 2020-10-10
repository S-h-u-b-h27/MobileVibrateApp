package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView resultTv;
    private EditText number1et;
    private EditText number2;
    private Button plusButton, minusButton ,multiplyButton , divideButton , modulusButton;
    private Double num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTv = findViewById(R.id.result);
        number1et = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        plusButton = findViewById(R.id.plus);
        minusButton = findViewById(R.id.minus);
        multiplyButton = findViewById(R.id.multiply);
        divideButton = findViewById(R.id.divide);
        modulusButton = findViewById(R.id.modulus);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number1et.getText().toString().isEmpty())
                    num1 = Double.parseDouble(number1et.getText().toString());
                if (!number1et.getText().toString().isEmpty())
                    num2 = Double.parseDouble(number2.getText().toString());
                result = num1 + num2;
                resultTv.setText("Result :- " + result);
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number1et.getText().toString().isEmpty())
                    num1 = Double.parseDouble(number1et.getText().toString());
                if (!number1et.getText().toString().isEmpty())
                    num2 = Double.parseDouble(number2.getText().toString());
                result = num1 - num2;
                resultTv.setText("Result :- " + result);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number1et.getText().toString().isEmpty())
                    num1 = Double.parseDouble(number1et.getText().toString());
                if (!number1et.getText().toString().isEmpty())
                    num2 = Double.parseDouble(number2.getText().toString());
                result = num1 * num2;
                resultTv.setText("Result :- " + result);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number1et.getText().toString().isEmpty())
                    num1 = Double.parseDouble(number1et.getText().toString());
                if (!number1et.getText().toString().isEmpty())
                    num2 = Double.parseDouble(number2.getText().toString());
                if (num2 == 0) {
                    Toast.makeText(MainActivity.this, "Number 2 can not be 0", Toast.LENGTH_LONG).show();
                    resultTv.setText("Result :- " + "Infinity");
                    return;
                } else {
                    result = num1 / num2;
                    resultTv.setText("Result :- " + result);
                }
            }
        });

        modulusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number1et.getText().toString().isEmpty())
                    num1 = Double.parseDouble(number1et.getText().toString());
                if (!number1et.getText().toString().isEmpty())
                    num2 = Double.parseDouble(number2.getText().toString());
                result = num1 % num2;
                resultTv.setText("Result :- " + result);
            }
        });

    }
}