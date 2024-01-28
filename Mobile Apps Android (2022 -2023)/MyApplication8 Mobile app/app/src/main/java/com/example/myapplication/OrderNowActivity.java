package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class OrderNowActivity extends AppCompatActivity {
    private Button backButIn;
    private Button menuButton;
    private View viewBut;

    private Button back;

    private RadioGroup radioChoiceGroup;
    private RadioButton choiceSelected;

    private int counter = 0;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_now);

        viewBut = findViewById(R.id.imageViewHomeButton);
        viewBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderNowActivity.this, IndexPage.class);
                startActivity(intent);
            }
        });



        menuButton = findViewById(R.id.menu_but);

        backButIn = findViewById(R.id.back);
        backButIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderNowActivity.this, IndexPage.class);
                startActivity(intent);
            }
        });


        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                            Intent i = new Intent(OrderNowActivity.this, MenuPage.class);
                            startActivity(i);
            }
        });



    }
}