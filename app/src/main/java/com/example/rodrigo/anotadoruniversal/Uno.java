package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Uno extends AppCompatActivity {
    private Jugador jugador1, jugador2, jugador3, jugador4, jugador5, jugador6, jugador7, jugador8, jugador9, jugador10;
    private TextView jug1, jug2, jug3, jug4, jug5, jug6, jug7, jug8, jug9, jug10,resultado1,resultado2,resultado3,resultado4,resultado5,resultado6,resultado7,resultado8,resultado9,resultado10;
    private RadioButton ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10;
    private int jugadores,sumatoria;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);
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


    public void seleccionarJugadores(Boolean nuevaPartida) {
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
        final EditText nombre6 = new EditText(this);
        nombre6.setHint("Jugador 6");
        final EditText nombre7 = new EditText(this);
        nombre7.setHint("Jugador 7");
        final EditText nombre8 = new EditText(this);
        nombre8.setHint("Jugador 8");
        final EditText nombre9 = new EditText(this);
        nombre9.setHint("Jugador 9");
        final EditText nombre10 = new EditText(this);
        nombre10.setHint("Jugador 10");
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
                avisoPrincipio();
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

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
            alertdialog.setTitle("Cambiar a Jodete");
            alertdialog.setMessage("El jodete es un juego similar al uno con pequeños cambios en las reglas");
            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent j=new Intent(Uno.this,Jodete.class);
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
            layout.addView(et1);
            layout.addView(et2);
            arrayEt[0]=et1;
            arrayEt[1]=et2;
        }
        else if(jugadores==3){
            layout.addView(et1);
            layout.addView(et2);
            layout.addView(et3);
            arrayEt[0]=et1;
            arrayEt[1]=et2;
            arrayEt[2]=et3;
        }
        else if(jugadores==4){
            layout.addView(et1);
            layout.addView(et2);
            layout.addView(et3);
            layout.addView(et4);
            arrayEt[0]=et1;
            arrayEt[1]=et2;
            arrayEt[2]=et3;
            arrayEt[3]=et4;
        }
        else if(jugadores==5){
            layout.addView(et1);
            layout.addView(et2);
            layout.addView(et3);
            layout.addView(et4);
            layout.addView(et5);
            arrayEt[0]=et1;
            arrayEt[1]=et2;
            arrayEt[2]=et3;
            arrayEt[3]=et4;
            arrayEt[4]=et5;
        }
        else if(jugadores==6){
            layout.addView(et1);
            layout.addView(et2);
            layout.addView(et3);
            layout.addView(et4);
            layout.addView(et5);
            layout.addView(et6);
            arrayEt[0]=et1;
            arrayEt[1]=et2;
            arrayEt[2]=et3;
            arrayEt[3]=et4;
            arrayEt[4]=et5;
            arrayEt[5]=et6;
        }
        else if(jugadores==7){
            layout.addView(et1);
            layout.addView(et2);
            layout.addView(et3);
            layout.addView(et4);
            layout.addView(et5);
            layout.addView(et6);
            layout.addView(et7);
            arrayEt[0]=et1;
            arrayEt[1]=et2;
            arrayEt[2]=et3;
            arrayEt[3]=et4;
            arrayEt[4]=et5;
            arrayEt[5]=et6;
            arrayEt[6]=et7;
        }
        else if(jugadores==8){
            layout.addView(et1);
            layout.addView(et2);
            layout.addView(et3);
            layout.addView(et4);
            layout.addView(et5);
            layout.addView(et6);
            layout.addView(et7);
            layout.addView(et8);
            arrayEt[0]=et1;
            arrayEt[1]=et2;
            arrayEt[2]=et3;
            arrayEt[3]=et4;
            arrayEt[4]=et5;
            arrayEt[5]=et6;
            arrayEt[6]=et7;
            arrayEt[7]=et8;
        }
        else if(jugadores==9){
            layout.addView(et1);
            layout.addView(et2);
            layout.addView(et3);
            layout.addView(et4);
            layout.addView(et5);
            layout.addView(et6);
            layout.addView(et7);
            layout.addView(et8);
            layout.addView(et9);
            arrayEt[0]=et1;
            arrayEt[1]=et2;
            arrayEt[2]=et3;
            arrayEt[3]=et4;
            arrayEt[4]=et5;
            arrayEt[5]=et6;
            arrayEt[6]=et7;
            arrayEt[7]=et8;
            arrayEt[8]=et9;
        }
        else if(jugadores==10){
            layout.addView(et1);
            layout.addView(et2);
            layout.addView(et3);
            layout.addView(et4);
            layout.addView(et5);
            layout.addView(et6);
            layout.addView(et7);
            layout.addView(et8);
            layout.addView(et9);
            layout.addView(et10);
            arrayEt[0]=et1;
            arrayEt[1]=et2;
            arrayEt[2]=et3;
            arrayEt[3]=et4;
            arrayEt[4]=et5;
            arrayEt[5]=et6;
            arrayEt[6]=et7;
            arrayEt[7]=et8;
            arrayEt[8]=et9;
            arrayEt[9]=et10;
        }
        alertidalog.setView(layout);
        alertidalog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                for (int j = 0; j <jugadores ; j++) {
                    if(!arrayEt[j].getText().toString().equals(""))
                        sumatoria+=(Integer.parseInt(arrayEt[j].getText().toString()));
                    else {
                        Toast.makeText(Uno.this, "Ingresar puntaje de todos los jugadores", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                if(ch1.isChecked()){
                    sumarPuntos(sumatoria,jugador1,resultado1);
                }
                else if(ch2.isChecked()){
                    sumarPuntos(sumatoria,jugador2,resultado2);
                }
                else if(ch3.isChecked()){
                    sumarPuntos(sumatoria,jugador3,resultado3);
                }
                else if(ch4.isChecked()){
                    sumarPuntos(sumatoria,jugador4,resultado4);
                }
                else if(ch5.isChecked()){
                    sumarPuntos(sumatoria,jugador5,resultado5);
                }
                else if(ch6.isChecked()){
                    sumarPuntos(sumatoria,jugador6,resultado6);
                }
                else if(ch7.isChecked()){
                    sumarPuntos(sumatoria,jugador7,resultado7);
                }
                else if(ch8.isChecked()){
                    sumarPuntos(sumatoria,jugador8,resultado8);
                }
                else if(ch9.isChecked()){
                    sumarPuntos(sumatoria,jugador9,resultado9);
                }
                else if(ch10.isChecked()){
                    sumarPuntos(sumatoria,jugador10,resultado10);
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
                if(jugador.getPuntos()<500){
                    jugador.sumarPuntos(puntos);
                    puntaje.setText(String.valueOf(jugador.getPuntos()));
                }
                if(jugador.getPuntos()>=500){
                    puntaje.setTextColor(getResources().getColor(R.color.verde));
                    Toast.makeText(this, "Ganador: "+jugador.getNombre(), Toast.LENGTH_SHORT).show();
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

