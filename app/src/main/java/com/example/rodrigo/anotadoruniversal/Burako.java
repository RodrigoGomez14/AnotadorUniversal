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
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


public class Burako extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private TextView equipo1,equipo2,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,total1,total2;
    private int cuentaManos1,cuentaManos2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burako);
        jugador1=new Jugador(0);
        jugador1.setNombre("Jugador 1");
        jugador2=new Jugador(0);
        jugador2.setNombre("Jugador 2");
        equipo1=findViewById(R.id.equipo1);
        equipo2=findViewById(R.id.equipo2);
        textView5=findViewById(R.id.textView5);
        textView5.setVisibility(View.INVISIBLE);
        textView6=findViewById(R.id.textView6);
        textView6.setVisibility(View.INVISIBLE);
        textView7=findViewById(R.id.textView7);
        textView7.setVisibility(View.INVISIBLE);
        textView8=findViewById(R.id.textView8);
        textView8.setVisibility(View.INVISIBLE);
        textView9=findViewById(R.id.textView9);
        textView9.setVisibility(View.INVISIBLE);
        textView10=findViewById(R.id.textView10);
        textView10.setVisibility(View.INVISIBLE);
        textView11=findViewById(R.id.textView11);
        textView11.setVisibility(View.INVISIBLE);
        textView12=findViewById(R.id.textView12);
        textView12.setVisibility(View.INVISIBLE);
        textView13=findViewById(R.id.textView13);
        textView13.setVisibility(View.INVISIBLE);
        textView14=findViewById(R.id.textView14);
        textView14.setVisibility(View.INVISIBLE);
        textView15=findViewById(R.id.textView15);
        textView15.setVisibility(View.INVISIBLE);
        textView16=findViewById(R.id.textView16);
        textView16.setVisibility(View.INVISIBLE);
        total1=findViewById(R.id.total1);
        total2=findViewById(R.id.total2);
        cuentaManos1=0;
        cuentaManos2=0;
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
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
                    e.printStackTrace();
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
    public void organizarManos1(int jug1){
        switch (cuentaManos1){
            case 0:
                organizarPuntajes(textView5,total1,jugador1,jug1);
                cuentaManos1++;
                break;
            case 1:
                organizarPuntajes(textView7,total1,jugador1,jug1);
                cuentaManos1++;
                break;
            case 2:
                organizarPuntajes(textView9,total1,jugador1,jug1);
                cuentaManos1++;
                break;
            case 3:
                organizarPuntajes(textView11,total1,jugador1,jug1);
                cuentaManos1++;
                break;
            case 4:
                organizarPuntajes(textView13,total1,jugador1,jug1);
                cuentaManos1++;
                break;
            case 5:
                organizarPuntajes(textView15,total1,jugador1,jug1);
                cuentaManos1++;
                break;
        }


    }
    public void organizarManos2(int jug2){
        switch (cuentaManos2){
            case 0:
                organizarPuntajes(textView6,total2,jugador2,jug2);
                cuentaManos2++;
                break;
            case 1:
                organizarPuntajes(textView8,total2,jugador2,jug2);
                cuentaManos2++;
                break;
            case 2:
                organizarPuntajes(textView10,total2,jugador2,jug2);
                cuentaManos2++;
                break;
            case 3:
                organizarPuntajes(textView12,total2,jugador2,jug2);
                cuentaManos2++;
                break;
            case 4:
                organizarPuntajes(textView14,total2,jugador2,jug2);
                cuentaManos2++;
                break;
            case 5:
                organizarPuntajes(textView16,total2,jugador2,jug2);
                cuentaManos2++;
                break;
        }


    }


    public void organizarPuntajes(TextView parcial,TextView total,Jugador jugador,int puntaje){
        parcial.setVisibility(View.VISIBLE);
        if(jugador.getPuntos()<3000){
            jugador.sumarPuntos(puntaje);
            parcial.setText(String.valueOf(puntaje));
            total.setText(String.valueOf(jugador.getPuntos()));
        }
        if(jugador.getPuntos()>=3000){
            Toast.makeText(this, "Partido Terminado, Ganador: "+jugador.getNombre(), Toast.LENGTH_SHORT).show();
        }
    }

    public void cambiarNombre(EditText nombre,TextView equipo,Jugador Jugador){
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
                    reiniciarPartido();
                    cuentaManos1=0;
                    jugador1.setPuntos(0);
                    cuentaManos2=0;
                    jugador1.setPuntos(0);
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
    public void reiniciarMarcador(TextView parcial,TextView total){
        parcial.setText(R.string.Puntaje_en_0);
        parcial.setVisibility(View.INVISIBLE);
        total.setText(R.string.Puntaje_en_0);

    }
    public void reiniciarPartido(){
        reiniciarMarcador(textView5,total1);
        reiniciarMarcador(textView6,total2);
        reiniciarMarcador(textView7,total1);
        reiniciarMarcador(textView8,total2);
        reiniciarMarcador(textView9,total1);
        reiniciarMarcador(textView10,total2);
        reiniciarMarcador(textView11,total1);
        reiniciarMarcador(textView12,total2);
        reiniciarMarcador(textView13,total1);
        reiniciarMarcador(textView14,total2);
        reiniciarMarcador(textView15,total1);
        reiniciarMarcador(textView16,total2);

    }


    public void apretarBoton(View vista){
        elegirPuntajes(jugador1);
    }


    public void elegirPuntajes(Jugador jugador){
        final Jugador jug=jugador;
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setTitle("Ingresar Puntajes");
        alertdialog.setMessage("Seleccionar el ganador de cada jugada");

        TableLayout tabla= new TableLayout(this);


        TableRow rowJugador=new TableRow(this);
        TextView txtJugador=new TextView(this);
        txtJugador.setText(jug.getNombre());
        txtJugador.setTextSize(18);
        txtJugador.setTextColor(getResources().getColor(R.color.Negro));
        txtJugador.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        rowJugador.addView(txtJugador);
        tabla.addView(rowJugador);


        TableRow row1 =new TableRow(this);
        final EditText canastasInpuras=new EditText(this);
        canastasInpuras.setHint("Inpuras (0)");
        canastasInpuras.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText canastasPuras=new EditText(this);
        canastasPuras.setHint("Puras (0)");
        canastasPuras.setInputType(InputType.TYPE_CLASS_NUMBER);
        final TextView txtCanastas=new TextView(this);
        txtCanastas.setText("Canastas");
        txtCanastas.setTextSize(18);
        txtCanastas.setTextColor(getResources().getColor(R.color.Negro));
        txtCanastas.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row1.addView(txtCanastas);
        row1.addView(canastasInpuras);
        row1.addView(canastasPuras);
        tabla.addView(row1);

        TableRow row2 = new TableRow(this);
        RadioGroup grupo = new RadioGroup(this);
        grupo.setOrientation(LinearLayout.HORIZONTAL);
        final RadioButton resta = new RadioButton(this);
        resta.setText("-100");
        final RadioButton suma = new RadioButton(this);
        suma.setText("+100");
        TextView txtMuerto=new TextView(this);
        txtMuerto.setText("Muerto");
        txtMuerto.setTextSize(18);
        txtMuerto.setTextColor(getResources().getColor(R.color.Negro));
        txtMuerto.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        grupo.addView(suma);
        grupo.addView(resta);
        row2.addView(txtMuerto);
        row2.addView(grupo);
        tabla.addView(row2);

        TableRow row3=new TableRow(this);
        TextView txtCorte=new TextView(this);
        txtCorte.setText("Corte");
        txtCorte.setTextSize(18);
        txtCorte.setTextColor(getResources().getColor(R.color.Negro));
        txtCorte.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        final CheckBox corto=new CheckBox(this);
        row3.addView(txtCorte);
        row3.addView(corto);
        tabla.addView(row3);

        TableRow row4=new TableRow(this);
        TextView txtAtril=new TextView(this);
        txtAtril.setText("Atril");
        txtAtril.setTextSize(18);
        txtAtril.setTextColor(getResources().getColor(R.color.Negro));
        txtAtril.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        final EditText puntosAtril= new EditText(this);
        puntosAtril.setInputType(InputType.TYPE_CLASS_NUMBER);
        puntosAtril.setHint("Puntos a descontar (0)");
        row4.addView(txtAtril);
        row4.addView(puntosAtril);
        tabla.addView(row4);

        TableRow row5=new TableRow(this);
        TextView txtMesa=new TextView(this);
        txtMesa.setText("Mesa");
        txtMesa.setTextSize(18);
        txtMesa.setTextColor(getResources().getColor(R.color.Negro));
        txtMesa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        final EditText puntosMesa= new EditText(this);
        puntosMesa.setInputType(InputType.TYPE_CLASS_NUMBER);
        puntosMesa.setHint("Puntos a sumar ");
        row5.addView(txtMesa);
        row5.addView(puntosMesa);
        tabla.addView(row5);


        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int sumatoria=0;
                int inpuras,puras,atril,mesa;
                if(canastasInpuras.getText().toString().equals("")){
                    inpuras=0;
                }
                else {
                    inpuras=Integer.parseInt(canastasInpuras.getText().toString());
                }
                if(canastasPuras.getText().toString().equals("")){
                    puras=0;
                }
                else{
                    puras=Integer.parseInt(canastasPuras.getText().toString());
                }
                sumatoria+=(100*inpuras);
                sumatoria+=(200*puras);

                if(suma.isChecked()){
                    sumatoria+=100;
                }
                else if(resta.isChecked()){
                    sumatoria-=100;
                }
                if(corto.isChecked()){
                    sumatoria+=100;
                }

                if(puntosAtril.getText().toString().equals("")){
                    atril=0;
                }
                else {
                    atril=Integer.parseInt(puntosAtril.getText().toString());
                }

                if(puntosMesa.getText().toString().equals("")){
                    mesa=0;
                }
                else {
                    mesa=Integer.parseInt(puntosMesa.getText().toString());
                }
                sumatoria+=mesa;
                sumatoria-=atril;

                if(jug.equals(jugador1)){
                    organizarManos1(sumatoria);
                    elegirPuntajes(jugador2);
                }
                else if(jug.equals(jugador2)){
                    organizarManos2(sumatoria);
                }
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });




        alertdialog.setView(tabla);
        alertdialog.create().show();

    }





}
