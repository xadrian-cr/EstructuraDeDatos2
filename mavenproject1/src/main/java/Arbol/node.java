/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

/**
 *
 * @author adria
 */
public class node {
    
    private int id;
    private node hijoizq;
    private node hijoder;

    public node(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public node getHijoizq() {
        return hijoizq;
    }

    public void setHijoizq(node hijoizq) {
        this.hijoizq = hijoizq;
    }

    public node getHijoder() {
        return hijoder;
    }

    public void setHijoder(node hijoder) {
        this.hijoder = hijoder;
    }
    
    
}
