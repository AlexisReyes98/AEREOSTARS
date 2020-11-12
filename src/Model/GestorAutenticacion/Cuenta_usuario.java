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
public class Cuenta_usuario {
    private String nombre;
    private int edad;
    private String nombreUsuario;
    private String contraseña;
    private boolean administrador;

    public Cuenta_usuario() {
    }

    public Cuenta_usuario(String nombre, int edad, String nombreUsuario, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.administrador = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Cuenta_usuario{" + "nombre=" + nombre + ", edad=" + edad + ", nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
