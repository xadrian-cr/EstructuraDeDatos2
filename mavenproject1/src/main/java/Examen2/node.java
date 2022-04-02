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
public class node<T> {
    
    private T data;
    private node<T> next;
    private node<T> back;
    private Persona persona;
    private Moto moto;

    
    public node(T data) {
        this.data = data;
        this.next = null;
    }

    public node(Persona persona) {
        this.persona = persona;
        this.next = null;
        this.back = null; 
    }
    
    public node(Moto persona) {
        this.moto = moto;
        this.next = null;
        this.back = null; 
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }

    public node<T> getBack() {
        return back;
    }

    public void setBack(node<T> back) {
        this.back = back;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }
    
}
