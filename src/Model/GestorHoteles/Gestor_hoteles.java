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
public class Gestor_hoteles {
    public Relacion_hoteles listaHoteles = new Relacion_hoteles();
    
    public void agregarHotel(int numreferencia, String nombre, String destino, int numestrellas, double costo){
        Hotel nuevo = new Hotel(numreferencia, nombre, destino, numestrellas, costo);
        listaHoteles.registrar(nuevo);
    }
    
    public void eliminarHotel(int numReferencia){
        /*if(listaHoteles.eliminarHotel(numReferencia) == false){
            System.out.println("No se encontro el vuelo con el número de referencia dado.");
        }*/
    }
    
    public void modificarHotel(){
        
    }
    
    public void solicitarHotel(String origen, String destino){
        //listaHoteles.solicitarHotel(origen,destino);
    }
}
