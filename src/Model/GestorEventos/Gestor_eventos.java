/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorEventos;

/**
 *
 * @author equipo aereostars
 */
public class Gestor_eventos {
    public Relacion_eventos listaEventos = new Relacion_eventos();
    
    public void agregarEvento(String nombre, String detalles, String fecha, double costo, int numReferencia){
        Evento nuevo = new Evento(nombre, detalles, fecha, costo, numReferencia);
        listaEventos.agregarEvento(nuevo);
    }
    
    public void eliminarEvento(int numReferencia){
        if(listaEventos.eliminarEvento(numReferencia) == false){
            System.out.println("No se encontro el vuelo con el número de referencia dado.");
        }
    }
    
    public void modificarEvento(){
        
    }
    
    public void solicitarEvento(String nombre){
        listaEventos.solicitarEvento(nombre);
    }
}
