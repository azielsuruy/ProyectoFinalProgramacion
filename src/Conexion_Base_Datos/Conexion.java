
package Conexion_Base_Datos;

import java.sql.*;

public class Conexion {
    
    private String db="proyectoprogramacion"; //nombre base datos 
    private String user="root"; //root 
    private String password=""; //
    private String url="jdbc:mysql://localhost/" + db;
    private Connection conn=null;
    
    public Conexion(){
        
        this.url="jdbc:mysql://localhost:3306/"
                + "/proyecto?serverTunezone=UTC";
        
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(this.url,
                    this.user,this.password);
            if(conn!=null){
                
                System.out.println("Se ha conectado a la base de Datos" + db + "Bienvenido");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        catch(ClassNotFoundException e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public Connection obtenerConexion(){
        
        return conn;
    }

    public Connection ObtenerConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
