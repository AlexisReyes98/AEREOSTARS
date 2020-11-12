/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorHoteles;

/**
 *
 * @author equipo aereostars
 */
public class Hotel {
    private String nombre;
    private String destino;
    private int numEstrellas;
    private double costo;
    private int numReferencia;

    public Hotel() {
    }

    public Hotel(String nombre, String destino, int numEstrellas, double costo, int numReferencia) {
        this.nombre = nombre;
        this.destino = destino;
        this.numEstrellas = numEstrellas;
        this.costo = costo;
        this.numReferencia = numReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumEstrellas() {
        return numEstrellas;
    }

    public void setNumEstrellas(int numEstrellas) {
        this.numEstrellas = numEstrellas;
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

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", destino=" + destino + ", numEstrellas=" + numEstrellas + ", costo=" + costo + ", numReferencia=" + numReferencia + '}';
    }
    
}
