/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPaquetes;

import Model.GestorHoteles.*;
import Model.GestorEventos.*;

/**
 *
 * @author equipo aereostars
 */
public class Paquete {
    private String destino;
    private String origen;
    private String tipo;
    private String fechaSalida;
    private String horaSalida;
    private double costo;
    private int numReferencia;
    private Evento evento;
    private Hotel hotel;

    public Paquete() {
    }

    public Paquete(String destino, String origen, String tipo, String fechaSalida, String horaSalida, double costo, int numReferencia) {
        this.destino = destino;
        this.origen = origen;
        this.tipo = tipo;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.costo = costo;
        this.numReferencia = numReferencia;
    }

    public Paquete(String destino, String origen, String tipo, String fechaSalida, String horaSalida, double costo, int numReferencia, Evento evento, Hotel hotel) {
        this.destino = destino;
        this.origen = origen;
        this.tipo = tipo;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.costo = costo;
        this.numReferencia = numReferencia;
        this.evento = evento;
        this.hotel = hotel;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Paquete{" + "destino=" + destino + ", origen=" + origen + ", tipo=" + tipo + ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + ", costo=" + costo + ", numReferencia=" + numReferencia + ", evento=" + evento + ", hotel=" + hotel + '}';
    }
    
}
