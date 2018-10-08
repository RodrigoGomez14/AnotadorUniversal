package com.example.rodrigo.anotadoruniversal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Escoba extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private TextView puntos1,puntos2;
    private EditText equipo1, equipo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoba);
        jugador1=new Jugador(0);
        jugador2=new Jugador(0);
        puntos1=findViewById(R.id.puntos1);
        puntos2=findViewById(R.id.puntos2);
        equipo1=findViewById(R.id.equipo1);
        equipo2=findViewById(R.id.equipo2);

    }

    public void sumarJug1(View vista){
        jugador1.sumarPuntos(1);
        if(jugador1.getPuntos()>=15){
            jugador1.setPuntos(15);
            Toast.makeText(this, "Partido Finalizado", Toast.LENGTH_LONG).show();
        }
        puntos1.setText(String.valueOf(jugador1.getPuntos()));
    }
    public void restartJug1(View vista){
        jugador1.restarPuntos(1);
        if(jugador1.getPuntos()<0){
            jugador1.setPuntos(0);
        }
        puntos1.setText(String.valueOf(jugador1.getPuntos()));
    }
    public void sumarJug2(View vista){
        jugador2.sumarPuntos(1);
        if(jugador2.getPuntos()>=15){
            Toast.makeText(this, "Partido Finalizado", Toast.LENGTH_LONG).show();
            jugador2.setPuntos(15);
        }
        puntos2.setText(String.valueOf(jugador2.getPuntos()));
    }
    public void restarJug2(View vista){
        jugador2.restarPuntos(1);
        if(jugador2.getPuntos()<0){
            jugador2.setPuntos(0);
        }
        puntos2.setText(String.valueOf(jugador2.getPuntos()));
    }

}
