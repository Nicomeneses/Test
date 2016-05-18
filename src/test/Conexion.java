/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nicolas
 */
public class Conexion {
    
    public Connection conectar(){
         try
        {           
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String database = 
                      "JDBC:ODBC:Driver={Microsoft Access Driver (*.mdb, *.accdb)}; DBQ=C:\\blabla.mdb";
            Connection conn = DriverManager.getConnection(database, "", "");            
            return conn;      
                   
        } catch(Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
