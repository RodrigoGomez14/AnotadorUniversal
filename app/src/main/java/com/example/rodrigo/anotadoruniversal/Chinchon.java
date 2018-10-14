package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Chinchon extends AppCompatActivity {
    private TextView jugadoruno,jugadordos,jugadortres,jugadorcuatro;
    private Jugador jugador1,jugador2,jugador3,jugador4;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinchon_activity);
        jugador1=new Jugador(0);
        jugadoruno=findViewById(R.id.jugadoruno);
        jugadordos=findViewById(R.id.jugadordos);
        jugadortres=findViewById(R.id.jugadortres);
        jugadorcuatro=findViewById(R.id.jugadorcuatro);
        jugador2=new Jugador(0);
        jugador3=new Jugador(0);
        jugador4=new Jugador(0);

    }



    public void cambiarNombre(View vista){
        AlertDialog.Builder alertdialog= new AlertDialog.Builder(this);
        alertdialog.setTitle("Cambiar Nombres");
        LinearLayout layout = new LinearLayout(this);
        final EditText nombre1 = new EditText(this);
        nombre1.setHint(jugador1.getNombre());
        final EditText nombre2 = new EditText(this);
        nombre2.setHint(jugador2.getNombre());
        final EditText nombre3 = new EditText(this);
        nombre3.setHint(jugador3.getNombre());
        final EditText nombre4 = new EditText(this);
        nombre4.setHint(jugador4.getNombre());
        layout.addView(nombre1);
        layout.addView(nombre2);
        layout.addView(nombre3);
        layout.addView(nombre4);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                distribuirNombres(jugadoruno,nombre1,jugador1);
                distribuirNombres(jugadordos,nombre2,jugador2);
                distribuirNombres(jugadortres,nombre3,jugador3);
                distribuirNombres(jugadorcuatro,nombre4,jugador4);
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertdialog.create().show();
    }

    public void distribuirNombres(View v,EditText n,Jugador jug){
        TextView casilla=(TextView)v;
        String nombre=n.getText().toString();
        casilla.setText(nombre);
        jug.setNombre(nombre);
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
}
