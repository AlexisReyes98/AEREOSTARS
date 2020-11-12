/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorCheck_in;

import Model.GestorReservacion.*;

/**
 *
 * @author equipo aereostars
 */
public class Check_in {
    Relacion_comprobantes comprobantes = new Relacion_comprobantes();
    Comprobante_reservacion comprobante = new Comprobante_reservacion();
    Pase_abordar paseAbordar;

    public Pase_abordar realizarCheckIn(int ID_reservacion, int opcion){
        comprobante = comprobantes.buscarComprobanteRes(ID_reservacion);
        if (opcion == 1){   //Vuelo
            paseAbordar = new Pase_abordar(comprobante.getVuelo().getVuelo().getDestino(), comprobante.getVuelo().getVuelo().getOrigen(), comprobante.getVuelo().getNumAsiento(), comprobante.getVuelo().getVuelo().getHoraSalida(), comprobante.getIdReservacion());
        }
        else if(opcion == 2){   //Paquete
            paseAbordar = new Pase_abordar(comprobante.getPaquete().getPaquete().getDestino(), comprobante.getPaquete().getPaquete().getOrigen(), comprobante.getPaquete().getNumAsiento(), comprobante.getPaquete().getPaquete().getHoraSalida(), comprobante.getIdReservacion());
        }
        return paseAbordar;
    }
}
