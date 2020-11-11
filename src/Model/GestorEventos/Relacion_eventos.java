/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorEventos;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Relacion_eventos {
    private final ArrayList<Evento> listaEventos = new ArrayList<>();
    
    public void agregarEvento(Evento evento){
        //listaEventos.add(evento);
        try{
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement sql;
            String consulta;
            consulta = "INSERT INTO eventos (nombre,detalles,fecha,numReferencia) VALUES (?,?,?,?)";
            sql = conexion.prepareStatement(consulta);
            sql.setString(1, evento.getNombre());
            sql.setString(2, evento.getDetalles());
            String date = evento.getFecha();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy"); // your template here
            java.util.Date dateStr = formatter.parse(date);
            java.sql.Date dateDB = new java.sql.Date(dateStr.getTime());
            sql.setDate(3, dateDB);
            sql.setDouble(4, evento.getCosto());
            sql.setInt(5, evento.getNumReferencia());
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
    
    public boolean eliminarEvento(int numreferencia){
        Evento evento = new Evento();
        boolean encontrar = false;
        /*int i=0;
        while(i<listaEventos.size() && encontrar == false){
            if(numreferencia == listaEventos.get(i).getNumReferencia()){
               listaEventos.remove(i);
               encontrar = true;
            }
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            String sql = "DELETE FROM eventos WHERE numreferencia = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, numreferencia);
            ps.execute();
            encontrar = true;
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el evento "+ex);
        }
        return encontrar;
    }
    
    public void modificarEvento(){
        
    }
    
    public void solicitarEvento(String nombre){
        ArrayList<Evento> listaRequisitos = new ArrayList<>();
        Evento evento = new Evento();
        int i=0;
        /*for (int i = 0; i < listaEventos.size(); i++) {
            if ((nombre == null ? listaEventos.get(i).getNombre() == null : nombre.equals(listaEventos.get(i).getNombre()))) {
                listaRequisitos.add(listaEventos.get(i));
            }
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM eventos WHERE nombre = ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
        while( rs.next() ) {
            evento.setNumReferencia(rs.getInt(1));
            evento.setNombre(rs.getString(2));
            evento.setDetalles(rs.getString(3));
            evento.setFecha(rs.getString(4));
            evento.setCosto(rs.getDouble(5));
            listaEventos.add(evento);
            listaRequisitos.add(listaEventos.get(i));
            i++;
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el vuelo "+ex);
        }
        detallesEvento(listaRequisitos);
    }
    
    public void detallesEvento(ArrayList<Evento> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
    public Evento buscarEventoRes(int numreferencia){
        Evento evento = new Evento();
        /*boolean encontrar = false;
        int i = 0;
        System.out.println(listaEventos.size());
        while(i<listaEventos.size() && encontrar == false){
            if(numreferencia == listaEventos.get(i).getNumReferencia()){
                encontrar = true;
                evento = listaEventos.get(i);
            }
            i++;
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM eventos WHERE numreferencia = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, numreferencia);
            rs = ps.executeQuery();
        while( rs.next() ) {
            evento.setNumReferencia(rs.getInt(1));
            evento.setNombre(rs.getString(2));
            evento.setDetalles(rs.getString(3));
            evento.setFecha(rs.getString(4));
            evento.setCosto(rs.getDouble(5));
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el vuelo "+ex);
        }
        return evento;   
    }
}
