/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorAutenticacion;

/**
 *
 * @author equipo aereostars
 */
public class Gestor_autenticacion {
    Autenticacion nuevaSesion = new Autenticacion();
    private String claveAdmin = "AEROSTARS";
    
    public boolean iniciarSesion(String nombreUsuario, String contraseña){
        return nuevaSesion.buscarUsuario(nombreUsuario, contraseña);
    }
    
    public boolean iniciarSesionAdmin(String nombreUsuario, String contraseña){
        return nuevaSesion.buscarAdmin(nombreUsuario, contraseña);
    }
    
    public void registrarSocio(String nombre, int edad, String nombreUsuario, String contraseña){
        Cuenta_usuario nuevo = new Cuenta_usuario(nombre, edad, nombreUsuario, contraseña);
        nuevaSesion.agregarUsuario(nuevo);
    }
    
    public void registrarAdmin(String nombre, int edad, String nombreUsuario, String contraseña){
        Cuenta_usuario nuevo = new Cuenta_usuario(nombre, edad, nombreUsuario, contraseña);
        nuevo.setAdministrador(true);
        nuevaSesion.agregarUsuario(nuevo);
    }
    
    public void eliminarUsuario(String nombreUsuario, String contraseña){
        if(nuevaSesion.eliminarUsuario(nombreUsuario, contraseña) == false){
            System.out.println("No se encontro el usuario buscado.");
        }
    }

    public String getClaveAdministrador() {
        return claveAdmin;
    }

    public void setClaveAdministrador(String claveAdmin) {
        this.claveAdmin = claveAdmin;
    }
}
