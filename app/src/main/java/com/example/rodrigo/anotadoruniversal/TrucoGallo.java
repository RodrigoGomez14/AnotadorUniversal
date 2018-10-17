package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TrucoGallo extends AppCompatActivity {
    private Jugador jugador1,jugador2,jugador3;
    private int cantidadDePuntos;
    private TextView equipo1,equipo2,equipo3,puntos1,puntos2,puntos3,BoM1,BoM2,BoM3;
    private Button boton1,boton2,boton3,boton4,boton5,boton6;
    private ImageView linea1_1,linea1_2,linea1_3,linea1_4,linea1_5,linea1_6,linea1_7,linea1_8,linea1_9,linea1_10,
            linea1_11,linea1_12,linea1_13,linea1_14,linea1_15,linea2_1,linea2_2,linea2_3,linea2_4,linea2_5,linea2_6,linea2_7,
            linea2_8,linea2_9,linea2_10,linea2_11,linea2_12,linea2_13,linea2_14,linea2_15,linea3_1,linea3_2,linea3_3,linea3_4,linea3_5,linea3_6,linea3_7,
            linea3_8,linea3_9,linea3_10,linea3_11,linea3_12,linea3_13,linea3_14,linea3_15;;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_truco_gallo);
        cantidadDePuntos= Integer.parseInt(getIntent().getExtras().getString("cantidadDePuntos"));
        jugador1=new Jugador(0);
        jugador2=new Jugador(0);
        jugador3=new Jugador(0);
        equipo1=findViewById(R.id.equipo1);
        equipo2=findViewById(R.id.equipo2);
        equipo3=findViewById(R.id.equipo3);
        boton1=findViewById(R.id.boton1);
        boton2=findViewById(R.id.boton2);
        boton3=findViewById(R.id.boton3);
        boton4=findViewById(R.id.boton4);
        boton5=findViewById(R.id.boton5);
        boton6=findViewById(R.id.boton6);
        puntos1=findViewById(R.id.puntos1);
        puntos2=findViewById(R.id.puntos2);
        puntos3=findViewById(R.id.puntos3);
        BoM1=findViewById(R.id.BoM1);
        BoM2=findViewById(R.id.BoM2);
        BoM3=findViewById(R.id.BoM3);
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
        linea2_1=findViewById(R.id.linea2_1);
        linea2_2=findViewById(R.id.linea2_2);
        linea2_3=findViewById(R.id.linea2_3);
        linea2_4=findViewById(R.id.linea2_4);
        linea2_5=findViewById(R.id.linea2_5);
        linea2_6=findViewById(R.id.linea2_6);
        linea2_7=findViewById(R.id.linea2_7);
        linea2_8=findViewById(R.id.linea2_8);
        linea2_9=findViewById(R.id.linea2_9);
        linea2_10=findViewById(R.id.linea2_10);
        linea2_11=findViewById(R.id.linea2_11);
        linea2_12=findViewById(R.id.linea2_12);
        linea2_13=findViewById(R.id.linea2_13);
        linea2_14=findViewById(R.id.linea2_14);
        linea2_15=findViewById(R.id.linea2_15);
        linea3_1=findViewById(R.id.linea3_1);
        linea3_2=findViewById(R.id.linea3_2);
        linea3_3=findViewById(R.id.linea3_3);
        linea3_4=findViewById(R.id.linea3_4);
        linea3_5=findViewById(R.id.linea3_5);
        linea3_6=findViewById(R.id.linea3_6);
        linea3_7=findViewById(R.id.linea3_7);
        linea3_8=findViewById(R.id.linea3_8);
        linea3_9=findViewById(R.id.linea3_9);
        linea3_10=findViewById(R.id.linea3_10);
        linea3_11=findViewById(R.id.linea3_11);
        linea3_12=findViewById(R.id.linea3_12);
        linea3_13=findViewById(R.id.linea3_13);
        linea3_14=findViewById(R.id.linea3_14);
        linea3_15=findViewById(R.id.linea3_15);
        lineas(jugador1);
        lineas(jugador2);
        lineas(jugador3);

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

    public void byM(TextView bym, TextView numero, Jugador jug){

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

    public void alertNombre(View vista) {
        AlertDialog.Builder alertialog = new AlertDialog.Builder(this);
        alertialog.setTitle("Cambiar Nombres");
        final EditText equipouno = new EditText(this);
        equipouno.setHint(jugador1.getNombre());
        final EditText equipodos = new EditText(this);
        equipodos.setHint(jugador2.getNombre());
        final EditText equipotres = new EditText(this);
        equipotres.setHint(jugador3.getNombre());
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(equipouno);
        layout.addView(equipodos);
        layout.addView(equipotres);
        alertialog.setView(layout);
        alertialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                cambiarNombre(equipo1, equipouno, jugador1);
                cambiarNombre(equipo2, equipodos, jugador2);
                cambiarNombre(equipo3, equipotres, jugador3);

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
    public Jugador capturarJugador(View vista){
        Button boton=(Button)vista;
        if(boton.equals(boton1)){
            return jugador1;
        }
        else if (boton.equals(boton2)){
            return jugador1;
        }
        else if (boton.equals(boton3)){
            return jugador2;
        }
        else if (boton.equals(boton4)){
            return jugador2;
        }
        else if(boton.equals(boton5)){
            return jugador3;
        }
        else if(boton.equals(boton6)){
            return jugador3;
        }
        return null;
    }
    public void capturarBoton(View vista){
        Jugador jugador = capturarJugador(vista);
        Button boton=(Button)vista;
        if(boton.equals(boton1)){
            sumar(puntos1,jugador1);
            actualizarLineas(jugador1,boton);

        }
        else if(boton.equals(boton2)){
            restar(puntos1,jugador1);
            actualizarLineas(jugador1,boton);
        }
        else if (boton.equals(boton3)){
            sumar(puntos2,jugador2);
            actualizarLineas2(jugador2,boton);
        }
        else if (boton.equals(boton4)){
            restar(puntos2,jugador2);
            actualizarLineas2(jugador2,boton);
        }
        else if(boton.equals(boton5)){
            sumar(puntos3,jugador3);
            actualizarLineas3(jugador3,boton);
        }
        else if (boton.equals(boton6)){
            restar(puntos3,jugador3);
            actualizarLineas3(jugador3,boton);
        }

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
        if(jugador.equals(jugador3)){
            byM(BoM3,resultado,jugador3);
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
        if(jugador.equals(jugador3)){
            byM(BoM3,resultado,jugador3);
        }

    }

    public void actualizarLineas(Jugador jugador,Button boton) {
        switch (jugador.getPuntos()) {
            case 0:
                mostrarLinea(null, linea1_1, boton);
            case 1:
                mostrarLinea(linea1_1, linea1_2, boton);
                break;
            case 2:
                mostrarLinea(linea1_2, linea1_3, boton);
                break;
            case 3:
                mostrarLinea(linea1_3, linea1_4, boton);
                break;
            case 4:
                mostrarLinea(linea1_4, linea1_5, boton);
                break;
            case 5:
                mostrarLinea(linea1_5, linea1_6, boton);
                break;
            case 6:
                mostrarLinea(linea1_6, linea1_7, boton);
                break;
            case 7:
                mostrarLinea(linea1_7, linea1_8, boton);
                break;
            case 8:
                mostrarLinea(linea1_8, linea1_9, boton);
                break;
            case 9:
                mostrarLinea(linea1_9, linea1_10, boton);
                break;
            case 10:
                mostrarLinea(linea1_10, linea1_11, boton);
                break;
            case 11:
                mostrarLinea(linea1_11, linea1_12, boton);
                break;
            case 12:
                mostrarLinea(linea1_12, linea1_13, boton);
                break;
            case 13:
                mostrarLinea(linea1_13, linea1_14, boton);
                break;
            case 14:
                mostrarLinea(linea1_14, linea1_15, boton);
                break;
            case 15:
                if (boton.equals(boton1) || boton.equals(boton3)) {
                    mostrarLinea(linea1_15, null, boton);
                } else if (boton.equals(boton2) || boton.equals(boton4)) {
                    medioPartido(boton);
                }
                break;
            case 16:
                if (boton.equals(boton1) || boton.equals(boton3)) {
                    medioPartido(boton);
                }
                mostrarLinea(linea1_1, linea1_2, boton);
                break;
            case 17:
                mostrarLinea(linea1_2, linea1_3, boton);
                break;
            case 18:
                mostrarLinea(linea1_3, linea1_4, boton);
                break;
            case 19:
                mostrarLinea(linea1_4, linea1_5, boton);
                break;
            case 20:
                mostrarLinea(linea1_5, linea1_6, boton);
                break;
            case 21:
                mostrarLinea(linea1_6, linea1_7, boton);
                break;
            case 22:
                mostrarLinea(linea1_7, linea1_8, boton);
                break;
            case 23:
                mostrarLinea(linea1_8, linea1_9, boton);
                break;
            case 24:
                mostrarLinea(linea1_9, linea1_10, boton);
                break;
            case 25:
                mostrarLinea(linea1_10, linea1_11, boton);
                break;
            case 26:
                mostrarLinea(linea1_11, linea1_12, boton);
                break;
            case 27:
                mostrarLinea(linea1_12, linea1_13, boton);
                break;
            case 28:
                mostrarLinea(linea1_13, linea1_14, boton);
                break;
            case 29:
                mostrarLinea(linea1_14, linea1_15, boton);
                break;
            case 30:
                mostrarLinea(linea1_15, null, boton);
                break;

        }
    }
    public void actualizarLineas2(Jugador jugador,Button boton) {

        switch (jugador.getPuntos()){
            case 0:
                mostrarLinea(null,linea2_1,boton);
            case 1:
                mostrarLinea(linea2_1,linea2_2,boton);
                break;
            case 2:
                mostrarLinea(linea2_2,linea2_3,boton);
                break;
            case 3:
                mostrarLinea(linea2_3,linea2_4,boton);
                break;
            case 4:
                mostrarLinea(linea2_4,linea2_5,boton);
                break;
            case 5:
                mostrarLinea(linea2_5,linea2_6,boton);
                break;
            case 6:
                mostrarLinea(linea2_6,linea2_7,boton);
                break;
            case 7:
                mostrarLinea(linea2_7,linea2_8,boton);
                break;
            case 8:
                mostrarLinea(linea2_8,linea2_9,boton);
                break;
            case 9:
                mostrarLinea(linea2_9,linea2_10,boton);
                break;
            case 10:
                mostrarLinea(linea2_10,linea2_11,boton);
                break;
            case 11:
                mostrarLinea(linea2_11,linea2_12,boton);
                break;
            case 12:
                mostrarLinea(linea2_12,linea2_13,boton);
                break;
            case 13:
                mostrarLinea(linea2_13,linea2_14,boton);
                break;
            case 14:
                mostrarLinea(linea2_14,linea2_15,boton);
                break;
            case 15:
                if(boton.equals(boton1)||boton.equals(boton3)) {
                    mostrarLinea(linea2_15, null, boton);
                }
                else if(boton.equals(boton2)||boton.equals(boton4)){
                    medioPartido(boton);
                }
                break;
            case 16:
                if(boton.equals(boton1)||boton.equals(boton3)){
                    medioPartido(boton);
                }
                mostrarLinea(linea2_1,linea2_2,boton);
                break;
            case 17:
                mostrarLinea(linea2_2,linea2_3,boton);
                break;
            case 18:
                mostrarLinea(linea2_3,linea2_4,boton);
                break;
            case 19:
                mostrarLinea(linea2_4,linea2_5,boton);
                break;
            case 20:
                mostrarLinea(linea2_5,linea2_6,boton);
                break;
            case 21:
                mostrarLinea(linea2_6,linea2_7,boton);
                break;
            case 22:
                mostrarLinea(linea2_7,linea2_8,boton);
                break;
            case 23:
                mostrarLinea(linea2_8,linea2_9,boton);
                break;
            case 24:
                mostrarLinea(linea2_9,linea2_10,boton);
                break;
            case 25:
                mostrarLinea(linea2_10,linea2_11,boton);
                break;
            case 26:
                mostrarLinea(linea2_11,linea2_12,boton);
                break;
            case 27:
                mostrarLinea(linea2_12,linea2_13,boton);
                break;
            case 28:
                mostrarLinea(linea2_13,linea2_14,boton);
                break;
            case 29:
                mostrarLinea(linea2_14,linea2_15,boton);
                break;
            case 30:
                mostrarLinea(linea2_15,null,boton);
                break;
        }
    }
    public void actualizarLineas3(Jugador jugador,Button boton) {

        switch (jugador.getPuntos()){
            case 0:
                mostrarLinea(null,linea3_1,boton);
            case 1:
                mostrarLinea(linea3_1,linea3_2,boton);
                break;
            case 2:
                mostrarLinea(linea3_2,linea3_3,boton);
                break;
            case 3:
                mostrarLinea(linea3_3,linea3_4,boton);
                break;
            case 4:
                mostrarLinea(linea3_4,linea3_5,boton);
                break;
            case 5:
                mostrarLinea(linea3_5,linea3_6,boton);
                break;
            case 6:
                mostrarLinea(linea3_6,linea3_7,boton);
                break;
            case 7:
                mostrarLinea(linea3_7,linea3_8,boton);
                break;
            case 8:
                mostrarLinea(linea3_8,linea3_9,boton);
                break;
            case 9:
                mostrarLinea(linea3_9,linea3_10,boton);
                break;
            case 10:
                mostrarLinea(linea3_10,linea3_11,boton);
                break;
            case 11:
                mostrarLinea(linea3_11,linea3_12,boton);
                break;
            case 12:
                mostrarLinea(linea3_12,linea3_13,boton);
                break;
            case 13:
                mostrarLinea(linea3_13,linea3_14,boton);
                break;
            case 14:
                mostrarLinea(linea3_14,linea3_15,boton);
                break;
            case 15:
                if(boton.equals(boton5)) {
                    mostrarLinea(linea3_15, null, boton);
                }
                else if(boton.equals(boton6)){
                    medioPartido(boton);
                }
                break;
            case 16:
                if(boton.equals(boton5)){
                    medioPartido(boton);
                }
                mostrarLinea(linea3_1,linea3_2,boton);
                break;
            case 17:
                mostrarLinea(linea3_2,linea3_3,boton);
                break;
            case 18:
                mostrarLinea(linea3_3,linea3_4,boton);
                break;
            case 19:
                mostrarLinea(linea3_4,linea3_5,boton);
                break;
            case 20:
                mostrarLinea(linea3_5,linea3_6,boton);
                break;
            case 21:
                mostrarLinea(linea3_6,linea3_7,boton);
                break;
            case 22:
                mostrarLinea(linea3_7,linea3_8,boton);
                break;
            case 23:
                mostrarLinea(linea3_8,linea3_9,boton);
                break;
            case 24:
                mostrarLinea(linea3_9,linea3_10,boton);
                break;
            case 25:
                mostrarLinea(linea3_10,linea3_11,boton);
                break;
            case 26:
                mostrarLinea(linea3_11,linea3_12,boton);
                break;
            case 27:
                mostrarLinea(linea3_12,linea3_13,boton);
                break;
            case 28:
                mostrarLinea(linea3_13,linea3_14,boton);
                break;
            case 29:
                mostrarLinea(linea3_14,linea3_15,boton);
                break;
            case 30:
                mostrarLinea(linea3_15,null,boton);
                break;
        }
    }
    public void mostrarLinea(ImageView linea,ImageView siguiente, Button boton){
        if(boton.equals(boton1)||boton.equals(boton3)||boton.equals(boton5)){
            linea.setVisibility(View.VISIBLE);
        }
        else if(boton.equals(boton2)||boton.equals(boton4)||boton.equals(boton6)){
            siguiente.setVisibility(View.INVISIBLE);
        }

    }
    public void cambioDePuntaje (ImageView linea,Button boton){
        if(boton.equals(boton1) || boton.equals(boton3)||boton.equals(boton5)){
            linea.setVisibility(View.INVISIBLE);
        }
        else if(boton.equals(boton2) || boton.equals(boton4)||boton.equals(boton6)){
            linea.setVisibility(View.VISIBLE);
        }
    }
    public void medioPartido(Button boton){
        if(boton.equals(boton1)||boton.equals(boton2)){
            cambioDePuntaje(linea1_1,boton);
            cambioDePuntaje(linea1_2,boton);
            cambioDePuntaje(linea1_3,boton);
            cambioDePuntaje(linea1_4,boton);
            cambioDePuntaje(linea1_5,boton);
            cambioDePuntaje(linea1_6,boton);
            cambioDePuntaje(linea1_7,boton);
            cambioDePuntaje(linea1_8,boton);
            cambioDePuntaje(linea1_9,boton);
            cambioDePuntaje(linea1_10,boton);
            cambioDePuntaje(linea1_11,boton);
            cambioDePuntaje(linea1_12,boton);
            cambioDePuntaje(linea1_13,boton);
            cambioDePuntaje(linea1_14,boton);
            cambioDePuntaje(linea1_15,boton);
        }
        else if(boton.equals(boton3)||boton.equals(boton4)){
            cambioDePuntaje(linea2_1,boton);
            cambioDePuntaje(linea2_2,boton);
            cambioDePuntaje(linea2_3,boton);
            cambioDePuntaje(linea2_4,boton);
            cambioDePuntaje(linea2_5,boton);
            cambioDePuntaje(linea2_6,boton);
            cambioDePuntaje(linea2_7,boton);
            cambioDePuntaje(linea2_8,boton);
            cambioDePuntaje(linea2_9,boton);
            cambioDePuntaje(linea2_10,boton);
            cambioDePuntaje(linea2_11,boton);
            cambioDePuntaje(linea2_12,boton);
            cambioDePuntaje(linea2_13,boton);
            cambioDePuntaje(linea2_14,boton);
            cambioDePuntaje(linea2_15,boton);
        }
        else if(boton.equals(boton5)||boton.equals(boton6)){
            cambioDePuntaje(linea3_1,boton);
            cambioDePuntaje(linea3_2,boton);
            cambioDePuntaje(linea3_3,boton);
            cambioDePuntaje(linea3_4,boton);
            cambioDePuntaje(linea3_5,boton);
            cambioDePuntaje(linea3_6,boton);
            cambioDePuntaje(linea3_7,boton);
            cambioDePuntaje(linea3_8,boton);
            cambioDePuntaje(linea3_9,boton);
            cambioDePuntaje(linea3_10,boton);
            cambioDePuntaje(linea3_11,boton);
            cambioDePuntaje(linea3_12,boton);
            cambioDePuntaje(linea3_13,boton);
            cambioDePuntaje(linea3_14,boton);
            cambioDePuntaje(linea3_15,boton);

        }
    }


    public void lineas(Jugador jugador){
        if(jugador.equals(jugador1)){
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
        else if (jugador.equals(jugador2)){
            linea2_1.setVisibility(View.INVISIBLE);
            linea2_2.setVisibility(View.INVISIBLE);
            linea2_3.setVisibility(View.INVISIBLE);
            linea2_4.setVisibility(View.INVISIBLE);
            linea2_5.setVisibility(View.INVISIBLE);
            linea2_6.setVisibility(View.INVISIBLE);
            linea2_7.setVisibility(View.INVISIBLE);
            linea2_8.setVisibility(View.INVISIBLE);
            linea2_9.setVisibility(View.INVISIBLE);
            linea2_10.setVisibility(View.INVISIBLE);
            linea2_11.setVisibility(View.INVISIBLE);
            linea2_12.setVisibility(View.INVISIBLE);
            linea2_13.setVisibility(View.INVISIBLE);
            linea2_14.setVisibility(View.INVISIBLE);
            linea2_15.setVisibility(View.INVISIBLE);
        }
        else if (jugador.equals(jugador3)){
            linea3_1.setVisibility(View.INVISIBLE);
            linea3_2.setVisibility(View.INVISIBLE);
            linea3_3.setVisibility(View.INVISIBLE);
            linea3_4.setVisibility(View.INVISIBLE);
            linea3_5.setVisibility(View.INVISIBLE);
            linea3_6.setVisibility(View.INVISIBLE);
            linea3_7.setVisibility(View.INVISIBLE);
            linea3_8.setVisibility(View.INVISIBLE);
            linea3_9.setVisibility(View.INVISIBLE);
            linea3_10.setVisibility(View.INVISIBLE);
            linea3_11.setVisibility(View.INVISIBLE);
            linea3_12.setVisibility(View.INVISIBLE);
            linea3_13.setVisibility(View.INVISIBLE);
            linea3_14.setVisibility(View.INVISIBLE);
            linea3_15.setVisibility(View.INVISIBLE);
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
                    Intent j=new Intent(TrucoGallo.this,ConfiguracionTruco.class);
                    boolean gallo=true;
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
            AlertDialog.Builder alertdialog =new AlertDialog.Builder(this);
            alertdialog.setTitle("Reiniciar?");
            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    reiniciarPartido();
                }
            });
            alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alertdialog.create().show();
        }
        return super.onOptionsItemSelected(item);
    }
    public void reiniciarPartido(){
        jugador1.setPuntos(0);
        puntos1.setText( String.valueOf(jugador1.getPuntos()));
        jugador2.setPuntos(0);
        puntos2.setText(String.valueOf(jugador2.getPuntos()));
        jugador3.setPuntos(0);
        puntos3.setText(String.valueOf(jugador3.getPuntos()));
        lineas(jugador1);
        lineas(jugador2);
        lineas(jugador3);
    }
}
