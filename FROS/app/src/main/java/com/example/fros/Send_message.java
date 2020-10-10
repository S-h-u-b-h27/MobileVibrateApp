package com.example.fros;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Send_message extends AppCompatActivity {

    private EditText number,message,longi,lati;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message2);

        number = findViewById(R.id.number);
        message = findViewById(R.id.message);
        send = findViewById(R.id.send);
        longi = findViewById(R.id.longi);
        lati = findViewById(R.id.lati);
        longi.setText(getIntent().getStringExtra("ABC"));
        lati.setText(getIntent().getStringExtra("ABCC"));


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){

                    if (checkSelfPermission(Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED){

                        sendSMS();
                    }else{
                        requestPermissions(new String[]{Manifest.permission.SEND_SMS},1);
                    }
                }


            }
        });

    }
    private void sendSMS(){
        String phoneNo = number.getText().toString().trim();
        String SMS = message.getText().toString().trim();
        String longii = longi.getText().toString().trim();
        String latii =  lati.getText().toString().trim();

        String shubh = SMS + " " + longii + " " + latii;

         try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo,null,shubh,null,null);
            Toast.makeText(this, "Message is sent", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Faild to send message", Toast.LENGTH_SHORT).show();
        }


    }
}