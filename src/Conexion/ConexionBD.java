/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author equipo aereostars
 */
public class ConexionBD {
    private static Connection conn = null;
    private static String usuario = "adminAereo";
    private static String pwd = "aereostars";
    private static String host = "ls-36108e309ce802399938b4e5d624eba78274c264.cans7cvrt2zk.us-east-1.rds.amazonaws.com:3306";
    private static String database = "aereostars";
    private static String url = "";

    public ConexionBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://"+host+"/"+database+"?user="+usuario+"&password="+pwd+"&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT";
            //conn = DriverManager.getConnection(url, usuario, pwd);
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Connection getCon(){
        return conn;
    }
    
    public void close(){
        try {
            if(conn != null)
                conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
