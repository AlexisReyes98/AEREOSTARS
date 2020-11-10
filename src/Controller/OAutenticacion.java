/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.GUIAutenticacion.GUIAutenticacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author giova
 */
public class OAutenticacion implements ActionListener{
    private JPanel panel;
    private String nombre;
    private String contrasena;
    
    public OAutenticacion (JPanel p){
        panel = p;
    }
    
    public OAutenticacion (String nombre,String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    
    public OAutenticacion (JPanel p,String nombre,String contrasena){
        panel = p;
        this.nombre=nombre;
        this.contrasena=contrasena;
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
      if(e.getActionCommand().equals("Iniciar Sesión")){
          System.out.println("Iniciar Sesión");
          GUIAutenticacion ga = new GUIAutenticacion();
          ga.setLocationRelativeTo(null);
          ga.setVisible(true);
      }else if(e.getActionCommand().equals("Loguearse")){
          System.out.println("Loguearse como: "+nombre+" "+contrasena);
      }
    }
}
