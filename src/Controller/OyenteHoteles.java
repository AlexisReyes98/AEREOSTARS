/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorHoteles.*;
import View.GUIHoteles.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class OyenteHoteles implements ActionListener {
    public Hotel h;
    public Relacion_hoteles modC;
    public GUIAgregarHotel frm;
    public GUIModificarHotel frm1;
    public GUIEliminarHotel frm2;
    public GUIBuscarHotel frm3;
    public GUIHOTEL frm4;
    
    public OyenteHoteles(Hotel h,Relacion_hoteles modC,GUIAgregarHotel frm, GUIModificarHotel frm1,GUIEliminarHotel frm2, GUIBuscarHotel frm3, GUIHOTEL frm4){
        this.h=h;
        this.modC=modC;
        this.frm=frm;
        this.frm1=frm1;
        this.frm2=frm2;
        this.frm3=frm3;
        this.frm4=frm4;
        
        this.frm.btn_agregar.addActionListener(this);
        
        this.frm1.btn_buscar.addActionListener(this);
        this.frm1.btn_modificar.addActionListener(this);
        
        this.frm2.btn_eliminar.addActionListener(this);
        this.frm2.btn_buscar1.addActionListener(this);
        
        this.frm3.btn_buscar2.addActionListener(this);
        //menu principal
        this.frm4.btn_agregarhotel.addActionListener(this);
        
      
    }
   public OyenteHoteles(){
       
   }
    //
    public void iniciar(){
        frm.setTitle("HOTELES");
        frm.setLocationRelativeTo(null);
        frm.txt_id.setVisible(false);
    }
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frm.btn_agregar){
            h.setNumreferencia(Integer.parseInt(frm.txtnumref.getText()));
            h.setNombre(frm.txtnombre.getText());
            h.setDestino(frm.txtdireccion.getText());
            h.setNumestrellas(Integer.parseInt(frm.txtnumestre.getText()));
            h.setCosto(Double.parseDouble(frm.txtcosto.getText()));
            //h.setid(Integer.parseInt(frm.txt_id.getText()));
            
             if(modC.registrar(h)){
                 JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                 limpiar();
             }
             else{
                 JOptionPane.showMessageDialog(null, "registro no guardado");
                 limpiar();
             }
        }
        if(e.getSource()==frm1.btn_buscar){
            
            h.setNumreferencia(Integer.parseInt(frm1.txtnumref.getText()));
            
            if(modC.buscar(h)){
                 
                 frm1.txtnumref.setText(String.valueOf(h.getNumreferencia()));
                 frm1.txtnombre.setText(h.getnombre());
                 frm1.txtdestino.setText(h.getdestino());
                 frm1.txtestre.setText(String.valueOf(h.getNumestrellas()));
                 frm1.txtcosto.setText(String.valueOf(h.getcosto()));
                 
                    
                
            
            }
            
            else{
                 JOptionPane.showMessageDialog(null, "no encontrado");
                 limpiar();
             }
            
        }
        
        if(e.getSource()==frm1.btn_modificar){
            h.setNumreferencia(Integer.parseInt(frm1.txtnumref.getText()));
            h.setNombre(frm1.txtnombre.getText());
            h.setDestino(frm1.txtdestino.getText());
            h.setNumestrellas(Integer.parseInt(frm1.txtestre.getText()));
            h.setCosto(Double.parseDouble(frm1.txtcosto.getText()));
            
             if(modC.modificar(h)){
                 JOptionPane.showMessageDialog(null, "registo modificado");
                 limpiar();
             }
             else{
                 JOptionPane.showMessageDialog(null, "error la modificar");
                 limpiar();
             }
        
}
           
        
         
         
         
         if(e.getSource()==frm2.btn_eliminar){
            h.setNumreferencia(Integer.parseInt(frm2.txtnumref.getText()));
            
             if(modC.eliminar(h)){
                 JOptionPane.showMessageDialog(null, "registro eliminado");
                 limpiar();
             }
             else{
                 JOptionPane.showMessageDialog(null, "error al eliminar");
                 limpiar();
             }
        
        }
         
           if(e.getSource()==frm2.btn_buscar1){
            
            h.setNumreferencia(Integer.parseInt(frm2.txtnumref.getText()));
            
            if(modC.buscar(h)){
                 
                 frm2.txtnumref.setText(String.valueOf(h.getNumreferencia()));
                 frm2.txtnombre.setText(h.getnombre());
                 frm2.txtorigen.setText(h.getdestino());
                 frm2.txtestrellas.setText(String.valueOf(h.getNumestrellas()));
                 frm2.txtcosto.setText(String.valueOf(h.getcosto()));
                 
                    
                
            
            }
            
            else{
                 JOptionPane.showMessageDialog(null, "no encontrado");
                 limpiar();
             }
            
        }
         
         
          if(e.getSource()==frm3.btn_buscar2){
            h.setNumreferencia(Integer.parseInt(frm3.txtnumref.getText()));
            
             if(modC.buscar(h)){
                 
                 frm3.txtnumref.setText(String.valueOf(h.getNumreferencia()));
                 frm3.txtnombre.setText(h.getnombre());
                 frm3.txtorigen.setText(h.getdestino());
                 frm3.txtestrellas.setText(String.valueOf(h.getNumestrellas()));
                 frm3.txtcosto.setText(String.valueOf(h.getcosto()));
                 
                         
                 
                
             }
             else{
                 JOptionPane.showMessageDialog(null, "no encontrado");
                 limpiar1();
             }
        
}
           if(e.getSource()==frm3.btnlimpiar){
               limpiar1();
           }
           
              if(e.getSource()==frm4.btn_agregarhotel){
                  
              }
           
           
        
        
    
} 
    
    public void limpiar(){
        
        
        frm.txtnumref.setText(null);
        frm.txtnombre.setText(null);
        frm.txtdireccion.setText(null);
        frm.txtnumestre.setText(null);
        frm.txtcosto.setText(null);
    }
    public void limpiar1(){
      
       
        frm3.txtnumref.setText(null);
        frm3.txtnombre.setText(null);
        frm3.txtorigen.setText(null);
        frm3.txtestrellas.setText(null);
        frm3.txtcosto.setText(null);
    }

}
