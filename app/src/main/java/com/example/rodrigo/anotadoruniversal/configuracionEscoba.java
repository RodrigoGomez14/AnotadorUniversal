package com.example.rodrigo.anotadoruniversal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class configuracionEscoba extends AppCompatActivity {
    private RadioButton dosjugadores,tresjugadores,cuatrojugadores;
    private CheckBox chorizo;
    private int jugadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracion_escoba);
        dosjugadores=findViewById(R.id.dosjugadores);
        tresjugadores=findViewById(R.id.tresjugadores);
        cuatrojugadores=findViewById(R.id.cuatrojugadores);
        chorizo=findViewById(R.id.chorizoCheck);
        try{
            jugadores=getIntent().getExtras().getInt("jugadores");
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        if(jugadores==2){
            dosjugadores.setChecked(true);
        }
        else if(jugadores==3){
            tresjugadores.setChecked(true);
        }
        else if(jugadores==4){
            cuatrojugadores.setChecked(true);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.enviar_configuracion,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.atras) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

            if(dosjugadores.isChecked()){
                if(chorizo.isChecked()){
                    Intent j=new Intent(this,Chorizo.class);
                    startActivity(j);
                    finish();
                }

                else{
                    Intent j = new Intent(this,Escoba.class);
                    startActivity(j);
                    finish();
                }

            }
            else if(tresjugadores.isChecked()){
                if(chorizo.isChecked()){
                    Intent j=new Intent(this,Chorizo2.class);
                    startActivity(j);
                    finish();
                }

                else{
                    Intent j = new Intent(this,Escoba_3_jug.class);
                    startActivity(j);
                    finish();
                }
            }
            else if(cuatrojugadores.isChecked()){
                if(chorizo.isChecked()){
                    Intent j=new Intent(this,Chorizo.class);
                    startActivity(j);
                    finish();
                }

                else{
                    Intent j = new Intent(this,Escoba_4_jug.class);
                    startActivity(j);
                    finish();
                }
            }

    }
}
