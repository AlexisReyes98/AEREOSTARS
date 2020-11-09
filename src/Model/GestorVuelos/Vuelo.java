/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorVuelos;

/**
 *
 * @author giova
 */
public class Vuelo {
    private String destino;
    private String origen;
    private String tipo;
    private String fechaSalida;
    private String horaSalida;
    private double costo;
    private int numReferencia;

    public Vuelo(String destino, String origen, String tipo, String fechaSalida, String horaSalida, double costo, int numReferencia) {
        this.destino = destino;
        this.origen = origen;
        this.tipo = tipo;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.costo = costo;
        this.numReferencia = numReferencia;
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

    @Override
    public String toString() {
        return "Vuelo{" + "destino=" + destino + ", origen=" + origen + ", tipo=" + tipo + ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + ", costo=" + costo + ", numReferencia=" + numReferencia + '}';
    }
    
}
