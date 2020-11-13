/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorReservacion;

/**
 *
 * @author equipo aereostars
 */
public class Comprobante_reservacion {
    private int idReservacion;
    private Datos_pasajero pasajero;
    private Datos_pago pago;
    private Datos_vuelo vuelo;
    private Datos_paquete paquete;
    private Datos_hotel hotel;

    public Comprobante_reservacion() {
    }
    
    public Comprobante_reservacion(int idReservacion, Datos_pasajero pasajero, Datos_pago pago, Datos_vuelo vuelo) {
        this.idReservacion = idReservacion;
        this.pasajero = pasajero;
        this.pago = pago;
        this.vuelo = vuelo;
    }

    public Comprobante_reservacion(int idReservacion, Datos_pasajero pasajero, Datos_pago pago, Datos_paquete paquete) {
        this.idReservacion = idReservacion;
        this.pasajero = pasajero;
        this.pago = pago;
        this.paquete = paquete;
    }

    public Comprobante_reservacion(int idReservacion, Datos_pasajero pasajero, Datos_pago pago, Datos_hotel hotel) {
        this.idReservacion = idReservacion;
        this.pasajero = pasajero;
        this.pago = pago;
        this.hotel = hotel;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Datos_pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Datos_pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Datos_pago getPago() {
        return pago;
    }

    public void setPago(Datos_pago pago) {
        this.pago = pago;
    }

    public Datos_vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Datos_vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Datos_paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Datos_paquete paquete) {
        this.paquete = paquete;
    }

    public Datos_hotel getHotel() {
        return hotel;
    }

    public void setHotel(Datos_hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Comprobante_reservacion{" + "idReservacion=" + idReservacion + ", pasajero=" + pasajero + ", pago=" + pago + ", vuelo=" + vuelo + ", paquete=" + paquete + ", hotel=" + hotel + '}';
    }
    
}
