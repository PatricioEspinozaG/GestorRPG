/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Patin
 */
public class Inventario {
    private int id;
    private String objeto;
    private int cantidad;
    private Personaje personaje;

    public Inventario() {
    }

    public Inventario(int id, String objeto, int cantidad, Personaje personaje) {
        this.id = id;
        this.objeto = objeto;
        this.cantidad = cantidad;
        this.personaje = personaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
    
    //metodo
    
    
}
