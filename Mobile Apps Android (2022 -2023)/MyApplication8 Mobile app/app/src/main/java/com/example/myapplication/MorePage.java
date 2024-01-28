package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MorePage extends AppCompatActivity {
    private Button trans;
    private View viewBut;
    private Button bell;
    private WebView webView;
    private Button contact;

    private Button calender;
    private Button videoPage;

    private Button backButtonFindUsPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_page);

        bell = findViewById(R.id.bell);
        bell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MorePage.this, R.raw.asd);
                mp.start();

            }
        });
        contact = findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MorePage.this, ContactUs.class);
                startActivity(intent);
            }
        });
        videoPage = findViewById(R.id.videoButton);


        videoPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MorePage.this, CameraPage.class);
                startActivity(intent);

                Intent i = new Intent(MorePage.this, CameraPage.class);
                String myText = "This msg came from find us page";
                i.putExtra("Send me", myText);
                startActivity(i);

            }
        });
        backButtonFindUsPage = findViewById(R.id.back_but_finus_page);
        backButtonFindUsPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MorePage.this, IndexPage.class);
                startActivity(intent);
            }
        });
        trans = findViewById(R.id.phone_but);
        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MorePage.this,Transtion.class );
                startActivity(i);

            }
        });
        calender = findViewById(R.id.calender);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MorePage.this, Calender.class);
                startActivity(intent);
            }
        });

        viewBut = findViewById(R.id.imageViewHomeButton);
        viewBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MorePage.this, IndexPage.class);
                startActivity(intent);
            }
        });



    }
}