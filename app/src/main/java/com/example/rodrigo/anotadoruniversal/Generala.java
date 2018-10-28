package com.example.rodrigo.anotadoruniversal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Generala extends AppCompatActivity  {
    String jguada;
    private TextView jugadoruno, jugadordos, jugadortres, jugadorcuatro, unouno, unodos, unotres, unocuatro, dosuno, dosdos, dostres, doscuatro, tresuno, tresdos, trestres, trescuatro, cuatrouno, cuatrodos, cuatrotres, cuatrocuatro, cincouno,
            cincodos, cincotres, cincocuatro, seisuno, seisdos, seistres, seiscuatro, escalerauno, escalerados, escaleratres, escaleracuatro, fulluno, fulldos, fulltres,
            fullcuatro, pokeruno, pokerdos, pokertres, pokercuatro, generalauno, generalados, generalatres, generalacuatro, generala2uno, generala2dos, generala2tres, generala2cuatro,
            total1, total2, total3, total4, txt1, txt2, txt3, txt4, txt5, txt6, txtescalera, txtfull, txtpoker, txtgenerala, txtgeneralados;
    private Jugador jugador1, jugador2, jugador3, jugador4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generala);
        jugadoruno = findViewById(R.id.Jugador1);
        jugadordos = findViewById(R.id.Jugador2);
        jugadortres = findViewById(R.id.Jugador3);
        jugadorcuatro = findViewById(R.id.Jugador4);
        unouno = findViewById(R.id.unouno);
        unodos = findViewById(R.id.unodos);
        unotres = findViewById(R.id.unotres);
        unocuatro = findViewById(R.id.unocuatro);
        dosuno = findViewById(R.id.dosuno);
        dosdos = findViewById(R.id.dosdos);
        dostres = findViewById(R.id.dostres);
        doscuatro = findViewById(R.id.doscuatro);
        tresuno = findViewById(R.id.tresuno);
        tresdos = findViewById(R.id.tresdos);
        trestres = findViewById(R.id.trestres);
        trescuatro = findViewById(R.id.trescuatro);
        cuatrouno = findViewById(R.id.cuatrouno);
        cuatrodos = findViewById(R.id.cuatrodos);
        cuatrotres = findViewById(R.id.cuatrotres);
        cuatrocuatro = findViewById(R.id.cuatrocuatro);
        cincouno = findViewById(R.id.cincouno);
        cincodos = findViewById(R.id.cincodos);
        cincotres = findViewById(R.id.cincotres);
        cincocuatro = findViewById(R.id.cincocuatro);
        seisuno = findViewById(R.id.seisuno);
        seisdos = findViewById(R.id.seisdos);
        seistres = findViewById(R.id.seistres);
        seiscuatro = findViewById(R.id.seiscuatro);
        escalerauno = findViewById(R.id.escalerauno);
        escalerados = findViewById(R.id.escalerados);
        escaleratres = findViewById(R.id.escaleratres);
        escaleracuatro = findViewById(R.id.escaleracuatro);
        fulluno = findViewById(R.id.fulluno);
        fulldos = findViewById(R.id.fulldos);
        fulltres = findViewById(R.id.fulltres);
        fullcuatro = findViewById(R.id.fullcuatro);
        pokeruno = findViewById(R.id.pokeruno);
        pokerdos = findViewById(R.id.pokerdos);
        pokertres = findViewById(R.id.pokertres);
        pokercuatro = findViewById(R.id.pokercuatro);
        generalauno = findViewById(R.id.generalauno);
        generalados = findViewById(R.id.generalados);
        generalatres = findViewById(R.id.generalatres);
        generalacuatro = findViewById(R.id.generalacuatro);
        generala2uno = findViewById(R.id.generala2uno);
        generala2dos = findViewById(R.id.generala2dos);
        generala2tres = findViewById(R.id.generala2tres);
        generala2cuatro = findViewById(R.id.generala2cuatro);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txtescalera = findViewById(R.id.txtescalera);
        txtfull = findViewById(R.id.txtfull);
        txtpoker = findViewById(R.id.txtpoker);
        txtgenerala = findViewById(R.id.txtgenerala);
        txtgeneralados = findViewById(R.id.txtgeneralados);
        generala2cuatro = findViewById(R.id.generala2cuatro);
        total1 = findViewById(R.id.Total1);
        total2 = findViewById(R.id.Total2);
        total3 = findViewById(R.id.Total3);
        total4 = findViewById(R.id.Total4);
        jugador1 = new Jugador(0);
        jugador1.setNombre("Jugador 1");
        jugador2 = new Jugador(0);
        jugador2.setNombre("Jugador 2");
        jugador3 = new Jugador(0);
        jugador3.setNombre("Jugador 3");
        jugador4 = new Jugador(0);
        jugador4.setNombre("Jugador 4");
        cambiarNombre(null);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    public void cambiarNombre(View vista) {
        final EditText juguno = new EditText(this);
        juguno.setHint("Jugador1");
        final EditText jugdos = new EditText(this);
        jugdos.setHint("Jugador 2");
        final EditText jugtres = new EditText(this);
        jugtres.setHint("Jugador 3");
        final EditText jugcuatro = new EditText(this);
        jugcuatro.setHint("Jugador 4");
        final AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setTitle("Cambiar nombres");
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(juguno);
        layout.addView(jugdos);
        layout.addView(jugtres);
        layout.addView(jugcuatro);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (!juguno.getText().toString().equals("")) {
                    String nombre = juguno.getText().toString();
                    jugador1.setNombre(nombre);
                    jugadoruno.setText(nombre);
                }
                if (!jugdos.getText().toString().equals("")) {
                    String nombre = jugdos.getText().toString();
                    jugador2.setNombre(nombre);
                    jugadordos.setText(nombre);
                }
                if (!jugtres.getText().toString().equals("")) {
                    String nombre = jugtres.getText().toString();
                    jugador3.setNombre(nombre);
                    jugadortres.setText(nombre);
                }
                if (!jugcuatro.getText().toString().equals("")) {
                    String nombre = jugcuatro.getText().toString();
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
        final Jugador jugador= capturarJugador(vista);
        final TextView casillero = (TextView) vista;
        final String jugada=Jugada(casillero);
        AlertDialog.Builder alertdialog= alertPuntos(jugada,casillero);
        alertdialog.create().show();

    }
    public AlertDialog.Builder alertPuntos(String jugada, final TextView casillero){
        final Jugador jugador = capturarJugador(casillero);
        final AlertDialog.Builder nuevaAlerta=new AlertDialog.Builder(this);
        nuevaAlerta.setTitle(jugador.getNombre()+"\nJugada: "+jugada );
        if(jugada.equals("1")) {
            nuevaAlerta.setItems(R.array.puntos_dado_uno, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 1);
                            break;
                        case 2:
                            actualizarCasilleros(casillero, jugador, 2);
                            break;
                        case 3:
                            actualizarCasilleros(casillero, jugador, 3);
                            break;
                        case 4:
                            actualizarCasilleros(casillero, jugador, 4);
                            break;
                        case 5:
                            actualizarCasilleros(casillero, jugador, 5);
                            break;
                    }
                }
            });
            return nuevaAlerta;
        }
        else if(jugada.equals("2")) {
            nuevaAlerta.setItems(R.array.puntos_dado_dos, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 2);
                            break;
                        case 2:
                            actualizarCasilleros(casillero, jugador, 4);
                            break;
                        case 3:
                            actualizarCasilleros(casillero, jugador, 6);
                            break;
                        case 4:
                            actualizarCasilleros(casillero, jugador, 8);
                            break;
                        case 5:
                            actualizarCasilleros(casillero, jugador, 10);
                            break;
                    }
                }
            });
            return nuevaAlerta;
        }
                 else if (jugada.equals("3")) {
            nuevaAlerta.setItems(R.array.puntos_lado_tres, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 3);
                            break;
                        case 2:
                            actualizarCasilleros(casillero, jugador, 6);
                            break;
                        case 3:
                            actualizarCasilleros(casillero, jugador, 9);
                            break;
                        case 4:
                            actualizarCasilleros(casillero, jugador, 12);
                            break;
                        case 5:
                            actualizarCasilleros(casillero, jugador, 15);
                            break;
                    }
                }
            });
            return nuevaAlerta;
        }
                    else if(jugada.equals("4")) {
            nuevaAlerta.setItems(R.array.puntos_lado_cuatro, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 4);
                            break;
                        case 2:
                            actualizarCasilleros(casillero, jugador, 8);
                            break;
                        case 3:
                            actualizarCasilleros(casillero, jugador, 12);
                            break;
                        case 4:
                            actualizarCasilleros(casillero, jugador, 16);
                            break;
                        case 5:
                            actualizarCasilleros(casillero, jugador, 20);
                            break;
                    }
                }
            });
            return nuevaAlerta;
        }
        else if(jugada.equals("5")) {
                nuevaAlerta.setItems(R.array.puntos_lado_cinco, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 5);
                            break;
                        case 2:
                            actualizarCasilleros(casillero, jugador, 10);
                            break;
                        case 3:
                            actualizarCasilleros(casillero, jugador, 15);
                            break;
                        case 4:
                            actualizarCasilleros(casillero, jugador, 20);
                            break;
                        case 5:
                            actualizarCasilleros(casillero, jugador, 25);
                            break;
                    }
                }
            });
                return nuevaAlerta;
        }
            else if(jugada.equals("6")) {
            nuevaAlerta.setItems(R.array.puntos_lado_seis, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 6);
                            break;
                        case 2:
                            actualizarCasilleros(casillero, jugador, 12);
                            break;
                        case 3:
                            actualizarCasilleros(casillero, jugador, 18);
                            break;
                        case 4:
                            actualizarCasilleros(casillero, jugador, 24);
                            break;
                        case 5:
                            actualizarCasilleros(casillero, jugador, 30);
                            break;
                    }
                }
            });
            return nuevaAlerta;
        }
        else if(jugada.equals("Escalera")) {
            nuevaAlerta.setItems(R.array.puntos_escalera, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 20);
                            break;
                        case 2:
                            actualizarCasilleros(casillero, jugador, 25);
                            break;
                    }
                }
            });
            return nuevaAlerta;
        }
        else if(jugada.equals("Full")) {
            nuevaAlerta.setItems(R.array.puntos_full, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 30);
                            break;
                        case 2:
                            actualizarCasilleros(casillero, jugador, 35);
                            break;
                    }
                }
            });
            return nuevaAlerta;
        }
        else if(jugada.equals("Poker")) {
            nuevaAlerta.setItems(R.array.puntos_poker, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 40);
                            break;
                        case 2:
                            actualizarCasilleros(casillero, jugador, 45);
                            break;
                    }
                }
            });
            return nuevaAlerta;
        }
        else if(jugada.equals("Generala")) {
            nuevaAlerta.setItems(R.array.puntos_generala, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 50);
                            break;

                    }
                }
            });
            return nuevaAlerta;
        }
        else if(jugada.equals("Generala Doble")) {
            nuevaAlerta.setItems(R.array.puntos_generala_doble, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            actualizarCasilleros(casillero, jugador, 0);
                            break;
                        case 1:
                            actualizarCasilleros(casillero, jugador, 60);
                            break;
                    }
                }
            });
            return nuevaAlerta;
        }
        return null;
    }
    public void actualizarCasilleros(TextView casillero,Jugador jugador,int puntaje){
        if(!casillero.getText().equals("-")){
            jugador.restarPuntos(Integer.parseInt(casillero.getText().toString()));
        }
        casillero.setText(String.valueOf(puntaje));
        jugador.sumarPuntos(puntaje);
        lanzarTotal(jugador).setText(String.valueOf(jugador.getPuntos()));


    }
    public TextView lanzarTotal(Jugador jugador){
        if(jugador.equals(jugador1)){
            return total1;
        }
        else if (jugador.equals(jugador2)){
            return total2;
        }
        else if (jugador.equals(jugador3)){
            return total3;
        }
        else if (jugador.equals(jugador4)){
            return total4;
        }
        return null;
    }
    public String Jugada(View vista) {
        TextView casillero = (TextView) vista;
        if (casillero.equals(unouno) || casillero.equals(unodos) || casillero.equals(unotres) || casillero.equals(unocuatro)) {
            return "1";
        }
        if (casillero.equals(dosuno) || casillero.equals(dosdos) || casillero.equals(dostres) || casillero.equals(doscuatro)) {
            return "2";
        }
        if (casillero.equals(tresuno) || casillero.equals(tresdos) || casillero.equals(trestres) || casillero.equals(trescuatro)) {
            return "3";
        }
        if (casillero.equals(cuatrouno) || casillero.equals(cuatrodos) || casillero.equals(cuatrotres) || casillero.equals(cuatrocuatro)) {
            return "4";
        }
        if (casillero.equals(cincouno) || casillero.equals(cincodos) || casillero.equals(cincotres) || casillero.equals(cincocuatro)) {
            return "5";
        }
        if (casillero.equals(seisuno) || casillero.equals(seisdos) || casillero.equals(seistres) || casillero.equals(seiscuatro)) {
            return "6";
        }
        if (casillero.equals(escalerauno) || casillero.equals(escalerados) || casillero.equals(escaleratres) || casillero.equals(escaleracuatro)) {
            return "Escalera";
        }
        if (casillero.equals(fulluno) || casillero.equals(fulldos) || casillero.equals(fulltres) || casillero.equals(fullcuatro)) {
            return "Full";
        }
        if (casillero.equals(pokeruno) || casillero.equals(pokerdos) || casillero.equals(pokertres) || casillero.equals(pokercuatro)) {
            return "Poker";
        }
        if (casillero.equals(generalauno) || casillero.equals(generalados) || casillero.equals(generalatres) || casillero.equals(generalacuatro)) {
            return "Generala";
        }
        if (casillero.equals(generala2uno) || casillero.equals(generala2dos) || casillero.equals(generala2tres) || casillero.equals(generala2cuatro)) {
            return "Generala Doble";
        }
        return null;


    }
    public Jugador capturarJugador(View vista) {
        TextView casillero = (TextView) vista;
        if (casillero.equals(unouno) || casillero.equals(dosuno) || casillero.equals(tresuno) || casillero.equals(cuatrouno) || casillero.equals(cincouno) || casillero.equals(seisuno) || casillero.equals(escalerauno) || casillero.equals(fulluno) || casillero.equals(pokeruno) || casillero.equals(generalauno) || casillero.equals(generala2uno)) {
            return jugador1;
        }
        if (casillero.equals(unodos) || casillero.equals(dosdos) || casillero.equals(tresdos) || casillero.equals(cuatrodos) || casillero.equals(cincodos) || casillero.equals(seisdos) || casillero.equals(escalerados) || casillero.equals(fulldos) || casillero.equals(pokerdos) || casillero.equals(generalados) || casillero.equals(generala2dos)) {
            return jugador2;
        }
        if (casillero.equals(unotres) || casillero.equals(dostres) || casillero.equals(trestres) || casillero.equals(cuatrotres) || casillero.equals(cincotres) || casillero.equals(seistres) || casillero.equals(escaleratres) || casillero.equals(fulltres) || casillero.equals(pokertres) || casillero.equals(generalatres) || casillero.equals(generala2tres)) {
            return jugador3;
        }
        if (casillero.equals(unocuatro) || casillero.equals(doscuatro) || casillero.equals(trescuatro) || casillero.equals(cuatrocuatro) || casillero.equals(cincocuatro) || casillero.equals(seiscuatro) || casillero.equals(escaleracuatro) || casillero.equals(fullcuatro) || casillero.equals(pokercuatro) || casillero.equals(generalacuatro) || casillero.equals(generala2cuatro)) {
            return jugador4;
        }
        return null;
    }

    @Override
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
                resetearJuego();
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
    public void resetearJuego(){
        jugador1.setPuntos(0);
        jugador2.setPuntos(0);
        jugador3.setPuntos(0);
        jugador4.setPuntos(0);
        unouno.setText(R.string.Puntaje_en_0);
        unodos.setText(R.string.Puntaje_en_0);
        unotres.setText(R.string.Puntaje_en_0);
        unocuatro.setText(R.string.Puntaje_en_0);
        dosuno.setText(R.string.Puntaje_en_0);
        dosdos.setText(R.string.Puntaje_en_0);
        dostres.setText(R.string.Puntaje_en_0);
        doscuatro.setText(R.string.Puntaje_en_0);
        tresuno.setText(R.string.Puntaje_en_0);
        tresdos.setText(R.string.Puntaje_en_0);
        trestres.setText(R.string.Puntaje_en_0);
        trescuatro.setText(R.string.Puntaje_en_0);
        cuatrouno.setText(R.string.Puntaje_en_0);
        cuatrodos.setText(R.string.Puntaje_en_0);
        cuatrotres.setText(R.string.Puntaje_en_0);
        cuatrocuatro.setText(R.string.Puntaje_en_0);
        cincouno.setText(R.string.Puntaje_en_0);
        cincodos.setText(R.string.Puntaje_en_0);
        cincotres.setText(R.string.Puntaje_en_0);
        cincocuatro.setText(R.string.Puntaje_en_0);
        seisuno.setText(R.string.Puntaje_en_0);
        seisdos.setText(R.string.Puntaje_en_0);
        seistres.setText(R.string.Puntaje_en_0);
        seiscuatro.setText(R.string.Puntaje_en_0);
        escalerauno.setText(R.string.Puntaje_en_0);
        escalerados.setText(R.string.Puntaje_en_0);
        escaleratres.setText(R.string.Puntaje_en_0);
        escaleracuatro.setText(R.string.Puntaje_en_0);
        fulluno.setText(R.string.Puntaje_en_0);
        fulldos.setText(R.string.Puntaje_en_0);
        fulltres.setText(R.string.Puntaje_en_0);
        fullcuatro.setText(R.string.Puntaje_en_0);
        pokeruno.setText(R.string.Puntaje_en_0);
        pokerdos.setText(R.string.Puntaje_en_0);
        pokertres.setText(R.string.Puntaje_en_0);
        pokercuatro.setText(R.string.Puntaje_en_0);
        generalauno.setText(R.string.Puntaje_en_0);
        generalados.setText(R.string.Puntaje_en_0);
        generalatres.setText(R.string.Puntaje_en_0);
        generalacuatro.setText(R.string.Puntaje_en_0);
        generala2uno.setText(R.string.Puntaje_en_0);
        generala2dos.setText(R.string.Puntaje_en_0);
        generala2tres.setText(R.string.Puntaje_en_0);
        generala2cuatro.setText(R.string.Puntaje_en_0);
        total1.setText(R.string.Puntaje_en_0);
        total2.setText(R.string.Puntaje_en_0);
        total3.setText(R.string.Puntaje_en_0);
        total4.setText(R.string.Puntaje_en_0);
    }

}



