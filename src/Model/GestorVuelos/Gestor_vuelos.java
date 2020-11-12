/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorVuelos;

/**
 *
 * @author equipo aereostars
 */
public class Gestor_vuelos {
    public Relacion_vuelos listaVuelos = new Relacion_vuelos();
    
    public void agregarVuelo(String destino, String origen, String tipo, String fecha_ida, String hora_salida, float costo, int numreferencia){
        Vuelo nuevo = new Vuelo(destino, origen, tipo, fecha_ida, hora_salida, costo, numreferencia);
        listaVuelos.agregarVuelo(nuevo);
    }
    
    public void eliminarVuelo(int numReferencia){
        if(listaVuelos.eliminarVuelo(numReferencia) == false){
            System.out.println("No se encontro el vuelo con el número de referencia dado.");
        }
    }
    
    public void modificarVuelo(){
        
    }
    
    public void solicitarVuelo(String origen, String destino/*, String fecha_ida*/){
        listaVuelos.solicitarVuelo(origen,destino/*,fecha_ida*/);
    }
    
}
