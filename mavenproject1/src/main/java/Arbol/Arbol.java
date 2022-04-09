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
public class Arbol {
    
    private node raiz;
    
    public void inserta(int value){
        
        if (raiz == null){
            
            raiz = new node(value);
            
        }
        else{
            insertar(raiz,value);
        }
        
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
    
    public void menor(){
        if (raiz == null) {
            imprimirMenor(raiz);
        }else{
            System.out.println("Arbol esta vacio....");
        }
    }
    
    public void imprimirMenor (node nodo){
        if ( nodo != null ) {
            imprimirMenor(nodo.getHijoizq());
        }else{
            System.out.println(nodo.getId());
        }
    }
    
}
