package com.jhoanlopez.interfacesdeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SegundaPantalla extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        Intent tp = new Intent(this,TerceraPantalla.class);

        siguiente = findViewById(R.id.but_but);

        siguiente.setOnClickListener(v -> {
            startActivity(tp);
        });
    }
}