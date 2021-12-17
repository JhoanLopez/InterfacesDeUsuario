package com.jhoanlopez.interfacesdeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class TerceraPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_pantalla);

        Intent ma = new Intent(this, MainActivity.class);
        Intent sp = new Intent(this, SegundaPantalla.class);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.it_ayuda:
                Toast.makeText(this, "Ayuda", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.it_informacion:
                Toast.makeText(this, "Información", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.it_cerrarsesion:
                Toast.makeText(this, "Cerrar Sesión", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.it_cuenta:
                Toast.makeText(this, "Cuenta", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.it_idioma:
                Toast.makeText(this, "Idioma", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}