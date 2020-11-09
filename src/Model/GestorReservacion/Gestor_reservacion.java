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

/**
 *
 * @author giova
 */
public class Gestor_reservacion {
    Scanner datos = new Scanner(System.in);
    public Relacion_vuelos seleccion_vuelo = new Relacion_vuelos();
    public Relacion_paquetes seleccion_paquete = new Relacion_paquetes();
    public Relacion_hoteles seleccion_hotel = new Relacion_hoteles();
    public Relacion_comprobantes comprobante = new Relacion_comprobantes();
    
    public void generarReservacion(int opcion, int num_ref){
        switch(opcion){
            case 1:{
                //Reservacion de vuelo
                Vuelo vuelo_res = seleccion_vuelo.buscarVueloRes(num_ref);
                Datos_vuelo vuelo = new Datos_vuelo(vuelo_res);
                Datos_pago pago = new Datos_pago(vuelo_res.getCosto());
                int idReservacion = (int)(Math.random()*999+1); //Numero de referencia aleatorio (de entre 1 a 999)
                Reservacion nueva_reservacion = new Reservacion(vuelo_res, ingresaDatosPasajero(), pago, vuelo, idReservacion);
                Comprobante_reservacion comprobante_res = new Comprobante_reservacion(idReservacion, ingresaDatosPasajero(), pago, vuelo);
                comprobante.agregarComprobante(comprobante_res);
                break;
            }
            case 2:{
                //Reservacion de paquetes
                Paquete paquete_res = seleccion_paquete.buscarPaqueteRes(num_ref);
                Datos_paquete paquete = new Datos_paquete(paquete_res);
                Datos_pago pago = new Datos_pago(paquete_res.getCosto());
                int idReservacion = (int)(Math.random()*999+1); //Numero de referencia aleatorio (de entre 1 a 999)
                Reservacion nueva_reservacion = new Reservacion(paquete_res, ingresaDatosPasajero(), pago, paquete, idReservacion);
                Comprobante_reservacion comprobante_res = new Comprobante_reservacion(idReservacion, ingresaDatosPasajero(), pago, paquete);
                comprobante.agregarComprobante(comprobante_res);
                break;
            }
            case 3:{
                //Reservacion de un hotel
                Hotel hotel_res = seleccion_hotel.buscarHotelRes(num_ref);
                Datos_hotel hotel = new Datos_hotel(hotel_res);
                Datos_pago pago = new Datos_pago(hotel_res.getCosto());
                int idReservacion = (int)(Math.random()*999+1); //Numero de referencia aleatorio (de entre 1 a 999)
                Reservacion nueva_reservacion = new Reservacion(hotel_res, ingresaDatosPasajero(), pago, hotel, idReservacion);
                Comprobante_reservacion comprobante_res = new Comprobante_reservacion(idReservacion, ingresaDatosPasajero(), pago, hotel);
                comprobante.agregarComprobante(comprobante_res);
                break;
            }
            default:
                break;
        }
    }
    
    public void cancelarReservacion() {
        
    }
    
    public Datos_pasajero ingresaDatosPasajero() {
        System.out.println("\nINGRESO DE DATOS DEL USUARIO. ");
        System.out.print("Ingrese su nombre: ");
        String nombre = datos.nextLine();
        System.out.print("Ingrese su número de teléfono: ");
        int telefono = datos.nextInt();
        datos.nextLine();
        System.out.print("Ingrese su correo electrónico: ");
        String correo = datos.nextLine();
        Datos_pasajero pasajero = new Datos_pasajero(nombre, telefono, correo);
        
        return pasajero;
    }
}
