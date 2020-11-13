/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorEventos.Evento;
import Model.GestorHoteles.Hotel;
import Model.GestorPaquetes.Gestor_paquetes;
import View.GUIPaquetes.GUIAgregarPaquete;
import View.GUIPaquetes.GUIDetallesPaquete;
import View.GUIPaquetes.GUIEliminarPaquete;
import View.GUIPaquetes.GUIModificarPaquete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author equipo aereostars
 */
public class OPaquetes implements ActionListener{
    
    public GUIAgregarPaquete frm;
    public GUIDetallesPaquete frm1;
    public GUIEliminarPaquete frm2;
    public GUIModificarPaquete frm3;
    String seleccionado="";

    public OPaquetes() {
        frm = new GUIAgregarPaquete(); 
        frm1 = new GUIDetallesPaquete();
        frm2 = new GUIEliminarPaquete();
        frm3 = new GUIModificarPaquete();
        
        frm.btn_agregarPaquete.addActionListener(this);
        frm.btn_cancelarAgregarPaquete.addActionListener(this);
        
        frm1.btn_paqDetBack.addActionListener(this);
        
        frm2.btn_paqDel.addActionListener(this);
        frm2.btn_paqDelClose.addActionListener(this);
        
        frm3.btn_paqModExit.addActionListener(this);
        frm3.btn_paqModSubmit.addActionListener(this);
        frm3.rad_paqCosto.addActionListener(this);
        frm3.rad_paqDestino.addActionListener(this);
        frm3.rad_paqFecha.addActionListener(this);
        frm3.rad_paqHora.addActionListener(this);
        frm3.rad_paqOrigen.addActionListener(this);
        frm3.rad_paqTipo.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("Agregar paquete");
        frm.setLocationRelativeTo(null);
        frm1.setTitle("Detalles de paquete");
        frm1.setLocationRelativeTo(null);
        frm2.setTitle("Eliminar paquete");
        frm2.setLocationRelativeTo(null);
        frm3.setTitle("Modificar paquete");
        frm3.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frm.btn_agregarPaquete)){
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
                Gestor_paquetes gv = new Gestor_paquetes();
                gv.agregarPaquete(destino, origen, tipo, fechaSalida, horaSalida, costo, referencia,new Evento(),new Hotel());
                JOptionPane.showMessageDialog(null, "El paquete se ha agregado satisfactoriamente");
            }
        }else if(ae.getSource().equals(frm.btn_cancelarAgregarPaquete)){
            frm.dispose();
        }else if(ae.getSource().equals(frm1.btn_paqDetBack)){
            frm1.dispose();
        }else if(ae.getSource().equals(frm2.btn_paqDelClose)){
            frm2.dispose();
        }else if(ae.getSource().equals(frm2.btn_paqDel)){
            if(frm2.txt_inputDePaqNum.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No has llenado el campo");
            }else{
                int numReferencia = Integer.parseInt(frm2.txt_inputDePaqNum.getText());
                Gestor_paquetes gv = new Gestor_paquetes();
                if(gv.eliminarPaquete(numReferencia)){
                    JOptionPane.showMessageDialog(null, "Se ha borrado satisfactoriamente");
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido borrar, verifica los datos.");
                }
            }
        }else if(ae.getSource().equals(frm3.btn_paqModExit)){
            frm3.dispose();
        }else if(ae.getSource().equals(frm3.btn_paqModSubmit)){
            if(frm3.txt_paqModRef.getText().isEmpty()||frm3.txt_paqModValue.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No has llenado todos los campos");
            }else{
                int campo = 0;
                if(seleccionado.equals("Costo")) campo = 0;
                else if(seleccionado.equals("Destino")) campo = 1;
                else if(seleccionado.equals("Fecha de salida")) campo = 2;
                else if(seleccionado.equals("Hora de salida")) campo = 3;
                else if(seleccionado.equals("Origen")) campo = 4;
                else if(seleccionado.equals("Tipo")) campo = 5;
                String value = frm3.txt_paqModValue.getText();
                String ref = frm3.txt_paqModRef.getText();
                Gestor_paquetes gv = new Gestor_paquetes();
                try {
                    gv.modificarpaquete(Integer.parseInt(ref),campo,value);
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
