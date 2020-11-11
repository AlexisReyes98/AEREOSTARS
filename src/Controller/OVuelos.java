/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorVuelos.Gestor_vuelos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author giova
 */
public class OVuelos implements ActionListener{
    
    private String origen;
    private String destino;
    private String tipo;
    private String costo;
    private String horaSalida;
    private String fecha;
    private String numReferencia;

    public OVuelos() {
    }

    public OVuelos(String destino, String origen, String tipo, String fecha, String horaSalida, String costo, String numReferencia) {
        this.origen = origen;
        this.destino = destino;
        this.tipo = tipo;
        this.costo = costo;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.numReferencia = numReferencia;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton button = (JButton) ae.getSource();
        String command = button.getActionCommand();
        if(command.equals("Agregar")){
            Gestor_vuelos gv = new Gestor_vuelos();
            //gv.agregarVuelo(destino,origen,tipo,fecha,horaSalida,Float.parseFloat(costo),Integer.parseInt(numReferencia));
            System.out.println(""+destino);
        }
    }
    
}
