package com.example.rodrigo.anotadoruniversal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button burako1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        burako1=findViewById(R.id.botonburako);
    }

    public void anotadorTruco(View vista){
            Intent i= new Intent(MainActivity.this , Truco.class);
            i.putExtra("cantidadDePuntos","30");
            startActivity(i);
    }
    public void anotadorEscoba(View vista){
        Intent i=new Intent(MainActivity.this, Escoba.class);
        startActivity(i);
    }
    public void anotadorChancho(View vista){
        Intent i=new Intent(MainActivity.this,Chancho.class);
        startActivity(i);
    }
    public void mostrarInformacion(View vista){
        Intent i=new Intent(MainActivity.this,InformacionClase.class);
        startActivity(i);
    }
    public void anotadorGenerala (View vista){
        Intent i=new Intent(MainActivity.this, Generala.class);
        startActivity(i);
    }
    public void snotadorChinchon(View vista){
        Intent i = new Intent(MainActivity.this,Chinchon.class);
        startActivity(i);
    }
    public void anotadorBurako(View vista){
        Intent i=new Intent(MainActivity.this,Burako.class);
        startActivity(i);
    }
    public void anotadorRummy(View vista){
        Intent i=new Intent(this,Rummy.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.configuracion){
            return true;
        }
        if(id==R.id.Informacion){
            mostrarInformacion(null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
