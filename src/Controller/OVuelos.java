/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorVuelos.Gestor_vuelos;
import View.GUIVuelos.GUIAgregarVuelo;
import View.GUIVuelos.GUIDetallesVuelo;
import View.GUIVuelos.GUIEliminarVuelo;
import View.GUIVuelos.GUIModificarVuelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author equipo aereostars
 */
public class OVuelos implements ActionListener{
    
    public GUIAgregarVuelo frm;
    public GUIDetallesVuelo frm1;
    public GUIEliminarVuelo frm2;
    public GUIModificarVuelo frm3;
    String seleccionado="";

    public OVuelos() {
    }

    public OVuelos(GUIAgregarVuelo frm, GUIDetallesVuelo frm1, GUIEliminarVuelo frm2, GUIModificarVuelo frm3) {
        this.frm = frm;
        this.frm1 = frm1;
        this.frm2 = frm2;
        this.frm3 = frm3;
        
        this.frm.btn_agregarVuelo.addActionListener(this);
        this.frm.btn_cancelarAgregarVuelo.addActionListener(this);
        
        this.frm1.btn_vueloDetBack.addActionListener(this);
        
        this.frm2.btn_vueloDel.addActionListener(this);
        this.frm2.btn_vueloDelClose.addActionListener(this);
        
        this.frm3.btn_vueloModClose.addActionListener(this);
        this.frm3.btn_vueloModSubmit.addActionListener(this);
        this.frm3.rad_vueloCosto.addActionListener(this);
        this.frm3.rad_vueloDestino.addActionListener(this);
        this.frm3.rad_vueloFecha.addActionListener(this);
        this.frm3.rad_vueloHora.addActionListener(this);
        this.frm3.rad_vueloOrigen.addActionListener(this);
        this.frm3.rad_vueloTipo.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("Agregar vuelo");
        frm.setLocationRelativeTo(null);
        frm1.setTitle("Detalles de vuelo");
        frm1.setLocationRelativeTo(null);
        frm2.setTitle("Eliminar vuelo");
        frm2.setLocationRelativeTo(null);
        frm3.setTitle("Modificar vuelo");
        frm3.setLocationRelativeTo(null);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frm.btn_agregarVuelo)){
            if(frm.txt_inputAddCosto.getText().isEmpty()||frm.txt_inputAddDestino.getText().isEmpty()||
               frm.txt_inputAddHoraSalida.getText().isEmpty()||frm.txt_inputAddFecha.getText().isEmpty()||
               frm.txt_inputAddNumRef.getText().isEmpty()||frm.txt_inputAddOrigen.getText().isEmpty()||
               frm.txt_inputAddTipo.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "No has llenado todos los campos");
            }else{
                String origen = frm.txt_inputAddOrigen.getText();
                String destino = frm.txt_inputAddDestino.getText();
                String tipo = frm.txt_inputAddTipo.getText();
                String fechaSalida = frm.txt_inputAddFecha.getText();
                String horaSalida = frm.txt_inputAddHoraSalida.getText();
                float costo = Float.parseFloat(frm.txt_inputAddCosto.getText());
                int referencia = Integer.parseInt(frm.txt_inputAddNumRef.getText());
                Gestor_vuelos gv = new Gestor_vuelos();
                gv.agregarVuelo(destino, origen, tipo, fechaSalida, horaSalida, costo, referencia);
                JOptionPane.showMessageDialog(null, "El vuelo se ha agregado satisfactoriamente");
            }
        }else if(ae.getSource().equals(frm.btn_cancelarAgregarVuelo)){
            frm.dispose();
        }else if(ae.getSource().equals(frm1.btn_vueloDetBack)){
            frm1.dispose();
        }else if(ae.getSource().equals(frm2.btn_vueloDelClose)){
            frm2.dispose();
        }else if(ae.getSource().equals(frm2.btn_vueloDel)){
            if(frm2.txt_inputDelVueloNum.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No has llenado el campo");
            }else{
                int numReferencia = Integer.parseInt(frm2.txt_inputDelVueloNum.getText());
                Gestor_vuelos gv = new Gestor_vuelos();
                if(gv.eliminarVuelo(numReferencia)){
                    JOptionPane.showMessageDialog(null, "Se ha borrado satisfactoriamente");
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido borrar, verifica los datos.");
                }
            }
        }else if(ae.getSource().equals(frm3.btn_vueloModClose)){
            frm3.dispose();
        }else if(ae.getSource().equals(frm3.btn_vueloModSubmit)){
            if(frm3.txt_vueloModRef.getText().isEmpty()||frm3.txt_vueloModValue.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No has llenado todos los campos");
            }else{
                int campo = 0;
                if(seleccionado.equals("Costo")) campo = 0;
                else if(seleccionado.equals("Destino")) campo = 1;
                else if(seleccionado.equals("Fecha de salida")) campo = 2;
                else if(seleccionado.equals("Hora de salida")) campo = 3;
                else if(seleccionado.equals("Origen")) campo = 4;
                else if(seleccionado.equals("Tipo")) campo = 5;
                String value = frm3.txt_vueloModValue.getText();
                String ref = frm3.txt_vueloModRef.getText();
                Gestor_vuelos gv = new Gestor_vuelos();
                System.out.println("hola y campo vale:"+campo);
                try {
                    gv.modificarVuelo(Integer.parseInt(ref),campo,value);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar");
                    Logger.getLogger(OVuelos.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Se ha modificado satisfactoriamente");
            }
        }else if(ae.getActionCommand().equals("Origen")){
            seleccionado = ae.getActionCommand();
        }else if(ae.getActionCommand().equals("Destino")){
            seleccionado = ae.getActionCommand();
        }else if(ae.getActionCommand().equals("Fecha de salida")){
            seleccionado = ae.getActionCommand();
        }else if(ae.getActionCommand().equals("Hora de salida")){
            seleccionado = ae.getActionCommand();
        }else if(ae.getActionCommand().equals("Tipo")){
            seleccionado = ae.getActionCommand();
        }else if(ae.getActionCommand().equals("Costo")){
            seleccionado = ae.getActionCommand();
        }
        
    }
    
}
