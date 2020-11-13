/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.GUIPrincipal.*;
import Model.GestorAutenticacion.Cuenta_usuario;
import Model.GestorAutenticacion.Gestor_autenticacion;
import View.GUIAutenticacion.GUIAutenticacion;
import View.GUIAutenticacion.GUIRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author equipo aereostars
 */
public class OAutenticacion implements ActionListener{
    public GUIAutenticacion frm;
    public GUIRegistro frm1;
    
    
    public OAutenticacion(){
        frm = new GUIAutenticacion();
        frm1=new GUIRegistro();    
        frm.btn_authLogin.addActionListener(this);
        frm.btn_authReg.addActionListener(this);
        
        frm1.btn_regExit.addActionListener(this);
        frm1.btn_register.addActionListener(this);
    }
   
    public void iniciar(){
        frm.setTitle("Autenticacion");
        frm.setLocationRelativeTo(null);
        frm1.setTitle("Registro");
        frm1.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        GUIPrincipalAdmin admin = new GUIPrincipalAdmin();
        GUIPrincipalInvitado inv = new GUIPrincipalInvitado();
        GUIPrincipalSocio so = new GUIPrincipalSocio();
        if(e.getSource().equals(frm.btn_authLogin)){
            Gestor_autenticacion ga = new Gestor_autenticacion();
            if(ga.iniciarSesion(frm.txt_authUser.getText(), frm.txt_authPwd.getText())){
                JOptionPane.showMessageDialog(null, "Bienvenido "+frm.txt_authUser.getText());
                frm.dispose();
                //Aqui abrir GUIPrincipal de Socio 
                so.setVisible(true);
            }else if(ga.iniciarSesionAdmin(frm.txt_authUser.getText(), frm.txt_authPwd.getText())){
                JOptionPane.showMessageDialog(null, "Bienvenido admin");
                frm.dispose();
                //Aqui abrir GUIPrincipal de Admin
                admin.setVisible(true);
            }else if(frm.txt_authPwd.getText().isEmpty()||frm.txt_authUser.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No has llenado todos los campos");
            }else{
                JOptionPane.showMessageDialog(null, "Los datos son incorrectos");
            }
        }if(e.getSource().equals(frm.btn_authReg)){
            frm.dispose();
            frm1.setVisible(true);
        }if(e.getSource().equals(frm1.btn_regExit)){
            frm1.dispose();
        }if(e.getSource().equals(frm1.btn_register)){
            if(frm1.txt_regEmail.getText().isEmpty()||frm1.txt_regName.getText().isEmpty()||frm1.txt_regPwd.getText().isEmpty()||frm1.txt_regUser.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No has llenado todos los campos");
            }else{
                Gestor_autenticacion ga = new Gestor_autenticacion();
                ga.registrarSocio(frm1.txt_regName.getText(), 0, frm1.txt_regUser.getText(), frm1.txt_regPwd.getText());
                JOptionPane.showMessageDialog(null, "Te has registrado satisfactoriamente");
                //Aqui abrir GUIPrincipal de Socio 
                so.setVisible(true);
            }
        }
    }
}
