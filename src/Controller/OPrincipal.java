/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorHoteles.*;
import Model.GestorPromociones.*;
import View.GUIEventos.*;
import View.GUIHoteles.*;
import View.GUIPrincipal.*;
import View.GUIPromociones.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import View.GUIReservacion.*;
import View.GUIVuelos.*;
import View.GUIPaquetes.*;
import View.GUIPago.*;
import View.GUICheck_in.*;
import View.GUIInformacion.*;

/**
 *
 * @author equipo aereostars
 */
public class OPrincipal implements ActionListener{
    JTextField jTextField1, jTextField2, jTextField3;
    JComboBox<String> jComboBox1;
    JComboBox<String> jComboBox2;
    JComboBox<String> jComboBox3;
    JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, btn_login;
    public GUIPrincipalSocio frm1;
    public GUIPrincipalInvitado frm2;
    
    //Admin
    public GUIPrincipalAdmin frm;
    
    //SOCIO
    public OPrincipal() {
        frm1 = new GUIPrincipalSocio();
        frm1.busca_so.addActionListener(this);
        jButton1 = frm1.busca_so;
        frm1.list_so.addActionListener(this);
        jComboBox1 = frm1.list_so;
        frm1.jTextField1.addActionListener(this);
        jTextField1 = frm1.jTextField1;
        frm1.list2_so.addActionListener(this);
        jComboBox2 = frm1.list2_so;
        frm1.reserva_so.addActionListener(this);
        jButton2 = frm1.reserva_so;
        frm1.jTextField2.addActionListener(this);
        jTextField2 = frm1.jTextField2;
        frm1.paga_so.addActionListener(this);
        jButton3 = frm1.paga_so;
        frm1.can_so.addActionListener(this);
        jButton4 = frm1.can_so;
        frm1.che_so.addActionListener(this);
        jButton5 = frm1.che_so;
        
        //Invitado
        frm2 = new GUIPrincipalInvitado();
        frm2.btn_invitadoLogin.addActionListener(this);
        btn_login=frm2.btn_invitadoLogin;
        frm2.buscar_serv.addActionListener(this);
        jButton6 = frm2.buscar_serv;
        frm2.lista_serv.addActionListener(this);
        jComboBox3 = frm2.lista_serv;
        frm2.jTextField1.addActionListener(this);
        jTextField3 = frm2.jTextField1;
        
        
        //Admin
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
    
    public OPrincipal(JTextField jTextField1, JTextField jTextField2, JComboBox<String> jComboBox1,
            JComboBox<String> jComboBox2, JButton jButton1, JButton jButton2, JButton jButton3,
            JButton jButton4, JButton jButton5) {
        this.jTextField1 = jTextField1;
        this.jTextField2 = jTextField2;
        this.jComboBox1 = jComboBox1;
        this.jComboBox2 = jComboBox2;
        this.jButton1 = jButton1;
        this.jButton2 = jButton2;
        this.jButton3 = jButton3;
        this.jButton4 = jButton4;
        this.jButton5 = jButton5;
    }

    public void iniciar(){
        frm.setTitle("Administrador");
        frm.setLocationRelativeTo(null);
        frm1.setTitle("Socio");
        frm1.setLocationRelativeTo(null);
        frm2.setTitle("Invitado");
        frm2.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frm.btn_adminAddEvento)){
            
            GUIAgregarEvento ge = new GUIAgregarEvento ();
            ge.setLocationRelativeTo(null);
            ge.setTitle("Agregar evento");
            ge.setVisible(true);
        }if(ae.getSource().equals(frm.btn_adminAddHotel)){
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
        }if(ae.getSource().equals(frm.btn_adminAddPaquete)){
            OPaquetes op = new OPaquetes();
            op.iniciar();
            op.frm.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminAddPromo)){         //Creo hay info repetida
            Promocion h = new Promocion();
            Relacion_promocion modC = new Relacion_promocion();
            GUIAgregarPromo frm = new GUIAgregarPromo();
            GUIBuscarPromos frm3 = new GUIBuscarPromos();
            GUIModificarPromo frm4 = new GUIModificarPromo();
            GUIEliminarPromo frm5 = new GUIEliminarPromo();
            OyentePromo op = new OyentePromo(h,modC,frm,frm3,frm4,frm5);
            op.iniciar();
            op.frm.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminAddVuelo)){
            OVuelos ov = new OVuelos();
            ov.iniciar();
            ov.frm.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminDelEvento)){
            GUIEliminarEvento ge = new GUIEliminarEvento ();
            ge.setLocationRelativeTo(null);
            ge.setTitle("Eliminar evento");
            ge.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminDelHotel)){
            Hotel h = new Hotel();
            Relacion_hoteles modC = new Relacion_hoteles();
            GUIAgregarHotel frm = new GUIAgregarHotel();
            GUIModificarHotel frm1 = new GUIModificarHotel();
            GUIEliminarHotel frm2 = new GUIEliminarHotel();
            GUIBuscarHotel frm3 = new GUIBuscarHotel();
            GUIHOTEL frm4 = new GUIHOTEL();
            OyenteHoteles oh = new OyenteHoteles(h,modC,frm,frm1,frm2,frm3,frm4);
            oh.iniciar();
            oh.frm2.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminDelPaquete)){
            OPaquetes op = new OPaquetes();
            op.iniciar();
            op.frm2.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminDelPromo)){
            Promocion h = new Promocion();
            Relacion_promocion modC = new Relacion_promocion();
            GUIAgregarPromo frm = new GUIAgregarPromo();
            GUIBuscarPromos frm3 = new GUIBuscarPromos();
            GUIModificarPromo frm4 = new GUIModificarPromo();
            GUIEliminarPromo frm5 = new GUIEliminarPromo();
            OyentePromo op = new OyentePromo(h,modC,frm,frm3,frm4,frm5);
            op.iniciar();
            op.frm5.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminDelVuelo)){
            OVuelos ov = new OVuelos();
            ov.iniciar();
            ov.frm2.setVisible(true);    
        }else if(ae.getSource().equals(frm.btn_adminModEvento)){
            GUIModificarEvento ge = new GUIModificarEvento ();
            ge.setLocationRelativeTo(null);
            ge.setTitle("Modificar evento");
            ge.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminModHotel)){
            Hotel h = new Hotel();
            Relacion_hoteles modC = new Relacion_hoteles();
            GUIAgregarHotel frm = new GUIAgregarHotel();
            GUIModificarHotel frm1 = new GUIModificarHotel();
            GUIEliminarHotel frm2 = new GUIEliminarHotel();
            GUIBuscarHotel frm3 = new GUIBuscarHotel();
            GUIHOTEL frm4 = new GUIHOTEL();
            OyenteHoteles oh = new OyenteHoteles(h,modC,frm,frm1,frm2,frm3,frm4);
            oh.iniciar();
            oh.frm1.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminModPaquete)){
            OPaquetes op = new OPaquetes();
            op.iniciar();
            op.frm3.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminModPromo)){
            Promocion h = new Promocion();
            Relacion_promocion modC = new Relacion_promocion();
            GUIAgregarPromo frm = new GUIAgregarPromo();
            GUIBuscarPromos frm3 = new GUIBuscarPromos();
            GUIModificarPromo frm4 = new GUIModificarPromo();
            GUIEliminarPromo frm5 = new GUIEliminarPromo();
            OyentePromo op = new OyentePromo(h,modC,frm,frm3,frm4,frm5);
            op.iniciar();
            op.frm4.setVisible(true);
        }else if(ae.getSource().equals(frm.btn_adminModVuelo)){
            OVuelos ov = new OVuelos();
            ov.iniciar();
            ov.frm3.setVisible(true);   
        }
        
        Object boton = ae.getSource();
        GUIBuscarVuelos vu = new GUIBuscarVuelos();
        GUIBuscarPaquetes pa = new GUIBuscarPaquetes();
        GUIBuscarHoteles h = new GUIBuscarHoteles();
        GUIBuscarPromos pr = new GUIBuscarPromos();
        GUIBuscarEventos e = new GUIBuscarEventos();
        GUIReservacion r = new GUIReservacion();
        GUIPago pago = new GUIPago();
        GUICancelarReservacion cr = new GUICancelarReservacion();
        GUICheck_in ch = new GUICheck_in();
        
        if(boton == btn_login){
            OAutenticacion oa = new OAutenticacion();
            oa.iniciar();
            oa.frm.setVisible(true);
        }
        
        //Socio
        String s1 = (String) jComboBox1.getSelectedItem();
        if(boton == jComboBox1){
            jTextField1.setText("Buscando -> "+s1+"... ");
        }
        if(boton == jButton1 && "Vuelos".equals(s1)){
            GUIBuscarVuelos vu2 = new GUIBuscarVuelos();
            vu2.setVisible(true);
        }
        if(boton == jButton1 && "Paquetes".equals(s1)){
            pa.setVisible(true);
        }
        if(boton == jButton1 && "Hoteles".equals(s1)){
            h.setVisible(true);
        }
        if(boton == jButton1 && "Promociones".equals(s1)){
            pr.setVisible(true);
        }
        if(boton == jButton1 && "Eventos".equals(s1)){
            e.setVisible(true);
        }
        
        String s2 = (String) jComboBox2.getSelectedItem();
        if(boton == jComboBox2){
            jTextField2.setText("Reservando -> "+s2+"... ");
        }
        if(boton == jButton2){
            r.setVisible(true);
        }
        if(boton == jButton3){
            pago.setVisible(true);
        }
        if(boton == jButton4){
            cr.setVisible(true);
        }
        if(boton == jButton5){
            ch.setVisible(true);
        }
        
        //Invitado
        String s3 = (String) jComboBox3.getSelectedItem();
        if(boton == jComboBox3){
            jTextField3.setText("Buscando -> "+s3+"... ");
        }
        if(boton == jButton6 && "Vuelos".equals(s3)){
            vu.setVisible(true);
        }
        if(boton == jButton6 && "Paquetes".equals(s3)){
            pa.setVisible(true);
        }
        if(boton == jButton6 && "Hoteles".equals(s3)){
            h.setVisible(true);
        }
        if(boton == jButton6 && "Promociones".equals(s3)){
            pr.setVisible(true);
        }
        if(boton == jButton6 && "Eventos".equals(s3)){
            e.setVisible(true);
        }
    }
    
}