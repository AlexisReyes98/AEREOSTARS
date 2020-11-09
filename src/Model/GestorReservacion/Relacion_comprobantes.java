/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorReservacion;

import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Relacion_comprobantes {
    ArrayList<Comprobante_reservacion> tablaComprobante_reservacion = new ArrayList<>();
    
    public void agregarComprobante(Comprobante_reservacion comprobante){
        tablaComprobante_reservacion.add(comprobante);
        System.out.println("El comprobante se ha agregado con éxito.");
    }
    
    public Comprobante_reservacion buscarComprobanteRes(int num_ref){
        boolean encontrado = false;
        Comprobante_reservacion comprobante = null;
        int i = 0;
         while (i < tablaComprobante_reservacion.size() && encontrado == false){
            if (num_ref == tablaComprobante_reservacion.get(i).getIdReservacion()) {
                encontrado = true;
                comprobante = tablaComprobante_reservacion.get(i);
            }
            i++;
         }
        return comprobante;
    }
    
    public boolean eliminarComprobante(int num_referencia){
        boolean encontrado = false;
        int i = 0;
        while (i < tablaComprobante_reservacion.size() && encontrado == false){
            if (num_referencia == tablaComprobante_reservacion.get(i).getIdReservacion()) {
                encontrado = true;
                tablaComprobante_reservacion.remove(i);
            }
            i++;
        }
        return encontrado;
    }
    
}
