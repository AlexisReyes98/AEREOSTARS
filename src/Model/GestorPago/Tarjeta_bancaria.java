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
public class Tarjeta_bancaria {
    private String tarjeta_credito;
    private String tarjeta_debito;

    public Tarjeta_bancaria() {
    }

    public Tarjeta_bancaria(String tarjeta_credito, String tarjeta_debito) {
        this.tarjeta_credito = tarjeta_credito;
        this.tarjeta_debito = tarjeta_debito;
    }

    public String getTarjeta_credito() {
        return tarjeta_credito;
    }

    public void setTarjeta_credito(String tarjeta_credito) {
        this.tarjeta_credito = tarjeta_credito;
    }

    public String getTarjeta_debito() {
        return tarjeta_debito;
    }

    public void setTarjeta_debito(String tarjeta_debito) {
        this.tarjeta_debito = tarjeta_debito;
    }
    
    public boolean verificaTarjeta() {
        
        return true;
    }
}
