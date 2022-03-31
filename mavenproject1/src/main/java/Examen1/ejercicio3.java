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
public class ejercicio3<T> {
    
    private node head;
    private node tail;
    

    public ejercicio3() {
    }

    public node getHead() {
        return head;
    }

    public void setHead(node head) {
        this.head = head;
    }

    public node getTail() {
        return tail;
    }

    public void setTail(node tail) {
        this.tail = tail;
    }
    public void insertar(T value,T hora, T sector, T cedula){
        node nuevo = new node<T>(value,hora,sector,cedula);
        
        if (head == null & tail == null){
            head = nuevo;
            tail = nuevo;
        }
        
        
        tail.setNext(nuevo);
        tail= nuevo;
        
    }
}
