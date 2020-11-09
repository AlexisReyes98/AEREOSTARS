/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorReservacion;

/**
 *
 * @author giova
 */
public class Datos_pasajero {
    private String nombre;
    private int numTelefono;
    private String correo;

    public Datos_pasajero(String nombre, int numTelefono, String correo) {
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

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
