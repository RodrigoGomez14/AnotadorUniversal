package com.example.rodrigo.anotadoruniversal;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Chancho extends AppCompatActivity {
    TextView letra_C,letra_H,letra_A,letra_N,letra_C2,letra_H2,letra_O;
    Jugador jugador1;
    private Button boton1;
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
        boton1=findViewById(R.id.botonrestar);
        jugador1=new Jugador(0);
    }

    public void capturarToque(View vista){
            TextView letra=(TextView)vista;
            if(letra.equals(letra_C)||letra.equals(letra_H)||letra.equals(letra_A)||letra.equals(letra_N)||letra.equals(letra_C2)||letra.equals(letra_H2)||letra.equals(letra_O)){
                sumarPuntos(jugador1);
            }
            /*if (boton.equals(boton1)){
                restarPuntos(jugador1);
            }*/

    }
    public void sumarPuntos(Jugador jugador){
        if(jugador.getPuntos()==0) {
            letra_C.setTextColor(letra_C.getContext().getResources().getColor(R.color.Negro));
            jugador.sumarPuntos(1);
        }
        else if(jugador.getPuntos()==1) {
            letra_H.setTextColor(letra_H.getContext().getResources().getColor(R.color.Negro));
            jugador.sumarPuntos(1);
        }
        else if(jugador.getPuntos()==2) {
            letra_A.setTextColor(letra_A.getContext().getResources().getColor(R.color.Negro));
            jugador.sumarPuntos(1);
        }
        else if(jugador.getPuntos()==3) {
            letra_N.setTextColor(letra_N.getContext().getResources().getColor(R.color.Negro));
            jugador.sumarPuntos(1);
        }
        else if(jugador.getPuntos()==4) {
            letra_C2.setTextColor(letra_C2.getContext().getResources().getColor(R.color.Negro));
            jugador.sumarPuntos(1);
        }
        else if(jugador.getPuntos()==5) {
            letra_H2.setTextColor(letra_H2.getContext().getResources().getColor(R.color.Negro));
            jugador.sumarPuntos(1);
        }
        else if(jugador.getPuntos()==6) {
            letra_O.setTextColor(letra_O.getContext().getResources().getColor(R.color.Negro));
            Toast.makeText(this, "Ganador: "+jugador.getNombre(), Toast.LENGTH_SHORT).show();
            jugador.sumarPuntos(1);
        }
    }

    public void restarPuntos(Jugador jugador){
        if(jugador.getPuntos()==1) {
            letra_C.setTextColor(letra_C.getContext().getResources().getColor(R.color.GrisClaro));
            jugador.restarPuntos(1);
        }
        else if(jugador.getPuntos()==2) {
            letra_H.setTextColor(letra_H.getContext().getResources().getColor(R.color.GrisClaro));
            jugador.restarPuntos(1);
        }
        else if(jugador.getPuntos()==3) {
            letra_A.setTextColor(letra_A.getContext().getResources().getColor(R.color.GrisClaro));
            jugador.restarPuntos(1);
        }
        else if(jugador.getPuntos()==4) {
            letra_N.setTextColor(letra_N.getContext().getResources().getColor(R.color.GrisClaro));
            jugador.restarPuntos(1);
        }
        else if(jugador.getPuntos()==5) {
            letra_C2.setTextColor(letra_C2.getContext().getResources().getColor(R.color.GrisClaro));
            jugador.restarPuntos(1);
        }
        else if(jugador.getPuntos()==6) {
            letra_H2.setTextColor(letra_H2.getContext().getResources().getColor(R.color.GrisClaro));
            jugador.restarPuntos(1);
        }
        else if(jugador.getPuntos()==7) {
            letra_O.setTextColor(letra_O.getContext().getResources().getColor(R.color.GrisClaro));
            jugador.restarPuntos(1);
        }
    }

}
