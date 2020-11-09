/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPaquetes;

import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Relacion_paquetes {
    private final ArrayList<Paquete> listaPaquetes = new ArrayList<>();
    
    public void agregarPaquete(Paquete paquete){
        listaPaquetes.add(paquete);
    }
    
    public boolean eliminarPaquete(int numreferencia){
        boolean encontrar = false;
        int i=0;
        while(i<listaPaquetes.size() && encontrar == false){
            if(numreferencia == listaPaquetes.get(i).getNumReferencia()){
               listaPaquetes.remove(i);
               encontrar = true;
            }
        }
        return encontrar;
    }
    
    public void modificarPaquete(){
        
    }
    
    public void solicitarPaquete(String origen, String destino, String fecha){
        ArrayList<Paquete> listaRequisitos = new ArrayList<>();
        
        for (int i = 0; i < listaPaquetes.size(); i++) {
            if ((origen == null ? listaPaquetes.get(i).getOrigen() == null : origen.equals(listaPaquetes.get(i).getOrigen())) && (destino == null ? listaPaquetes.get(i).getDestino() == null : destino.equals(listaPaquetes.get(i).getDestino())) && (fecha == null ? listaPaquetes.get(i).getFechaSalida() == null : fecha.equals(listaPaquetes.get(i).getFechaSalida()))) {
                listaRequisitos.add(listaPaquetes.get(i));
            }
        }
        detallesPaquete(listaRequisitos);
    }
    
    public void detallesPaquete(ArrayList<Paquete> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
    public Paquete buscarPaqueteRes(int numreferencia){
        boolean encontrar = false;
        Paquete paquete = null;
        int i = 0;
        System.out.println(listaPaquetes.size());
        while(i<listaPaquetes.size() && encontrar == false){
            if(numreferencia == listaPaquetes.get(i).getNumReferencia()){
                encontrar = true;
                paquete = listaPaquetes.get(i);
            }
            i++;
        }
        return paquete;   
    }
}
