/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Coneccion {
    
    Connection conectar=null;
    
    public Connection conexion(){
    
        
        try{
          Class.forName("com.mysql.jdbc.Driver"); //ruta del conector
          conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/colops","root","");
            JOptionPane.showMessageDialog(null, "conexion exitosa!!!");
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "no hay conexion!!!"+e.getMessage());
        }
        return conectar;
    }
    
}
