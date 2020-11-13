/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorReservacion;

import Model.GestorVuelos.*;
import Model.GestorHoteles.*;
import Model.GestorPaquetes.*;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author equipo aereostars
 */
public class Gestor_reservacion {
    Scanner datos = new Scanner(System.in);
    public Relacion_vuelos seleccion_vuelo = new Relacion_vuelos();
    public Relacion_paquetes seleccion_paquete = new Relacion_paquetes();
    public Relacion_hoteles seleccion_hotel = new Relacion_hoteles();
    public Relacion_comprobantes comprobante = new Relacion_comprobantes();
    JTextArea jTextArea1;

    public Gestor_reservacion() {
    }

    public Gestor_reservacion(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }
    
    public void generarReservacion(int opcion, int num_ref, Datos_pasajero pasajero){
        switch(opcion){
            case 1:{
                //Reservacion de vuelo
                Vuelo vuelo_res = seleccion_vuelo.buscarVueloRes(num_ref);
                Datos_vuelo vuelo = new Datos_vuelo(vuelo_res);
                Datos_pago pago = new Datos_pago(vuelo_res.getCosto());
                int idReservacion = (int)(Math.random()*999+1); //Numero de referencia aleatorio (de entre 1 a 999)
                Reservacion nueva_reservacion = new Reservacion(vuelo_res, pasajero, pago, vuelo, idReservacion);
                Comprobante_reservacion comprobante_res = new Comprobante_reservacion(idReservacion, pasajero, pago, vuelo);
                comprobante.agregarComprobante(comprobante_res);
                break;
            }
            case 2:{
                //Reservacion de paquetes
                Paquete paquete_res = seleccion_paquete.buscarPaqueteRes(num_ref);
                Datos_paquete paquete = new Datos_paquete(paquete_res);
                Datos_pago pago = new Datos_pago(paquete_res.getCosto());
                int idReservacion = (int)(Math.random()*999+1); //Numero de referencia aleatorio (de entre 1 a 999)
                Reservacion nueva_reservacion = new Reservacion(paquete_res, pasajero, pago, paquete, idReservacion);
                Comprobante_reservacion comprobante_res = new Comprobante_reservacion(idReservacion, pasajero, pago, paquete);
                comprobante.agregarComprobante(comprobante_res);
                break;
            }
            case 3:{
                //Reservacion de un hotel
                Hotel hotel_res = seleccion_hotel.buscarHotelRes(num_ref);
                Datos_hotel hotel = new Datos_hotel(hotel_res);
                Datos_pago pago = new Datos_pago(hotel_res.getCosto());
                int idReservacion = (int)(Math.random()*999+1); //Numero de referencia aleatorio (de entre 1 a 999)
                Reservacion nueva_reservacion = new Reservacion(hotel_res, pasajero, pago, hotel, idReservacion);
                Comprobante_reservacion comprobante_res = new Comprobante_reservacion(idReservacion, pasajero, pago, hotel);
                comprobante.agregarComprobante(comprobante_res);
                break;
            }
            default:
                break;
        }
    }
    
    public boolean cancelarReservacion(int numRef) {
        boolean elim = false;
        if(comprobante.eliminarComprobante(numRef) == true){
            elim = true;
        }
        return elim;
    }
    
    public Datos_pasajero ingresaDatosPasajero(String nombre, String telefono, String correo) {
        Datos_pasajero pasajero = new Datos_pasajero(nombre, telefono, correo);
        
        return pasajero;
    }
}
