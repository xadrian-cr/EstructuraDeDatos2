/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

/**
 *
 * @author adria
 */
public class Persona {
 
    public int cedula;
    public String nombre;
    public String nacionalidad;

    public Persona() {
    }

    
    
    public Persona(int cedula, String nombre, String nacionalidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
}
