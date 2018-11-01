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


public class Rummy extends AppCompatActivity {
    private Jugador jugador1, jugador2;
    private TextView equipo1,equipo2,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,total1,total2;
    private int cuentaManos1,cuentaManos2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rummy);
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
                ultimaMano(textView11,total1,jugador1,jug1);
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
                ultimaMano(textView12,total2,jugador2,jug2);
                cuentaManos2++;
                break;
        }


    }


    public void organizarPuntajes(TextView parcial,TextView total,Jugador jugador,int puntaje){
        parcial.setVisibility(View.VISIBLE);
            jugador.sumarPuntos(puntaje);
            parcial.setText(String.valueOf(puntaje));
            total.setText(String.valueOf(jugador.getPuntos()));
    }
    public void ultimaMano(TextView parcial,TextView total,Jugador jugador,int puntaje){
        parcial.setVisibility(View.VISIBLE);
        jugador.sumarPuntos(puntaje);
        parcial.setText(String.valueOf(puntaje));
        total.setText(String.valueOf(jugador.getPuntos()));
        if(jugador1.getPuntos()<jugador2.getPuntos()){
            Toast.makeText(this, "Partido Terminado, Ganador: "+jugador1.getNombre(), Toast.LENGTH_SHORT).show();
        }
        else if(jugador1.getPuntos()>jugador2.getPuntos()){
            Toast.makeText(this, "Partido Terminado, Ganador: "+jugador2.getNombre(), Toast.LENGTH_SHORT).show();
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
        getMenuInflater().inflate(R.menu.menu_reinicio_configuracion,menu);
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
        if(id==R.id.configuracion){
            AlertDialog.Builder alertdialog=new AlertDialog.Builder(this);
            alertdialog.setTitle("Configuracion");
            alertdialog.setMessage("Se perderan los puntajes");
            alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent j=new Intent(Rummy.this,ConfiguracionRummy.class);
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

    }


    public void elegirPuntajes(View vista){
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setTitle("Ingresar Puntajes");
        alertdialog.setMessage("Seleccionar el ganador de cada jugada");
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        final EditText puntos1=new EditText(this);
        puntos1.setHint(jugador1.getNombre());
        puntos1.setInputType(InputType.TYPE_CLASS_NUMBER);
        final EditText puntos2=new EditText(this);
        puntos2.setInputType(InputType.TYPE_CLASS_NUMBER);
        puntos2.setHint(jugador2.getNombre());
        layout.addView(puntos1);
        layout.addView(puntos2);
        alertdialog.setView(layout);
        alertdialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(puntos1.getText().toString().equals("")||puntos2.getText().toString().equals("")){
                    Toast.makeText(Rummy.this, "Ingresar puntaje de todos los jugadores", Toast.LENGTH_SHORT).show();
                }
                else{
                    organizarManos1(Integer.parseInt(puntos1.getText().toString()));
                    organizarManos2(Integer.parseInt(puntos2.getText().toString()));
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





}

