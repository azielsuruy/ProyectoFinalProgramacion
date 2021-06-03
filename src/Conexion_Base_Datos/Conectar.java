
package Conexion_Base_Datos;

import com.sun.jdi.connect.spi.Connection;

import java.sql.*;

public class Conectar {
    
    Connection conect= null;
    
   public Connection conexion(){
       
       try{
           //interface
           Class.forName("com.mysql..jdbc.Driver");
           
           
           //Driver de COnexion//
          
           conect =(Connection)DriverManager.getConnection("jdbc.mysql://localhost/proyectoprogramacion?user=user&password=password");
       }catch(Exception e){
           
       }
       
       return conect;
   }
    
    
    
    

}
