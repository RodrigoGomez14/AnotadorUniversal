package com.example.rodrigo.anotadoruniversal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Generala extends AppCompatActivity {
    int[] numeros;
    private TextView unouno,unodos,unotres,unocuatro,total1,total2,total3,total4;
    private Jugador jugador1,jugador2,jugador3,jugador4;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generala);
        unouno=findViewById(R.id.unouno);
        unodos=findViewById(R.id.unodos);
        unotres=findViewById(R.id.unotres);
        unocuatro=findViewById(R.id.unocuatro);
        total1= findViewById(R.id.Total1);
        total2=findViewById(R.id.Total2);
        total3=findViewById(R.id.Total3);
        total4=findViewById(R.id.Total4);
        jugador1=new Jugador(0);
        jugador2=new Jugador(0);
        jugador3=new Jugador(0);
        jugador4=new Jugador(0);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    public void elegirPuntaje(View vista){
        final TextView casillero=(TextView)vista;
        final AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setTitle("Seleccione puntaje");
        LinearLayout layout = new LinearLayout(this);
        final EditText puntaje1 = new EditText(this);
        puntaje1.setHint("Jugador 1");
        final EditText puntaje2 = new EditText(this);
        puntaje2.setHint("Jugador 2");
        final EditText puntaje3 = new EditText(this);
        puntaje3.setHint("Jugador 3");
        final EditText puntaje4 = new EditText(this);
        puntaje4.setHint("Jugador 4");
        layout.addView(puntaje1);
        layout.addView(puntaje2);
        layout.addView(puntaje3);
        layout.addView(puntaje4);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (puntaje1.getText().toString()!=null){
                    mostrarDatos(casillero,puntaje1);
                    actualizarTotal(total1,puntaje1);
                }
                if (puntaje2.getText().toString()!=null){
                    mostrarDatos(casillero,puntaje2);
                    actualizarTotal(total2,puntaje2);
                }
                if (puntaje3.getText().toString()!=null){
                    mostrarDatos(casillero,puntaje3);
                    actualizarTotal(total3,puntaje3);
                }
                if (puntaje4.getText().toString()!=null){
                    mostrarDatos(casillero,puntaje4);
                    actualizarTotal(total4,puntaje4);
                }
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertdialog.create().show();
    }

    public void actualizarTotal(View vista,EditText unamano){
        String mano=unamano.getText().toString();
        if(vista.equals(R.id.Total1)){
            jugador1.sumarPuntos((Integer.parseInt(mano)));
            total1.setText(jugador1.getPuntos());
        }
        if(vista.equals(R.id.Total2)){
            jugador2.sumarPuntos(Integer.parseInt(mano));
            total2.setText(jugador2.getPuntos());
        }
        if(vista.equals(R.id.Total3)){
            jugador3.sumarPuntos(Integer.parseInt(mano));
            total3.setText(jugador3.getPuntos());
        }
        if(vista.equals(R.id.Total4)){
            jugador4.sumarPuntos(Integer.parseInt(mano));
            total4.setText(jugador4.getPuntos());
        }


    }
    public void puntosTotales (View vista){


        total1.setText(jugador1.getPuntos());
        total2.setText(jugador2.getPuntos());
        total3.setText(jugador3.getPuntos());
        total4.setText(jugador4.getPuntos());

    }


    public void mostrarDatos(View vista, EditText et1){
        TextView tantos =(TextView) vista;
        String unaMano=et1.getText().toString();
        tantos.setText(unaMano);


    }
}
