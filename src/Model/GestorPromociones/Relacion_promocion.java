/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPromociones;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Relacion_promocion extends ConexionBD {
    public boolean registrar(Promocion promo){
        PreparedStatement ps = null;
        ConexionBD conexion = new ConexionBD(); 
        Connection con = conexion.getCon();
        String sql = "INSERT INTO promociones (numReferencia,nombre,descripcion,vigencia)VALUES(?,?,?,?)";
        
        try/*(PreparedStatement ps = con.prepareStatement(sql))*/{
            ps=con.prepareStatement(sql);
            ps.setInt(1, promo.getNumreferencia());
            ps.setString(2, promo.getNombre());
            ps.setString(3, promo.getDescripcion());
            ps.setString(4,promo.getVigencia());
   
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
       public boolean modificar(Promocion promo){
        PreparedStatement ps = null;
        ConexionBD conexion = new ConexionBD(); 
        Connection con = conexion.getCon();
        String sql = "UPDATE promociones set numReferencia=?, nombre=?,descripcion=?,vigencia=?  where id= ?" ;
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, promo.getNumreferencia());
            ps.setString(2,promo.getNombre());
            ps.setString(3, promo.getDescripcion());
            ps.setString(4,promo.getVigencia());
            ps.setInt(5, promo.getId());
            
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
       
        public boolean eliminar(Promocion promo){
        PreparedStatement ps = null;
        ConexionBD conexion = new ConexionBD(); 
        Connection con = conexion.getCon();
        String sql = "delete from promociones where numReferencia=?"; //where id=?
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,promo.getNumreferencia()); //ps.setInt(6,hotel.getid());
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
          
        public boolean buscar(Promocion promo){
        PreparedStatement ps = null;
        ConexionBD conexion = new ConexionBD(); 
        Connection con = conexion.getCon();
        String sql = "SELECT *FROM promociones where numReferencia=?";
           ResultSet rs=null;
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,promo.getNumreferencia());//****
            rs=ps.executeQuery();
            
            if(rs.next()){
                promo.setNumreferencia(Integer.parseInt(rs.getString("numReferencia")));
                promo.setNombre(rs.getString("nombre"));
                promo.setDescripcion(rs.getString("descripcion"));
                promo.setVigencia(rs.getString("vigencia"));
                promo.setId(Integer.parseInt(rs.getString("id")));
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
