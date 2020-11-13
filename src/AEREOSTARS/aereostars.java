/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREOSTARS;

import View.GUIAutenticacion.*;
import Controller.*;
import Model.GestorVuelos.*;
import View.GUIPrincipal.*;
import View.GUIReservacion.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
/**
 *
 * @author equipo aereostars
 */
public class aereostars {
    public static void main(String[] args) {
        //GUIAutenticacion ga = new GUIAutenticacion();
        //ga.setVisible(true);
        //Gestor_vuelos g = new Gestor_vuelos();
        //g.agregarVuelo("querataro", "mexico", "doble", "22/11/2020", "10:20", 1250, 63);
        //g.solicitarVuelo("querataro", "mexico");
        //Relacion_vuelos r= new Relacion_vuelos();
        //r.eliminarVuelo(63);
        //GUIAgregarVuelo f = new GUIAgregarVuelo();
        //f.inicializarOyentes();
        //f.setLocationRelativeTo(null);
        //f.setVisible(true);
        //GUIRegistro gr = new GUIRegistro();
        //OAutenticacion oa = new OAutenticacion(ga,gr);
        //oa.iniciar();
        //ga.setVisible(true);
        //GUIReservacion gr = new GUIReservacion();
        //gr.setVisible(true);
        //GUICancelarReservacion r = new GUICancelarReservacion();
        //r.setVisible(true);
        //GUIPrincipalAdmin ad = new GUIPrincipalAdmin();
        //ad.setVisible(true);
        /*GUIPrincipalSocio so = new GUIPrincipalSocio();
        so.setVisible(true);*/
        //GUIPrincipalInvitado in = new GUIPrincipalInvitado();
        //in.setVisible(true);
        
        //Abrir GUIAutenticacion
        /*OAutenticacion oa = new OAutenticacion();
        oa.iniciar();
        oa.frm.setVisible(true);
        */
        //Abrir OPrincipalAdmin
        JTextField jTextField1 = new JTextField();
        JTextField jTextField2 = new JTextField();
        JComboBox<String> jComboBox1 = new JComboBox<String>();
        JComboBox<String> jComboBox2 = new JComboBox<String>();
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();
        JButton jButton4 = new JButton();
        JButton jButton5 = new JButton();
        
        JTextField jTextField3 = new JTextField();
        JComboBox<String> jComboBox3= new JComboBox<String>();
        JButton jButton6= new JButton();
        
        OPrincipal op = new OPrincipal();
        op.iniciar();
        //op.frm.setVisible(true);
        //GUIPrincipalInvitado gpi = new GUIPrincipalInvitado();
        //gpi.setVisible(true);
        op.frm2.setVisible(true);
        //in.setVisible(true);
    }
}
