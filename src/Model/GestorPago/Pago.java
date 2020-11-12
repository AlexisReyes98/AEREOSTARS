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
public class Pago {
    private double cantidad_pago;

    public Pago() {
    }

    public Pago(double cantidad_pago) {
        this.cantidad_pago = cantidad_pago;
    }

    public double getCantidad_pago() {
        return cantidad_pago;
    }

    public void setCantidad_pago(double cantidad_pago) {
        this.cantidad_pago = cantidad_pago;
    }
    
    public boolean efectuaPago(){
        Datos_pago pago = new Datos_pago(getCantidad_pago());
        Comprobante_pago pagado = new Comprobante_pago(pago.getPago());
        
        return true;
    }
}
