package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Truco extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private TextView puntos1, puntos2,equipo1,equipo2,BoM1,BoM2;
    private Button boton1,boton2,boton3,boton4;
    private int cantidadDePuntos;
    private ImageView linea1_1,linea1_2,linea1_3,linea1_4,linea1_5,linea1_6,linea1_7,linea1_8,linea1_9,linea1_10,linea1_11,linea1_12,linea1_13,linea1_14,linea1_15;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truco);
        cantidadDePuntos= Integer.parseInt(getIntent().getExtras().getString("cantidadDePuntos"));
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
        linea1_1=findViewById(R.id.linea1_1);
        linea1_2=findViewById(R.id.linea1_2);
        linea1_3=findViewById(R.id.linea1_3);
        linea1_4=findViewById(R.id.linea1_4);
        linea1_5=findViewById(R.id.linea1_5);
        linea1_6=findViewById(R.id.linea1_6);
        linea1_7=findViewById(R.id.linea1_7);
        linea1_8=findViewById(R.id.linea1_8);
        linea1_9=findViewById(R.id.linea1_9);
        linea1_10=findViewById(R.id.linea1_10);
        linea1_11=findViewById(R.id.linea1_11);
        linea1_12=findViewById(R.id.linea1_12);
        linea1_13=findViewById(R.id.linea1_13);
        linea1_14=findViewById(R.id.linea1_14);
        linea1_15=findViewById(R.id.linea1_15);
        BoM1=findViewById(R.id.BoM1);
        BoM2=findViewById(R.id.BoM2);
        lineas();

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
        if(jugador.getPuntos()>=cantidadDePuntos){
            jugador.setPuntos(cantidadDePuntos);
            Toast.makeText(this, "Partido Finalizado", Toast.LENGTH_LONG).show();
        }
             if(jugador.equals(jugador1)){
                byM(BoM1,resultado,jugador1);
             }
             if(jugador.equals(jugador2)){
                byM(BoM2,resultado,jugador2);
            }


    }
    public void restar(View vista, Jugador jugador){
        TextView resultado=(TextView)vista;
        jugador.restarPuntos(1);
        if(jugador.getPuntos()>=cantidadDePuntos){
            jugador.setPuntos(cantidadDePuntos);
            Toast.makeText(this, "Partido Finalizado", Toast.LENGTH_LONG).show();
        }
        if(jugador.getPuntos()<0){
            jugador.setPuntos(0);
        }
        if(jugador.equals(jugador1)){
            byM(BoM1,resultado,jugador1);
        }
        if(jugador.equals(jugador2)){
            byM(BoM2,resultado,jugador2);
        }

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
            restar(puntos2,jugador2);
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


            AlertDialog.Builder alertialog = new AlertDialog.Builder(this);
            alertialog.setTitle("Configuracion");
            alertialog.setMessage("Se perderán los puntajes");
            alertialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent j=new Intent(Truco.this,ConfiguracionTruco.class);
                    boolean gallo=false;
                    j.putExtra("gallo",gallo);
                    startActivity(j);
                    finish();
                }
            });
            alertialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            alertialog.show();
        }
        if(id==R.id.Reiniciar){

            reiniciarPartido(null);
        }

        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        AlertDialog.Builder alertialog = new AlertDialog.Builder(this);
        alertialog.setTitle("Salir?");
        alertialog.setMessage("Se reiniciará la partida");
        alertialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    finish();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        });
        alertialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        alertialog.show();
    }
    public void byM(TextView bym, TextView numero,Jugador jug){

        if(jug.getPuntos()<=16){
            bym.setText("Malas");
            bym.setTextColor(getResources().getColor(R.color.rojo));
            numero.setText(String.valueOf(jug.getPuntos()));
        }
        if (jug.getPuntos()>=16 && cantidadDePuntos==30) {
            bym.setText("Buenas");
            bym.setTextColor(getResources().getColor(R.color.verde));
            numero.setText(String.valueOf(jug.getPuntos()-15));
        }

    }


    public void alertNombre(View vista){
        AlertDialog.Builder alertialog = new AlertDialog.Builder(this);
        alertialog.setTitle("Cambiar Nombres");
        final EditText equipouno=new EditText(this);
        equipouno.setHint(jugador1.getNombre());
        final EditText equipodos=new EditText(this);
        equipodos.setHint(jugador2.getNombre());
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(equipouno);
        layout.addView(equipodos);
        alertialog.setView(layout);
        alertialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                cambiarNombre(equipo1,equipouno,jugador1);
                cambiarNombre(equipo2,equipodos,jugador2);
            }
        });
        alertialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        alertialog.show();
    }
    public void cambiarNombre(TextView casillero,EditText nombre, Jugador jug){
        String nombreNuevo=nombre.getText().toString();
        casillero.setText(nombreNuevo);
        jug.setNombre(nombreNuevo);
    }

    public void lineas(){
        linea1_1.setVisibility(View.INVISIBLE);
        linea1_2.setVisibility(View.INVISIBLE);
        linea1_3.setVisibility(View.INVISIBLE);
        linea1_4.setVisibility(View.INVISIBLE);
        linea1_5.setVisibility(View.INVISIBLE);
        linea1_6.setVisibility(View.INVISIBLE);
        linea1_7.setVisibility(View.INVISIBLE);
        linea1_8.setVisibility(View.INVISIBLE);
        linea1_9.setVisibility(View.INVISIBLE);
        linea1_10.setVisibility(View.INVISIBLE);
        linea1_11.setVisibility(View.INVISIBLE);
        linea1_12.setVisibility(View.INVISIBLE);
        linea1_13.setVisibility(View.INVISIBLE);
        linea1_14.setVisibility(View.INVISIBLE);
        linea1_15.setVisibility(View.INVISIBLE);
    }
}
