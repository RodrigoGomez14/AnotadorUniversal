package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Burako extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private int cuentaManos;
    private TextView jug1, jug2, ronda1_1,ronda1_2,ronda2_1,ronda2_2,ronda3_1,ronda3_2,ronda4_1,ronda4_2,ronda5_1,ronda5_2,total_1,total_2;

    public Burako() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burako);
        jugador1 = new Jugador(0);
        jugador1.setNombre("Jugador 1");
        jugador2 = new Jugador(0);
        jugador2.setNombre("Jugador 2");
        jug1 = findViewById(R.id.jug1);
        jug2 = findViewById(R.id.jug2);
        ronda1_1=findViewById(R.id.ronda1_1);
        ronda1_1.setVisibility(View.INVISIBLE);
        ronda1_2=findViewById(R.id.ronda1_2);
        ronda1_2.setVisibility(View.INVISIBLE);
        ronda2_1=findViewById(R.id.ronda2_1);
        ronda2_1.setVisibility(View.INVISIBLE);
        ronda2_2=findViewById(R.id.ronda2_2);
        ronda2_2.setVisibility(View.INVISIBLE);
        ronda3_1=findViewById(R.id.ronda3_1);
        ronda3_1.setVisibility(View.INVISIBLE);
        ronda3_2=findViewById(R.id.ronda3_2);
        ronda3_2.setVisibility(View.INVISIBLE);
        ronda4_1=findViewById(R.id.ronda4_1);
        ronda4_1.setVisibility(View.INVISIBLE);
        ronda4_2=findViewById(R.id.ronda4_2);
        ronda4_2.setVisibility(View.INVISIBLE);
        ronda5_1=findViewById(R.id.ronda5_1);
        ronda5_1.setVisibility(View.INVISIBLE);
        ronda5_2=findViewById(R.id.ronda5_2);
        ronda5_2.setVisibility(View.INVISIBLE);
        total_1=findViewById(R.id.total_1);
        total_2=findViewById(R.id.total_2);
        cuentaManos=0;
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void cambiarNombre(View vista) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Cambiar Nombres");
        final EditText jugadorUno = new EditText(this);
        final EditText jugadorDos = new EditText(this);
        jugadorUno.setHint("Jugador1");
        jugadorDos.setHint("Jugador 2");
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(jugadorUno);
        layout.addView(jugadorDos);
        alertDialog.setView(layout);
        alertDialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                jugador1.setNombre(jugadorUno.getText().toString());
                jug1.setText(jugador1.getNombre());
                jugador2.setNombre(jugadorDos.getText().toString());
                jug2.setText(jugador2.getNombre());
            }
        });
        alertDialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }




    public void mostrarPuntaje(TextView casillero1, TextView casillero2,EditText et1, EditText et2){
        String puntaje1= et1.getText().toString();
        String puntaje2= et2.getText().toString();
        organizarPuntaje(puntaje1,puntaje2);
        casillero1.setText(puntaje1);
        casillero1.setVisibility(View.VISIBLE);
        casillero2.setText(puntaje2);
        casillero2.setVisibility(View.VISIBLE);

    }

    public void rondaTerminada(View vista) {
        AlertDialog.Builder alertdialog= new AlertDialog.Builder(this);
        alertdialog.setTitle("Ingrese puntajes");
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        final EditText et1 = new EditText(this);
        et1.setInputType(InputType.TYPE_CLASS_NUMBER);
        et1.setHint(jugador1.getNombre());
        final EditText et2 = new EditText(this);
        et2.setInputType(InputType.TYPE_CLASS_NUMBER);
        et2.setHint(jugador2.getNombre());
        layout.addView(et1);
        layout.addView(et2);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                if (cuentaManos == 0) {
                    mostrarPuntaje(ronda1_1,ronda1_2,et1,et2);
                }
                if ((cuentaManos == 1) && (jugador1.getPuntos() <= 3000) && (jugador2.getPuntos() <= 3000)) {
                    mostrarPuntaje(ronda2_1,ronda2_2,et1,et2);

                }
                if ((cuentaManos == 2) && (jugador1.getPuntos() <= 3000) && (jugador2.getPuntos() <= 3000)) {
                    mostrarPuntaje(ronda3_1,ronda3_2,et1,et2);

                }
                if ((cuentaManos == 3) && (jugador1.getPuntos() <= 3000) && (jugador2.getPuntos() <= 3000)) {
                    mostrarPuntaje(ronda4_1,ronda4_2,et1,et2);

                }
                if ((cuentaManos == 4) && (jugador1.getPuntos() <= 3000) && (jugador2.getPuntos() <= 3000)) {
                    mostrarPuntaje(ronda5_1,ronda5_2,et1,et2);
                }
                if(jugador1.getPuntos()>3000 || jugador2.getPuntos()>3000){
                    Toast.makeText(Burako.this, "Partido Finalizado", Toast.LENGTH_SHORT).show();

                }
                cuentaManos++;
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        alertdialog.show();
    }

    public void organizarPuntaje(String jug1, String jug2){

        jugador1.sumarPuntos(Integer.parseInt(jug1));
        jugador2.sumarPuntos(Integer.parseInt(jug2));
        total_1.setText(String.valueOf(jugador1.getPuntos()));
        total_2.setText(String.valueOf(jugador2.getPuntos()));
    }
    public void onBackPressed() {
        AlertDialog.Builder alertialog = new AlertDialog.Builder(this);
        alertialog.setTitle("Salir?");
        alertialog.setMessage("Se reiniciará la partida");
        alertialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
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

    public void reiniciarPartido(){
        jugador1.setPuntos(0);
        jugador2.setPuntos(0);
        total_1.setText(R.string.Puntaje_en_0);
        total_2.setText(R.string.Puntaje_en_0);
        cuentaManos=0;
        ronda1_1.setVisibility(View.INVISIBLE);
        ronda1_2.setVisibility(View.INVISIBLE);
        ronda2_1.setVisibility(View.INVISIBLE);
        ronda2_2.setVisibility(View.INVISIBLE);
        ronda3_1.setVisibility(View.INVISIBLE);
        ronda3_2.setVisibility(View.INVISIBLE);
        ronda4_1.setVisibility(View.INVISIBLE);
        ronda4_1.setVisibility(View.INVISIBLE);
        ronda5_1.setVisibility(View.INVISIBLE);
        ronda5_2.setVisibility(View.INVISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_reinicio,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.Reiniciar){
            AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
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
            reiniciarPartido();
        }
        return super.onOptionsItemSelected(item);
    }
}
