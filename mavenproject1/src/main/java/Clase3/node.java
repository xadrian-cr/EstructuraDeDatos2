/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;

/**
 *
 * @author adria
 */
public class node {
    
    private int value;
    private node next;

    public node() {
    }

    public node(int value, node next) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "node{" + "value=" + value + '}';
    }
    
    
    
}
