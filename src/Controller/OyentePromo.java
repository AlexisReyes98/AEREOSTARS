/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorPromociones.*;
import View.GUIPromociones.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author jovan
 */
public class OyentePromo implements ActionListener {
    
    public Promocion h;
    public Relacion_promocion modC;
    public GUIAgregarPromo frm;
    public GUIBuscarPromo frm3;
    public GUIModificarPromo frm4;
    public GUIEliminarPromo frm5;
    
    
    public OyentePromo(Promocion h, Relacion_promocion modC,GUIAgregarPromo frm,GUIBuscarPromo frm3, GUIModificarPromo frm4,GUIEliminarPromo frm5){
        this.h=h;
        this.modC=modC;
        this.frm=frm;
        this.frm3=frm3;
        this.frm4=frm4;
        this.frm5=frm5;
                
        
        //agregar
        this.frm.btn_agregar.addActionListener(this);
        //buscar
        this.frm3.btn_buscar2.addActionListener(this);
        //Modificar
        this.frm4.btn_modificar.addActionListener(this);
        this.frm4.btn_buscar3.addActionListener(this);
        //eliminar
        this.frm5.btn_buscar4.addActionListener(this);
        this.frm5.btn_eliminar.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("PROMOCION");
        frm.setLocationRelativeTo(null);
        frm.txtid.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frm.btn_agregar){
            h.setNumreferencia(Integer.parseInt(frm.txtnumref.getText()));
            h.setNombre(frm.txtnombre.getText());
            h.setDescripcion(frm.txtdesc.getText());
            h.setVigencia(frm.txtvigencia.getText());
            //h.setid(Integer.parseInt(frm.txt_id.getText()));
            
             if(modC.registrar(h)){
                 JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                
             }
             else{
                 JOptionPane.showMessageDialog(null, "registro no guardado");
                
             }
        }
        
        
         
        if(e.getSource()==frm3.btn_buscar2){
            h.setNumreferencia(Integer.parseInt(frm3.txtnumref.getText()));
            
             if(modC.buscar(h)){
                 
                 frm3.txtnumref.setText(String.valueOf(h.getNumreferencia()));
                 frm3.txtnombre.setText(h.getNombre());
                 frm3.txtdesc.setText(h.getDescripcion());
                 frm3.txtvigencia.setText(h.getVigencia());
                 
                         
                 
                
             }
             else{
                 JOptionPane.showMessageDialog(null, "no encontrado");
        
             }
        
        }
        
        if(e.getSource()==frm4.btn_buscar3){
            
            h.setNumreferencia(Integer.parseInt(frm4.txtnumref.getText()));
            
            if(modC.buscar(h)){
                 
                 frm4.txtnumref.setText(String.valueOf(h.getNumreferencia()));
                 frm4.txtnombre.setText(h.getNombre());
                 frm4.txtdesc.setText(h.getDescripcion());
                 frm4.txtvigencia.setText(h.getVigencia());
               
                    
                
            
            }
            
            else{
                 JOptionPane.showMessageDialog(null, "no encontrado");
           
             }
            
        }
        
        
        
        //MODIFICAR
        if(e.getSource()==frm4.btn_modificar){
            h.setNumreferencia(Integer.parseInt(frm4.txtnumref.getText()));
            h.setNombre(frm4.txtnombre.getText());
            h.setDescripcion(frm4.txtdesc.getText());
            h.setVigencia(frm4.txtvigencia.getText());
        
            
             if(modC.modificar(h)){
                 JOptionPane.showMessageDialog(null, "registo modificado");
                 
             }
             else{
                 JOptionPane.showMessageDialog(null, "error la modificar");
                 
             }
        }
        
        
        //eliminar
        
         if(e.getSource()==frm5.btn_buscar4){
            
            h.setNumreferencia(Integer.parseInt(frm5.txtnumref.getText()));
            
            if(modC.buscar(h)){
                 
                 frm5.txtnumref.setText(String.valueOf(h.getNumreferencia()));
                 frm5.txtnombre.setText(h.getNombre());
                 frm5.txtdesc.setText(h.getDescripcion());
                 frm5.txtvigencia.setText(h.getVigencia());
                 
                
                    
                
            
            }
            
            else{
                 JOptionPane.showMessageDialog(null, "no encontrado");
                 
             }
            
        }
        
        
        
          if(e.getSource()==frm5.btn_eliminar){
            h.setNumreferencia(Integer.parseInt(frm5.txtnumref.getText()));
            
             if(modC.eliminar(h)){
                 JOptionPane.showMessageDialog(null, "registro eliminado");
                 
             }
             else{
                 JOptionPane.showMessageDialog(null, "error al eliminar");
                 
             }
        
        }
        
        
        
    }
    
    
}
