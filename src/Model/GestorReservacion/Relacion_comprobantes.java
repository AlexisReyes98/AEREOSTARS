/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorReservacion;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author equipo aereostars
 */
public class Relacion_comprobantes {
    ArrayList<Comprobante_reservacion> tablaComprobante_reservacion = new ArrayList<>();
    
    public void agregarComprobante(Comprobante_reservacion comprobante){
        //tablaComprobante_reservacion.add(comprobante);
        try{
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement sql;
            String consulta;
            consulta = "INSERT INTO comprobantes (idReservacion,pasajero,pago) VALUES (?,?,?)";
            sql = conexion.prepareStatement(consulta);
            sql.setInt(1, comprobante.getIdReservacion());
            sql.setString(2, comprobante.getPasajero().getNombre());
            sql.setDouble(3, comprobante.getPago().getPago());
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
    
    public Comprobante_reservacion buscarComprobanteRes(int idReservacion){
        Comprobante_reservacion comprobante = new Comprobante_reservacion();
        /*int i = 0;
        while (i < tablaComprobante_reservacion.size() && encontrado == false){
            if (num_ref == tablaComprobante_reservacion.get(i).getIdReservacion()) {
                encontrado = true;
                comprobante = tablaComprobante_reservacion.get(i);
            }
            i++;
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM comprobantes WHERE idreservacion = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, idReservacion);
            rs = ps.executeQuery();
        while( rs.next() ) {
            comprobante.setIdReservacion(rs.getInt(1));
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el comprobante "+ex);
        }
        return comprobante;
    }
    
    public boolean eliminarComprobante(int idReservacion){
        boolean encontrar = false;
        /*int i = 0;
        while (i < tablaComprobante_reservacion.size() && encontrado == false){
            if (num_referencia == tablaComprobante_reservacion.get(i).getIdReservacion()) {
                encontrado = true;
                tablaComprobante_reservacion.remove(i);
            }
            i++;
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            String sql = "DELETE FROM comprobantes WHERE idreservacion = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, idReservacion);
            ps.execute();
            encontrar = true;
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el comprobante "+ex);
        }
        return encontrar;
    }
    
}
