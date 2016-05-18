/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Nicolas
 */
public class Conexion {
    
    public Connection conectar(){
         try
        {           
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Properties p = new Properties();
            p.put("charSet", "iso-8859-1");
            String database = 
                      "JDBC:ODBC:Driver={Microsoft Access Driver (*.mdb, *.accdb)}; DBQ=C:\\blabla.mdb;";
            Connection conn = DriverManager.getConnection(database,p);            
            return conn;      
                   
        } catch(Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
