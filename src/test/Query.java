/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author Nicolas
 */
public class Query {
     private Conexion conexion = new Conexion();
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
     public Query() {
        try{
            if((con = conexion.conectar())==null){
                JOptionPane.showMessageDialog(null,"Error con la conexion a la BD");
                return;
            }
            st = con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ResultSet select(){
        try {
            String query = "TRANSFORM Sum([Ayuda de servicios].Puntos) AS SumaDePuntos\n" +
"SELECT [Ayuda Tecnico].Nombre\n" +
"FROM [Ayuda Tecnico] INNER JOIN (Servicios INNER JOIN [Ayuda de servicios] ON (Servicios.[Serv Normal] = [Ayuda de servicios].Normal) AND (Servicios.[Serv Servicio] = [Ayuda de servicios].Servicio)) ON [Ayuda Tecnico].Rut = Servicios.[Serv Tecnico]\n" +
"GROUP BY [Ayuda Tecnico].Nombre\n" +
"PIVOT Servicios.[Serv Fecha];";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
