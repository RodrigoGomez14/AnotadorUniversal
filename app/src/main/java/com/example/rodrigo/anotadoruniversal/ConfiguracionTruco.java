package com.example.rodrigo.anotadoruniversal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;

public class ConfiguracionTruco extends AppCompatActivity {
    private int cantidadDePuntos;
    private RadioButton puntos_15,puntos_30;
    private CheckBox switchgallo;
    private boolean gallo;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.configuracion_truco);
        gallo=getIntent().getExtras().getBoolean("gallo");
        switchgallo=findViewById(R.id.check_Gallo);
        puntos_15=findViewById(R.id.radioButton15);
        puntos_30=findViewById(R.id.radioButton30);
        puntos_30.setChecked(true);
        if(gallo){
            switchgallo.setChecked(true);
        }
        if(!gallo){
            switchgallo.setChecked(false);
        }
    }


    @Override
    public void onBackPressed() {
        if(switchgallo.isChecked()){
            if(puntos_15.isChecked()){
                cantidadDePuntos=15;
            }
            else if (puntos_30.isChecked()){
                cantidadDePuntos=30;
            }
            Intent i=new Intent(this,TrucoGallo.class);
            i.putExtra("cantidadDePuntos", String.valueOf(cantidadDePuntos) );
            startActivity(i);
            finish();
        }
        else if(!switchgallo.isChecked()){
            if(puntos_15.isChecked()){
                cantidadDePuntos=15;
            }
            else if (puntos_30.isChecked()){
                cantidadDePuntos=30;
            }
            Intent i =new Intent(this,Truco.class);
            i.putExtra("cantidadDePuntos",String.valueOf(cantidadDePuntos));
            startActivity(i);
            finish();
        }

        super.onBackPressed();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.configuracion_truco_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.atras){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
