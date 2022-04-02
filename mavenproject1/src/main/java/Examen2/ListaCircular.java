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
public class ListaCircular <T>{
    
    private node cabeza;
    private node ultimo;
    
    public void insert(T value){
        node<T> temp = new node(value);
        if(cabeza == null){
            cabeza = temp;
            temp.setNext(cabeza);
        }
        else{
           ultimo.setNext(temp);
           temp.setNext(cabeza);
        }
        ultimo = temp;
    }
    
    public void remove(){
        
        if(cabeza == null){
            System.out.println("La lista se encuetra Vacia");
        }
        else if(cabeza == ultimo){
            System.out.println("El nodo solo contiene un valor ");
        }

        else if (cabeza.getNext() == ultimo){
            ultimo.setNext(null);
            ultimo = cabeza;
            cabeza.setNext(null);
        }
        
        else{
    
            node<T> aux = cabeza;
            while(!aux.getNext().equals(ultimo)){
                aux = aux.getNext();
            }

            aux.getNext().setNext(null);
            aux.setNext(cabeza);
            ultimo = cabeza;
            cabeza = cabeza.getNext();
        }
    }
    public void print(){
        node aux = cabeza;
        while (!aux.getNext().equals(cabeza)){
            System.out.println(aux.getData().toString());
            aux = aux.getNext();
        }
        System.out.println(aux.getData().toString());
    }
}
