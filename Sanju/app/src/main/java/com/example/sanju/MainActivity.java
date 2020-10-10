package com.example.sanju;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {

    private EditText result ;
    boolean add , sub , mul , div , mod , pow  ;
    private Button clearbutton;
    private Button equalbutton;
    private Button Button0;
    private Button Button1;
    private Button Button2;
    private Button Button3;
    private Button Button4;
    private Button Button5;
    private Button Button6;
    private Button Button7;
    private Button Button8;
    private Button Button9;
    private Button addbut;
    private Button subbut;
    private Button mulbut;
    private Button divbut;
    private Button modbut;
    private Button powbut;
    private float num1 , num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button0 = findViewById(R.id.zero);
        Button1 = findViewById(R.id.one);
        Button2 = findViewById(R.id.two);
        Button3 = findViewById(R.id.three);
        Button4 = findViewById(R.id.four);
        Button5 = findViewById(R.id.five);
        Button6 = findViewById(R.id.six);
        Button7 = findViewById(R.id.seven);
        Button8 = findViewById(R.id.eight);
        Button9 = findViewById(R.id.nine);
        subbut = findViewById(R.id.sub);
        mulbut = findViewById(R.id.mul);
        addbut = findViewById(R.id.plus);
        divbut = findViewById(R.id.div);
        modbut = findViewById(R.id.mod);
        powbut = findViewById(R.id.pow);
        equalbutton = findViewById(R.id.equal);
        clearbutton = findViewById(R.id.clear);
        Button dotbutton = findViewById(R.id.dot);
        result = findViewById(R.id.result1);


        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "0");

            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "1");

            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "2");

            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "3");

            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "4");

            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "5");

            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "6");

            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "7");

            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "8");

            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "9");

            }
        });



        dotbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + ".");

            }
        });


       addbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                } else {
                    if (result.getText().toString().isEmpty())
                        return;
                    else {
                        num1 = Float.parseFloat(result.getText() + "");
                        add = true;
                        result.setText(null);
                    }
                }
            }
        });



        subbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                } else {
                    if (result.getText().toString().isEmpty())
                        return;
                    else {
                        num1 = Float.parseFloat(result.getText() + "");
                        add = true;
                        result.setText(null);
                    }
                }
            }
        });

        mulbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(result.getText() + "");
                mul = true;
                result.setText(null);

            }
        });


        modbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Float.parseFloat(result.getText() + "");
                mod = true;
                result.setText(null);


            }
        });
        divbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Float.parseFloat(result.getText() + "");
                div = true;
                result.setText(null);

            }
        });

        powbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Float.parseFloat(result.getText() + "");
                pow = true;
                result.setText(null);
            }
        });


        equalbutton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                num2 = Float.parseFloat(result.getText() + "");

                if(add==true)
                {
                    result.setText(num1 + num2 +"");
                    add = false;
                }
                if(sub==true )
                {
                    result.setText(num1 - num2 +"");
                    sub = false;
                }
                if(mul==true )
                {
                    result.setText(num1 * num2 +"");
                    mul = false;
                }
                if(div==true )
                {
                    result.setText(num1 / num2 +"");
                    div = false;
                }
                if(mod==true )
                {
                    result.setText(num1 % num2 +"");
                    mod= false;
                }
                if(pow==true )
                {
                    result.setText(pow(num1, num2) +"");
                    pow = false;
                }
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });

    }
}