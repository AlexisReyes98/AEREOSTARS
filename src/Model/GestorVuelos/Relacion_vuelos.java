/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorVuelos;

import java.util.ArrayList;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

/**
 *
 * @author giova
 */
public class Relacion_vuelos {
    private final ArrayList<Vuelo> listaVuelos = new ArrayList<>();
    
    public void agregarVuelo(Vuelo vuelo) {
        //listaVuelos.add(vuelo);
        try{
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement sql;
            String consulta;
            consulta = "INSERT INTO vuelos (destino,origen,tipo,fechaSalida,horaSalida,costo,numReferencia) VALUES (?,?,?,?,?,?,?)";
            sql = conexion.prepareStatement(consulta);
            sql.setString(1, vuelo.getDestino());
            sql.setString(2, vuelo.getOrigen());
            sql.setString(3, vuelo.getTipo());
            String date = vuelo.getFechaSalida();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy"); // your template here
            java.util.Date dateStr = formatter.parse(date);
            java.sql.Date dateDB = new java.sql.Date(dateStr.getTime());
            sql.setDate(4, dateDB);
            sql.setString(5, vuelo.getHoraSalida());
            sql.setDouble(6, vuelo.getCosto());
            sql.setInt(7, vuelo.getNumReferencia());
            //sql.executeUpdate();
            sql.execute();
            conn.close(); 
        } catch (SQLException e) {
            System.out.println("Error: no se pudo conectar a LA base de datos");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("error al ejecutar el comando de BD");
            e.printStackTrace();
        }

    }
    
    public boolean eliminarVuelo(int numreferencia){
         Vuelo vuelo = new Vuelo();
        boolean encontrar = false;
        /*int i=0;
        while(i<listaVuelos.size() && encontrar == false){
            if(numreferencia == listaVuelos.get(i).getNumReferencia()){
               listaVuelos.remove(i);
               encontrar = true;
            }
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            String sql = "DELETE FROM vuelos numReferencia WHERE ?";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, numreferencia);
            encontrar = true;
            /*rs = ps.executeQuery();
        while( rs.next() ) {
            vuelo.setDestino(rs.getString(1));
            vuelo.setOrigen(rs.getString(2));
            vuelo.setTipo(rs.getString(3));
            vuelo.setFechaSalida(rs.getDate(4).toString());
            vuelo.setHoraSalida(rs.getString(5));
            vuelo.setCosto(rs.getDouble(6));
            vuelo.setNumReferencia(rs.getShort(7));
            listaVuelos.add(vuelo);
            listaRequisitos.add(listaVuelos.get(i));
            i++;
        }*/
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el vuelo "+ex);
        }
        return encontrar;
    }
    
    public void modificarVuelo(){
        
    }
    
    public void solicitarVuelo(String origen, String destino, String fechaSalida){
        ArrayList<Vuelo> listaRequisitos = new ArrayList<>();
        Vuelo vuelo = new Vuelo();
        int i=0;
        /*for (int i = 0; i < listaVuelos.size(); i++) {
            if ((origen == null ? listaVuelos.get(i).getOrigen() == null : origen.equals(listaVuelos.get(i).getOrigen())) && (destino == null ? listaVuelos.get(i).getDestino() == null : destino.equals(listaVuelos.get(i).getDestino())) && (fechaSalida == null ? listaVuelos.get(i).getFechaSalida() == null : fechaSalida.equals(listaVuelos.get(i).getFechaSalida()))) {
                listaRequisitos.add(listaVuelos.get(i));
            }
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM `aereostars`.`vuelos` "
                       + "WHERE vuelos.destino = ? AND vuelos.origen = ? AND vuelos.fechaSalida = ? ;";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, origen);
            ps.setString(2, destino);
            ps.setString(3, fechaSalida);
            rs = ps.executeQuery();
        while( rs.next() ) {
            vuelo.setDestino(rs.getString(1));
            vuelo.setOrigen(rs.getString(2));
            vuelo.setTipo(rs.getString(3));
            vuelo.setFechaSalida(rs.getDate(4).toString());
            vuelo.setHoraSalida(rs.getString(5));
            vuelo.setCosto(rs.getDouble(6));
            vuelo.setNumReferencia(rs.getShort(7));
            listaVuelos.add(vuelo);
            listaRequisitos.add(listaVuelos.get(i));
            i++;
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el vuelo "+ex);
        }
        detallesVuelo(listaRequisitos);
    }
    
    public void detallesVuelo(ArrayList<Vuelo> listaMostrar){
        for(int i=0; i<listaMostrar.size();i++){
            System.out.println(listaMostrar.get(i).toString());
        }
    }
    
    public Vuelo buscarVueloRes(int numreferencia){
        Vuelo vuelo = new Vuelo();
        /*boolean encontrar = false;
        int i = 0;
        while(i<listaVuelos.size() && encontrar == false){
            if(numreferencia == listaVuelos.get(i).getNumReferencia()){
                encontrar = true;
                vuelo = listaVuelos.get(i);
            }
            i++;
        }*/
        try {
            ConexionBD conn = new ConexionBD(); 
            Connection conexion = conn.getCon();
            PreparedStatement ps;
            ResultSet rs;
            String sql = "SELECT * FROM `aereostars`.`vuelos` "
                       + "WHERE vuelos.numReferencia = ? ;";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, numreferencia);
            rs = ps.executeQuery();
        while( rs.next() ) {
            vuelo.setDestino(rs.getString(1));
            vuelo.setOrigen(rs.getString(2));
            vuelo.setTipo(rs.getString(3));
            vuelo.setFechaSalida(rs.getDate(4).toString());
            vuelo.setHoraSalida(rs.getString(5));
            vuelo.setCosto(rs.getDouble(6));
            vuelo.setNumReferencia(rs.getShort(7));
        }
        conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el vuelo "+ex);
        }
        return vuelo;
    }
}
