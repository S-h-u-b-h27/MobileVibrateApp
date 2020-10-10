package com.example.fros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.jar.Attributes;

public class SignUp extends AppCompatActivity {

    //variables
    TextInputLayout regName, regUsername, regEmail, regPhoneNumber, regPassword;
    Button regBtn, regToLoginBtn;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        //Hooks to all xml elements in activity_sign_up.xml
        regName = findViewById(R.id.name);
        regUsername = findViewById(R.id.Username);
        regEmail = findViewById(R.id.email);
        regPhoneNumber = findViewById(R.id.phoneNo);
        regPassword = findViewById(R.id.password);
        regBtn = findViewById(R.id.signup_go);
        regToLoginBtn = findViewById(R.id.signup_screen);

        //Save data in Firebase on button click

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("cources");



                //Get all the values
                String name = regName.getEditText().getText().toString();
                String username = regUsername.getEditText().getText().toString();
                String email = regEmail.getEditText().getText().toString();
                String phoneNumber = regPhoneNumber.getEditText().getText().toString();
                String password = regPassword.getEditText().getText().toString();




                UserHelperClass helperClass = new UserHelperClass(name , username, email, phoneNumber ,password);

                reference.child(username).setValue(helperClass);

                Intent intent = new Intent(SignUp.this,UserProfile.class);
                startActivity(intent);

            }

        });
    }

}