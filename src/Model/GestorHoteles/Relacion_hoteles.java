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

public class Relacion_hoteles extends ConexionBD  {
     public boolean registrar(Hotel hotel){
        PreparedStatement ps = null;
        ConexionBD conexion = new ConexionBD(); 
        Connection con = conexion.getCon();
        String sql = "INSERT INTO hoteles (numReferencia,nombre,destino,numEstrellas,costo)VALUES(?,?,?,?,?)";
        
        try/*(PreparedStatement ps = con.prepareStatement(sql))*/{
            ps=con.prepareStatement(sql);
            ps.setInt(1, hotel.getNumreferencia());
            ps.setString(2, hotel.getnombre());
            ps.setString(3, hotel.getdestino());
            ps.setInt(4,hotel.getNumestrellas());
            ps.setDouble(5, hotel.getcosto());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                 System.err.println(e);
            }
                
        }
        
        
        
    }
    //MODIFICAR
       public boolean modificar(Hotel hotel){
        PreparedStatement ps = null;
        ConexionBD conexion = new ConexionBD(); 
        Connection con = conexion.getCon();
        String sql = "UPDATE hoteles set numReferencia=?, nombre=?,destino=?,numEstrellas=?,costo=?  where id= ?" ;
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, hotel.getNumreferencia());
            ps.setString(2, hotel.getnombre());
            ps.setString(3, hotel.getdestino());
            ps.setInt(4,hotel.getNumestrellas());
            ps.setDouble(5, hotel.getcosto());
            ps.setInt(6, hotel.getid());
            
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                 System.err.println(e);
            }
                
        }
        
        
        
    }
       //eliminar
       
        public boolean eliminar(Hotel hotel){
        PreparedStatement ps = null;
        ConexionBD conexion = new ConexionBD(); 
        Connection con = conexion.getCon();
     
        String sql = "delete from hoteles where numReferencia=?"; //where id=?
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,hotel.getNumreferencia()); //ps.setInt(6,hotel.getid());
            ps.execute();//executeUpdate
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                 System.err.println(e);
            }
                
        }
        
        
        
    }
        //buscar
          
        public boolean buscar(Hotel hotel){
        PreparedStatement ps = null;
        ConexionBD conexion = new ConexionBD(); 
        Connection con = conexion.getCon();
        String sql = "SELECT *FROM hoteles where numReferencia=?";
           ResultSet rs=null;
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,hotel.getNumreferencia());//****
            rs=ps.executeQuery();
            
            if(rs.next()){
                hotel.setNumreferencia(Integer.parseInt(rs.getString("numReferencia")));
                hotel.setNombre(rs.getString("nombre"));
                hotel.setDestino(rs.getString("destino"));
                hotel.setNumestrellas(Integer.parseInt(rs.getString("numEstrellas")));
                hotel.setCosto(Double.parseDouble(rs.getString("costo")));
                hotel.setid(Integer.parseInt(rs.getString("id")));
                return true;
            }
            
            
            
            
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                 System.err.println(e);
            }
                
        }
        
        
        
    }
        
       
}
