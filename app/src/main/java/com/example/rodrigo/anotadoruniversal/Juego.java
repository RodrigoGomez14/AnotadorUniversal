package com.example.rodrigo.anotadoruniversal;
public  abstract class Juego {
    public  int sumarPuntos (int puntos){
        Jugador j1= new Jugador();
        int puntosfinal=j1.getPuntos()+puntos;
        j1.setPuntos(puntosfinal);
        return j1.getPuntos();
}
    public int restarPuntos(int puntos){
        Jugador j1=new Jugador();
        int puntosfinal=j1.getPuntos()+puntos;
        j1.setPuntos(puntosfinal);
        return j1.getPuntos();
    }

}
