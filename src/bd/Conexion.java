package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection obtenerConexion() {
        
        Connection conn = null;
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rpgbase", "root","");
            
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Error de la clase Conexion" + ex.getMessage());
        }
        return conn;
    }
}