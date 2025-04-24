package com.example.cgi_crazzgameinfo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imgKratosMain, imgMasterchiefMain, imgWukongMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgKratosMain = findViewById(R.id.imgKratosMain);
        imgMasterchiefMain = findViewById(R.id.imgMasterchiefMain);
        imgWukongMain = findViewById(R.id.imgWukongMain);

        imgKratosMain.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DetailActivity_Kratos.class));
        });

        imgMasterchiefMain.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DetailActivity_MasterChief.class));
        });

        imgWukongMain.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DetailActivity_WuKong.class));
        });
    }
}
