package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ContactUs extends AppCompatActivity {
    private View viewBut;
    private ImageView id_email,id_sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        id_email = findViewById(R.id.email);
        id_sms = findViewById(R.id.sms);

        id_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"tom@ait.ie"});
                email.putExtra(Intent.EXTRA_SUBJECT, "Hello from my app");
                email.putExtra(Intent.EXTRA_TEXT, "Bla bla Bla bla  Bla bla  Bla bla  Bla bla ");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Send Mail Using :"));
            }
        });

        id_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:2345612345");
                Intent msg = new Intent(Intent.ACTION_SENDTO, uri);
                msg.putExtra("sms_body", "The SMS text");
                startActivity(Intent.createChooser(msg, "Send sms Using :"));
            }
        });


        viewBut = findViewById(R.id.imageViewHomeButton);
        viewBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContactUs.this, IndexPage.class);
                startActivity(intent);
            }
        });
    }

}