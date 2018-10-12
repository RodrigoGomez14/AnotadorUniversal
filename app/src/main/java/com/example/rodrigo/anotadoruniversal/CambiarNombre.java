package com.example.rodrigo.anotadoruniversal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CambiarNombre extends AppCompatActivity {
    private EditText nombreNuevo;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cambiar_nombre);
        nombreNuevo=findViewById(R.id.Nuevo_Nombre);
    }

    public void cambiarNombre(View vista){
        Intent i=new Intent(CambiarNombre.this,Generala.class);
        i.putExtra("NuevoNombre",nombreNuevo.getText());
}

    @Override
    protected void onPause() {
        cambiarNombre(null);
        super.onPause();
    }
}
