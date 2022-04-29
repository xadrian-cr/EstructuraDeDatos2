/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen3;

/**
 *
 * @author adria
 */
public class Arbol {
    
    private node raiz = new node (55);
    
    public void inserta(int value){
        
            insertar(raiz,value);
            
    }
    
    public int insertar (node nodo, int value){
        
        if (value < nodo.getId()) {
            if (nodo.getHijoizq() == null) {
                
                nodo.setHijoizq(new node(value));
                
            }
            else {
                insertar (nodo.getHijoizq(),value);
            }
        }
        else {
            if (nodo.getHijoder() == null) {
                nodo.setHijoder(new node (value));
            }
            else {
                insertar (nodo.getHijoder(),value);
            }
        }
        
        return value;
    }
    
    public void inOrden(){
        if (raiz != null) {           
            inOrdenRecorrer(raiz);            
        } else {
            System.out.println("Arblo Vacio....");
        }
    }
    
    public void inOrdenRecorrer(node nodo){
        
        if (nodo != null) {
            System.out.println("mi nodo recursivo es: " + nodo.getId());
            inOrdenRecorrer (nodo.getHijoizq());
            System.out.println(nodo.getId());
            System.out.println("mi nodo recursivo es: " + nodo.getId());
            inOrdenRecorrer(nodo.getHijoder());
        }
        
    }
    
}
