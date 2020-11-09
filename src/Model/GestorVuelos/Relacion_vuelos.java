/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorVuelos;

import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Relacion_vuelos {
    private final ArrayList<Vuelo> listaVuelos = new ArrayList<>();
    
    public void agregarVuelo(Vuelo vuelo){
        listaVuelos.add(vuelo);
    }
    
    public boolean eliminarVuelo(int numreferencia){
        boolean encontrar = false;
        int i=0;
        while(i<listaVuelos.size() && encontrar == false){
            if(numreferencia == listaVuelos.get(i).getNumReferencia()){
               listaVuelos.remove(i);
               encontrar = true;
            }
        }
        return encontrar;
    }
    
    public void modificarVuelo(){
        
    }
    
    public void solicitarVuelo(String origen, String destino, String fecha){
        ArrayList<Vuelo> listaRequisitos = new ArrayList<>();
        
        for (int i = 0; i < listaVuelos.size(); i++) {
            if ((origen == null ? listaVuelos.get(i).getOrigen() == null : origen.equals(listaVuelos.get(i).getOrigen())) && (destino == null ? listaVuelos.get(i).getDestino() == null : destino.equals(listaVuelos.get(i).getDestino())) && (fecha == null ? listaVuelos.get(i).getFechaSalida() == null : fecha.equals(listaVuelos.get(i).getFechaSalida()))) {
                listaRequisitos.add(listaVuelos.get(i));
            }
        }
        detallesVuelo(listaRequisitos);
    }
    
    public void detallesVuelo(ArrayList<Vuelo> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
    public Vuelo buscarVueloRes(int numreferencia){
        boolean encontrar = false;
        Vuelo vuelo = null;
        int i = 0;
        System.out.println(listaVuelos.size());
        while(i<listaVuelos.size() && encontrar == false){
            if(numreferencia == listaVuelos.get(i).getNumReferencia()){
                encontrar = true;
                vuelo = listaVuelos.get(i);
            }
            i++;
        }
        return vuelo;   
    }
}
