package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Escoba extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private TextView equipo1,equipo2,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,total1,total2;
    private Button boton1,boton2,boton3,boton4;
    private int cuentaManos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoba);
        jugador1=new Jugador(0);
        jugador1.setNombre("Jugador 1");
        jugador2=new Jugador(0);
        jugador2.setNombre("Jugador 2");
        equipo1=findViewById(R.id.equipo1);
        equipo2=findViewById(R.id.equipo2);
        boton1=findViewById(R.id.boton1);
        boton2=findViewById(R.id.boton2);
        boton3=findViewById(R.id.boton3);
        boton4=findViewById(R.id.boton4);
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
        total1=findViewById(R.id.total1);
        total2=findViewById(R.id.total2);
        cuentaManos=0;
    }
    public void mano(View vista){
            final EditText juguno=new EditText(this);
            juguno.setHint(jugador1.getNombre());
            juguno.setInputType(InputType.TYPE_CLASS_NUMBER);
            final EditText jugdos=new EditText(this);
            jugdos.setHint(jugador2.getNombre());
            jugdos.setInputType(InputType.TYPE_CLASS_NUMBER);
            AlertDialog.Builder alertdialog= new AlertDialog.Builder(this);
            alertdialog.setTitle("Ingresar Puntaje");
            LinearLayout layout=new LinearLayout(this);
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(juguno);
            layout.addView(jugdos);
            alertdialog.setView(layout);
            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    organizarManos(juguno,jugdos,jugador1);

                }
            });
            alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alertdialog.create().show();

    }

    public void alertNombre(View vista){
        final EditText juguno=new EditText(this);
        juguno.setHint(jugador1.getNombre());
        final EditText jugdos=new EditText(this);
        jugdos.setHint(jugador2.getNombre());
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
    public void organizarManos(EditText jug1,EditText jug2, Jugador jugador){

        if(jug1.getText().toString().equals("")||jug2.getText().toString().equals("")){
            Toast.makeText(this, "Ingresar puntaje de todos los jugadores", Toast.LENGTH_SHORT).show();
        }
        else{
            switch (cuentaManos){
                case 0:
                    organizarPuntajes(textView5,total1,jugador1,jug1);
                    organizarPuntajes(textView6,total2,jugador2,jug2);
                    cuentaManos++;
                    break;
                case 1:
                    organizarPuntajes(textView7,total1,jugador1,jug1);
                    organizarPuntajes(textView8,total2,jugador2,jug2);
                    cuentaManos++;
                    break;
                case 2:
                    organizarPuntajes(textView9,total1,jugador1,jug1);
                    organizarPuntajes(textView10,total2,jugador2,jug2);
                    cuentaManos++;
                    break;
                case 3:
                    organizarPuntajes(textView11,total1,jugador1,jug1);
                    organizarPuntajes(textView12,total2,jugador2,jug2);
                    cuentaManos++;
                    break;
                case 4:
                    organizarPuntajes(textView13,total1,jugador1,jug1);
                    organizarPuntajes(textView14,total2,jugador2,jug2);
                    cuentaManos++;
                    break;
                case 5:
                    organizarPuntajes(textView15,total1,jugador1,jug1);
                    organizarPuntajes(textView16,total2,jugador2,jug2);
                    cuentaManos++;
                    break;
            }
            if(jugador.getPuntos()>=15){
                Toast.makeText(this, "Partido Terminado", Toast.LENGTH_SHORT).show();
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
        if(jugador.getPuntos()>=15){
            Toast.makeText(this, "Partido Terminado", Toast.LENGTH_SHORT).show();
        }
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_escoba,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.configuracion){
            AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
            alertdialog.setTitle("Configuracion");
            alertdialog.setMessage("Se perderán los puntajes");
            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent j = new Intent(Escoba.this,configuracionEscoba.class);
                    j.putExtra("jugadores", 2);
                    startActivity(j);
                    finish();
                }
            });
            alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alertdialog.create().show();
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
    public void reiniciarMarcador(TextView parcial,TextView total,Jugador jugador){
        jugador.setPuntos(0);
        parcial.setText(R.string.Puntaje_en_0);
        total.setText(R.string.Puntaje_en_0);

    }
    public void reiniciarPartido(){
        reiniciarMarcador(textView5,total1,jugador1);
        reiniciarMarcador(textView6,total2,jugador2);
        reiniciarMarcador(textView7,total1,jugador1);
        reiniciarMarcador(textView8,total2,jugador2);
        reiniciarMarcador(textView9,total1,jugador1);
        reiniciarMarcador(textView10,total2,jugador2);
        reiniciarMarcador(textView11,total1,jugador1);
        reiniciarMarcador(textView12,total2,jugador2);
        reiniciarMarcador(textView13,total1,jugador1);
        reiniciarMarcador(textView14,total2,jugador2);
        reiniciarMarcador(textView15,total1,jugador1);
        reiniciarMarcador(textView16,total2,jugador2);

    }
}
