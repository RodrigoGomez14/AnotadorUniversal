package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Chancho extends AppCompatActivity {
    TextView letraC1_1,letraC1_2,letraC1_3,letraC1_4,letraC1_5,letraH1_1,letraH1_2,letraH1_3,letraH1_4,letraH1_5,letra_A,letra_A2,letra_A3,letra_A4,letra_A5,letra_N,
            letra_N2,letra_N3,letra_N4,letra_N5,letraC2_1,letraC2_2,letraC2_3,letraC2_4,letraC2_5,letraH2_1,letraH2_2,letraH2_3,letraH2_4,letraH2_5,letra_O,letra_O2,letra_O3,
            letra_O4,letra_O5;
    Jugador jugador1,jugador2,jugador3,jugador4,jugador5;
    private Button botonrestar,botonrestar2,botonrestar3,botonrestar4,botonrestar5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chancho);
        letraC1_1=findViewById(R.id.letraC1_1);
        letraC1_2=findViewById(R.id.letraC1_2);
        letraC1_3=findViewById(R.id.letraC1_3);
        letraC1_4=findViewById(R.id.letraC1_4);
        letraC1_5=findViewById(R.id.letraC1_5);
        letraH1_1=findViewById(R.id.letraH1_1);
        letraH1_2=findViewById(R.id.letraH1_2);
        letraH1_3=findViewById(R.id.letraH1_3);
        letraH1_4=findViewById(R.id.letraH1_4);
        letraH1_5=findViewById(R.id.letraH1_5);
        letra_A=findViewById(R.id.letra_A);
        letra_A2=findViewById(R.id.letra_A2);
        letra_A3=findViewById(R.id.letra_A3);
        letra_A4=findViewById(R.id.letra_A4);
        letra_A5=findViewById(R.id.letra_A5);
        letra_N=findViewById(R.id.letra_N);
        letra_N2=findViewById(R.id.letra_N2);
        letra_N3=findViewById(R.id.letra_N3);
        letra_N4=findViewById(R.id.letra_N4);
        letra_N5=findViewById(R.id.letra_N5);
        letraC2_1=findViewById(R.id.letraC2_1);
        letraC2_2=findViewById(R.id.letraC2_2);
        letraC2_3=findViewById(R.id.letraC2_3);
        letraC2_4=findViewById(R.id.letraC2_4);
        letraC2_5=findViewById(R.id.letraC2_5);
        letraH2_1=findViewById(R.id.letraH2_1);
        letraH2_2=findViewById(R.id.letraH2_2);
        letraH2_3=findViewById(R.id.letraH2_3);
        letraH2_4=findViewById(R.id.letraH2_4);
        letraH2_5=findViewById(R.id.letraH2_5);
        letra_O=findViewById(R.id.letra_O);
        letra_O2=findViewById(R.id.letra_O2);
        letra_O3=findViewById(R.id.letra_O3);
        letra_O4=findViewById(R.id.letra_O4);
        letra_O5=findViewById(R.id.letra_O5);
        botonrestar=findViewById(R.id.botonrestar);
        botonrestar2=findViewById(R.id.botonrestar2);
        botonrestar3=findViewById(R.id.botonrestar3);
        botonrestar4=findViewById(R.id.botonrestar4);
        botonrestar5=findViewById(R.id.botonrestar5);
        jugador1=new Jugador(0);
        jugador2=new Jugador(0);
        jugador3=new Jugador(0);
        jugador4=new Jugador(0);
        jugador5=new Jugador(0);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public Jugador capturarJugador(TextView jugador){
        if(jugador.equals(letraC1_1)||jugador.equals(letraH1_1)||jugador.equals(letra_A)||jugador.equals(letra_N)||jugador.equals(letraC2_1)||jugador.equals(letraH2_1)||jugador.equals(letra_O)){
            return jugador1;
        }
        else if(jugador.equals(letraC1_2)||jugador.equals(letraH1_2)||jugador.equals(letra_A2)||jugador.equals(letra_N2)||jugador.equals(letraC2_2)||jugador.equals(letraH2_2)||jugador.equals(letra_O2)){
            return jugador2;
        }
        else if(jugador.equals(letraC1_3)||jugador.equals(letraH1_3)||jugador.equals(letra_A3)||jugador.equals(letra_N3)||jugador.equals(letraC2_3)||jugador.equals(letraH2_3)||jugador.equals(letra_O3)){
            return jugador3;
        }
        else if(jugador.equals(letraC1_4)||jugador.equals(letraH1_4)||jugador.equals(letra_A4)||jugador.equals(letra_N4)||jugador.equals(letraC2_4)||jugador.equals(letraH2_4)||jugador.equals(letra_O4)){
            return jugador4;
        }
        else if(jugador.equals(letraC1_5)||jugador.equals(letraH1_5)||jugador.equals(letra_A5)||jugador.equals(letra_N5)||jugador.equals(letraC2_5)||jugador.equals(letraH2_5)||jugador.equals(letra_O5)){
            return jugador5;
        }
        return null;
    }
    public void sumarPuntos(View vista){
        TextView letra=(TextView)vista;
        Jugador jugador=capturarJugador(letra);
        if(jugador.equals(jugador1)){
            if(jugador.getPuntos()==0){
                sumarPunto(letraC1_1,jugador);
            }
            else  if(jugador.getPuntos()==1){
                sumarPunto(letraH1_1,jugador);
            }
            else  if(jugador.getPuntos()==2){
                sumarPunto(letra_A,jugador);
            }
            else  if(jugador.getPuntos()==3){
                sumarPunto(letra_N,jugador);
            }
            else  if(jugador.getPuntos()==4){
                sumarPunto(letraC2_1,jugador);
            }
            else  if(jugador.getPuntos()==5){
                sumarPunto(letraH2_1,jugador);
            }
            else  if(jugador.getPuntos()==6){
                sumarPunto(letra_O,jugador);
            }
        }
        else if(jugador.equals(jugador2)){
            if(jugador.getPuntos()==0){
                sumarPunto(letraC1_2,jugador);
            }
            else  if(jugador.getPuntos()==1){
                sumarPunto(letraH1_2,jugador);
            }
            else  if(jugador.getPuntos()==2){
                sumarPunto(letra_A2,jugador);
            }
            else  if(jugador.getPuntos()==3){
                sumarPunto(letra_N2,jugador);
            }
            else  if(jugador.getPuntos()==4){
                sumarPunto(letraC2_2,jugador);
            }
            else  if(jugador.getPuntos()==5){
                sumarPunto(letraH2_2,jugador);
            }
            else  if(jugador.getPuntos()==6){
                sumarPunto(letra_O2,jugador);
            }
        }
        else if (jugador.equals(jugador3)){
            if(jugador.getPuntos()==0){
                sumarPunto(letraC1_3,jugador);
            }
            else  if(jugador.getPuntos()==1){
                sumarPunto(letraH1_3,jugador);
            }
            else  if(jugador.getPuntos()==2){
                sumarPunto(letra_A3,jugador);
            }
            else  if(jugador.getPuntos()==3){
                sumarPunto(letra_N3,jugador);
            }
            else  if(jugador.getPuntos()==4){
                sumarPunto(letraC2_3,jugador);
            }
            else  if(jugador.getPuntos()==5){
                sumarPunto(letraH2_3,jugador);
            }
            else  if(jugador.getPuntos()==6){
                sumarPunto(letra_O3,jugador);
            }
        }
        else if (jugador.equals(jugador4)){
            if(jugador.getPuntos()==0){
                sumarPunto(letraC1_4,jugador);
            }
            else  if(jugador.getPuntos()==1){
                sumarPunto(letraH1_4,jugador);
            }
            else  if(jugador.getPuntos()==2){
                sumarPunto(letra_A4,jugador);
            }
            else  if(jugador.getPuntos()==3){
                sumarPunto(letra_N4,jugador);
            }
            else  if(jugador.getPuntos()==4){
                sumarPunto(letraC2_4,jugador);
            }
            else  if(jugador.getPuntos()==5){
                sumarPunto(letraH2_4,jugador);
            }
            else  if(jugador.getPuntos()==6){
                sumarPunto(letra_O4,jugador);
            }
        }
        else if(jugador.equals(jugador5)){
            if(jugador.getPuntos()==0){
                sumarPunto(letraC1_5,jugador);
            }
            else  if(jugador.getPuntos()==1){
                sumarPunto(letraH1_5,jugador);
            }
            else  if(jugador.getPuntos()==2){
                sumarPunto(letra_A5,jugador);
            }
            else  if(jugador.getPuntos()==3){
                sumarPunto(letra_N5,jugador);
            }
            else  if(jugador.getPuntos()==4){
                sumarPunto(letraC2_5,jugador);
            }
            else  if(jugador.getPuntos()==5){
                sumarPunto(letraH2_5,jugador);
            }
            else  if(jugador.getPuntos()==6){
                sumarPunto(letra_O5,jugador);
            }
        }

    }
    public void sumarPunto(TextView letra,Jugador jugador){
        letra.setTextColor(getResources().getColor(R.color.Negro));
        jugador.sumarPuntos(1);
    }
    public Jugador capturarBoton(Button boton){
        if(boton.equals(botonrestar)){
            return jugador1;
        }
        if(boton.equals(botonrestar2)){
            return jugador2;
        }
        if(boton.equals(botonrestar3)){
            return jugador3;
        }
        if(boton.equals(botonrestar4)){
            return jugador4;
        }
        if(boton.equals(botonrestar5)){
            return jugador5;
        }
        return null;
    }
    public void restarPuntos(View vista){
        Button boton=(Button)vista;
        Jugador jugador=capturarBoton(boton);
        if(jugador.equals(jugador1)){
            if(jugador.getPuntos()==1){
                restarPunto(letraC1_1,jugador);
            }
            else  if(jugador.getPuntos()==2){
                restarPunto(letraH1_1,jugador);
            }
            else  if(jugador.getPuntos()==3){
                restarPunto(letra_A,jugador);
            }
            else  if(jugador.getPuntos()==4){
                restarPunto(letra_N,jugador);
            }
            else  if(jugador.getPuntos()==5){
                restarPunto(letraC2_1,jugador);
            }
            else  if(jugador.getPuntos()==6){
                restarPunto(letraH2_1,jugador);
            }
            else  if(jugador.getPuntos()==7){
                restarPunto(letra_O,jugador);
            }
        }
        else if(jugador.equals(jugador2)){
            if(jugador.getPuntos()==1){
                restarPunto(letraC1_2,jugador);
            }
            else  if(jugador.getPuntos()==2){
                restarPunto(letraH1_2,jugador);
            }
            else  if(jugador.getPuntos()==3){
                restarPunto(letra_A2,jugador);
            }
            else  if(jugador.getPuntos()==4){
                restarPunto(letra_N2,jugador);
            }
            else  if(jugador.getPuntos()==5){
                restarPunto(letraC2_2,jugador);
            }
            else  if(jugador.getPuntos()==6){
                restarPunto(letraH2_2,jugador);
            }
            else  if(jugador.getPuntos()==7){
                restarPunto(letra_O2,jugador);
            }
        }
        else if (jugador.equals(jugador3)){
            if(jugador.getPuntos()==1){
                restarPunto(letraC1_3,jugador);
            }
            else  if(jugador.getPuntos()==2){
                restarPunto(letraH1_3,jugador);
            }
            else  if(jugador.getPuntos()==3){
                restarPunto(letra_A3,jugador);
            }
            else  if(jugador.getPuntos()==4){
                restarPunto(letra_N3,jugador);
            }
            else  if(jugador.getPuntos()==5){
                restarPunto(letraC2_3,jugador);
            }
            else  if(jugador.getPuntos()==6){
                restarPunto(letraH2_3,jugador);
            }
            else  if(jugador.getPuntos()==7){
                restarPunto(letra_O3,jugador);
            }
        }
        else if (jugador.equals(jugador4)){
            if(jugador.getPuntos()==1){
                restarPunto(letraC1_4,jugador);
            }
            else  if(jugador.getPuntos()==2){
                restarPunto(letraH1_4,jugador);
            }
            else  if(jugador.getPuntos()==3){
                restarPunto(letra_A4,jugador);
            }
            else  if(jugador.getPuntos()==4){
                restarPunto(letra_N4,jugador);
            }
            else  if(jugador.getPuntos()==5){
                restarPunto(letraC2_4,jugador);
            }
            else  if(jugador.getPuntos()==6){
                restarPunto(letraH2_4,jugador);
            }
            else  if(jugador.getPuntos()==7){
                restarPunto(letra_O4,jugador);
            }
        }
        else if(jugador.equals(jugador5)){
            if(jugador.getPuntos()==1){
                restarPunto(letraC1_5,jugador);
            }
            else  if(jugador.getPuntos()==2){
                restarPunto(letraH1_5,jugador);
            }
            else  if(jugador.getPuntos()==3){
                restarPunto(letra_A5,jugador);
            }
            else  if(jugador.getPuntos()==4){
                restarPunto(letra_N5,jugador);
            }
            else  if(jugador.getPuntos()==5){
                restarPunto(letraC2_5,jugador);
            }
            else  if(jugador.getPuntos()==6){
                restarPunto(letraH2_5,jugador);
            }
            else  if(jugador.getPuntos()==7){
                restarPunto(letra_O5,jugador);
            }
        }
    }
    public void restarPunto(TextView letra,Jugador jugador){
        letra.setTextColor(getResources().getColor(R.color.GrisClaro));
        jugador.restarPuntos(1);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_reinicio,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void reiniciarPartido(Jugador jugador){
            if(jugador.equals(jugador1)){
                restarPunto(letraC1_1,jugador);
                restarPunto(letraH1_1,jugador);
                restarPunto(letra_A,jugador);
                restarPunto(letra_N,jugador);
                restarPunto(letraC2_1,jugador);
                restarPunto(letraH2_1,jugador);
                restarPunto(letra_O,jugador);
            }
            else if (jugador.equals(jugador2)){
                restarPunto(letraC1_2,jugador);
                restarPunto(letraH1_2,jugador);
                restarPunto(letra_A2,jugador);
                restarPunto(letra_N2,jugador);
                restarPunto(letraC2_2,jugador);
                restarPunto(letraH2_2,jugador);
                restarPunto(letra_O2,jugador);
            }
            else if (jugador.equals(jugador3)){
                restarPunto(letraC1_3,jugador);
                restarPunto(letraH1_3,jugador);
                restarPunto(letra_A3,jugador);
                restarPunto(letra_N3,jugador);
                restarPunto(letraC2_3,jugador);
                restarPunto(letraH2_3,jugador);
                restarPunto(letra_O3,jugador);
            }
            else if (jugador.equals(jugador4)){
                restarPunto(letraC1_4,jugador);
                restarPunto(letraH1_4,jugador);
                restarPunto(letra_A4,jugador);
                restarPunto(letra_N4,jugador);
                restarPunto(letraC2_4,jugador);
                restarPunto(letraH2_4,jugador);
                restarPunto(letra_O4,jugador);
            }
            else if (jugador.equals(jugador5)){
                restarPunto(letraC1_5,jugador);
                restarPunto(letraH1_5,jugador);
                restarPunto(letra_A5,jugador);
                restarPunto(letra_N5,jugador);
                restarPunto(letraC2_5,jugador);
                restarPunto(letraH2_5,jugador);
                restarPunto(letra_O5,jugador);
            }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.Reiniciar){
            final AlertDialog.Builder alertdialog= new AlertDialog.Builder(this);
            alertdialog.setTitle("Reiniciar?");
            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    reiniciarPartido(jugador1);
                    reiniciarPartido(jugador2);
                    reiniciarPartido(jugador3);
                    reiniciarPartido(jugador4);
                    reiniciarPartido(jugador5);
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
}
