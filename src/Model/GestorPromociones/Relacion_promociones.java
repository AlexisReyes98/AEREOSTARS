/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPromociones;

import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Relacion_promociones {
    private final ArrayList<Promocion> listaPromos = new ArrayList<>();
    
    public void agregarPromocion(Promocion promo){
        listaPromos.add(promo);
    }
    
    public boolean eliminarPromocion(int numreferencia){
        boolean encontrar = false;
        int i=0;
        while(i<listaPromos.size() && encontrar == false){
            if(numreferencia == listaPromos.get(i).getNumReferencia()){
               listaPromos.remove(i);
               encontrar = true;
            }
        }
        return encontrar;
    }
    
    public void modificarPromocion(){
        
    }
    
    public void solicitarPromocion(String nombre){
        ArrayList<Promocion> listaRequisitos = new ArrayList<>();
        
        for (int i = 0; i < listaPromos.size(); i++) {
            if ((nombre == null ? listaPromos.get(i).getNombre() == null : nombre.equals(listaPromos.get(i).getNombre()))) {
                listaRequisitos.add(listaPromos.get(i));
            }
        }
        detallesPromocion(listaRequisitos);
    }
    
    public void detallesPromocion(ArrayList<Promocion> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
}
