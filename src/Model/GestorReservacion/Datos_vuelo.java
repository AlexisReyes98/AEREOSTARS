/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorReservacion;

import Model.GestorVuelos.*;

/**
 *
 * @author equipo aereostars
 */
public class Datos_vuelo {
    private Vuelo vuelo;
    private int numAsiento;

    public Datos_vuelo() {
    }

    public Datos_vuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    public int asiento(){
        int a = (int)(Math.random()*999+1); //Numero de asiento aleatorio (de entre 1 a 999)
        return numAsiento = a;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    @Override
    public String toString() {
        return "Datos_vuelo{" + "vuelo=" + vuelo + ", numAsiento=" + asiento() + '}';
    }
    
    
}
