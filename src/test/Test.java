/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
/**
 *
 * @author Nicolas
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
     // TODO code application logic here
     // System.out.println("hola mundo");
        ResultSet consul;         
        Query consulta = new Query();
        consul =  consulta.select();
     // System.out.println(consul.);
        ResultSetMetaData rsmd = consul.getMetaData();
        rsmd.getColumnName(1);
        
        System.out.println(rsmd.getColumnName(1)+' '+rsmd.getColumnName(2)+' '+rsmd.getColumnName(3)+' '+rsmd.getColumnName(4)+' '+rsmd.getColumnName(5)+' '+rsmd.getColumnName(6)+' '+rsmd.getColumnName(7));
        while( consul.next())  {                 
            System.out.println(consul.getString(1)+' '+consul.getString(2)+ ' '+consul.getString(3)+ ' '+consul.getString(4)+ ' '+consul.getString(5)+ ' '+consul.getString(6)+ ' '+consul.getString(7));
        }
        
        
        NewJFrame frame = new NewJFrame();
        frame.show();
         
         
       
              
     
    }
    
}
