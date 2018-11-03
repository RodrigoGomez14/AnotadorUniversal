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
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Jodete extends AppCompatActivity {
    private Jugador jugador1, jugador2, jugador3, jugador4, jugador5, jugador6, jugador7, jugador8, jugador9, jugador10;
    private TextView jug1, jug2, jug3, jug4, jug5, jug6, jug7, jug8, jug9, jug10,resultado1,resultado2,resultado3,resultado4,resultado5,resultado6,resultado7,resultado8,resultado9,resultado10;
    private RadioButton ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10;
    private int jugadores,sumatoria;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jodete_activity);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        jugador1 = new Jugador(0);
        jugador2 = new Jugador(0);
        jugador3 = new Jugador(0);
        jugador4 = new Jugador(0);
        jugador5 = new Jugador(0);
        jugador6 = new Jugador(0);
        jugador7 = new Jugador(0);
        jugador8 = new Jugador(0);
        jugador9 = new Jugador(0);
        jugador10 = new Jugador(0);
        jug1 = findViewById(R.id.jug1);
        jug1.setVisibility(View.INVISIBLE);
        jug2 = findViewById(R.id.jug2);
        jug2.setVisibility(View.INVISIBLE);
        jug3 = findViewById(R.id.jug3);
        jug3.setVisibility(View.INVISIBLE);
        jug4 = findViewById(R.id.jug4);
        jug4.setVisibility(View.INVISIBLE);
        jug5 = findViewById(R.id.jug5);
        jug5.setVisibility(View.INVISIBLE);
        jug6 = findViewById(R.id.jug6);
        jug6.setVisibility(View.INVISIBLE);
        jug7 = findViewById(R.id.jug7);
        jug7.setVisibility(View.INVISIBLE);
        jug8 = findViewById(R.id.jug8);
        jug8.setVisibility(View.INVISIBLE);
        jug9 = findViewById(R.id.jug9);
        jug9.setVisibility(View.INVISIBLE);
        jug10 = findViewById(R.id.jug10);
        jug10.setVisibility(View.INVISIBLE);
        ch1=findViewById(R.id.ch1);
        ch1.setVisibility(View.INVISIBLE);
        ch2=findViewById(R.id.ch2);
        ch2.setVisibility(View.INVISIBLE);
        ch3=findViewById(R.id.ch3);
        ch3.setVisibility(View.INVISIBLE);
        ch4=findViewById(R.id.ch4);
        ch4.setVisibility(View.INVISIBLE);
        ch5=findViewById(R.id.ch5);
        ch5.setVisibility(View.INVISIBLE);
        ch6=findViewById(R.id.ch6);
        ch6.setVisibility(View.INVISIBLE);
        ch7=findViewById(R.id.ch7);
        ch7.setVisibility(View.INVISIBLE);
        ch8=findViewById(R.id.ch8);
        ch8.setVisibility(View.INVISIBLE);
        ch9=findViewById(R.id.ch9);
        ch9.setVisibility(View.INVISIBLE);
        ch10=findViewById(R.id.ch10);
        ch10.setVisibility(View.INVISIBLE);
        resultado1=findViewById(R.id.resultado1);
        resultado1.setVisibility(View.INVISIBLE);
        resultado2=findViewById(R.id.resultado2);
        resultado2.setVisibility(View.INVISIBLE);
        resultado3=findViewById(R.id.resultado3);
        resultado3.setVisibility(View.INVISIBLE);
        resultado4=findViewById(R.id.resultado4);
        resultado4.setVisibility(View.INVISIBLE);
        resultado5=findViewById(R.id.resultado5);
        resultado5.setVisibility(View.INVISIBLE);
        resultado6=findViewById(R.id.resultado6);
        resultado6.setVisibility(View.INVISIBLE);
        resultado7=findViewById(R.id.resultado7);
        resultado7.setVisibility(View.INVISIBLE);
        resultado8=findViewById(R.id.resultado8);
        resultado8.setVisibility(View.INVISIBLE);
        resultado9=findViewById(R.id.resultado9);
        resultado9.setVisibility(View.INVISIBLE);
        resultado10=findViewById(R.id.resultado10);
        resultado10.setVisibility(View.INVISIBLE);
        jugadores=0;
        seleccionarJugadores(false);
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


    public void seleccionarJugadores(Boolean nuevaPartida){
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setTitle("Ingresar Nombres");
        LinearLayout layout =new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        final EditText nombre1 = new EditText(this);
        nombre1.setHint("Jugador "+jugadores);
        if(jugadores==0){
            EditTextJugador(nombre1,jugador1,jug1,false);
        }
        else if(jugadores==1){
            EditTextJugador(nombre1,jugador2,jug2,false);
        }
        else if(jugadores==2){
            EditTextJugador(nombre1,jugador3,jug3,false);
        }
        else if(jugadores==3){
            EditTextJugador(nombre1,jugador4,jug4,false);
        }
        else if(jugadores==4){
            EditTextJugador(nombre1,jugador5,jug5,false);
        }
        else if(jugadores==5){
            EditTextJugador(nombre1,jugador6,jug6,false);
        }
        else if(jugadores==6){
            EditTextJugador(nombre1,jugador7,jug7,false);
        }
        else if(jugadores==7){
            EditTextJugador(nombre1,jugador8,jug8,false);
        }
        else if(jugadores==8){
            EditTextJugador(nombre1,jugador9,jug9,false);
        }
        else if(jugadores==9){
            EditTextJugador(nombre1,jugador10,jug10,false);
        }
        layout.addView(nombre1);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertdialog.setNeutralButton("Agregar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertdialog.create().show();



    }

    public void EditTextJugador(EditText etJugador,Jugador jugador,TextView nombre,Boolean nuevapartida){
        if(nuevapartida&&!jugador.getNombre().equals("")){
            nombre.setText(jugador.getNombre());
        }
    }
    public void configurarJugadores(Jugador jugador,int jugadores){

    }

    public void seleccionarJugadores2(Boolean nuevaPartida) {
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setTitle("Ingresar Nombres");
        LinearLayout layout =new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        final EditText nombre1 = new EditText(this);
        nombre1.setHint("Jugador 1");
        if(nuevaPartida&&!jugador1.getNombre().equals("")){
            nombre1.setText(jugador1.getNombre());
        }
        final EditText nombre2 = new EditText(this);
        nombre2.setHint("Jugador 2");
        if(nuevaPartida&&!jugador2.getNombre().equals("")){
            nombre2.setText(jugador2.getNombre());
        }
        final EditText nombre3 = new EditText(this);
        nombre3.setHint("Jugador 3");
        if(nuevaPartida&&!jugador3.getNombre().equals("")){
            nombre3.setText(jugador3.getNombre());
        }
        final EditText nombre4 = new EditText(this);
        nombre4.setHint("Jugador 4");
        if(nuevaPartida&&!jugador4.getNombre().equals("")){
            nombre4.setText(jugador4.getNombre());
        }
        final EditText nombre5 = new EditText(this);
        nombre5.setHint("Jugador 5");
        if(nuevaPartida&&!jugador5.getNombre().equals("")){
            nombre5.setText(jugador5.getNombre());
        }
        final EditText nombre6 = new EditText(this);
        nombre6.setHint("Jugador 6");
        if(nuevaPartida&&!jugador6.getNombre().equals("")){
            nombre6.setText(jugador6.getNombre());
        }
        final EditText nombre7 = new EditText(this);
        nombre7.setHint("Jugador 7");
        if(nuevaPartida&&!jugador7.getNombre().equals("")){
            nombre7.setText(jugador7.getNombre());
        }
        final EditText nombre8 = new EditText(this);
        nombre8.setHint("Jugador 8");
        if(nuevaPartida&&!jugador8.getNombre().equals("")){
            nombre8.setText(jugador8.getNombre());
        }
        final EditText nombre9 = new EditText(this);
        nombre9.setHint("Jugador 9");
        if(nuevaPartida&&!jugador9.getNombre().equals("")){
            nombre9.setText(jugador9.getNombre());
        }
        final EditText nombre10 = new EditText(this);
        nombre10.setHint("Jugador 10");
        if(nuevaPartida&&!jugador10.getNombre().equals("")){
            nombre10.setText(jugador10.getNombre());
        }
        layout.addView(nombre1);
        layout.addView(nombre2);
        layout.addView(nombre3);
        layout.addView(nombre4);
        layout.addView(nombre5);
        layout.addView(nombre6);
        layout.addView(nombre7);
        layout.addView(nombre8);
        layout.addView(nombre9);
        layout.addView(nombre10);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(mostrarJugadores(nombre1,jugador1)){
                    jugadores++;
                }
                if( mostrarJugadores(nombre2,jugador2)){
                    jugadores++;
                }
                if(mostrarJugadores(nombre3,jugador3)){
                    jugadores++;
                }
                if(mostrarJugadores(nombre4,jugador4)){
                    jugadores++;
                }
                if(mostrarJugadores(nombre5,jugador5)){
                    jugadores++;
                }
                if(mostrarJugadores(nombre6,jugador6)){
                    jugadores++;
                }
                if(mostrarJugadores(nombre7,jugador7)){
                    jugadores++;
                }
                if(mostrarJugadores(nombre8,jugador8)){
                    jugadores++;
                }
                if(mostrarJugadores(nombre9,jugador9)){
                    jugadores++;
                }
                if(mostrarJugadores(nombre10,jugador10)){
                    jugadores++;
                }
                if(nombre1.getText().toString().equals("")&&nombre2.getText().toString().equals("")&&nombre3.getText().toString().equals("")&&nombre4.getText().toString().equals("")&&nombre5.getText().toString().equals("")&&nombre6.getText().toString().equals("")&&nombre7.getText().toString().equals("")&&nombre8.getText().toString().equals("")&&nombre9.getText().toString().equals("")&&nombre10.getText().toString().equals("")){
                    finish();
                }
                else{
                    avisoPrincipio();
                }
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertdialog.create().show();
    }
    public boolean mostrarJugadores(EditText et,Jugador jugador ){
        if(!et.getText().toString().equals("")){
            jugador.setNombre(et.getText().toString());

            if(jugador.equals(jugador1)){
                ch1.setVisibility(View.VISIBLE);
                resultado1.setVisibility(View.VISIBLE);
                jug1.setText(jugador1.getNombre());
                jug1.setVisibility(View.VISIBLE);
                return true;
            }
            else if(jugador.equals(jugador2)){
                ch2.setVisibility(View.VISIBLE);
                resultado2.setVisibility(View.VISIBLE);
                jug2.setText(jugador2.getNombre());
                jug2.setVisibility(View.VISIBLE);
                return true;
            }
            else if(jugador.equals(jugador3)){
                ch3.setVisibility(View.VISIBLE);
                resultado3.setVisibility(View.VISIBLE);
                jug3.setText(jugador3.getNombre());
                jug3.setVisibility(View.VISIBLE);
                return true;
            }
            else if(jugador.equals(jugador4)){
                ch4.setVisibility(View.VISIBLE);
                resultado4.setVisibility(View.VISIBLE);
                jug4.setText(jugador4.getNombre());
                jug4.setVisibility(View.VISIBLE);
                return  true;
            }
            else if(jugador.equals(jugador5)){
                ch5.setVisibility(View.VISIBLE);
                resultado5.setVisibility(View.VISIBLE);
                jug5.setText(jugador5.getNombre());
                jug5.setVisibility(View.VISIBLE);
                return true;
            }
            else if(jugador.equals(jugador6)){
                ch6.setVisibility(View.VISIBLE);
                resultado6.setVisibility(View.VISIBLE);
                jug6.setText(jugador6.getNombre());
                jug6.setVisibility(View.VISIBLE);
                return true;
            }
            else if(jugador.equals(jugador7)){
                ch7.setVisibility(View.VISIBLE);
                resultado7.setVisibility(View.VISIBLE);
                jug7.setText(jugador7.getNombre());
                jug7.setVisibility(View.VISIBLE);
                return true;
            }
            else if(jugador.equals(jugador8)){
                ch8.setVisibility(View.VISIBLE);
                resultado8.setVisibility(View.VISIBLE);
                jug8.setText(jugador8.getNombre());
                jug8.setVisibility(View.VISIBLE);
                return true;
            }
            else if(jugador.equals(jugador9)){
                ch9.setVisibility(View.VISIBLE);
                resultado9.setVisibility(View.VISIBLE);
                jug9.setText(jugador9.getNombre());
                jug9.setVisibility(View.VISIBLE);
                return true;
            }
            else if(jugador.equals(jugador10)){
                ch10.setVisibility(View.VISIBLE);
                resultado10.setVisibility(View.VISIBLE);
                jug10.setText(jugador10.getNombre());
                jug10.setVisibility(View.VISIBLE);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_reinicio_configuracion,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.configuracion){
            AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
            alertdialog.setTitle("Cambiar a Uno");
            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent j=new Intent(Jodete.this,Uno.class);
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
        else if(id==R.id.Reiniciar){
            AlertDialog.Builder alertdialog =new AlertDialog.Builder(this);
            alertdialog.setTitle("Reiniciar?");
            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    capaDeInvisivilidad();
                    seleccionarJugadores(true);
                    jugador1.setPuntos(0);
                    sumarPuntos(0,jugador1,resultado1);
                    jugador2.setPuntos(0);
                    sumarPuntos(0,jugador2,resultado2);
                    jugador3.setPuntos(0);
                    sumarPuntos(0,jugador3,resultado3);
                    jugador4.setPuntos(0);
                    sumarPuntos(0,jugador4,resultado4);
                    jugador5.setPuntos(0);
                    sumarPuntos(0,jugador5,resultado5);
                    jugador6.setPuntos(0);
                    sumarPuntos(0,jugador6,resultado6);
                    jugador7.setPuntos(0);
                    sumarPuntos(0,jugador6,resultado6);
                    jugador8.setPuntos(0);
                    sumarPuntos(0,jugador7,resultado7);
                    jugador9.setPuntos(0);
                    sumarPuntos(0,jugador9,resultado9);
                    jugador10.setPuntos(0);
                    sumarPuntos(0,jugador10,resultado10);
                    jugadores=0;
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

    public void apretarBoton(View vista){
        seleccionarJugadores(false);
    }

    public void ingresarPuntajes(View vista){
        sumatoria=0;
        final EditText[] arrayEt=new EditText[jugadores];
        AlertDialog.Builder alertidalog=new AlertDialog.Builder(this);
        alertidalog.setTitle("Insertar suma de cartas de cada jugador");

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        final EditText et1=new EditText(this);
        et1.setHint(jugador1.getNombre()+"(0)");
        et1.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText et2=new EditText(this);
        et2.setHint(jugador2.getNombre()+"(0)");
        et2.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText et3=new EditText(this);
        et3.setHint(jugador3.getNombre()+"(0)");
        et3.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText et4=new EditText(this);
        et4.setHint(jugador4.getNombre()+"(0)");
        et4.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText et5=new EditText(this);
        et5.setHint(jugador5.getNombre()+"(0)");
        et5.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText et6=new EditText(this);
        et6.setHint(jugador6.getNombre()+"(0)");
        et6.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText et7=new EditText(this);
        et7.setHint(jugador7.getNombre()+"(0)");
        et7.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText et8=new EditText(this);
        et8.setHint(jugador8.getNombre()+"(0)");
        et8.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText et9=new EditText(this);
        et9.setHint(jugador9.getNombre()+"(0)");
        et9.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText et10=new EditText(this);
        et10.setHint(jugador10.getNombre()+"(0)");
        et10.setInputType(InputType.TYPE_CLASS_NUMBER);
        if(jugadores==1){
            layout.addView(et1);
        }
        else if(jugadores==2){
            if(jugador1.getPuntos()<100){
                if(!ch1.isChecked()){
                    layout.addView(et1);
                }
            }
            if(jugador2.getPuntos()<100){
                if(!ch2.isChecked()){
                    layout.addView(et2);
                }
            }
        }
        else if(jugadores==3){
            if(jugador1.getPuntos()<100){
                if(!ch1.isChecked()){
                    layout.addView(et1);
                }
            }
            if(jugador2.getPuntos()<100){
                if(!ch2.isChecked()){
                    layout.addView(et2);
                }
            }
            if(jugador3.getPuntos()<100){
                if(!ch3.isChecked()){
                    layout.addView(et3);
                }
            }
        }
        else if(jugadores==4){
            if(jugador1.getPuntos()<100){
                if(!ch1.isChecked()){
                    layout.addView(et1);
                }
            }
            if(jugador2.getPuntos()<100){
                if(!ch2.isChecked()){
                    layout.addView(et2);
                }
            }
            if(jugador3.getPuntos()<100){
                if(!ch3.isChecked()){
                    layout.addView(et3);
                }
            }
            if(jugador4.getPuntos()<100){
                if(!ch4.isChecked()){
                    layout.addView(et4);
                }
            }
        }
        else if(jugadores==5){
            if(jugador1.getPuntos()<100){
                if(!ch1.isChecked()){
                    layout.addView(et1);
                }
            }
            if(jugador2.getPuntos()<100){
                if(!ch2.isChecked()){
                    layout.addView(et2);
                }
            }
            if(jugador3.getPuntos()<100){
                if(!ch3.isChecked()){
                    layout.addView(et3);
                }
            }
            if(jugador4.getPuntos()<100){
                if(!ch4.isChecked()){
                    layout.addView(et4);
                }
            }
            if(jugador5.getPuntos()<100){
                if(!ch5.isChecked()){
                    layout.addView(et5);
                }
            }
        }
        else if(jugadores==6){
            if(jugador1.getPuntos()<100){
                if(!ch1.isChecked()){
                    layout.addView(et1);
                }
            }
            if(jugador2.getPuntos()<100){
                if(!ch2.isChecked()){
                    layout.addView(et2);
                }
            }
            if(jugador3.getPuntos()<100){
                if(!ch3.isChecked()){
                    layout.addView(et3);
                }
            }
            if(jugador4.getPuntos()<100){
                if(!ch4.isChecked()){
                    layout.addView(et4);
                }
            }
            if(jugador5.getPuntos()<100){
                if(!ch5.isChecked()){
                    layout.addView(et5);
                }
            }
            if(jugador6.getPuntos()<100){
                if(!ch6.isChecked()){
                    layout.addView(et6);
                }
            }
        }
        else if(jugadores==7){
            if(jugador1.getPuntos()<100){
                if(!ch1.isChecked()){
                    layout.addView(et1);
                }
            }
            if(jugador2.getPuntos()<100){
                if(!ch2.isChecked()){
                    layout.addView(et2);
                }
            }
            if(jugador3.getPuntos()<100){
                if(!ch3.isChecked()){
                    layout.addView(et3);
                }
            }
            if(jugador4.getPuntos()<100){
                if(!ch4.isChecked()){
                    layout.addView(et4);
                }
            }
            if(jugador5.getPuntos()<100){
                if(!ch5.isChecked()){
                    layout.addView(et5);
                }
            }
            if(jugador6.getPuntos()<100){
                if(!ch6.isChecked()){
                    layout.addView(et6);
                }
            }
            if(jugador7.getPuntos()<100){
                if(!ch7.isChecked()){
                    layout.addView(et7);
                }
            }
        }
        else if(jugadores==8){
            if(jugador1.getPuntos()<100){
                if(!ch1.isChecked()){
                    layout.addView(et1);
                }
            }
            if(jugador2.getPuntos()<100){
                if(!ch2.isChecked()){
                    layout.addView(et2);
                }
            }
            if(jugador3.getPuntos()<100){
                if(!ch3.isChecked()){
                    layout.addView(et3);
                }
            }
            if(jugador4.getPuntos()<100){
                if(!ch4.isChecked()){
                    layout.addView(et4);
                }
            }
            if(jugador5.getPuntos()<100){
                if(!ch5.isChecked()){
                    layout.addView(et5);
                }
            }
            if(jugador6.getPuntos()<100){
                if(!ch6.isChecked()){
                    layout.addView(et6);
                }
            }
            if(jugador7.getPuntos()<100){
                if(!ch7.isChecked()){
                    layout.addView(et7);
                }
            }
            if(jugador8.getPuntos()<100){
                if(!ch8.isChecked()){
                    layout.addView(et8);
                }
            }
        }
        else if(jugadores==9){
            if(jugador1.getPuntos()<100){
                if(!ch1.isChecked()){
                    layout.addView(et1);
                }
            }
            if(jugador2.getPuntos()<100){
                if(!ch2.isChecked()){
                    layout.addView(et2);
                }
            }
            if(jugador3.getPuntos()<100){
                if(!ch3.isChecked()){
                    layout.addView(et3);
                }
            }
            if(jugador4.getPuntos()<100){
                if(!ch4.isChecked()){
                    layout.addView(et4);
                }
            }
            if(jugador5.getPuntos()<100){
                if(!ch5.isChecked()){
                    layout.addView(et5);
                }
            }
            if(jugador6.getPuntos()<100){
                if(!ch6.isChecked()){
                    layout.addView(et6);
                }
            }
            if(jugador7.getPuntos()<100){
                if(!ch7.isChecked()){
                    layout.addView(et7);
                }
            }
            if(jugador8.getPuntos()<100){
                if(!ch8.isChecked()){
                    layout.addView(et8);
                }
            }
            if(jugador9.getPuntos()<100){
                if(!ch9.isChecked()){
                    layout.addView(et9);
                }
            }
        }
        else if(jugadores==10){
            if(jugador1.getPuntos()<100){
                if(!ch1.isChecked()){
                    layout.addView(et1);
                }
            }
            if(jugador2.getPuntos()<100){
                if(!ch2.isChecked()){
                    layout.addView(et2);
                }
            }
            if(jugador3.getPuntos()<100){
                if(!ch3.isChecked()){
                    layout.addView(et3);
                }
            }
            if(jugador4.getPuntos()<100){
                if(!ch4.isChecked()){
                    layout.addView(et4);
                }
            }
            if(jugador5.getPuntos()<100){
                if(!ch5.isChecked()){
                    layout.addView(et5);
                }
            }
            if(jugador6.getPuntos()<100){
                if(!ch6.isChecked()){
                    layout.addView(et6);
                }
            }
            if(jugador7.getPuntos()<100){
                if(!ch7.isChecked()){
                    layout.addView(et7);
                }
            }
            if(jugador8.getPuntos()<100){
                if(!ch8.isChecked()){
                    layout.addView(et8);
                }
            }
            if(jugador9.getPuntos()<100){
                if(!ch9.isChecked()){
                    layout.addView(et9);
                }
            }
            if(jugador10.getPuntos()<100){
                if(!ch10.isChecked()){
                    layout.addView(et10);
                }
            }
        }
        alertidalog.setView(layout);
        alertidalog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(jugadores==2){
                    if(checkEditText(et1)){
                        sumarPuntos(Integer.parseInt(et1.getText().toString()),jugador1,resultado1);
                    }
                    if(checkEditText(et2)){
                        sumarPuntos(Integer.parseInt(et2.getText().toString()),jugador2,resultado2);
                    }
                }
                else if(jugadores==3){
                    if(checkEditText(et1)){
                        sumarPuntos(Integer.parseInt(et1.getText().toString()),jugador1,resultado1);
                    }
                    if(checkEditText(et2)){
                        sumarPuntos(Integer.parseInt(et2.getText().toString()),jugador2,resultado2);
                    }
                    if(checkEditText(et3)){
                        sumarPuntos(Integer.parseInt(et3.getText().toString()),jugador3,resultado3);
                    }
                }
                else if(jugadores==4){
                    if(checkEditText(et1)){
                        sumarPuntos(Integer.parseInt(et1.getText().toString()),jugador1,resultado1);
                    }
                    if(checkEditText(et2)){
                        sumarPuntos(Integer.parseInt(et2.getText().toString()),jugador2,resultado2);
                    }
                    if(checkEditText(et3)){
                        sumarPuntos(Integer.parseInt(et3.getText().toString()),jugador3,resultado3);
                    }
                    if(checkEditText(et4)){
                        sumarPuntos(Integer.parseInt(et4.getText().toString()),jugador4,resultado4);
                    }
                }
                else if(jugadores==5){
                    if(checkEditText(et1)){
                        sumarPuntos(Integer.parseInt(et1.getText().toString()),jugador1,resultado1);
                    }
                    if(checkEditText(et2)){
                        sumarPuntos(Integer.parseInt(et2.getText().toString()),jugador2,resultado2);
                    }
                    if(checkEditText(et3)){
                        sumarPuntos(Integer.parseInt(et3.getText().toString()),jugador3,resultado3);
                    }
                    if(checkEditText(et4)){
                        sumarPuntos(Integer.parseInt(et4.getText().toString()),jugador4,resultado4);
                    }
                    if(checkEditText(et5)){
                        sumarPuntos(Integer.parseInt(et5.getText().toString()),jugador5,resultado5);
                    }
                }
                else if(jugadores==6){
                    if(checkEditText(et1)){
                        sumarPuntos(Integer.parseInt(et1.getText().toString()),jugador1,resultado1);
                    }
                    if(checkEditText(et2)){
                        sumarPuntos(Integer.parseInt(et2.getText().toString()),jugador2,resultado2);
                    }
                    if(checkEditText(et3)){
                        sumarPuntos(Integer.parseInt(et3.getText().toString()),jugador3,resultado3);
                    }
                    if(checkEditText(et4)){
                        sumarPuntos(Integer.parseInt(et4.getText().toString()),jugador4,resultado4);
                    }
                    if(checkEditText(et5)){
                        sumarPuntos(Integer.parseInt(et5.getText().toString()),jugador5,resultado5);
                    }
                    if(checkEditText(et6)){
                        sumarPuntos(Integer.parseInt(et6.getText().toString()),jugador6,resultado6);
                    }
                }
                else if(jugadores==7){
                    if(checkEditText(et1)){
                        sumarPuntos(Integer.parseInt(et1.getText().toString()),jugador1,resultado1);
                    }
                    if(checkEditText(et2)){
                        sumarPuntos(Integer.parseInt(et2.getText().toString()),jugador2,resultado2);
                    }
                    if(checkEditText(et3)){
                        sumarPuntos(Integer.parseInt(et3.getText().toString()),jugador3,resultado3);
                    }
                    if(checkEditText(et4)){
                        sumarPuntos(Integer.parseInt(et4.getText().toString()),jugador4,resultado4);
                    }
                    if(checkEditText(et5)){
                        sumarPuntos(Integer.parseInt(et5.getText().toString()),jugador5,resultado5);
                    }
                    if(checkEditText(et6)){
                        sumarPuntos(Integer.parseInt(et6.getText().toString()),jugador6,resultado6);
                    }
                    if(checkEditText(et7)){
                        sumarPuntos(Integer.parseInt(et7.getText().toString()),jugador7,resultado7);
                    }
                }
                else if(jugadores==8){
                    if(checkEditText(et1)){
                        sumarPuntos(Integer.parseInt(et1.getText().toString()),jugador1,resultado1);
                    }
                    if(checkEditText(et2)){
                        sumarPuntos(Integer.parseInt(et2.getText().toString()),jugador2,resultado2);
                    }
                    if(checkEditText(et3)){
                        sumarPuntos(Integer.parseInt(et3.getText().toString()),jugador3,resultado3);
                    }
                    if(checkEditText(et4)){
                        sumarPuntos(Integer.parseInt(et4.getText().toString()),jugador4,resultado4);
                    }
                    if(checkEditText(et5)){
                        sumarPuntos(Integer.parseInt(et5.getText().toString()),jugador5,resultado5);
                    }
                    if(checkEditText(et6)){
                        sumarPuntos(Integer.parseInt(et6.getText().toString()),jugador6,resultado6);
                    }
                    if(checkEditText(et7)){
                        sumarPuntos(Integer.parseInt(et7.getText().toString()),jugador7,resultado7);
                    }
                    if(checkEditText(et8)){
                        sumarPuntos(Integer.parseInt(et8.getText().toString()),jugador8,resultado8);
                    }
                }
                else if(jugadores==9){
                    if(checkEditText(et1)){
                        sumarPuntos(Integer.parseInt(et1.getText().toString()),jugador1,resultado1);
                    }
                    if(checkEditText(et2)){
                        sumarPuntos(Integer.parseInt(et2.getText().toString()),jugador2,resultado2);
                    }
                    if(checkEditText(et3)){
                        sumarPuntos(Integer.parseInt(et3.getText().toString()),jugador3,resultado3);
                    }
                    if(checkEditText(et4)){
                        sumarPuntos(Integer.parseInt(et4.getText().toString()),jugador4,resultado4);
                    }
                    if(checkEditText(et5)){
                        sumarPuntos(Integer.parseInt(et5.getText().toString()),jugador5,resultado5);
                    }
                    if(checkEditText(et6)){
                        sumarPuntos(Integer.parseInt(et6.getText().toString()),jugador6,resultado6);
                    }
                    if(checkEditText(et7)){
                        sumarPuntos(Integer.parseInt(et7.getText().toString()),jugador7,resultado7);
                    }
                    if(checkEditText(et8)){
                        sumarPuntos(Integer.parseInt(et8.getText().toString()),jugador8,resultado8);
                    }
                    if(checkEditText(et9)){
                        sumarPuntos(Integer.parseInt(et9.getText().toString()),jugador9,resultado9);
                    }
                }
                else if(jugadores==10){
                    if(checkEditText(et1)){
                        sumarPuntos(Integer.parseInt(et1.getText().toString()),jugador1,resultado1);
                    }
                    if(checkEditText(et2)){
                        sumarPuntos(Integer.parseInt(et2.getText().toString()),jugador2,resultado2);
                    }
                    if(checkEditText(et3)){
                        sumarPuntos(Integer.parseInt(et3.getText().toString()),jugador3,resultado3);
                    }
                    if(checkEditText(et4)){
                        sumarPuntos(Integer.parseInt(et4.getText().toString()),jugador4,resultado4);
                    }
                    if(checkEditText(et5)){
                        sumarPuntos(Integer.parseInt(et5.getText().toString()),jugador5,resultado5);
                    }
                    if(checkEditText(et6)){
                        sumarPuntos(Integer.parseInt(et6.getText().toString()),jugador6,resultado6);
                    }
                    if(checkEditText(et7)){
                        sumarPuntos(Integer.parseInt(et7.getText().toString()),jugador7,resultado7);
                    }
                    if(checkEditText(et8)){
                        sumarPuntos(Integer.parseInt(et8.getText().toString()),jugador8,resultado8);
                    }
                    if(checkEditText(et9)){
                        sumarPuntos(Integer.parseInt(et9.getText().toString()),jugador9,resultado9);
                    }
                    if(checkEditText(et10)){
                        sumarPuntos(Integer.parseInt(et10.getText().toString()),jugador10,resultado10);
                    }
                }

                if(ch1.isChecked()){
                    cortar(jugador1,resultado1);
                }
                else if(ch2.isChecked()){
                    cortar(jugador2,resultado2);
                }
                else if(ch3.isChecked()){
                    cortar(jugador3,resultado3);
                }
                else if(ch4.isChecked()){
                    cortar(jugador4,resultado4);
                }
                else if(ch5.isChecked()){
                    cortar(jugador5,resultado5);
                }
                else if(ch6.isChecked()){
                    cortar(jugador6,resultado6);
                }
                else if(ch7.isChecked()){
                    cortar(jugador7,resultado7);
                }
                else if(ch8.isChecked()){
                    cortar(jugador8,resultado8);
                }
                else if(ch9.isChecked()){
                    cortar(jugador9,resultado9);
                }
                else if(ch10.isChecked()){
                    cortar(jugador10,resultado10);
                }
            }
        });
        alertidalog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertidalog.create().show();
    }

    public void sumarPuntos(int puntos,Jugador jugador,TextView puntaje){
        if(jugador.getPuntos()<100){
            jugador.sumarPuntos(puntos);
            puntaje.setText(String.valueOf(jugador.getPuntos()));
            puntaje.setTextColor(getResources().getColor(R.color.Negro));
        }
        if(jugador.getPuntos()>=100){
            puntaje.setTextColor(getResources().getColor(R.color.rojo));
        }

    }
    public void cortar(Jugador jugador, TextView puntaje){
        if(jugador.getPuntos()<100){
            jugador.sumarPuntos(-10);
            puntaje.setText(String.valueOf(jugador.getPuntos()));
        }
    }

    public void capaDeInvisivilidad(){
        jug1.setVisibility(View.INVISIBLE);
        jug2.setVisibility(View.INVISIBLE);
        jug3.setVisibility(View.INVISIBLE);
        jug4.setVisibility(View.INVISIBLE);
        jug5.setVisibility(View.INVISIBLE);
        jug6.setVisibility(View.INVISIBLE);
        jug7.setVisibility(View.INVISIBLE);
        jug8.setVisibility(View.INVISIBLE);
        jug9.setVisibility(View.INVISIBLE);
        jug10.setVisibility(View.INVISIBLE);
        ch1.setVisibility(View.INVISIBLE);
        ch2.setVisibility(View.INVISIBLE);
        ch3.setVisibility(View.INVISIBLE);
        ch4.setVisibility(View.INVISIBLE);
        ch5.setVisibility(View.INVISIBLE);
        ch6.setVisibility(View.INVISIBLE);
        ch7.setVisibility(View.INVISIBLE);
        ch8.setVisibility(View.INVISIBLE);
        ch9.setVisibility(View.INVISIBLE);
        ch10.setVisibility(View.INVISIBLE);
        resultado1.setVisibility(View.INVISIBLE);
        resultado2.setVisibility(View.INVISIBLE);
        resultado3.setVisibility(View.INVISIBLE);
        resultado4.setVisibility(View.INVISIBLE);
        resultado5.setVisibility(View.INVISIBLE);
        resultado6.setVisibility(View.INVISIBLE);
        resultado7.setVisibility(View.INVISIBLE);
        resultado8.setVisibility(View.INVISIBLE);
        resultado9.setVisibility(View.INVISIBLE);
        resultado10.setVisibility(View.INVISIBLE);
    }

    public boolean checkEditText(EditText et){
        if(!et.getText().toString().equals("")){
            return true;
        }
        return false;
    }

    public void avisoPrincipio(){
        AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
        alertdialog.setTitle("Modo de uso");
        alertdialog.setMessage("Seleccionar el jugador que corte en cada mano");
        alertdialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertdialog.create().show();
    }
}
