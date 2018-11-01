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
import android.widget.TableLayout;
import android.widget.TableRow;
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
        textView1.setVisibility(View.INVISIBLE);
        textView2=findViewById(R.id.textView2);
        textView2.setVisibility(View.INVISIBLE);
        textView3=findViewById(R.id.textView3);
        textView3.setVisibility(View.INVISIBLE);
        textView4=findViewById(R.id.textView4);
        textView4.setVisibility(View.INVISIBLE);
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
        textView17=findViewById(R.id.textView17);
        textView17.setVisibility(View.INVISIBLE);
        textView18=findViewById(R.id.textView18);
        textView18.setVisibility(View.INVISIBLE);
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
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
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

    public void organizarManos(int jug1,int jug2,int jug3){
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
    public void organizarPuntajes(TextView parcial,TextView total,Jugador jugador,int puntaje){
        parcial.setVisibility(View.VISIBLE);
        if(jugador.getPuntos()<15){
            jugador.sumarPuntos(puntaje);
            parcial.setText(String.valueOf(puntaje));
            total.setText(String.valueOf(jugador.getPuntos()));
        }
        if(jugador.getPuntos()>=15){
            jugador.setPuntos(15);
            Toast.makeText(this, "Partido Finalizado, Ganador: "+jugador.getNombre(), Toast.LENGTH_SHORT).show();
        }

    }

    public void reiniciarMarcador(TextView parcial,TextView total,Jugador jugador){
        jugador.setPuntos(0);
        parcial.setText(R.string.Puntaje_en_0);
        parcial.setVisibility(View.INVISIBLE);
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

    public void elegirPuntajes(View vista){
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setTitle("Ingresar Puntajes");
        alertdialog.setMessage("Seleccionar el ganador de cada jugada");

        TableLayout tabla= new TableLayout(this);


        TableRow rowEscobas=new TableRow(this);
        final TextView txtEscobas=new TextView(this);
        txtEscobas.setText(R.string.Escobas);
        txtEscobas.setTextSize(18);
        txtEscobas.setTextColor(getResources().getColor(R.color.Negro));
        rowEscobas.addView(txtEscobas);
        tabla.addView(rowEscobas);


        TableRow row1 =new TableRow(this);
        final EditText escobas1=new EditText(this);
        escobas1.setHint(jugador1.getNombre()+"(0)");
        escobas1.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText escobas2=new EditText(this);
        escobas2.setHint(jugador2.getNombre()+"(0)");
        escobas2.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText escobas3=new EditText(this);
        escobas3.setHint(jugador3.getNombre()+"(0)");
        escobas3.setInputType(InputType.TYPE_CLASS_NUMBER);
        row1.addView(escobas1);
        row1.addView(escobas2);
        row1.addView(escobas3);
        tabla.addView(row1);

        TableRow rowSieteOro=new TableRow(this);
        final TextView txtSieteOro=new TextView(this);
        txtSieteOro.setText(R.string.Siete_de_Oro);
        txtSieteOro.setTextSize(18);
        txtSieteOro.setTextColor(getResources().getColor(R.color.Negro));
        rowSieteOro.addView(txtSieteOro);
        tabla.addView(rowSieteOro);


        TableRow row2=new TableRow(this);
        final CheckBox sieteOroJug1=new CheckBox(this);
        sieteOroJug1.setText(jugador1.getNombre());
        final CheckBox sieteOroJug2=new CheckBox(this);
        sieteOroJug2.setText(jugador2.getNombre());
        final CheckBox sieteOroJug3=new CheckBox(this);
        sieteOroJug3.setText(jugador3.getNombre());
        row2.addView(sieteOroJug1);
        row2.addView(sieteOroJug2);
        row2.addView(sieteOroJug3);
        tabla.addView(row2);

        TableRow rowSetenta=new TableRow(this);
        final TextView txtSetenta=new TextView(this);
        txtSetenta.setText(R.string.Setenta);
        txtSetenta.setTextSize(18);
        txtSetenta.setTextColor(getResources().getColor(R.color.Negro));
        rowSetenta.addView(txtSetenta);
        tabla.addView(rowSetenta);


        TableRow row3=new TableRow(this);
        final CheckBox setentaJug1=new CheckBox(this);
        setentaJug1.setText(jugador1.getNombre());
        final CheckBox setentaJug2=new CheckBox(this);
        setentaJug2.setText(jugador2.getNombre());
        final CheckBox setentaJug3=new CheckBox(this);
        setentaJug3.setText(jugador3.getNombre());
        row3.addView(setentaJug1);
        row3.addView(setentaJug2);
        row3.addView(setentaJug3);
        tabla.addView(row3);

        TableRow rowCartas=new TableRow(this);
        final TextView txtCartas=new TextView(this);
        txtCartas.setText(R.string.Cartas);
        txtCartas.setTextSize(18);
        txtCartas.setTextColor(getResources().getColor(R.color.Negro));
        rowCartas.addView(txtCartas);
        tabla.addView(rowCartas);


        TableRow row4=new TableRow(this);
        final CheckBox cartasJug1=new CheckBox(this);
        cartasJug1.setText(jugador1.getNombre());
        final CheckBox cartasJug2=new CheckBox(this);
        cartasJug2.setText(jugador2.getNombre());
        final CheckBox cartasJug3=new CheckBox(this);
        cartasJug3.setText(jugador3.getNombre());
        row4.addView(cartasJug1);
        row4.addView(cartasJug2);
        row4.addView(cartasJug3);
        tabla.addView(row4);


        TableRow rowOros=new TableRow(this);
        final TextView txtOros=new TextView(this);
        txtOros.setText(R.string.Oros);
        txtOros.setTextSize(18);
        txtOros.setTextColor(getResources().getColor(R.color.Negro));
        rowOros.addView(txtOros);
        tabla.addView(rowOros);


        TableRow row5=new TableRow(this);
        final CheckBox orosJug1=new CheckBox(this);
        orosJug1.setText(jugador1.getNombre());
        final CheckBox orosJug2=new CheckBox(this);
        orosJug2.setText(jugador2.getNombre());
        final CheckBox orosJug3=new CheckBox(this);
        orosJug3.setText(jugador3.getNombre());
        row5.addView(orosJug1);
        row5.addView(orosJug2);
        row5.addView(orosJug3);
        tabla.addView(row5);


        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int sumatoriaUno=0,sumatoriaDos=0,sumatoriaTres=0,escobasJug1,escobasJug2,escobasJug3;
                if(escobas1.getText().toString().equals("")){
                    escobasJug1=0;
                }
                else{
                    escobasJug1=Integer.parseInt(escobas1.getText().toString());

                }
                if(escobas2.getText().toString().equals("")){
                    escobasJug2=0;
                }
                else{
                    escobasJug2=Integer.parseInt(escobas2.getText().toString());

                }
                if(escobas3.getText().toString().equals("")){
                    escobasJug3=0;
                }
                else{
                    escobasJug3=Integer.parseInt(escobas3.getText().toString());

                }
                sumatoriaUno+=escobasJug1;
                sumatoriaDos+=escobasJug2;
                sumatoriaTres+=escobasJug3;
                if(sieteOroJug1.isChecked()){
                    if(!sieteOroJug2.isChecked()&&!sieteOroJug3.isChecked())
                        sumatoriaUno++;
                }
                if (sieteOroJug2.isChecked()){
                    if(!sieteOroJug1.isChecked()&&!sieteOroJug3.isChecked())
                        sumatoriaDos++;
                }
                if (sieteOroJug3.isChecked()){
                    if(!sieteOroJug1.isChecked()&&!sieteOroJug2.isChecked())
                        sumatoriaTres ++;
                }
                if(setentaJug1.isChecked()){
                    if(!setentaJug2.isChecked()&&!setentaJug3.isChecked())
                        sumatoriaUno++;
                }
                if(setentaJug2.isChecked()){
                    if(!setentaJug1.isChecked()&&!setentaJug3.isChecked())
                        sumatoriaDos++;
                }
                if(setentaJug3.isChecked()){
                    if(!setentaJug1.isChecked()&&!setentaJug2.isChecked())
                        sumatoriaTres++;
                }
                if(cartasJug1.isChecked()){
                    if(!cartasJug2.isChecked()&&!cartasJug3.isChecked())
                        sumatoriaUno++;
                }
                if(cartasJug2.isChecked()){
                    if(!cartasJug1.isChecked()&&!cartasJug3.isChecked())
                        sumatoriaDos++;
                }
                if(cartasJug3.isChecked()){
                    if(!cartasJug1.isChecked()&&!cartasJug2.isChecked())
                        sumatoriaTres++;
                }
                if(orosJug1.isChecked()){
                    if(!orosJug2.isChecked()&&!orosJug3.isChecked())
                        sumatoriaUno++;
                }
                if(orosJug2.isChecked()){
                    if(!orosJug1 .isChecked()&&!orosJug3.isChecked())
                        sumatoriaDos++;
                }
                if(orosJug3.isChecked()){
                    if(!orosJug1 .isChecked()&&!orosJug2.isChecked())
                        sumatoriaTres++;
                }
                organizarManos(sumatoriaUno,sumatoriaDos,sumatoriaTres);

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
