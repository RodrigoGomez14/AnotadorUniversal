package com.example.rodrigo.anotadoruniversal;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Chancho extends AppCompatActivity {
    TextView letra_C,letra_H,letra_A,letra_N,letra_C2,letra_H2,letra_O;
    Jugador jugador1;
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chancho);
        letra_C=findViewById(R.id.letra_C);
        letra_H=findViewById(R.id.letra_H);
        letra_A=findViewById(R.id.letra_A);
        letra_N=findViewById(R.id.letra_N);
        letra_C2=findViewById(R.id.letra_C2);
        letra_H2=findViewById(R.id.letra_H2);
        letra_O=findViewById(R.id.letra_O);
    }
    public void sumarPuntos(View vista){
        switch (contador){
            case 0:
                contador++;
                letra_C.setTextColor(letra_C.getContext().getResources().getColor(R.color.Negro));
                break;
            case 1:
                contador++;
                letra_H.setTextColor(letra_H.getContext().getResources().getColor(R.color.Negro));
                break;
            case 2:
                contador++;
                letra_A.setTextColor(letra_A.getContext().getResources().getColor(R.color.Negro));
                break;
            case 3:
                contador++;
                letra_N.setTextColor(letra_N.getContext().getResources().getColor(R.color.Negro));
                break;
            case 4:
                contador++;
                letra_C2.setTextColor(letra_C2.getContext().getResources().getColor(R.color.Negro));
                break;
            case 5:
                contador++;
                letra_H2.setTextColor(letra_H2.getContext().getResources().getColor(R.color.Negro));
                break;
            case 6:
                contador++;
                letra_O.setTextColor(letra_O.getContext().getResources().getColor(R.color.Negro));
                Toast.makeText(this, "Partido Finalizado", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void restarPuntos(View vista){
        switch (contador){
            case 1:
                contador--;
                letra_C.setTextColor(letra_C.getContext().getResources().getColor(R.color.GrisClaro));
                break;
            case 2:
                contador--;
                letra_H.setTextColor(letra_H.getContext().getResources().getColor(R.color.GrisClaro));
                break;
            case 3:
                contador--;
                letra_A.setTextColor(letra_A.getContext().getResources().getColor(R.color.GrisClaro));
                break;
            case 4:
                contador--;
                letra_N.setTextColor(letra_N.getContext().getResources().getColor(R.color.GrisClaro));
                break;
            case 5:
                contador--;
                letra_C2.setTextColor(letra_C2.getContext().getResources().getColor(R.color.GrisClaro));
                break;
            case 6:
                contador--;
                letra_H2.setTextColor(letra_H2.getContext().getResources().getColor(R.color.GrisClaro));
                break;
            case 7:
                contador--;
                letra_O.setTextColor(letra_O.getContext().getResources().getColor(R.color.GrisClaro));
                break;
        }
    }

}
