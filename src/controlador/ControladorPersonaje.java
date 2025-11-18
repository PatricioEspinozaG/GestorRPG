/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import modelo.Personaje;
import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author Patin
 */
public class ControladorPersonaje {

    public ControladorPersonaje() {
    }
    

    public boolean agregarPersonaje(Personaje p){
        try{
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "INSERT INTO personaje(id,nombre,clase,nivel,experiencia,salud,mana,fuerza,agilidad,inteligencia) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNombre());
            stmt.setString(3, p.getClase());
            stmt.setInt(4, p.getNivel());
            stmt.setInt(5, p.getExperiencia());
            stmt.setInt(6, p.getSalud());
            stmt.setInt(7, p.getMana());
            stmt.setInt(8, p.getFuerza());
            stmt.setInt(9, p.getAgilidad());
            stmt.setInt(10, p.getInteligencia());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        }
        catch(SQLException e){
            System.out.println("Error al consultar para insertar datos"+e.getMessage());
            return false;
        }
    }
    
    
}
