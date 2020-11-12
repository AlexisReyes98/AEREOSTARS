/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPago;

import Model.GestorReservacion.*;

/**
 *
 * @author equipo aereostars
 */
public class Gestor_pago {
    Pago pago = new Pago();
    Tarjeta_bancaria tarjeta_bancaria = new Tarjeta_bancaria();
    Relacion_comprobantes relacion_comprobantes = new Relacion_comprobantes();
    Comprobante_reservacion comprobante_reservacion = new Comprobante_reservacion();

    public Gestor_pago() {
    }
    
    public Comprobante_reservacion solicita_Pago(int n) {
        
        return relacion_comprobantes.buscarComprobanteRes(n);
    }
    
    public void proporcionaTarjeta(int tipo, String tarjeta) {
        switch(tipo){
            case 1:
                tarjeta_bancaria.setTarjeta_credito(tarjeta);
                if(tarjeta_bancaria.verificaTarjeta() == true){
                    //pago.setCantiidad_pago(comprobante_reservacion.getPago());
                    pago.efectuaPago();
                }
                break;
            case 2:
                tarjeta_bancaria.setTarjeta_debito(tarjeta);
                if(tarjeta_bancaria.verificaTarjeta() == true){
                    //pago.setCantiidad_pago(comprobante_reservacion.getPago());
                    pago.efectuaPago();
                }
                break;
            default:
                break;
        }
    }
}
