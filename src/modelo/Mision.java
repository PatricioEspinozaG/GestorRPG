/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Patin
 */
public class Mision {
    private int id;
    private String titulo;
    private String descripcion;
    private boolean asignada;
    private int nivelGanado;
    private int saludExtra;
    private int manaExtra;
    private int fuerzaExtra;
    private int agilidadExtra;
    private int inteligenciaExtra;
    
    private Personaje personaje;

    public Mision() {
    }

    public Mision(int id, String titulo, String descripcion, Personaje personaje, boolean asignada, int nivelGanado, int saludExtra, int manaExtra, int fuerzaExtra, int agilidadExtra, int inteligenciaExtra) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.personaje = personaje;
        this.asignada = false;
        this.nivelGanado = nivelGanado;
        this.saludExtra = saludExtra;
        this.manaExtra = manaExtra;
        this.fuerzaExtra = fuerzaExtra;
        this.agilidadExtra = agilidadExtra;
        this.inteligenciaExtra = inteligenciaExtra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public boolean isAsignada() {
        return asignada;
    }

    public void setAsignada(boolean asignada) {
        this.asignada = asignada;
    }

    public int getNivelGanado() {
        return nivelGanado;
    }

    public void setNivelGanado(int nivelGanado) {
        this.nivelGanado = nivelGanado;
    }

    public int getSaludExtra() {
        return saludExtra;
    }

    public void setSaludExtra(int saludExtra) {
        this.saludExtra = saludExtra;
    }

    public int getManaExtra() {
        return manaExtra;
    }

    public void setManaExtra(int manaExtra) {
        this.manaExtra = manaExtra;
    }

    public int getFuerzaExtra() {
        return fuerzaExtra;
    }

    public void setFuerzaExtra(int fuerzaExtra) {
        this.fuerzaExtra = fuerzaExtra;
    }

    public int getAgilidadExtra() {
        return agilidadExtra;
    }

    public void setAgilidadExtra(int agilidadExtra) {
        this.agilidadExtra = agilidadExtra;
    }

    public int getInteligenciaExtra() {
        return inteligenciaExtra;
    }

    public void setInteligenciaExtra(int inteligenciaExtra) {
        this.inteligenciaExtra = inteligenciaExtra;
    }

    @Override
    public String toString() {
        return "Mision{" + "id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", personaje=" + personaje + ", asignada=" + asignada + ", nivelGanado=" + nivelGanado + ", saludExtra=" + saludExtra + ", manaExtra=" + manaExtra + ", fuerzaExtra=" + fuerzaExtra + ", agilidadExtra=" + agilidadExtra + ", inteligenciaExtra=" + inteligenciaExtra + '}';
    } 
}
