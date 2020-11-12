/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorAutenticacion;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author equipo aereostars
 */
public class Autenticacion {
    private final ArrayList<Cuenta_usuario> listaUsuarios = new ArrayList<>();
    
    public void agregarUsuario(Cuenta_usuario usuario){
        //tablaUsuarios.add(usuario);
        try{
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement sql;
            String consulta;
            consulta = "INSERT INTO usuarios (nombre,edad,nombreUsuario,contraseña,isAdmin) VALUES (?,?,?,?,?)";
            sql = conexion.prepareStatement(consulta);
            sql.setString(1, usuario.getNombre());
            sql.setInt(2, usuario.getEdad());
            sql.setString(3, usuario.getNombreUsuario());
            sql.setString(4, usuario.getContraseña());
            sql.setBoolean(5, usuario.getAdministrador());
            sql.execute();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: no se pudo conectar a la base de datos");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error al ejecutar el comando de BD");
            e.printStackTrace();
        }
    }
    
    public boolean buscarUsuario(String nombreUsuario, String contraseña){
        Cuenta_usuario usuario = new Cuenta_usuario();
        boolean encontrado = false;
        int i = 0;
        /*while(i < tablaUsuarios.size() && encontrado == false){
            if(nombreUsuario.equals(tablaUsuarios.get(i).getNombreUsuario()))
                if(contraseña.equals(tablaUsuarios.get(i).getContraseña()))
                    encontrado = true;
            i++;
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM usuarios WHERE nombreUsuario = ? AND contraseña = ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
        while( rs.next() ) {
            usuario.setNombre(rs.getString(1));
            usuario.setEdad(rs.getInt(2));
            usuario.setNombreUsuario(rs.getString(3));
            usuario.setContraseña(rs.getString(4));
            usuario.setAdministrador(rs.getBoolean(5));
            listaUsuarios.add(usuario);
            if(usuario.getAdministrador() == false){
                encontrado=true;
            }
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener al socio "+ex);
        }
        return encontrado;
    }
    
    public boolean buscarAdmin(String nombreUsuario, String contraseña){
        Cuenta_usuario usuario = new Cuenta_usuario();
        boolean encontrado = false;
        /*int i = 0;
        while(i < tablaUsuarios.size() && encontrado == false){
            if(tablaUsuarios.get(i).isAdministrador() == true)
                if(nombreUsuario.equals(tablaUsuarios.get(i).getNombreUsuario()))
                    if(contraseña.equals(tablaUsuarios.get(i).getContraseña()))
                        encontrado = true;
            i++;
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM usuarios WHERE nombreUsuario = ? AND contraseña = ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
        while( rs.next() ) {
            usuario.setNombre(rs.getString(1));
            usuario.setEdad(rs.getInt(2));
            usuario.setNombreUsuario(rs.getString(3));
            usuario.setContraseña(rs.getString(4));
            usuario.setAdministrador(rs.getBoolean(5));
            listaUsuarios.add(usuario);
            if(usuario.getAdministrador() == true){
                encontrado=true;
            }
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener al administrador "+ex);
        }
        return encontrado;
    }
    
    public boolean eliminarUsuario(String nombreUsuario, String contraseña){
        boolean eliminar = false;
        /*int i = 0;
        while(i < tablaUsuarios.size() && eliminar == false){
            if(nombreUsuario.equals(tablaUsuarios.get(i).getNombreUsuario()))
                if(contraseña.equals(tablaUsuarios.get(i).getContraseña())){
                    tablaUsuarios.remove(i);
                    eliminar = true;
                }
            i++;        
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            String sql = "DELETE FROM usuarios WHERE nombreUsuario = ? AND contraseña = ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, contraseña);
            ps.execute();
            eliminar = true;
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar al usuario "+ex);
        }
        return eliminar;
    }
    
}
