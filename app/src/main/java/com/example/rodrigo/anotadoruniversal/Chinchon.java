package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Chinchon extends AppCompatActivity {
    private TextView juguno,jugdos,jugtres,jugcuatro;
    private Jugador jugador1,jugador2,jugador3,jugador4;
    private TableLayout tabla;
    private TableRow jugadores,boton;
    private Button manoFinalizada;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinchon_activity);
        juguno=new TextView(this);
        juguno.setText(R.string.jugadoruno);
        jugdos=new TextView(this);
        jugdos.setText(R.string.jugadordos);
        jugtres=new TextView(this);
        jugtres.setText(R.string.jugadortres);
        jugcuatro=new TextView(this);
        jugcuatro.setText(R.string.jugadorcuatro);
        jugador1=new Jugador(0);
        jugador2=new Jugador(0);
        jugador3=new Jugador(0);
        jugador4=new Jugador(0);
        tabla=findViewById(R.id.tabla);
        jugadores=findViewById(R.id.fila1);
        boton=findViewById(R.id.fila2);
        tabla.addView(jugadores);
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
                distribuirNombres(juguno,nombre1,jugador1);
                distribuirNombres(jugdos,nombre2,jugador2);
                distribuirNombres(jugtres,nombre3,jugador3);
                distribuirNombres(jugcuatro,nombre4,jugador4);
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

    public class tabla{


        public void crearTabla(){


        }

    }
}
