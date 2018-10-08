package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Generala extends AppCompatActivity {
    private int[] numeros;

    private TextView Jugador1, jug1Nro1;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generala);
        Jugador1=findViewById(R.id.Jugador1);
        numeros=getResources().getIntArray(R.array.numero_Uno);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
