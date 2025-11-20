/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import bd.Conexion;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Patin
 */
public class ControladorMision {

    public boolean agregarMision(){
        try{
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "INSERT INTO mision(titulo, descripcion, nivelGanado, saludExtra, manaExtra, fuerzaExtra, agilidadExtra, inteligenciaExtra,asignada) VALUES(?,?,?,?,?,?,?,?,false)";
            PreparedStatement stmt = cnx.prepareStatement(query);
                                                
                    
            return true;
        }
        catch(SQLException e){
            System.out.println("Error al consultar para ingresar datos"+e.getMessage());
            return false;
        }
    }
    
}
