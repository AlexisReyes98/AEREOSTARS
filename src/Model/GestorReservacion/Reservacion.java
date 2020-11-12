/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorReservacion;

import Model.GestorVuelos.*;
import Model.GestorHoteles.*;
import Model.GestorPaquetes.*;

/**
 *
 * @author equipo aereostars
 */
public class Reservacion {
    private Vuelo vueloRes;
    private Hotel hotelRes;
    private Paquete paqueteRes;
    private Datos_pasajero datosPasajero;
    private Datos_pago datosPago;
    private Datos_vuelo datosVuelo;
    private Datos_hotel datosHotel;
    private Datos_paquete datosPaquete;
    private int idReservacion;

    public Reservacion(Vuelo vueloRes, Datos_pasajero datosPasajero, Datos_pago datosPago, Datos_vuelo datosVuelo, int idReservacion) {
        this.vueloRes = vueloRes;
        this.datosPasajero = datosPasajero;
        this.datosPago = datosPago;
        this.datosVuelo = datosVuelo;
        this.idReservacion = idReservacion;
    }

    public Reservacion(Hotel hotelRes, Datos_pasajero datosPasajero, Datos_pago datosPago, Datos_hotel datosHotel, int idReservacion) {
        this.hotelRes = hotelRes;
        this.datosPasajero = datosPasajero;
        this.datosPago = datosPago;
        this.datosHotel = datosHotel;
        this.idReservacion = idReservacion;
    }

    public Reservacion(Paquete paqueteRes, Datos_pasajero datosPasajero, Datos_pago datosPago, Datos_paquete datosPaquete, int idReservacion) {
        this.paqueteRes = paqueteRes;
        this.datosPasajero = datosPasajero;
        this.datosPago = datosPago;
        this.datosPaquete = datosPaquete;
        this.idReservacion = idReservacion;
    }

    public Vuelo getVueloRes() {
        return vueloRes;
    }

    public void setVueloRes(Vuelo vueloRes) {
        this.vueloRes = vueloRes;
    }

    public Hotel getHotelRes() {
        return hotelRes;
    }

    public void setHotelRes(Hotel hotelRes) {
        this.hotelRes = hotelRes;
    }

    public Paquete getPaqueteRes() {
        return paqueteRes;
    }

    public void setPaqueteRes(Paquete paqueteRes) {
        this.paqueteRes = paqueteRes;
    }

    public Datos_pasajero getDatosPasajero() {
        return datosPasajero;
    }

    public void setDatosPasajero(Datos_pasajero datosPasajero) {
        this.datosPasajero = datosPasajero;
    }

    public Datos_pago getDatosPago() {
        return datosPago;
    }

    public void setDatosPago(Datos_pago datosPago) {
        this.datosPago = datosPago;
    }

    public Datos_vuelo getDatosVuelo() {
        return datosVuelo;
    }

    public void setDatosVuelo(Datos_vuelo datosVuelo) {
        this.datosVuelo = datosVuelo;
    }

    public Datos_hotel getDatosHotel() {
        return datosHotel;
    }

    public void setDatosHotel(Datos_hotel datosHotel) {
        this.datosHotel = datosHotel;
    }

    public Datos_paquete getDatosPaquete() {
        return datosPaquete;
    }

    public void setDatosPaquete(Datos_paquete datosPaquete) {
        this.datosPaquete = datosPaquete;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }
    
}
