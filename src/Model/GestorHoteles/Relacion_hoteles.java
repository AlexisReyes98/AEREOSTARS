/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorHoteles;

import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Relacion_hoteles {
    private final ArrayList<Hotel> listaHoteles = new ArrayList<>();
    
    public void agregarHotel(Hotel hotel){
        listaHoteles.add(hotel);
    }
    
    public boolean eliminarHotel(int numreferencia){
        boolean encontrar = false;
        int i=0;
        while(i<listaHoteles.size() && encontrar == false){
            if(numreferencia == listaHoteles.get(i).getNumReferencia()){
               listaHoteles.remove(i);
               encontrar = true;
            }
        }
        return encontrar;
    }
    
    public void modificarVuelo(){
        
    }
    
    public void solicitarHotel(String nombre, String destino){
        ArrayList<Hotel> listaRequisitos = new ArrayList<>();
        
        for (int i = 0; i < listaHoteles.size(); i++) {
            if ((nombre == null ? listaHoteles.get(i).getNombre() == null : nombre.equals(listaHoteles.get(i).getNombre())) && (destino == null ? listaHoteles.get(i).getDestino() == null : destino.equals(listaHoteles.get(i).getDestino()))) {
                listaRequisitos.add(listaHoteles.get(i));
            }
        }
        detallesHotel(listaRequisitos);
    }
    
    public void detallesHotel(ArrayList<Hotel> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
    public Hotel buscarHotelRes(int numreferencia){
        boolean encontrar = false;
        Hotel hotel = null;
        int i = 0;
        System.out.println(listaHoteles.size());
        while(i<listaHoteles.size() && encontrar == false){
            if(numreferencia == listaHoteles.get(i).getNumReferencia()){
                encontrar = true;
                hotel = listaHoteles.get(i);
            }
            i++;
        }
        return hotel;
    }
}
