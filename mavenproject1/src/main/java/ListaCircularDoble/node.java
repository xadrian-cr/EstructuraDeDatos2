/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircularDoble;

/**
 *
 * @author adria
 */
public class node {
    
    Persona persona;
    node next;
    node back;

    public node(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public node getBack() {
        return back;
    }

    public void setBack(node back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "node{" + "persona=" + persona + ", next=" + next + ", back=" + back + '}';
    }

    
    
    
    
}
