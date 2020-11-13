/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorInformacion;

import Model.GestorEventos.Gestor_eventos;
import Model.GestorHoteles.Gestor_hoteles;
import Model.GestorPaquetes.Gestor_paquetes;
import Model.GestorPromociones.Gestor_promociones;
import Model.GestorVuelos.Gestor_vuelos;

/**
 *
 * @author equipo aereostars
 */
public class Gestor_info {
    public Gestor_vuelos vuelos = new Gestor_vuelos();
    public Gestor_hoteles hoteles = new Gestor_hoteles();
    public Gestor_paquetes paquetes = new Gestor_paquetes();
    public Gestor_promociones promos = new Gestor_promociones();
    public Gestor_eventos eventos = new Gestor_eventos();
    
    public void solicitarVuelos(/*String origen, String destino, String fecha_ida*/){
        vuelos.solicitarVuelo(/*origen, destino/*, fecha_ida*/);
    }
    
    public void solicitarHoteles(String origen, String destino){
        hoteles.solicitarHotel(origen, destino);
    }
    
    public void solicitarPaquetes(/*String origen, String destino, String fecha_ida*/){
        paquetes.solicitarPaquete(/*origen, destino, fecha_ida*/);
    }
    
    public void solicitarPromociones(String nombre){
        promos.solicitarPromocion(nombre);
    }
    
    public void solictarEventos(String nombre){
        eventos.solicitarEvento(nombre);
    }
    
}
