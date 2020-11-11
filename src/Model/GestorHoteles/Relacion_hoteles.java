/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorHoteles;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Relacion_hoteles {
    private final ArrayList<Hotel> listaHoteles = new ArrayList<>();
    
    public void agregarHotel(Hotel hotel){
        //listaHoteles.add(hotel);
        try{
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement sql;
            String consulta;
            consulta = "INSERT INTO hoteles (nombre,destino,numEstrellas,costo,numReferencia) VALUES (?,?,?,?,?)";
            sql = conexion.prepareStatement(consulta);
            sql.setString(1, hotel.getNombre());
            sql.setString(2, hotel.getDestino());
            sql.setInt(3, hotel.getNumEstrellas());
            sql.setDouble(4, hotel.getCosto());
            sql.setInt(5, hotel.getNumReferencia());
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
    
    public boolean eliminarHotel(int numreferencia){
        Hotel hotel = new Hotel();
        boolean encontrar = false;
        /*int i=0;
        while(i<listaHoteles.size() && encontrar == false){
            if(numreferencia == listaHoteles.get(i).getNumReferencia()){
               listaHoteles.remove(i);
               encontrar = true;
            }
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            String sql = "DELETE FROM hoteles WHERE numreferencia = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, numreferencia);
            ps.execute();
            encontrar = true;
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el hotel "+ex);
        }
        return encontrar;
    }
    
    public void modificarVuelo(){
        
    }
    
    public void solicitarHotel(String nombre, String destino){
        ArrayList<Hotel> listaRequisitos = new ArrayList<>();
        Hotel hotel = new Hotel();
        int i=0;
        /*for (int i = 0; i < listaHoteles.size(); i++) {
            if ((nombre == null ? listaHoteles.get(i).getNombre() == null : nombre.equals(listaHoteles.get(i).getNombre())) && (destino == null ? listaHoteles.get(i).getDestino() == null : destino.equals(listaHoteles.get(i).getDestino()))) {
                listaRequisitos.add(listaHoteles.get(i));
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
            hotel.setNumReferencia(rs.getInt(1));
            hotel.setNombre(rs.getString(2));
            hotel.setDestino(rs.getString(3));
            hotel.setNumEstrellas(rs.getInt(4));
            hotel.setCosto(rs.getDouble(5));
            listaHoteles.add(hotel);
            listaRequisitos.add(listaHoteles.get(i));
            i++;
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el hotel "+ex);
        }
        detallesHotel(listaRequisitos);
    }
    
    public void detallesHotel(ArrayList<Hotel> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
    public Hotel buscarHotelRes(int numreferencia){
        Hotel hotel = new Hotel();
        /*boolean encontrar = false;
        int i = 0;
        while(i<listaHoteles.size() && encontrar == false){
            if(numreferencia == listaHoteles.get(i).getNumReferencia()){
                encontrar = true;
                hotel = listaHoteles.get(i);
            }
            i++;
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM hoteles WHERE numreferencia = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, numreferencia);
            rs = ps.executeQuery();
        while( rs.next() ) {
            hotel.setNumReferencia(rs.getInt(1));
            hotel.setNombre(rs.getString(2));
            hotel.setDestino(rs.getString(3));
            hotel.setNumEstrellas(rs.getInt(4));
            hotel.setCosto(rs.getDouble(5));
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el hotel "+ex);
        }
        return hotel;
    }
}
