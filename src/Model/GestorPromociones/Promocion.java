/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPromociones;

/**
 *
 * @author giova
 */
public class Promocion {
    private String nombre;
    private String descripcion;
    private String vigencia;
    private int numReferencia;

    public Promocion(String nombre, String descripcion, String vigencia, int numReferencia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.vigencia = vigencia;
        this.numReferencia = numReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    @Override
    public String toString() {
        return "Promocion{" + "nombre=" + nombre + ", Descripcion=" + descripcion + ", vigencia=" + vigencia + ", numReferencia=" + numReferencia + '}';
    }
    
}
