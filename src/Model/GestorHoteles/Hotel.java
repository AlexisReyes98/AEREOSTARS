/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorHoteles;

/**
 *
 * @author jovan
 */
public class Hotel {
     private int numreferencia;
    private String nombre;
    private String destino;
    private int numestrellas;
    private double costo;
    private int id;
    
    public Hotel(int numreferencia, String nombre, String destino, int numestrellas, double costo){
        this.numreferencia=numreferencia;
        this.nombre=nombre;
        this.destino=destino;
        this.numestrellas=numestrellas;
        this.costo=costo;
    }

    public Hotel() {
        
    }
    public void setNumreferencia (int numreferencia){
       this.numreferencia=numreferencia;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDestino(String destino){
        this.destino=destino;
    }
    public void setNumestrellas(int numestrellas){
        this.numestrellas=numestrellas;
    }
    public void setCosto(double costo) {
        this.costo=costo;
    }
    public void setid(int id){
        this.id=id;
    }
    
    public int getNumreferencia(){
        return numreferencia;
    }
    public String getnombre(){
        return nombre;
        
    }
    public String getdestino(){
        return destino;
    }
    public int getNumestrellas(){
        return numestrellas;
    }
    public double getcosto(){
        return costo;
    }
    public int getid(){
        return id;
    }
}
