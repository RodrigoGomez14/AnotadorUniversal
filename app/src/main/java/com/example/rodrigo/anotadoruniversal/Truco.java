package com.example.rodrigo.anotadoruniversal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Truco extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private TextView puntos1, puntos2,equipo1,equipo2;
    private Button boton1,boton2,boton3,boton4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truco);
        jugador1=new Jugador(0);
        jugador2=new Jugador(0);
        puntos1= findViewById(R.id.puntos1);
        puntos2=findViewById(R.id.puntos2);
        equipo1=findViewById(R.id.equipo1);
        equipo2=findViewById(R.id.equipo2);
        boton1=findViewById(R.id.boton1);
        boton2=findViewById(R.id.boton2);
        boton3=findViewById(R.id.boton3);
        boton4=findViewById(R.id.boton4);
    }

    public void reiniciarPartido(View vista){
        jugador1.setPuntos(0);
        puntos1.setText( String.valueOf(jugador1.getPuntos()));
        jugador2.setPuntos(0);
        puntos2.setText(String.valueOf(jugador2.getPuntos()));
    }
    public void sumar(View vista, Jugador jugador){
            TextView resultado = (TextView)vista;
            jugador.sumarPuntos(1);
            if(jugador.getPuntos()>=30){
                jugador.setPuntos(30);
                Toast.makeText(this, "Partido Finalizado", Toast.LENGTH_LONG).show();
            }
            resultado.setText(String.valueOf(jugador.getPuntos()));
    }
    public void restar(View vista, Jugador jugador){
        TextView resultado=(TextView)vista;
        jugador.restarPuntos(1);
        if(jugador.getPuntos()<0){
            jugador.setPuntos(0);
        }
        resultado.setText(String.valueOf(jugador.getPuntos()));

    }

    public void capturarBoton(View vista){
        Button boton=(Button)vista;
        if(boton.equals(boton1)){
            sumar(puntos1,jugador1);
        }
        if(boton.equals(boton2)){
            restar(puntos1,jugador1);
        }
        if(boton.equals(boton3)){
            sumar(puntos2,jugador2);
        }
        if(boton.equals(boton4)){
            sumar(puntos2,jugador2);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_truco,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.configuracion){
            Intent i=new Intent(Truco.this,ConfiguracionTruco.class);
            startActivity(i);
        }
        if(id==R.id.Reiniciar){

            reiniciarPartido(null);
        }
        return super.onOptionsItemSelected(item);
    }
}
