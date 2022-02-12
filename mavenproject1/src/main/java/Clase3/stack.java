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

public class stack {
    
    private node top;
    private int lenght;
    
    public void pilas (){
        top = null;
        lenght=0;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public int getLenght(){
        return lenght;
    }
    
    /**
     * Este metodo agregará nuevos valores a nuestra pila
     * @param value = valor a agregar a nuestra pila
     */
    public void push (int value){
        //creamos un nodo
        node newNode = new node();
        //le asignamos el valor al nodo
        newNode.setValue(value);
        
        if (isEmpty()){
            //si está vacío, seleccionamos que el nodo sea el top
            top = newNode;
        }
        else{
            //asignamos el el next de este nuevo valor es el top
            newNode.setNext(top);
            //asignamos que este nuevo elemento es el nuevo top 
            top = newNode;
        }
        lenght++;
    }
    
    /**
     * Este metodo eliminará un valor de nuestra pila
     */
    public void pop (){
        if (isEmpty()){
            System.out.println("No se tiene elemento el cual eliminar");
        }
        else {
            top = top.getNext();
            lenght--;
        }
    }
}

    