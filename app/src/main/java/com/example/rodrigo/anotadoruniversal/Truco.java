package com.example.rodrigo.anotadoruniversal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Truco extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private TextView puntos1, puntos2;
    private EditText equipo1, equipo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truco);
        jugador1=new Jugador(0);
        jugador2=new Jugador(0);
        puntos1= findViewById(R.id.puntos1);
        puntos2=findViewById(R.id.puntos2);
        equipo1=findViewById(R.id.equipo1);
        equipo1.setFocusable(false);
        equipo2=findViewById(R.id.equipo2);
        equipo2.setFocusable(false);

    }

    public void reiniciarPartido(View vista){
        jugador1.setPuntos(0);
        puntos1.setText( String.valueOf(jugador1.getPuntos()));
        jugador2.setPuntos(0);
        puntos2.setText(String.valueOf(jugador2.getPuntos()));

    }
    public void sumarJug1(View vista){
            jugador1.sumarPuntos(1);
            if(jugador1.getPuntos()>=30){
                jugador1.setPuntos(30);
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
        if(jugador2.getPuntos()>=30){
            Toast.makeText(this, "Partido Finalizado", Toast.LENGTH_LONG).show();
            jugador2.setPuntos(30);
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
