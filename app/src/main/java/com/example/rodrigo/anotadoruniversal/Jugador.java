package com.example.rodrigo.anotadoruniversal;

import android.text.Editable;

public class Jugador {
    private String nombre="Jugador";
    private int puntos=0;

    public void sumarPuntos(int puntos){

        this.puntos+=puntos;
    }
    public void restarPuntos(int puntos){

        this.puntos-=puntos;
        if(this.puntos<0){
            this.puntos=0;
        }
    }
    public Jugador(int puntos) {
        this.puntos = puntos;
    }
    public Jugador(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
