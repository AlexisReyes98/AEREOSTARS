/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.GestorReservacion.*;
import View.GUIReservacion.*;

/**
 *
 * @author equipo aereostars
 */
public class OReservacion implements ActionListener{
    public GUIReservacion res;
    public GUIComprobanteRes comp;
    public GUICancelarReservacion can;

    public OReservacion() {
    }

    public OReservacion(GUIReservacion res, GUIComprobanteRes comp, GUICancelarReservacion can) {
        this.res = res;
        this.comp = comp;
        this.can = can;
        
        this.res.jButton1.addActionListener(this);
    }
    
    public void iniciar(){
        res.setTitle("Reservacion");
        res.setLocationRelativeTo(null);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(res.jButton1)){
            Datos_pasajero p;
            Gestor_reservacion reserva = new Gestor_reservacion();
            p = reserva.ingresaDatosPasajero(res.jTextField2.getText(), res.jTextField3.getText(), res.jTextField4.getText());
            
        }
    }
    
}
