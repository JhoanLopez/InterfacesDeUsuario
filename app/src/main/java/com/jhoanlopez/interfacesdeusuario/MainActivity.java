package com.jhoanlopez.interfacesdeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button but_empezar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent pp = new Intent(this, PrimeraPantalla.class);

        but_empezar = findViewById(R.id.but_empezar);

        but_empezar.setOnClickListener(v ->  {
            startActivity(pp);
        });

    }
}