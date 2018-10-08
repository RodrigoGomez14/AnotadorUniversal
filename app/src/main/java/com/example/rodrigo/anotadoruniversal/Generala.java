package com.example.rodrigo.anotadoruniversal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.support.v7.app.AlertDialog.*;

public class Generala extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generala);
    }
    public void cambiarNombre(View vista){
        Intent i=new Intent(Generala.this,CambiarNombre.class);
        startActivity(i);

    }



    public void num1Jugador1(View vista){
        //Button jugada=findViewById(R.id.num1Jugador1);
        //jugada.setText("Hola");
    }


    public String recibirNombre(View vista){
        String nombre=getIntent().getExtras().getString("NuevoNombre");
        return nombre;
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
