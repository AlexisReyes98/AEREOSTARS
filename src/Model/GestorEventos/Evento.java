/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorEventos;

/**
 *
 * @author giova
 */
public class Evento {
    private String nombre;
    private String detalles;
    private String fecha;
    private int numReferencia;

    public Evento() {
    }

    public Evento(String nombre, String detalles, String fecha, int numReferencia) {
        this.nombre = nombre;
        this.detalles = detalles;
        this.fecha = fecha;
        this.numReferencia = numReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", detalles=" + detalles + ", fecha=" + fecha + ", numReferencia=" + numReferencia + '}';
    }
    
}
