/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlproductividad;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import Modelo.Query;
import Vistas.Productividad;
import java.sql.SQLException;
//vistas
import Vistas.Productividad;
import java.sql.Array;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class ControlProductividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ResultSet consul;         
        Query consulta = new Query();
        consul =  consulta.select();
        ResultSetMetaData rsmd = consul.getMetaData();       
        ArrayList nombreColumnas = new ArrayList();       
            
         for (int i = 1; i < rsmd.getColumnCount()+1; i++) {        
            nombreColumnas.add(rsmd.getColumnName(i));
        }  
        Productividad productividad = new Productividad();
        productividad.InitListado(nombreColumnas,consul);
        productividad.show();
        
    }
    
}
