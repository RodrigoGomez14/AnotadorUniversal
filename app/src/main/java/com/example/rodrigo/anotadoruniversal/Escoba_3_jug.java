package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Escoba_3_jug extends AppCompatActivity {
    private TextView equipo1,equipo2,equipo3,textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,total1,total2,total3;
    private Jugador jugador1,jugador2,jugador3;
    private int cuentaManos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoba_tres);
        equipo1=findViewById(R.id.equipo1);
        equipo2=findViewById(R.id.equipo2);
        equipo3=findViewById(R.id.equipo3);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);
        textView13=findViewById(R.id.textView13);
        textView14=findViewById(R.id.textView14);
        textView15=findViewById(R.id.textView15);
        textView16=findViewById(R.id.textView16);
        textView17=findViewById(R.id.textView17);
        textView18=findViewById(R.id.textView18);
        total1=findViewById(R.id.total1);
        total2=findViewById(R.id.total2);
        total3=findViewById(R.id.total3);
        jugador1=new Jugador(0);
        jugador1.setNombre("Jugador 1");
        jugador2=new Jugador(0);
        jugador2.setNombre("Jugador 2");
        jugador3=new Jugador(0);
        jugador3.setNombre("Jugador 3");
        cuentaManos=0;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_escoba,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.configuracion){
            AlertDialog.Builder alertidalog=new AlertDialog.Builder(this);
            alertidalog.setTitle("Configuracion");
            alertidalog.setMessage("Se perdeán los puntjes");
            alertidalog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent j =new Intent(Escoba_3_jug.this,configuracionEscoba.class);
                    j.putExtra("jugadores",3);
                    startActivity(j);
                    finish();
                }
            });
            alertidalog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alertidalog.create().show();
        }
        if(id==R.id.Reiniciar){
            AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
            alertdialog.setTitle("Reiniciar?");
            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    reiniciarPartido();
                    cuentaManos=0;
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

    public void mano(View vista){
        final EditText juguno=new EditText(this);
        juguno.setHint(jugador1.getNombre());
        juguno.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText jugdos=new EditText(this);
        jugdos.setHint(jugador2.getNombre());
        jugdos.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText jugtres=new EditText(this);
        jugtres.setHint(jugador3.getNombre());
        jugtres.setInputType(InputType.TYPE_CLASS_NUMBER);
        AlertDialog.Builder alertdialog= new AlertDialog.Builder(this);
        alertdialog.setTitle("Ingresar Puntaje");
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(juguno);
        layout.addView(jugdos);
        layout.addView(jugtres);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                organizarManos(juguno,jugdos,jugtres);
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertdialog.create().show();
    }
    public void organizarManos(EditText jug1,EditText jug2,EditText jug3){
        if(jug1.getText().toString().equals("")||jug2.getText().toString().equals("")||jug3.getText().toString().equals("")){
            Toast.makeText(this, "Ingresar puntaje de todos los jugadores", Toast.LENGTH_SHORT).show();
        }
        else {
            switch (cuentaManos) {
                case 0:
                    organizarPuntajes(textView1, total1, jugador1, jug1);
                    organizarPuntajes(textView2, total2, jugador2, jug2);
                    organizarPuntajes(textView3, total3, jugador3, jug3);
                    cuentaManos++;
                    break;
                case 1:
                    organizarPuntajes(textView4, total1, jugador1, jug1);
                    organizarPuntajes(textView5, total2, jugador2, jug2);
                    organizarPuntajes(textView6, total3, jugador3, jug3);
                    cuentaManos++;
                    break;
                case 2:
                    organizarPuntajes(textView7, total1, jugador1, jug1);
                    organizarPuntajes(textView8, total2, jugador2, jug2);
                    organizarPuntajes(textView9, total3, jugador3, jug3);
                    cuentaManos++;
                    break;
                case 3:
                    organizarPuntajes(textView10, total1, jugador1, jug1);
                    organizarPuntajes(textView11, total2, jugador2, jug2);
                    organizarPuntajes(textView12, total3, jugador3, jug3);
                    cuentaManos++;
                    break;
                case 4:
                    organizarPuntajes(textView13, total1, jugador1, jug1);
                    organizarPuntajes(textView14, total2, jugador2, jug2);
                    organizarPuntajes(textView15, total3, jugador3, jug3);
                    cuentaManos++;
                    break;
                case 5:
                    organizarPuntajes(textView16, total1, jugador1, jug1);
                    organizarPuntajes(textView17, total2, jugador2, jug2);
                    organizarPuntajes(textView18, total3, jugador3, jug3);
                    cuentaManos++;
                    break;
            }
        }
    }
    public void organizarPuntajes(TextView parcial,TextView total,Jugador jugador,EditText puntaje){
        if(jugador.getPuntos()<15){
            int puntos=Integer.parseInt(puntaje.getText().toString());
            jugador.sumarPuntos(puntos);
            parcial.setText(String.valueOf(puntos));
            total.setText(String.valueOf(jugador.getPuntos()));
        }
        else if(jugador.getPuntos()>=15){
            jugador.setPuntos(15);
            Toast.makeText(this, "Partido Finalizado", Toast.LENGTH_SHORT).show();
        }

    }

    public void reiniciarMarcador(TextView parcial,TextView total,Jugador jugador){
        jugador.setPuntos(0);
        parcial.setText(R.string.Puntaje_en_0);
        total.setText(R.string.Puntaje_en_0);

    }
    public void reiniciarPartido(){
        reiniciarMarcador(textView1,total1,jugador1);
        reiniciarMarcador(textView2,total2,jugador2);
        reiniciarMarcador(textView3,total3,jugador3);
        reiniciarMarcador(textView4,total1,jugador1);
        reiniciarMarcador(textView5,total2,jugador2);
        reiniciarMarcador(textView6,total3,jugador3);
        reiniciarMarcador(textView7,total1,jugador1);
        reiniciarMarcador(textView8,total2,jugador2);
        reiniciarMarcador(textView9,total3,jugador3);
        reiniciarMarcador(textView10,total1,jugador1);
        reiniciarMarcador(textView11,total2,jugador2);
        reiniciarMarcador(textView12,total3,jugador3);
        reiniciarMarcador(textView13,total1,jugador1);
        reiniciarMarcador(textView14,total2,jugador2);
        reiniciarMarcador(textView15,total3,jugador3);
        reiniciarMarcador(textView16,total1,jugador1);
        reiniciarMarcador(textView17,total2,jugador2);
        reiniciarMarcador(textView18,total3,jugador3);

    }

    public void alertNombre(View vista){
        final EditText juguno=new EditText(this);
        juguno.setHint(jugador1.getNombre());
        final EditText jugdos=new EditText(this);
        jugdos.setHint(jugador2.getNombre());
        final EditText jugtres=new EditText(this);
        jugtres.setHint(jugador3.getNombre());
        AlertDialog.Builder alertdialog= new AlertDialog.Builder(this);
        alertdialog.setTitle("cambiar nombre");
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(juguno);
        layout.addView(jugdos);
        layout.addView(jugtres);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                    cambiarNombre(juguno,equipo1,jugador1);
                    cambiarNombre(jugdos,equipo2,jugador2);
                    cambiarNombre(jugtres,equipo3,jugador3);
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
