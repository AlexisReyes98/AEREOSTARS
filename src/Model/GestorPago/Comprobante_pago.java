/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPago;

/**
 *
 * @author giova
 */
public class Comprobante_pago {
    private double monto_pagado;

    public Comprobante_pago(double monto_pagado) {
        this.monto_pagado = monto_pagado;
    }

    public double getMonto_pagado() {
        return monto_pagado;
    }

    public void setMonto_pagado(double monto_pagado) {
        this.monto_pagado = monto_pagado;
    }

    @Override
    public String toString() {
        return "Comprobante de pago{" + "monto_pagado=" + monto_pagado + '}';
    }
    
}
