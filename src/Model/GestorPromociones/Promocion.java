/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPromociones;

/**
 *
 * @author jovan
 */
public class Promocion {
    private int id;
    private int numreferencia;
    private String nombre;
    private String descripcion;
    private String vigencia;

    public Promocion() {
    }

    public Promocion(int id, int numreferencia, String nombre, String descripcion, String vigencia) {
        this.id = id;
        this.numreferencia = numreferencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.vigencia = vigencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumreferencia() {
        return numreferencia;
    }

    public void setNumreferencia(int numreferencia) {
        this.numreferencia = numreferencia;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }
    
    
    
    
    
    
}
