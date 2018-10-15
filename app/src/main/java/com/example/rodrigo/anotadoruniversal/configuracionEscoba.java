package com.example.rodrigo.anotadoruniversal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;

public class configuracionEscoba extends AppCompatActivity {
    private RadioButton dosjugadores,tresjugadores;
    private int jugadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracion_escoba);
        dosjugadores=findViewById(R.id.dosjugadores);
        tresjugadores=findViewById(R.id.tresjugadores);
        jugadores=getIntent().getExtras().getInt("jugadores");
        if(jugadores==2){
            dosjugadores.setChecked(true);
        }
        else if(jugadores==3){
            tresjugadores.setChecked(true);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_configuracion_escoba,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.aceptar) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

            if(dosjugadores.isChecked()){
                Intent j = new Intent(this,Escoba.class);
                startActivity(j);
                finish();

            }
            else if(tresjugadores.isChecked()){
                Intent j = new Intent(this,Escoba_3_jug.class);
                startActivity(j);
                finish();
            }

    }
}
