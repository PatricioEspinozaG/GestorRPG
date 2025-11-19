/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import modelo.Personaje;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
            
            String query = "INSERT INTO personaje(nombre,clase,nivel,experiencia,salud,mana,fuerza,agilidad,inteligencia) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getClase());
            stmt.setInt(3, p.getNivel());
            stmt.setInt(4, p.getExperiencia());
            stmt.setInt(5, p.getSalud());
            stmt.setInt(6, p.getMana());
            stmt.setInt(7, p.getFuerza());
            stmt.setInt(8, p.getAgilidad());
            stmt.setInt(9, p.getInteligencia());
            
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
   
        public List<Personaje> listar(){
        
        List<Personaje> lista = new ArrayList<>();
        try{
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT* FROM personaje";
            java.sql.PreparedStatement stmt = cnx.prepareCall(query);
            
            java.sql.ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Personaje p = new Personaje();
                p.setId(rs.getInt("Id"));
                p.setNombre(rs.getString("Nombre"));
                p.setClase(rs.getString("Clase"));
                p.setNivel(rs.getInt("Nivel"));
                p.setExperiencia(rs.getInt("Experiencia"));
                p.setSalud(rs.getInt("Salud"));
                p.setMana(rs.getInt("Mana"));
                p.setFuerza(rs.getInt("Fuerza"));
                p.setAgilidad(rs.getInt("Agilidad"));
                p.setInteligencia(rs.getInt("Inteligencia"));
                
                lista.add(p);
            }
            
            rs.close();
            stmt.close();
            cnx.close();
            
            return lista;
        }       
        catch(SQLException e){
            System.out.println("Error al consultar para listar datos"+e.getMessage());
            return lista;
        }
    }
    
    public boolean borrarPersonaje(int id){
        try{
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "DELETE FROM personaje WHERE id=?";
            java.sql.PreparedStatement stmt = cnx.prepareCall(query);
            
            stmt.setInt(1, id);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            
        return true;    
        }   
        catch(SQLException e){
            System.out.println("Error al consultar para borrar datos"+e.getMessage());
            return false;
        }
    }
    
}
