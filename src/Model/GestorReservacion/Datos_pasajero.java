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
public class Datos_pasajero {
    private String nombre;
    private String numTelefono;
    private String correo;

    public Datos_pasajero() {
    }

    public Datos_pasajero(String nombre, String numTelefono, String correo) {
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Datos_pasajero{" + "nombre=" + nombre + ", numTelefono=" + numTelefono + ", correo=" + correo + '}';
    }
    
}
