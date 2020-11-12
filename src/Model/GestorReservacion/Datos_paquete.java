/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorReservacion;

import Model.GestorPaquetes.*;

/**
 *
 * @author equipo aereostars
 */
public class Datos_paquete {
    private Paquete paquete;
    private int numAsiento;

    public Datos_paquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    
    public void asiento(){
        int a = (int)(Math.random()*999+1); //Numero de asiento aleatorio (de entre 1 a 999)
        numAsiento = a;
    }

    public int getNumAsiento() {
        return numAsiento;
    }
    
}
