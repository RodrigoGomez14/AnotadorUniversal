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

public class Chorizo extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private TextView equipo1,equipo2,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,total1,total2;
    private int cuentaManos;
    private int extras1,extras2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chorizo);
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
        cuentaManos=0;
        extras1=0;
        extras2=0;
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
    public void organizarManos(int jug1,int jug2){
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

    }


    public void organizarPuntajes(TextView parcial,TextView total,Jugador jugador,int puntaje){
        parcial.setVisibility(View.VISIBLE);
        if(jugador.getPuntos()<50){
            jugador.sumarPuntos(puntaje);
            parcial.setText(String.valueOf(puntaje));
            total.setText(String.valueOf(jugador.getPuntos()));
        }
        if(jugador.getPuntos()>=50){
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
        getMenuInflater().inflate(R.menu.menu_chorizo,menu);
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
                    Intent j = new Intent(Chorizo.this,configuracionEscoba.class);
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
        if(id==R.id.PuntosExtra){
            AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
            alertdialog.setTitle("Agregar Jugada");

            TableLayout tabla = new TableLayout(this);


            TableRow row1=new TableRow(this);
            RadioGroup grupoJugadores=new RadioGroup(this);
            grupoJugadores.setOrientation(LinearLayout.HORIZONTAL);
            final RadioButton jug1=new RadioButton(this);
            jug1.setText(jugador1.getNombre());
            final RadioButton jug2=new RadioButton(this);
            jug2.setText(jugador2.getNombre());
            grupoJugadores.addView(jug1);
            grupoJugadores.addView(jug2);
            row1.addView(grupoJugadores);
            tabla.addView(row1);

            TableRow row2 = new TableRow(this);
            RadioGroup grupo1=new RadioGroup(this);
            grupo1.setOrientation(LinearLayout.VERTICAL);
            final RadioButton tresDelNueve1=new RadioButton(this);
            tresDelNueve1.setText(R.string.TresDelNueve);
            final RadioButton dosDelSiete1=new RadioButton(this);
            dosDelSiete1.setText(R.string.DosdelSiete);
            final RadioButton escalera1=new RadioButton(this);
            escalera1.setText(R.string.Escalera3);
            final RadioButton flor1=new RadioButton(this);
            flor1.setText(R.string.flor);
            final RadioButton chorizo1= new RadioButton(this);
            chorizo1.setText(R.string.ChorizoJugada);

            grupo1.addView(tresDelNueve1);
            grupo1.addView(dosDelSiete1);
            grupo1.addView(escalera1);
            grupo1.addView(flor1);
            grupo1.addView(chorizo1);
            row2.addView(grupo1);
            tabla.addView(row2);

            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if(jug1.isChecked()){
                        if(tresDelNueve1.isChecked()){
                            extras1+=3;
                        }
                        else if(dosDelSiete1.isChecked()){
                            extras1+=2;
                        }
                        else if(escalera1.isChecked()){
                            extras1+=3;
                        }
                        else if(flor1.isChecked()){
                            extras1+=3;
                        }
                        else if (chorizo1.isChecked()){
                            extras1+=10;
                        }
                    }
                    if(jug2.isChecked()){
                        if(tresDelNueve1.isChecked()){
                            extras2+=3;
                        }
                        else if(dosDelSiete1.isChecked()){
                            extras2+=2;
                        }
                        else if(escalera1.isChecked()){
                            extras2+=3;
                        }
                        else if(flor1.isChecked()){
                            extras2+=3;
                        }
                        else if (chorizo1.isChecked()){
                            extras2+=10;
                        }
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

        return super.onOptionsItemSelected(item);
    }
    public void reiniciarMarcador(TextView parcial,TextView total,Jugador jugador){
        jugador.setPuntos(0);
        parcial.setText(R.string.Puntaje_en_0);
        parcial.setVisibility(View.INVISIBLE);
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
        extras1=0;
        extras2=0;

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
        row1.addView(escobas1);
        row1.addView(escobas2);
        tabla.addView(row1);

        TableRow rowSieteOro=new TableRow(this);
        final TextView txtSieteOro=new TextView(this);
        txtSieteOro.setText(R.string.Siete_de_Oro);
        txtSieteOro.setTextSize(18);
        txtSieteOro.setTextColor(getResources().getColor(R.color.Negro));
        rowSieteOro.addView(txtSieteOro);
        tabla.addView(rowSieteOro);

        TableRow rowDoceOro=new TableRow(this);
        final TextView txtDoceOro=new TextView(this);
        txtDoceOro.setText(R.string.DocedeOro);
        txtDoceOro.setTextSize(18);
        txtDoceOro.setTextColor(getResources().getColor(R.color.Negro));
        rowDoceOro.addView(txtDoceOro);
        tabla.addView(rowDoceOro);


        TableRow row6=new TableRow(this);
        final CheckBox doceUno=new CheckBox(this);
        doceUno.setText(jugador1.getNombre());
        final CheckBox doceDos=new CheckBox(this);
        doceDos.setText(jugador2.getNombre());
        row6.addView(doceUno);
        row6.addView(doceDos);
        tabla.addView(row6);

        TableRow row2=new TableRow(this);
        final CheckBox sieteOroJug1=new CheckBox(this);
        sieteOroJug1.setText(jugador1.getNombre());
        final CheckBox sieteOroJug2=new CheckBox(this);
        sieteOroJug2.setText(jugador2.getNombre());
        row2.addView(sieteOroJug1);
        row2.addView(sieteOroJug2);
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
        row3.addView(setentaJug1);
        row3.addView(setentaJug2);
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
        row4.addView(cartasJug1);
        row4.addView(cartasJug2);
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
        row5.addView(orosJug1);
        row5.addView(orosJug2);
        tabla.addView(row5);

        TableRow rowExtras=new TableRow(this);
        final TextView txtExtras=new TextView(this);
        txtExtras.setText(R.string.extras);
        txtExtras.setTextSize(18);
        txtExtras.setTextColor(getResources().getColor(R.color.Negro));
        rowExtras.addView(txtExtras);
        tabla.addView(rowExtras);


        TableRow row7=new TableRow(this);
        final TextView extrasJug1=new TextView(this);
        extrasJug1.setText(String.valueOf(extras1));
        extrasJug1.setTextSize(18);
        extrasJug1.setTextColor(getResources().getColor(R.color.Negro));
        final TextView extrasJUg2=new TextView(this);
        extrasJUg2.setTextSize(18);
        extrasJUg2.setTextColor(getResources().getColor(R.color.Negro));
        extrasJUg2.setText(String.valueOf(extras2));
        row7.addView(extrasJug1);
        row7.addView(extrasJUg2);
        tabla.addView(row7);


        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int sumatoriaUno=0,sumatoriaDos=0,escobasJug1,escobasJug2;
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
                sumatoriaUno+=escobasJug1;
                sumatoriaDos+=escobasJug2;
                if(sieteOroJug1.isChecked()){
                    if(!sieteOroJug2.isChecked())
                        sumatoriaUno+=2;
                }
                if (sieteOroJug2.isChecked()){
                    if(!sieteOroJug1.isChecked())
                        sumatoriaDos+=2;
                }
                if(setentaJug1.isChecked()){
                    if(!setentaJug2.isChecked())
                        sumatoriaUno++;
                }
                else if(setentaJug2.isChecked()){
                    if(!setentaJug1.isChecked())
                        sumatoriaDos++;
                }
                if(cartasJug1.isChecked()){
                    if(!cartasJug2.isChecked())
                        sumatoriaUno++;
                }
                else if(cartasJug2.isChecked()){
                    if(!cartasJug1.isChecked())
                        sumatoriaDos++;
                }
                if(orosJug1.isChecked()){
                    if(!orosJug2.isChecked())
                        sumatoriaUno++;
                }
                else if(orosJug2.isChecked()){
                    if(!orosJug1 .isChecked())
                        sumatoriaDos++;
                }
                if(doceUno.isChecked()){
                    if(!doceDos.isChecked()){
                        sumatoriaUno++;
                    }
                }
                else if(doceDos.isChecked()){
                    if(!doceUno.isChecked()){
                        sumatoriaDos++;
                    }
                }
                sumatoriaUno+=Integer.parseInt(extrasJug1.getText().toString());
                sumatoriaDos+=Integer.parseInt(extrasJUg2.getText().toString());
                organizarManos(sumatoriaUno,sumatoriaDos);
                extras1=0;
                extras2=0;
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
