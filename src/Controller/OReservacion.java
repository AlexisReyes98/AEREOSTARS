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
import View.GUIPrincipal.*;
import javax.swing.*;

/**
 *
 * @author equipo aereostars
 */
public class OReservacion implements ActionListener{
    JTextField jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8;
    JComboBox<String> jComboBox1;
    JButton jButton1, jButton2, jButton3, jButton4;
    JTextArea jTextArea1;

    public OReservacion(JTextField jTextField1, JTextField jTextField2, JTextField jTextField3, JTextField jTextField4,
            JTextField jTextField5, JComboBox<String> jComboBox1, JButton jButton1) {
        this.jTextField1 = jTextField1;
        this.jTextField2 = jTextField2;
        this.jTextField3 = jTextField3;
        this.jTextField4 = jTextField4;
        this.jTextField5 = jTextField5;
        this.jComboBox1 = jComboBox1;
        this.jButton1 = jButton1;
    }

    public OReservacion(JButton jButton2, JTextArea jTextArea1) {
        this.jButton2 = jButton2;
        this.jTextArea1 = jTextArea1;
    }

    public OReservacion(JTextField jTextField6, JTextField jTextField7, JTextField jTextField8, JButton jButton3, JButton jButton4) {
        this.jTextField6 = jTextField6;
        this.jTextField7 = jTextField7;
        this.jTextField8 = jTextField8;
        this.jButton3 = jButton3;
        this.jButton4 = jButton4;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object bot = ae.getSource();
        int i=0;
        Gestor_reservacion reserva = new Gestor_reservacion(jTextArea1);
        String seleccion = (String) jComboBox1.getSelectedItem();
        switch (seleccion) {
                case "Vuelo":
                    i=1;
                    break;
                case "Paquete":
                    i=2;
                    break;
                case "Hotel":
                    i=3;
                    break;
                default:
                    break;
        }
        if(bot==jComboBox1){
            jTextField5.setText("Efectuando de reservacion de un "+seleccion+"... ");
        }
        else if(bot==jButton1){
            Datos_pasajero pasajero;
            pasajero = reserva.ingresaDatosPasajero(jTextField2.getText(), jTextField3.getText(), jTextField4.getText());
            int numRef = Integer.parseInt(jTextField1.getText());
            reserva.generarReservacion(i, numRef, pasajero);
            new GUIComprobanteRes().setVisible(true);
        }
        else if(bot==jButton2){
            new GUIPrincipalSocio().setVisible(true);
        }
        else if(bot==jButton3){
            int numr = Integer.parseInt(jTextField6.getText());
            if(reserva.cancelarReservacion(numr) == true){
                jTextField7.setText("Comprobante encontrado...");
                jTextField8.setText("Comproante eliminado con exito!!!");
            }
            else{
                jTextField7.setText("Comprobante no encontrado...");
                jTextField8.setText("Comproante no eliminado!!!");
            }
        }
        else if(bot==jButton4){
            new GUIPrincipalSocio().setVisible(true);
        }
    }
    
}
