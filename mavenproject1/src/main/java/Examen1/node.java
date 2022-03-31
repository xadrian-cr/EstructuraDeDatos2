/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

/**
 *
 * @author adria
 */
public class node<T> {
    
    private T value;
    private T marca;
    private T talla;
    private T hora;
    private T sector;
    private T cedula;
    
    private node<T> next;
    
    public node(T value, T hora, T sector, T cedula) {
        this.value = value;
        this.hora = hora;
        this.sector = sector;
        this.cedula = cedula;
    }

    public node(T value, T marca, T talla) {
        this.value = value;
        this.marca = marca;
        this.talla = talla;
        this.next = null;
    }
   
    public node(){}
    
    public node(T value){
        this.value = value;
    }

    public T getMarca() {
        return marca;
    }

    public void setMarca(T marca) {
        this.marca = marca;
    }

    public T getTalla() {
        return talla;
    }

    public void setTalla(T talla) {
        this.talla = talla;
    }
    

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

}