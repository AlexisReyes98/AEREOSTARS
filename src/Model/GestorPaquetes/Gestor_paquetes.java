/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPaquetes;

import Model.GestorEventos.*;
import Model.GestorHoteles.*;

/**
 *
 * @author giova
 */
public class Gestor_paquetes {
    public Relacion_paquetes listaPaquetes = new Relacion_paquetes();
    
    public void agregarPaquete(String destino, String origen, String tipo, String fecha_ida, String hora_salida, float costo, int numreferencia, Evento evento, Hotel hotel){
        Paquete nuevo = new Paquete(destino, origen, tipo, fecha_ida, hora_salida, costo, numreferencia, evento, hotel);
        listaPaquetes.agregarPaquete(nuevo);
    }
    
    public void eliminarPaquete(int numReferencia){
        if(listaPaquetes.eliminarPaquete(numReferencia) == false){
            System.out.println("No se encontro el vuelo con el número de referencia dado.");
        }
    }
    
    public void modificarpaquete(){
        
    }
    
    public void solicitarVuelo(String origen, String destino, String fecha_ida){
        listaPaquetes.solicitarPaquete(origen,destino,fecha_ida);
    }
}
