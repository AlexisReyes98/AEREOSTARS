/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorEventos;

import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Relacion_eventos {
    private final ArrayList<Evento> listaEventos = new ArrayList<>();
    
    public void agregarEvento(Evento evento){
        listaEventos.add(evento);
    }
    
    public boolean eliminarEvento(int numreferencia){
        boolean encontrar = false;
        int i=0;
        while(i<listaEventos.size() && encontrar == false){
            if(numreferencia == listaEventos.get(i).getNumReferencia()){
               listaEventos.remove(i);
               encontrar = true;
            }
        }
        return encontrar;
    }
    
    public void modificarEvento(){
        
    }
    
    public void solicitarEvento(String nombre){
        ArrayList<Evento> listaRequisitos = new ArrayList<>();
        
        for (int i = 0; i < listaEventos.size(); i++) {
            if ((nombre == null ? listaEventos.get(i).getNombre() == null : nombre.equals(listaEventos.get(i).getNombre()))) {
                listaRequisitos.add(listaEventos.get(i));
            }
        }
        detallesEvento(listaRequisitos);
    }
    
    public void detallesEvento(ArrayList<Evento> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
    public Evento buscarEventoRes(int numreferencia){
        boolean encontrar = false;
        Evento evento = null;
        int i = 0;
        System.out.println(listaEventos.size());
        while(i<listaEventos.size() && encontrar == false){
            if(numreferencia == listaEventos.get(i).getNumReferencia()){
                encontrar = true;
                evento = listaEventos.get(i);
            }
            i++;
        }
        return evento;   
    }
}
