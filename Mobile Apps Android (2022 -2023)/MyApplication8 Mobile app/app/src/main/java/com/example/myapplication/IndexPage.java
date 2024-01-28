package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndexPage extends AppCompatActivity {
    private Button firstBut;
    private Button scndPageBut;
    private Button findUsPageBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_page);
        // -----------------------------------------


        firstBut = findViewById(R.id.order_now_but);
        firstBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndexPage.this, OrderNowActivity.class);
                startActivity(intent);
            }
        });
        scndPageBut = findViewById(R.id.book_now_but);
        scndPageBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndexPage.this, BookNow.class);
                startActivity(intent);
            }
        });
        firstBut = findViewById(R.id.find_us_but);
        firstBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndexPage.this, MorePage.class);
                startActivity(intent);
            }
        });




   }
}