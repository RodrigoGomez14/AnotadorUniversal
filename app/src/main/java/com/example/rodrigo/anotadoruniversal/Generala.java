package com.example.rodrigo.anotadoruniversal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Generala extends AppCompatActivity {
    int[] numeros;
    private TextView unouno,unodos,unotres,unocuatro;

    private TextView Jugador1, jug1Nro1;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generala);
        Jugador1=findViewById(R.id.Jugador1);
        unouno=findViewById(R.id.unouno);
        unodos=findViewById(R.id.unodos);
        unotres=findViewById(R.id.unotres);
        unocuatro=findViewById(R.id.unocuatro);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    public void elegirPuntaje(View vista){
        
        TextView casillero=(TextView)vista;
        final AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setTitle("Seleccione puntaje");
        if(casillero.equals(unouno) ||casillero.equals(unodos) || casillero.equals(unotres) || casillero.equals(unocuatro))){

            alertdialog.setItems(R.array.dado_cara_uno, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
        }
        if(casillero .equals(unodos)){
            alertdialog.setItems(R.array.dado_cara_dos, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

        }
        alertdialog.create().show();
    }




    public void tomarDatos(View vista){
        TextView tantos =(TextView) vista;
        tantos.setText("hola");
    }
}
