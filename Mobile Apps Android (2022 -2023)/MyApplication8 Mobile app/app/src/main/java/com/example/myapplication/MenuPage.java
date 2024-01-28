package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MenuPage extends AppCompatActivity {
    private Button menuPageBackButton;
    private View viewBut;
    private ViewFlipper viewFlipper;
    private Button btu_next, btu_prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        viewFlipper = findViewById(R.id.view_flipper);
        btu_next = findViewById(R.id.but_next);
        btu_prev = findViewById(R.id.but_pre);

        btu_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(MenuPage.this,R.anim.slide_in_left);
                viewFlipper.setOutAnimation(MenuPage.this,R.anim.slide_out_right);
                viewFlipper.showNext();
            }
        });

        btu_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(MenuPage.this,R.anim.slide_in_right);
                viewFlipper.setOutAnimation(MenuPage.this,R.anim.slide_out_left);
                viewFlipper.showPrevious();
            }
        });


        viewBut = findViewById(R.id.imageViewHomeButton);
        viewBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPage.this, IndexPage.class);
                startActivity(intent);
            }
        });
        menuPageBackButton = findViewById(R.id.menu_page_back_but);
        menuPageBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPage.this, OrderNowActivity.class);
                startActivity(intent);
            }
        });
    }
}