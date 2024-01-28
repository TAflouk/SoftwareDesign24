package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Transtion extends AppCompatActivity {
    private View viewBut;
    private Button but_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transtion);

        viewBut = findViewById(R.id.imageViewHomeButton);
        viewBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Transtion.this, IndexPage.class);
                startActivity(intent);
            }
        });

        but_next = findViewById(R.id.nextBut);
        but_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Transtion.this,Screen2.class);
                startActivity(i);
                overridePendingTransition(R.transition.slide_in_right,R.transition.slide_out_left);// transition
            }
        });
    }
}