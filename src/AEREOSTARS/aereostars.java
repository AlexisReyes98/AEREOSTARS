/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREOSTARS;

import Model.GestorVuelos.*;
import View.GUIVuelos.GUIAgregarVuelo;

/**
 *
 * @author giova
 */
public class aereostars {
    public static void main(String[] args) {
        //Gestor_vuelos g = new Gestor_vuelos();
        //g.agregarVuelo("cancun", "mexico", "doble", "10/11/2020", "08:18", 1500, 75);
        //g.agregarVuelo("querataro", "mexico", "doble", "22/11/2020", "10:20", 1250, 63);
        //g.solicitarVuelo("cancun", "mexico", "doble");
        GUIAgregarVuelo f = new GUIAgregarVuelo();
        f.inicializarOyentes();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
