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
    private String clase;
    private int nivel;
    private int experiencia;
    private int salud;
    private int mana;
    private int fuerza; 
    private int agilidad;
    private int inteligencia;

    public Personaje() {
    }

    public Personaje(String nombre, String clase, int nivel, int experiencia, int salud, int mana, int fuerza, int agilidad, int inteligencia) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.salud = salud;
        this.mana = mana;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
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

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public String toString() {
        return "Personaje{" + "id=" + id + ", nombre=" + nombre + ", clase=" + clase + ", nivel=" + nivel + ", experiencia=" + experiencia + ", salud=" + salud + ", mana=" + mana + ", fuerza=" + fuerza + ", agilidad=" + agilidad + ", inteligencia=" + inteligencia + '}';
    }
    
    //metodos
    
    
}