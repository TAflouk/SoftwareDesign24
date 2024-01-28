package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;


public class BookNow extends AppCompatActivity {
    private Button bookButton, btu_show;
    private View viewBut;
    private TextView tv;
    private EditText etx;
    private SharedPreferences sp_database;

    private Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_now);
        // -----------------------------------------


        bookButton = findViewById(R.id.bookButton);
        tv = findViewById(R.id.tv);
        btu_show = findViewById(R.id.showBookButton);
        etx = findViewById(R.id.etx);

        backButton = findViewById(R.id.back_but_page2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookNow.this, IndexPage.class);
                startActivity(intent);
            }
        });
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sp_database = getApplicationContext().getSharedPreferences("table_store_text", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp_database.edit();
                String txt = etx.getText().toString();
                editor.putString("key_saved_text", txt);
                editor.commit();
                Toast.makeText(BookNow.this, "Data Saved!", Toast.LENGTH_SHORT).show();

            }
        });
        viewBut = findViewById(R.id.imageViewHomeButton);
        viewBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookNow.this, IndexPage.class);
                startActivity(intent);
            }
        });
        btu_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp_database = getApplicationContext().getSharedPreferences("table_store_text", MODE_PRIVATE);
                String name = sp_database.getString("key_saved_text", null);
                Toast.makeText(BookNow.this, name, Toast.LENGTH_SHORT).show();
            }
        });


    }
}