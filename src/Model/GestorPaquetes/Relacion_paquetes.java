/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorPaquetes;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author equipo aereostars
 */
public class Relacion_paquetes {
    private final ArrayList<Paquete> listaPaquetes = new ArrayList<>();
    
    public void agregarPaquete(Paquete paquete){
        //listaPaquetes.add(paquete);
        try{
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement sql;
            String consulta;
            consulta = "INSERT INTO paquetes (destino,origen,tipo,fechaSalida,horaSalida,costo,numReferencia) VALUES (?,?,?,?,?,?,?)";
            sql = conexion.prepareStatement(consulta);
            sql.setString(1, paquete.getDestino());
            sql.setString(2, paquete.getOrigen());
            sql.setString(3, paquete.getTipo());
            String date = paquete.getFechaSalida();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy"); // your template here
            java.util.Date dateStr = formatter.parse(date);
            java.sql.Date dateDB = new java.sql.Date(dateStr.getTime());
            sql.setDate(4, dateDB);
            sql.setString(5, paquete.getHoraSalida());
            sql.setDouble(6, paquete.getCosto());
            sql.setInt(7, paquete.getNumReferencia());
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
    
    public boolean eliminarPaquete(int numreferencia){
        boolean encontrar = false;
        /*int i=0;
        while(i<listaPaquetes.size() && encontrar == false){
            if(numreferencia == listaPaquetes.get(i).getNumReferencia()){
               listaPaquetes.remove(i);
               encontrar = true;
            }
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            String sql = "DELETE FROM paquetes WHERE numreferencia = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, numreferencia);
            ps.execute();
            encontrar = true;
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el paquete "+ex);
        }
        return encontrar;
    }
    
    public void modificarPaquete(int numReferencia,int campo, String nuevoValor) throws ParseException{
        ConexionBD conn = new ConexionBD(); 
        Connection conexion = conn.getCon();
        PreparedStatement ps;
        String sql;
        try{
            switch(campo){
                case 4:
                    sql = "UPDATE paquetes SET origen = ? WHERE numReferencia = ?";
                    ps = conexion.prepareStatement(sql);
                    ps.setString(1, nuevoValor);
                    ps.setInt(2, numReferencia);
                    ps.executeUpdate();
                    break;
                case 1:
                    sql = "UPDATE paquetes SET destino = ? WHERE numReferencia = ?";
                    ps = conexion.prepareStatement(sql);
                    ps.setString(1, nuevoValor);
                    ps.setInt(2, numReferencia);
                    ps.execute();
                    break;
                case 5:
                    sql = "UPDATE paquetes SET tipo = ? WHERE numReferencia = ?";
                    ps = conexion.prepareStatement(sql);
                    ps.setString(1, nuevoValor);
                    ps.setInt(2, numReferencia);
                    ps.execute();
                    break;
                case 2:
                    sql = "UPDATE paquetes SET fechasalida = ? WHERE numReferencia = ?";
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy"); // your template here
                    java.util.Date dateStr = formatter.parse(nuevoValor);
                    java.sql.Date dateDB = new java.sql.Date(dateStr.getTime());
                    ps = conexion.prepareStatement(sql);
                    ps.setDate(1, dateDB);
                    ps.setInt(2, numReferencia);
                    ps.execute();
                    break;
                case 3:
                    sql = "UPDATE paquetes SET horaSalida = ? WHERE numReferencia = ?";
                    ps = conexion.prepareStatement(sql);
                    ps.setString(1, nuevoValor);
                    ps.setInt(2, numReferencia);
                    ps.execute();
                    break;
                case 0:
                    sql = "UPDATE paquetes SET costo = ? WHERE numReferencia = ?";
                    ps = conexion.prepareStatement(sql);
                    ps.setDouble(1, Double.parseDouble(nuevoValor));
                    ps.setInt(2, numReferencia);
                    ps.execute();
                    break;    
                default:
                    break;
            }
            conn.close();
        }catch (SQLException ex) {
            System.out.println("Error al modificar el paquete "+ex);
        }  
        
    }
    
    public void solicitarPaquete(String origen, String destino, String fecha){
        ArrayList<Paquete> listaRequisitos = new ArrayList<>();
        Paquete paquete = new Paquete();
        int i=0;
        /*for (int i = 0; i < listaPaquetes.size(); i++) {
            if ((origen == null ? listaPaquetes.get(i).getOrigen() == null : origen.equals(listaPaquetes.get(i).getOrigen())) && (destino == null ? listaPaquetes.get(i).getDestino() == null : destino.equals(listaPaquetes.get(i).getDestino())) && (fecha == null ? listaPaquetes.get(i).getFechaSalida() == null : fecha.equals(listaPaquetes.get(i).getFechaSalida()))) {
                listaRequisitos.add(listaPaquetes.get(i));
            }
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM paquetes WHERE destino = ? AND origen = ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, origen);
            ps.setString(2, destino);
            rs = ps.executeQuery();
        while( rs.next() ) {
            paquete.setNumReferencia(rs.getInt(1));
            paquete.setDestino(rs.getString(2));
            paquete.setOrigen(rs.getString(3));
            paquete.setTipo(rs.getString(4));
            paquete.setFechaSalida(rs.getString(5));
            paquete.setHoraSalida(rs.getString(6));
            paquete.setCosto(rs.getDouble(7));
            listaPaquetes.add(paquete);
            listaRequisitos.add(listaPaquetes.get(i));
            i++;
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el paquete "+ex);
        }
        detallesPaquete(listaRequisitos);
    }
    
    public void detallesPaquete(ArrayList<Paquete> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
    public Paquete buscarPaqueteRes(int numreferencia){
        Paquete paquete = new Paquete();
        /*boolean encontrar = false;
        int i = 0;
        while(i<listaPaquetes.size() && encontrar == false){
            if(numreferencia == listaPaquetes.get(i).getNumReferencia()){
                encontrar = true;
                paquete = listaPaquetes.get(i);
            }
            i++;
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM paquetes WHERE numreferencia = ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, numreferencia);
            rs = ps.executeQuery();
        while( rs.next() ) {
            paquete.setNumReferencia(rs.getInt(1));
            paquete.setDestino(rs.getString(2));
            paquete.setOrigen(rs.getString(3));
            paquete.setTipo(rs.getString(4));
            paquete.setFechaSalida(rs.getString(5));
            paquete.setHoraSalida(rs.getString(6));
            paquete.setCosto(rs.getDouble(7));
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el paquete "+ex);
        }
        return paquete;   
    }
}
