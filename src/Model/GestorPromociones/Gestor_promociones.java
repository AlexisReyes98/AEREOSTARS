/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPromociones;

/**
 *
 * @author equipo aereostars
 */
public class Gestor_promociones {
    public Relacion_promocion listaPromos = new Relacion_promocion();
    
    public void agregarPromocion(int id, int numreferencia, String nombre, String descripcion, String vigencia){
        Promocion nuevo = new Promocion(id, numreferencia, nombre, descripcion, vigencia);
        listaPromos.registrar(nuevo);
    }
    
    public void eliminarPromocion(int numReferencia){
        /*if(listaPromos.eliminarPromocion(numReferencia) == false){
            System.out.println("No se encontro el vuelo con el número de referencia dado.");
        }*/
    }
    
    public void modificarPromocion(){
        
    }
    
    public void solicitarPromocion(String nombre){
        //listaPromos.solicitarPromocion(nombre);
    }
}
