package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Escoba extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private TextView puntos1,puntos2,equipo1,equipo2;
    private Button boton1,boton2,boton3,boton4;
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
        boton1=findViewById(R.id.boton1);
        boton2=findViewById(R.id.boton2);
        boton3=findViewById(R.id.boton3);
        boton4=findViewById(R.id.boton4);


    }

    public void capturarBoton(View vista){
        Button boton =(Button)vista;
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

    public void sumar(View vista,Jugador jugador){
        TextView resultado = (TextView)vista;
        jugador.sumarPuntos(1);
        if(jugador.getPuntos()>=15){
            jugador.setPuntos(15);
            Toast.makeText(this, "Partido finalizado \n ganador: "+jugador.getNombre(), Toast.LENGTH_LONG).show();

        }
        resultado.setText(String.valueOf(jugador.getPuntos()));
    }
    public void restar(View vista,Jugador jugador){
        TextView resultado=(TextView)vista;
        jugador.restarPuntos(1);
        if(jugador.getPuntos()<0){
            jugador.setPuntos(0);
        }
        resultado.setText(String.valueOf(jugador.getPuntos()));
    }

    public void alertNombre(View vista){
        final TextView jugador=(TextView) vista;
        final EditText juguno=new EditText(this);
        juguno.setHint("Jugador1");
        final EditText jugdos=new EditText(this);
        jugdos.setHint("Jugador 2");
        AlertDialog.Builder alertdialog= new AlertDialog.Builder(this);
        alertdialog.setTitle("cambiar nombre");
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(juguno);
        layout.addView(jugdos);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    cambiarNombre(juguno,equipo1,jugador1);
                    cambiarNombre(jugdos,equipo2,jugador2);
                }
                catch (Exception e){

                }

            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertdialog.create().show();

    }

    public void cambiarNombre(EditText Nombre,TextView Equipo,Jugador Jugador){
        EditText nombre=(EditText)Nombre;
        TextView equipo=(TextView)Equipo;
        if(!nombre.getText().toString().equals("")){
            String nombrestring=nombre.getText().toString();
            Jugador.setNombre(nombrestring);
            equipo.setText(nombrestring);
        }
    }
}
