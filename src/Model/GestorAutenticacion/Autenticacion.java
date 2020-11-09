/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorAutenticacion;

import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Autenticacion {
    private ArrayList<Cuenta_usuario> tablaUsuarios = new ArrayList<Cuenta_usuario>();
    
    public void agregarUsuario(Cuenta_usuario usuario){
        tablaUsuarios.add(usuario);
        System.out.println("Su usuario se ha agregado correctamente.");
    }
    
    public boolean buscarUsuario(String nombreUsuario, String contraseña){
        boolean encontrado = false;
        int i = 0;
        while(i < tablaUsuarios.size() && encontrado == false){
            if(nombreUsuario.equals(tablaUsuarios.get(i).getNombreUsuario()))
                if(contraseña.equals(tablaUsuarios.get(i).getContraseña()))
                    encontrado = true;
            i++;
        }
        return encontrado;
    }
    
    public boolean eliminarUsuario(String nombreUsuario, String contraseña){
        int i = 0;
        boolean eliminar = false;
        while(i < tablaUsuarios.size() && eliminar == false){
            if(nombreUsuario.equals(tablaUsuarios.get(i).getNombreUsuario()))
                if(contraseña.equals(tablaUsuarios.get(i).getContraseña())){
                    tablaUsuarios.remove(i);
                    eliminar = true;
                }
            i++;        
        }
        return eliminar;
    }
    
    public boolean buscarAdmin(String nombreUsuario, String contraseña){
        boolean encontrado = false;
        int i = 0;
        while(i < tablaUsuarios.size() && encontrado == false){
            if(tablaUsuarios.get(i).isAdministrador() == true)
                if(nombreUsuario.equals(tablaUsuarios.get(i).getNombreUsuario()))
                    if(contraseña.equals(tablaUsuarios.get(i).getContraseña()))
                        encontrado = true;
            i++;
        }
        return encontrado;
    }
    
}
