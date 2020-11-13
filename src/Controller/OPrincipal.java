/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorHoteles.Hotel;
import Model.GestorHoteles.Relacion_hoteles;
import Model.GestorPromociones.Promocion;
import Model.GestorPromociones.Relacion_promocion;
import View.GUIEventos.GUIAgregarEvento;
import View.GUIHoteles.GUIAgregarHotel;
import View.GUIHoteles.GUIBuscarHotel;
import View.GUIHoteles.GUIEliminarHotel;
import View.GUIHoteles.GUIHOTEL;
import View.GUIHoteles.GUIModificarHotel;
import View.GUIPrincipal.GUIPrincipalAdmin;
import View.GUIPromociones.GUIAgregarPromo;
import View.GUIPromociones.GUIBuscarPromo;
import View.GUIPromociones.GUIEliminarPromo;
import View.GUIPromociones.GUIModificarPromo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author equipo aereostars
 */
public class OPrincipal implements ActionListener{
    
    public GUIPrincipalAdmin frm;

    public OPrincipal() {
        frm = new GUIPrincipalAdmin();
        frm.btn_adminAddEvento.addActionListener(this);
        frm.btn_adminAddHotel.addActionListener(this);
        frm.btn_adminAddPaquete.addActionListener(this);
        frm.btn_adminAddPromo.addActionListener(this);
        frm.btn_adminAddVuelo.addActionListener(this);
        frm.btn_adminDelEvento.addActionListener(this);
        frm.btn_adminDelHotel.addActionListener(this);
        frm.btn_adminDelPaquete.addActionListener(this);
        frm.btn_adminDelPromo.addActionListener(this);
        frm.btn_adminDelVuelo.addActionListener(this);
        frm.btn_adminModEvento.addActionListener(this);
        frm.btn_adminModHotel.addActionListener(this);
        frm.btn_adminModPaquete.addActionListener(this);
        frm.btn_adminModPromo.addActionListener(this);
        frm.btn_adminModVuelo.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("Administrador");
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frm.btn_adminAddEvento)){
            GUIAgregarEvento ge = new GUIAgregarEvento ();
            ge.setLocationRelativeTo(null);
            ge.setTitle("Agregar evento");
            ge.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminAddHotel)){
            Hotel h = new Hotel();
            Relacion_hoteles modC = new Relacion_hoteles();
            GUIAgregarHotel frm = new GUIAgregarHotel();
            GUIModificarHotel frm1 = new GUIModificarHotel();
            GUIEliminarHotel frm2 = new GUIEliminarHotel();
            GUIBuscarHotel frm3 = new GUIBuscarHotel();
            GUIHOTEL frm4 = new GUIHOTEL();
            OyenteHoteles oh = new OyenteHoteles(h,modC,frm,frm1,frm2,frm3,frm4);
            oh.iniciar();
            oh.frm.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminAddPaquete)){
            OPaquetes op = new OPaquetes();
            op.iniciar();
            op.frm.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminAddPromo)){
            Promocion h = new Promocion();
            Relacion_promocion modC = new Relacion_promocion();
            GUIAgregarPromo frm = new GUIAgregarPromo();
            GUIBuscarPromo frm3 = new GUIBuscarPromo();
            GUIModificarPromo frm4 = new GUIModificarPromo();
            GUIEliminarPromo frm5 = new GUIEliminarPromo();
            OyentePromo op = new OyentePromo(h,modC,frm,frm3,frm4,frm5);
            op.iniciar();
            op.frm.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminAddVuelo)){
            OVuelos ov = new OVuelos();
            ov.iniciar();
            ov.frm.setVisible(true);
        }
    }
    
}
