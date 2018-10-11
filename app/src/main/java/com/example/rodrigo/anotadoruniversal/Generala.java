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
    String jguada;
    private TextView jugadoruno,jugadordos,jugadortres,jugadorcuatro,unouno,unodos,unotres,unocuatro,dosuno,dosdos,dostres,doscuatro,tresuno,tresdos,trestres,trescuatro,cuatrouno,cuatrodos,cuatrotres,cuatrocuatro,cincouno,
            cincodos,cincotres,cincocuatro,seisuno,seisdos,seistres,seiscuatro,escalerauno,escalerados,escaleratres,escaleracuatro,fulluno,fulldos,fulltres,
            fullcuatro,pokeruno,pokerdos,pokertres,pokercuatro,generalauno,generalados,generalatres,generalacuatro,generala2uno,generala2dos,generala2tres,generala2cuatro,
            total1,total2,total3,total4,txt1,txt2,txt3,txt4,txt5,txt6,txtescalera,txtfull,txtpoker,txtgenerala,txtgeneralados;
    private Jugador jugador1,jugador2,jugador3,jugador4;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generala);
        jugadoruno=findViewById(R.id.Jugador1);
        jugadordos=findViewById(R.id.Jugador2);
        jugadortres=findViewById(R.id.Jugador3);
        jugadorcuatro=findViewById(R.id.Jugador4);
        unouno=findViewById(R.id.unouno);
        unodos=findViewById(R.id.unodos);
        unotres=findViewById(R.id.unotres);
        unocuatro=findViewById(R.id.unocuatro);
        dosuno=findViewById(R.id.dosuno);
        dosdos=findViewById(R.id.dosdos);
        dostres=findViewById(R.id.dostres);
        doscuatro=findViewById(R.id.doscuatro);
        tresuno=findViewById(R.id.tresuno);
        tresdos=findViewById(R.id.tresdos);
        trestres=findViewById(R.id.trestres);
        trescuatro=findViewById(R.id.trescuatro);
        cuatrouno=findViewById(R.id.cuatrouno);
        cuatrodos=findViewById(R.id.cuatrodos);
        cuatrotres=findViewById(R.id.cuatrotres);
        cuatrocuatro=findViewById(R.id.cuatrocuatro);
        cincouno=findViewById(R.id.cincouno);
        cincodos=findViewById(R.id.cincodos);
        cincotres=findViewById(R.id.cincotres);
        cincocuatro=findViewById(R.id.cincocuatro);
        seisuno=findViewById(R.id.seisuno);
        seisdos=findViewById(R.id.seisdos);
        seistres=findViewById(R.id.seistres);
        seiscuatro=findViewById(R.id.seiscuatro);
        escalerauno=findViewById(R.id.escalerauno);
        escalerados=findViewById(R.id.escalerados);
        escaleratres=findViewById(R.id.escaleratres);
        escaleracuatro=findViewById(R.id.escaleracuatro);
        fulluno=findViewById(R.id.fulluno);
        fulldos=findViewById(R.id.fulldos);
        fulltres=findViewById(R.id.fulltres);
        fullcuatro=findViewById(R.id.fullcuatro);
        pokeruno=findViewById(R.id.pokeruno);
        pokerdos=findViewById(R.id.pokerdos);
        pokertres=findViewById(R.id.pokertres);
        pokercuatro=findViewById(R.id.pokercuatro);
        generalauno=findViewById(R.id.generalauno);
        generalados=findViewById(R.id.generalados);
        generalatres=findViewById(R.id.generalatres);
        generalacuatro=findViewById(R.id.generalacuatro);
        generala2uno=findViewById(R.id.generala2uno);
        generala2dos=findViewById(R.id.generala2dos);
        generala2tres=findViewById(R.id.generala2tres);
        generala2cuatro=findViewById(R.id.generala2cuatro);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        txt4=findViewById(R.id.txt4);
        txt5=findViewById(R.id.txt5);
        txt6=findViewById(R.id.txt6);
        txtescalera=findViewById(R.id.txtescalera);
        txtfull=findViewById(R.id.txtfull);
        txtpoker=findViewById(R.id.txtpoker);
        txtgenerala=findViewById(R.id.txtgenerala);
        txtgeneralados=findViewById(R.id.txtgeneralados);
        generala2cuatro=findViewById(R.id.generala2cuatro);
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
    public void cambiarNombre(View vista){
        final TextView jugador=(TextView) vista;
        final EditText juguno=new EditText(this);
        juguno.setHint("Jugador1");
        final EditText jugdos=new EditText(this);
        jugdos.setHint("Jugador 2");
        final EditText jugtres=new EditText(this);
        jugtres.setHint("Jugador 3");
        final EditText jugcuatro=new EditText(this);
        jugcuatro.setHint("Jugador 4");
        AlertDialog.Builder alertdialog= new AlertDialog.Builder(this);
        alertdialog.setTitle("cambiar nombre");
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(juguno);
        layout.addView(jugdos);
        layout.addView(jugtres);
        layout.addView(jugcuatro);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(!juguno.getText().toString().equals("")){
                    String nombre=juguno.getText().toString();
                    jugador1.setNombre(nombre);
                    jugadoruno.setText(nombre);
                }
                if(!jugdos.getText().toString().equals("")){
                    String nombre=jugdos.getText().toString();
                    jugador2.setNombre(nombre);
                    jugadordos.setText(nombre);
                }
                if(!jugtres.getText().toString().equals("")){
                    String nombre=jugtres.getText().toString();
                    jugador3.setNombre(nombre);
                    jugadortres.setText(nombre);
                }
                if(!jugcuatro.getText().toString().equals("")){
                    String nombre=jugcuatro.getText().toString();
                    jugador4.setNombre(nombre);
                    jugadorcuatro.setText(nombre);
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
    public void elegirPuntaje(View vista) {
        final TextView casillero = (TextView) vista;
        final AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setTitle("Ingrese puntaje de: "+ Jugada(casillero));
        LinearLayout layout = new LinearLayout(this);
        final EditText puntaje = new EditText(this);
        layout.addView(puntaje);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                setearPuntaje(casillero,puntaje);
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertdialog.create().show();
    }

    public void actualizarunPuntaje(View vista,EditText Mano,Jugador jugador){
        String mano=Mano.getText().toString();
        TextView txtlista=(TextView)vista;
        Jugador jug=jugador;
        txtlista.setText(mano);
        jug.sumarPuntos(Integer.parseInt(mano));
        total1.setText(String.valueOf(jugador1.getPuntos()));
        total2.setText(String.valueOf(jugador2.getPuntos()));
        total3.setText(String.valueOf(jugador3.getPuntos()));
        total4.setText(String.valueOf(jugador4.getPuntos()));
        }


    public void intentarActualizar(View viejo,EditText nuevo,Jugador uno) {
        TextView txt = (TextView)viejo;
        try {
            if(!nuevo.getText().toString().equals("")){
                if(!txt.getText().toString().equals("-")){
                    uno.restarPuntos(Integer.parseInt(txt.getText().toString()));
                    actualizarunPuntaje(viejo, nuevo, uno);
                }
                else if(txt.getText().toString().equals("-")){
                    actualizarunPuntaje(viejo, nuevo, uno);
                }

            }
        } catch (Exception e) {
        }
    }

    public String Jugada (View vista){
        TextView casillero = (TextView)vista;
        if(casillero.equals(unouno)||casillero.equals(unodos)||casillero.equals(unotres)||casillero.equals(unocuatro)){
            return "1";
        }
        if(casillero.equals(dosuno)||casillero.equals(dosdos)||casillero.equals(dostres)||casillero.equals(doscuatro)){
            return "2";
        }
        if(casillero.equals(tresuno)||casillero.equals(tresdos)||casillero.equals(trestres)||casillero.equals(trescuatro)){
            return "3";
        }
        if(casillero.equals(cuatrouno)||casillero.equals(cuatrodos)||casillero.equals(cuatrotres)||casillero.equals(cuatrocuatro)){
            return "4";
        }
        if(casillero.equals(cincouno)||casillero.equals(cincodos)||casillero.equals(cincotres)||casillero.equals(cincocuatro)){
            return "5";
        }
        if(casillero.equals(seisuno)||casillero.equals(seisdos)||casillero.equals(seistres)||casillero.equals(seiscuatro)){
            return "6";
        }
        if(casillero.equals(escalerauno)||casillero.equals(escalerados)||casillero.equals(escaleratres)||casillero.equals(escaleracuatro)){
            return "Escalera";
        }
        if(casillero.equals(fulluno)||casillero.equals(fulldos)||casillero.equals(fulltres)||casillero.equals(fullcuatro)){
            return "Full";
        }
        if(casillero.equals(pokeruno)||casillero.equals(pokerdos)||casillero.equals(pokertres)||casillero.equals(pokercuatro)){
            return "Poker";
        }
        if(casillero.equals(generalauno)||casillero.equals(generalados)||casillero.equals(generalatres)||casillero.equals(generalacuatro)){
            return "Generala";
        }
        if(casillero.equals(generala2uno)||casillero.equals(generala2dos)||casillero.equals(generala2tres)||casillero.equals(generala2cuatro)){
            return "Generala Doble";
        }
        return null;



    }
    public void setearPuntaje(TextView c,EditText p){
        TextView casilla=(TextView)c;
        EditText etpuntaje=(EditText)p;
        intentarActualizar(c,p,capturarJugador(casilla));

    }
    public Jugador capturarJugador (View vista){
        TextView casillero=(TextView)vista;
        if(casillero.equals(unouno)||casillero.equals(dosuno)||casillero.equals(tresuno)||casillero.equals(cuatrouno)||casillero.equals(cincouno)||casillero.equals(seisuno)||casillero.equals(escalerauno)||casillero.equals(fulluno)||casillero.equals(pokeruno)||casillero.equals(generalauno)||casillero.equals(generala2uno)){
            return jugador1;
        }
        if(casillero.equals(unodos)||casillero.equals(dosdos)||casillero.equals(tresdos)||casillero.equals(cuatrodos)||casillero.equals(cincodos)||casillero.equals(seisdos)||casillero.equals(escalerados)||casillero.equals(fulldos)||casillero.equals(pokerdos)||casillero.equals(generalados)||casillero.equals(generala2dos)){
            return jugador2;
        }
        if(casillero.equals(unotres)||casillero.equals(dostres)||casillero.equals(trestres)||casillero.equals(cuatrotres)||casillero.equals(cincotres)||casillero.equals(seistres)||casillero.equals(escaleratres)||casillero.equals(fulltres)||casillero.equals(pokertres)||casillero.equals(generalatres)||casillero.equals(generala2tres)){
            return jugador3;
        }
        if(casillero.equals(unocuatro)||casillero.equals(doscuatro)||casillero.equals(trescuatro)||casillero.equals(cuatrocuatro)||casillero.equals(cincocuatro)||casillero.equals(seiscuatro)||casillero.equals(escaleracuatro)||casillero.equals(fullcuatro)||casillero.equals(pokercuatro)||casillero.equals(generalacuatro)||casillero.equals(generala2cuatro)){
            return jugador4;
        }
        return null;
    }

}



