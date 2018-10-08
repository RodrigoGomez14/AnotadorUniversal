package com.example.rodrigo.anotadoruniversal;

public class Jugador {
    private int puntos=0;

    public void sumarPuntos(int puntos){

        this.puntos+=puntos;
    }
    public void restarPuntos(int puntos){

        this.puntos-=puntos;
    }
    public Jugador(int puntos) {
        this.puntos = puntos;
    }
    public Jugador(){

    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
