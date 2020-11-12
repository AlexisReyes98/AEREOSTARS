/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorVuelos;

import java.text.ParseException;

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
    
    public boolean eliminarVuelo(int numReferencia){
        return (listaVuelos.eliminarVuelo(numReferencia));
    }
    
    public void modificarVuelo(int numReferencia,int campo, String nuevoValor) throws ParseException{
        listaVuelos.modificarVuelo(numReferencia, campo, nuevoValor);      
    }
    
    public void solicitarVuelo(String origen, String destino/*, String fecha_ida*/){
        listaVuelos.solicitarVuelo(origen,destino/*,fecha_ida*/);
    }
    
}
