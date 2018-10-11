package com.example.rodrigo.anotadoruniversal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;

public class ConfiguracionTruco extends AppCompatActivity {
    private boolean gallo;
    private CheckBox switchgallo;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracion_truco);
        switchgallo=findViewById(R.id.check_Gallo);
    }


    @Override
    public void onBackPressed() {
        if(switchgallo.isChecked()==true){
            Intent i=new Intent(this,TrucoGallo.class);
            i.putExtra("esGallo", gallo );
        }
        super.onBackPressed();
    }
}
