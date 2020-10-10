package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsinfo;

    private String Username = "Admin";
    private String Password = "12345678";

    boolean isValid = false;
    private int couter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.editTextTextPassword);
        eLogin = findViewById(R.id.btLogin);
        eAttemptsinfo = findViewById(R.id.tvAttemptsinfo);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this ,"Please enter all the details correctly",Toast.LENGTH_SHORT).show();
                }else {

                    isValid = validate(inputName,inputPassword);

                    if(isValid){

                        couter--;

                        Toast.makeText(MainActivity.this, "IncorrecTt credentials entered!", Toast.LENGTH_SHORT).show();

                        eAttemptsinfo.setText("No. of Attempts remaining: " + couter);

                        if(couter == 0){
                            eLogin.setEnabled(false);
                        }

                    }else{

                        Toast.makeText(MainActivity.this, "Login sucessful", Toast.LENGTH_SHORT).show();

                        //Add the code to new Activity
                        Intent intent = new Intent( MainActivity.this, HomePageActivity.class);
                        startActivity(intent);
                    }

                }
            }
        });
    }

    private boolean validate(String name,String password){

        if(name.equals(Username) && password.equals(Password)){
            return true;
        }
        return false;
    }
}