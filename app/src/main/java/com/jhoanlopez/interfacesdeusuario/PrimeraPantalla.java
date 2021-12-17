package com.jhoanlopez.interfacesdeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeraPantalla extends AppCompatActivity {

    Button but_siguiente;
    EditText et_usuario;
    EditText et_contraseña;
    TextView tv_usuario;
    TextView tv_contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pantalla);

        Intent sp = new Intent(this, SegundaPantalla.class);

        but_siguiente = findViewById(R.id.but_siguiente);
        et_usuario = findViewById(R.id.et_usuario);
        et_contraseña = findViewById(R.id.et_contraseña);
        tv_usuario = findViewById(R.id.tv_usuario);
        tv_contraseña = findViewById(R.id.tv_contraseña);

        but_siguiente.setOnClickListener(v ->  {

            startActivity(sp);
        });
    }
}