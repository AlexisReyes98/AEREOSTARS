/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREOSTARS;

import Controller.OAutenticacion;
import Model.GestorVuelos.*;
import View.GUIAutenticacion.GUIAutenticacion;
import View.GUIAutenticacion.GUIRegistro;
import View.GUIVuelos.GUIAgregarVuelo;
import View.GUIReservacion.*;
/**
 *
 * @author equipo aereostars
 */
public class aereostars {
    public static void main(String[] args) {
        //Gestor_vuelos g = new Gestor_vuelos();
        //g.agregarVuelo("querataro", "mexico", "doble", "22/11/2020", "10:20", 1250, 63);
        //g.solicitarVuelo("querataro", "mexico");
        //Relacion_vuelos r= new Relacion_vuelos();
        //r.eliminarVuelo(63);
        //GUIAgregarVuelo f = new GUIAgregarVuelo();
        //f.inicializarOyentes();
        //f.setLocationRelativeTo(null);
        //f.setVisible(true);
        //GUIAutenticacion ga = new GUIAutenticacion();
        //GUIRegistro gr = new GUIRegistro();
        //OAutenticacion oa = new OAutenticacion(ga,gr);
        //oa.iniciar();
        //ga.setVisible(true);
        GUIReservacion gr = new GUIReservacion();
        gr.setVisible(true);
        //GUICancelarReservacion r = new GUICancelarReservacion();
        //r.setVisible(true);
    }
}
