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
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Relacion_promociones {
    private final ArrayList<Promocion> listaPromos = new ArrayList<>();
    
    public void agregarPromocion(Promocion promo){
        //listaPromos.add(promo);
        try{
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement sql;
            String consulta;
            consulta = "INSERT INTO promociones (nombre,descrpcion,vigencia,numReferencia) VALUES (?,?,?,?)";
            sql = conexion.prepareStatement(consulta);
            sql.setString(1, promo.getNombre());
            sql.setString(2, promo.getDescripcion());
            String date = promo.getVigencia();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy"); // your template here
            java.util.Date dateStr = formatter.parse(date);
            java.sql.Date dateDB = new java.sql.Date(dateStr.getTime());
            sql.setDate(3, dateDB);
            sql.setInt(4, promo.getNumReferencia());
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
    
    public boolean eliminarPromocion(int numreferencia){
        boolean encontrar = false;
        /*int i=0;
        while(i<listaPromos.size() && encontrar == false){
            if(numreferencia == listaPromos.get(i).getNumReferencia()){
               listaPromos.remove(i);
               encontrar = true;
            }
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            String sql = "DELETE FROM promociones WHERE numreferencia = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, numreferencia);
            ps.execute();
            encontrar = true;
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar la promocion "+ex);
        }
        return encontrar;
    }
    
    public void modificarPromocion(){
        
    }
    
    public void solicitarPromocion(String nombre){
        ArrayList<Promocion> listaRequisitos = new ArrayList<>();
        Promocion promocion = new Promocion();
        int i=0;
        /*for (int i = 0; i < listaPromos.size(); i++) {
            if ((nombre == null ? listaPromos.get(i).getNombre() == null : nombre.equals(listaPromos.get(i).getNombre()))) {
                listaRequisitos.add(listaPromos.get(i));
            }
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM promociones WHERE nombre = ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
        while( rs.next() ) {
            promocion.setNumReferencia(rs.getInt(1));
            promocion.setNombre(rs.getString(2));
            promocion.setDescripcion(rs.getString(3));
            promocion.setVigencia(rs.getString(4));
            listaPromos.add(promocion);
            listaRequisitos.add(listaPromos.get(i));
            i++;
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la promocion "+ex);
        }
        detallesPromocion(listaRequisitos);
    }
    
    public void detallesPromocion(ArrayList<Promocion> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
}
