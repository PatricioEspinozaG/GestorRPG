/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Patin
 */
public class Personaje {
    private int id;
    private String nombre;
    private int nivel;
    private String clase;
    private double vida;
    private double ataque;

    public Personaje() {
    }

    public Personaje(int id, String nombre, int nivel, String clase, double vida, double ataque) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.clase = clase;
        this.vida = vida;
        this.ataque = ataque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    
    //metodo
    public String mostrarInfo(){
        return "ID: " + id + " | Nombre: " + nombre + " | Nivel : " + nivel + " | Clase: " + clase + " | Vida: " + vida + " | Ataque: " + ataque;
    }
    
}
