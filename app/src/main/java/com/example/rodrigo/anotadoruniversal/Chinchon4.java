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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Chinchon4 extends AppCompatActivity {
    private TextView juguno,jugdos,jugtres,jugcuatro;
    private TextView textView30,textView31,textView32,textView33,textView34,textView35,textView36,textView37,textView38,textView39,textView40,textView41,textView42,textView43,textView44,textView45,textView46,
    textView47,textView48,textView49,textView50,textView51,textView52,textView53,textView54,textView55,textView56,textView57,textView58,textView59,textView60,textView61,textView62,textView63,textView64,textView65,
    textView66,textView67,textView68,textView69,textView70,textView71,textView72,textView73,textView74,textView75,textView76,textView77,textView78,textView79,textView80,textView81,textView82,textView83,textView84,
    textView85,total1,total2,total3,total4;
    private Jugador jugador1,jugador2,jugador3,jugador4;
    private int cuentamanos;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinchon4_activity);
        juguno=findViewById(R.id.juguno);
        jugdos=findViewById(R.id.jugdos);
        jugtres=findViewById(R.id.jugtres);
        jugcuatro=findViewById(R.id.jugcuatro);
        jugador1=new Jugador(0);
        jugador1.setNombre("Jugador 1");
        jugador2=new Jugador(0);
        jugador2.setNombre("Jugador 2");
        jugador3=new Jugador(0);
        jugador3.setNombre("Jugador 3");
        jugador4=new Jugador(0);
        jugador4.setNombre("Jugador 4");
        cuentamanos-=0;
        textView30=findViewById(R.id.textView30);
        textView30.setVisibility(View.INVISIBLE);
        textView31=findViewById(R.id.textView31);
        textView31.setVisibility(View.INVISIBLE);
        textView32=findViewById(R.id.textView32);
        textView32.setVisibility(View.INVISIBLE);
        textView33=findViewById(R.id.textView33);
        textView33.setVisibility(View.INVISIBLE);
        textView34=findViewById(R.id.textView34);
        textView34.setVisibility(View.INVISIBLE);
        textView35=findViewById(R.id.textView35);
        textView35.setVisibility(View.INVISIBLE);
        textView36=findViewById(R.id.textView36);
        textView36.setVisibility(View.INVISIBLE);
        textView37=findViewById(R.id.textView37);
        textView37.setVisibility(View.INVISIBLE);
        textView38=findViewById(R.id.textView38);
        textView38.setVisibility(View.INVISIBLE);
        textView39=findViewById(R.id.textView39);
        textView39.setVisibility(View.INVISIBLE);
        textView40=findViewById(R.id.textView40);
        textView40.setVisibility(View.INVISIBLE);
        textView41=findViewById(R.id.textView41);
        textView41.setVisibility(View.INVISIBLE);
        textView42=findViewById(R.id.textView42);
        textView42.setVisibility(View.INVISIBLE);
        textView43=findViewById(R.id.textView43);
        textView43.setVisibility(View.INVISIBLE);
        textView44=findViewById(R.id.textView44);
        textView44.setVisibility(View.INVISIBLE);
        textView45=findViewById(R.id.textView45);
        textView45.setVisibility(View.INVISIBLE);
        textView46=findViewById(R.id.textView46);
        textView46.setVisibility(View.INVISIBLE);
        textView47=findViewById(R.id.textView47);
        textView47.setVisibility(View.INVISIBLE);
        textView48=findViewById(R.id.textView48);
        textView48.setVisibility(View.INVISIBLE);
        textView49=findViewById(R.id.textView49);
        textView49.setVisibility(View.INVISIBLE);
        textView50=findViewById(R.id.textView50);
        textView50.setVisibility(View.INVISIBLE);
        textView51=findViewById(R.id.textView51);
        textView51.setVisibility(View.INVISIBLE);
        textView52=findViewById(R.id.textView52);
        textView52.setVisibility(View.INVISIBLE);
        textView53=findViewById(R.id.textView53);
        textView53.setVisibility(View.INVISIBLE);
        textView54=findViewById(R.id.textView54);
        textView54.setVisibility(View.INVISIBLE);
        textView55=findViewById(R.id.textView55);
        textView55.setVisibility(View.INVISIBLE);
        textView56=findViewById(R.id.textView56);
        textView56.setVisibility(View.INVISIBLE);
        textView57=findViewById(R.id.textView57);
        textView57.setVisibility(View.INVISIBLE);
        textView58=findViewById(R.id.textView58);
        textView58.setVisibility(View.INVISIBLE);
        textView59=findViewById(R.id.textView59);
        textView59.setVisibility(View.INVISIBLE);
        textView60=findViewById(R.id.textView60);
        textView60.setVisibility(View.INVISIBLE);
        textView61=findViewById(R.id.textView61);
        textView61.setVisibility(View.INVISIBLE);
        textView62=findViewById(R.id.textView62);
        textView62.setVisibility(View.INVISIBLE);
        textView63=findViewById(R.id.textView63);
        textView63.setVisibility(View.INVISIBLE);
        textView64=findViewById(R.id.textView64);
        textView64.setVisibility(View.INVISIBLE);
        textView65=findViewById(R.id.textView65);
        textView65.setVisibility(View.INVISIBLE);
        textView66=findViewById(R.id.textView66);
        textView66.setVisibility(View.INVISIBLE);
        textView67=findViewById(R.id.textView67);
        textView67.setVisibility(View.INVISIBLE);
        textView68=findViewById(R.id.textView68);
        textView68.setVisibility(View.INVISIBLE);
        textView69=findViewById(R.id.textView69);
        textView69.setVisibility(View.INVISIBLE);
        textView70=findViewById(R.id.textView70);
        textView70.setVisibility(View.INVISIBLE);
        textView71=findViewById(R.id.textView71);
        textView71.setVisibility(View.INVISIBLE);
        textView72=findViewById(R.id.textView72);
        textView72.setVisibility(View.INVISIBLE);
        textView73=findViewById(R.id.textView73);
        textView73.setVisibility(View.INVISIBLE);
        textView74=findViewById(R.id.textView74);
        textView74.setVisibility(View.INVISIBLE);
        textView75=findViewById(R.id.textView75);
        textView75.setVisibility(View.INVISIBLE);
        textView76=findViewById(R.id.textView76);
        textView76.setVisibility(View.INVISIBLE);
        textView77=findViewById(R.id.textView77);
        textView77.setVisibility(View.INVISIBLE);
        textView78=findViewById(R.id.textView78);
        textView78.setVisibility(View.INVISIBLE);
        textView79=findViewById(R.id.textView79);
        textView79.setVisibility(View.INVISIBLE);
        textView80=findViewById(R.id.textView80);
        textView80.setVisibility(View.INVISIBLE);
        textView81=findViewById(R.id.textView81);
        textView81.setVisibility(View.INVISIBLE);
        textView82=findViewById(R.id.textView82);
        textView82.setVisibility(View.INVISIBLE);
        textView83=findViewById(R.id.textView83);
        textView83.setVisibility(View.INVISIBLE);
        textView84=findViewById(R.id.textView84);
        textView84.setVisibility(View.INVISIBLE);
        textView85=findViewById(R.id.textView85);
        textView85.setVisibility(View.INVISIBLE);
        total1=findViewById(R.id.total1);
        total2=findViewById(R.id.total2);
        total3=findViewById(R.id.total3);
        total4=findViewById(R.id.total4);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void alertPuntos(View vista){
        AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
        alertdialog.setTitle("Ingresar Puntajes");
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        final EditText puntaje1 = new EditText(this);
        puntaje1.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_SIGNED);
        puntaje1.setHint(jugador1.getNombre());
        if(jugador1.getPuntos()>=101){
            puntaje1.setText("0");
            puntaje1.setVisibility(View.INVISIBLE);
        }
        final EditText puntaje2 = new EditText(this);
        puntaje2.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_SIGNED);
        puntaje2.setHint(jugador2.getNombre());
        if(jugador2.getPuntos()>=101){
            puntaje2.setText("0");
            puntaje2.setVisibility(View.INVISIBLE);
        }
        final EditText puntaje3 = new EditText(this);
        puntaje3.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_SIGNED);
        puntaje3.setHint(jugador3.getNombre());
        if(jugador3.getPuntos()>=101){
            puntaje3.setText("0");
            puntaje3.setVisibility(View.INVISIBLE);
        }
        final EditText puntaje4 = new EditText(this);
        puntaje4.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_SIGNED);
        puntaje4.setHint(jugador4.getNombre());
        if(jugador4.getPuntos()>=101){
            puntaje4.setText("0");
            puntaje4.setVisibility(View.INVISIBLE);
        }
        layout.addView(puntaje1);
        layout.addView(puntaje2);
        layout.addView(puntaje3);
        layout.addView(puntaje4);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            repartirPuntajes(puntaje1,puntaje2,puntaje3,puntaje4);
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertdialog.create().show();
    }

    public void repartirPuntajes (EditText puntaje1,EditText puntaje2,EditText puntaje3,EditText puntaje4){
        if(!puntaje1.getText().toString().equals("")&&!puntaje2.getText().toString().equals("")&&!puntaje3.getText().toString().equals("")&&!puntaje4.getText().toString().equals("")){
            distintasManos(total1,Integer.parseInt(puntaje1.getText().toString()),jugador1);
            distintasManos(total2,Integer.parseInt(puntaje2.getText().toString()),jugador2);
            distintasManos(total3,Integer.parseInt(puntaje3.getText().toString()),jugador3);
            distintasManos(total4,Integer.parseInt(puntaje4.getText().toString()),jugador4);
            cuentamanos++;
        }
        else{
            Toast.makeText(this, "Ingresar puntajes de todos los jugadores", Toast.LENGTH_SHORT).show();

        }
    }


    public void distintasManos(TextView total,int puntos,Jugador jugador) {

            if (cuentamanos == 0) {
                if (jugador.equals(jugador1))
                    sumarPuntos(textView30, total, puntos, jugador);
                else if (jugador.equals(jugador2))
                    sumarPuntos(textView31, total, puntos, jugador);
                else if (jugador.equals(jugador3))
                    sumarPuntos(textView32, total, puntos, jugador);
                else if (jugador.equals(jugador4))
                    sumarPuntos(textView33, total, puntos, jugador);
        } else if (cuentamanos == 1) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView34, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView35, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView36, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView37, total, puntos, jugador);
        } else if (cuentamanos == 2) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView38, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView39, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView40, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView41, total, puntos, jugador);

        } else if (cuentamanos == 3) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView42, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView43, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView44, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView45, total, puntos, jugador);

        } else if (cuentamanos == 4) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView46, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView47, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView48, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView49, total, puntos, jugador);

        } else if (cuentamanos == 5) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView50, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView51, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView52, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView53, total, puntos, jugador);

        } else if (cuentamanos == 6) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView54, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView55, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView56, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView57, total, puntos, jugador);

        } else if (cuentamanos == 7) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView58, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView59, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView60, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView61, total, puntos, jugador);

        } else if (cuentamanos == 8) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView62, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView63, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView64, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView65, total, puntos, jugador);

        } else if (cuentamanos == 9) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView66, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView67, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView68, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView69, total, puntos, jugador);

        } else if (cuentamanos == 10) {
            if (jugador.equals(jugador1))
                sumarPuntos(textView70, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView71, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView72, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView73, total, puntos, jugador);

        } else if (cuentamanos == 11) {

            if (jugador.equals(jugador1))
                sumarPuntos(textView74, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView75, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView76, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView77, total, puntos, jugador);

        } else if (cuentamanos == 12) {

            if (jugador.equals(jugador1))
                sumarPuntos(textView78, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView79, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView80, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView81, total, puntos, jugador);

        } else if (cuentamanos == 13) {

            if (jugador.equals(jugador1))
                sumarPuntos(textView82, total, puntos, jugador);
            else if (jugador.equals(jugador2))
                sumarPuntos(textView83, total, puntos, jugador);
            else if (jugador.equals(jugador3))
                sumarPuntos(textView84, total, puntos, jugador);
            else if (jugador.equals(jugador4))
                sumarPuntos(textView85, total, puntos, jugador);

        }





    }

    public void sumarPuntos(TextView mano,TextView total,int puntos,Jugador jugador){
        if(jugador.getPuntos()<101){
            mano.setText(String.valueOf(puntos));
            mano.setVisibility(View.VISIBLE);
            jugador.sumarPuntos(puntos);
            total.setText(String.valueOf(jugador.getPuntos()));
        }
        if(jugador.getPuntos()>=101){
            total.setTextColor(getResources().getColor(R.color.rojo));
        }
    }


    public void cambiarNombre(View vista){
        AlertDialog.Builder alertdialog= new AlertDialog.Builder(this);
        alertdialog.setTitle("Cambiar Nombres");
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        final EditText nombre1 = new EditText(this);
        nombre1.setHint(jugador1.getNombre());
        final EditText nombre2 = new EditText(this);
        nombre2.setHint(jugador2.getNombre());
        final EditText nombre3 = new EditText(this);
        nombre3.setHint(jugador3.getNombre());
        final EditText nombre4 = new EditText(this);
        nombre4.setHint(jugador4.getNombre());
        layout.addView(nombre1);
        layout.addView(nombre2);
        layout.addView(nombre3);
        layout.addView(nombre4);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(!nombre1.getText().toString().equals(""))
                    distribuirNombres(juguno,nombre1,jugador1);
                if(!nombre2.getText().toString().equals(""))
                    distribuirNombres(jugdos,nombre2,jugador2);
                if(!nombre3.getText().toString().equals(""))
                    distribuirNombres(jugtres,nombre3,jugador3);
                if(!nombre4.getText().toString().equals(""))
                    distribuirNombres(jugcuatro,nombre4,jugador4);
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertdialog.create().show();
    }

    public void distribuirNombres(TextView casilla,EditText nuevo,Jugador jugador){
        String nombre=nuevo.getText().toString();
        casilla.setText(nombre);
        jugador.setNombre(nombre);
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
        getMenuInflater().inflate(R.menu.menu_reinicio_configuracion,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void reiniciarPartido(){
        AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
        alertdialog.setTitle("Reiniciar?");
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                jugador1.setPuntos(0);
                jugador2.setPuntos(0);
                jugador3.setPuntos(0);
                jugador4.setPuntos(0);
                total1.setText(R.string.Puntaje_en_0);
                total1.setTextColor(getResources().getColor(R.color.Negro));
                total2.setText(R.string.Puntaje_en_0);
                total2.setTextColor(getResources().getColor(R.color.Negro));
                total3.setText(R.string.Puntaje_en_0);
                total3.setTextColor(getResources().getColor(R.color.Negro));
                total4.setText(R.string.Puntaje_en_0);
                total4.setTextColor(getResources().getColor(R.color.Negro));
                textView30.setVisibility(View.INVISIBLE);
                textView31.setVisibility(View.INVISIBLE);
                textView32.setVisibility(View.INVISIBLE);
                textView33.setVisibility(View.INVISIBLE);
                textView34.setVisibility(View.INVISIBLE);
                textView35.setVisibility(View.INVISIBLE);
                textView36.setVisibility(View.INVISIBLE);
                textView37.setVisibility(View.INVISIBLE);
                textView38.setVisibility(View.INVISIBLE);
                textView39.setVisibility(View.INVISIBLE);
                textView40.setVisibility(View.INVISIBLE);
                textView41.setVisibility(View.INVISIBLE);
                textView42.setVisibility(View.INVISIBLE);
                textView43.setVisibility(View.INVISIBLE);
                textView44.setVisibility(View.INVISIBLE);
                textView45.setVisibility(View.INVISIBLE);
                textView46.setVisibility(View.INVISIBLE);
                textView47.setVisibility(View.INVISIBLE);
                textView48.setVisibility(View.INVISIBLE);
                textView49.setVisibility(View.INVISIBLE);
                textView50.setVisibility(View.INVISIBLE);
                textView51.setVisibility(View.INVISIBLE);
                textView52.setVisibility(View.INVISIBLE);
                textView53.setVisibility(View.INVISIBLE);
                textView54.setVisibility(View.INVISIBLE);
                textView55.setVisibility(View.INVISIBLE);
                textView56.setVisibility(View.INVISIBLE);
                textView57.setVisibility(View.INVISIBLE);
                textView58.setVisibility(View.INVISIBLE);
                textView59.setVisibility(View.INVISIBLE);
                textView60.setVisibility(View.INVISIBLE);
                textView61.setVisibility(View.INVISIBLE);
                textView62.setVisibility(View.INVISIBLE);
                textView63.setVisibility(View.INVISIBLE);
                textView64.setVisibility(View.INVISIBLE);
                textView65.setVisibility(View.INVISIBLE);
                textView66.setVisibility(View.INVISIBLE);
                textView67.setVisibility(View.INVISIBLE);
                textView68.setVisibility(View.INVISIBLE);
                textView69.setVisibility(View.INVISIBLE);
                textView70.setVisibility(View.INVISIBLE);
                textView71.setVisibility(View.INVISIBLE);
                textView72.setVisibility(View.INVISIBLE);
                textView73.setVisibility(View.INVISIBLE);
                textView74.setVisibility(View.INVISIBLE);
                textView75.setVisibility(View.INVISIBLE);
                textView76.setVisibility(View.INVISIBLE);
                textView77.setVisibility(View.INVISIBLE);
                textView78.setVisibility(View.INVISIBLE);
                textView79.setVisibility(View.INVISIBLE);
                textView80.setVisibility(View.INVISIBLE);
                textView81.setVisibility(View.INVISIBLE);
                textView82.setVisibility(View.INVISIBLE);
                textView83.setVisibility(View.INVISIBLE);
                textView84.setVisibility(View.INVISIBLE);
                textView85.setVisibility(View.INVISIBLE);
                cuentamanos=0;
            }
        });
        alertdialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertdialog.create().show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.Reiniciar){
            reiniciarPartido();
        }
        else if(id==R.id.configuracion){
        final AlertDialog.Builder alertdialog =new AlertDialog.Builder(this);
        alertdialog.setTitle("Configuracion");
        alertdialog.setMessage("Se perderán los puntajes");
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent j = new Intent(Chinchon4.this,ConfiguracionChinchon.class);
                j.putExtra("jugadores", 4);
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
        return super.onOptionsItemSelected(item);
    }
}
