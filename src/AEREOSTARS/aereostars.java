/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREOSTARS;

import Model.GestorVuelos.*;

/**
 *
 * @author giova
 */
public class aereostars {
    public static void main(String[] args) {
        Gestor_vuelos g = new Gestor_vuelos();
        g.agregarVuelo("cancun", "mexico", "doble", "10/11/2020", "08:18", 1500, 75);
        g.solicitarVuelo("cancun", "mexico", "doble");
    }
}
