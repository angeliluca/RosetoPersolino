package com.example.rosetopersolino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Visita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita);
    }


    public void mappa(View view) {
        Intent intent = new Intent(this, mappa.class);
        startActivity(intent);
    }
}
