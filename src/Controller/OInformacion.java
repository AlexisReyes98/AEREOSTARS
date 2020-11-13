/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorInformacion.Gestor_info;
import Model.GestorVuelos.Vuelo;
import View.GUIInformacion.GUIBuscarEventos;
import View.GUIInformacion.GUIBuscarHoteles;
import View.GUIInformacion.GUIBuscarPaquetes;
import View.GUIInformacion.GUIBuscarPromo;
import View.GUIInformacion.GUIBuscarVuelos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author equipo aereostars
 */
public class OInformacion implements ActionListener, ListSelectionListener{
    
    public GUIBuscarEventos frm;
    public GUIBuscarHoteles frm1;
    public GUIBuscarPaquetes frm2;
    public GUIBuscarPromo frm3;
    public GUIBuscarVuelos frm4;
    ArrayList<Integer> vuelosIndex;
    Gestor_info gi = new Gestor_info();


    public OInformacion() {
        frm = new GUIBuscarEventos();
        frm1 = new GUIBuscarHoteles();
        frm2 = new GUIBuscarPaquetes();
        frm3 = new GUIBuscarPromo();
        frm4 = new GUIBuscarVuelos();
        
        frm4.btn_vuelosBuscar.addActionListener(this);
        frm4.cmb_vuelosDestino.addActionListener(this);
        frm4.cmb_vuelosOrigen.addActionListener(this);
        frm4.lst_vuelosLista.addListSelectionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("Buscar eventos");
        frm.setLocationRelativeTo(null);
        frm1.setTitle("Buscar hoteles");
        frm1.setLocationRelativeTo(null);
        frm2.setTitle("Buscar paquetes");
        frm2.setLocationRelativeTo(null);
        frm3.setTitle("Buscar vuelos");
        frm3.setLocationRelativeTo(null);
        frm4.setTitle("Buscar vuelos");
        frm4.setLocationRelativeTo(null);
        gi.solicitarVuelos();
        DefaultComboBoxModel arrayOrigen= new DefaultComboBoxModel();
        DefaultComboBoxModel arrayDestino= new DefaultComboBoxModel();
        for(int i = 0; i < gi.vuelos.listaVuelos.listaVuelos.size(); i++) {
            arrayOrigen.addElement(gi.vuelos.listaVuelos.listaVuelos.get(i).getOrigen());
            arrayDestino.addElement(gi.vuelos.listaVuelos.listaVuelos.get(i).getDestino());
        }
        frm4.cmb_vuelosDestino.setModel(arrayDestino);
        frm4.cmb_vuelosOrigen.setModel(arrayOrigen);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frm4.btn_vuelosBuscar)){
            ArrayList<Vuelo> tmp = gi.vuelos.listaVuelos.listaVuelos;
            DefaultComboBoxModel listVuelos= new DefaultComboBoxModel();
            vuelosIndex = new ArrayList<Integer>();
            for(int i=0;i<tmp.size();i++){
                if(tmp.get(i).getOrigen().equals(frm4.cmb_vuelosOrigen.getSelectedItem())&&
                   tmp.get(i).getDestino().equals(frm4.cmb_vuelosDestino.getSelectedItem())){
                    String origen = tmp.get(i).getOrigen();
                    String destino = tmp.get(i).getDestino();
                    String fecha = tmp.get(i).getFechaSalida();
                    String costo = String.valueOf(tmp.get(i).getCosto());
                    vuelosIndex.add(i);
                    listVuelos.addElement("Origen: "+origen + " Destino: " + destino + " Fecha: "+ fecha + " Costo: " + costo);
                }
            }
            frm4.lst_vuelosLista.setModel(listVuelos);
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()){
            JList source = (JList)e.getSource();
            int selected = source.getSelectedIndex();
            int fullIndex = vuelosIndex.get(selected);
            OVuelos ov = new OVuelos();
            ov.iniciar();
            ov.frm1.lbl_vueloDetDestino.setText(gi.vuelos.listaVuelos.listaVuelos.get(fullIndex).getDestino());
            ov.frm1.lbl_vueloDetOrigen.setText(gi.vuelos.listaVuelos.listaVuelos.get(fullIndex).getOrigen());
            ov.frm1.lbl_vueloDetFecha.setText(gi.vuelos.listaVuelos.listaVuelos.get(fullIndex).getFechaSalida());
            ov.frm1.lbl_vueloDetHora.setText(gi.vuelos.listaVuelos.listaVuelos.get(fullIndex).getHoraSalida());
            ov.frm1.lbl_vueloDetNum.setText(String.valueOf(gi.vuelos.listaVuelos.listaVuelos.get(fullIndex).getNumReferencia()));
            ov.frm1.lbl_vueloDetTipo.setText(gi.vuelos.listaVuelos.listaVuelos.get(fullIndex).getTipo());
            ov.frm1.setVisible(true);
            
        }
    }
    
}
