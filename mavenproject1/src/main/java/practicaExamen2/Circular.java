/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaExamen2;

/**
 *
 * @author adria
 */
public class Circular <T> {
    
    private Node<T> cabeza = null;
    private Node<T> ultimo = null;
    
    public void insert(T value){
        
        
        //se crea metodo de insetar al final para realizar la prueba 
        Node<T> temp = new Node(value);
        if(cabeza == null){
            cabeza = temp;
            temp.setNext(cabeza);
        }
        else{
           temp.setNext(cabeza);
           ultimo.setNext(temp);
        }
        ultimo = temp;
    }
    
    public void print(){
        Node aux = cabeza;
        while (!aux.getNext().equals(cabeza)){
            System.out.println(aux.getData().toString());
            aux = aux.getNext();
        }
        System.out.println(aux.getData().toString());
    }
    
    public void remove(T value){
        if(cabeza == null){
            System.out.println("La lista se encuetra Vacia");
        }
        else{
            Node<T> temp = new Node(value);
            
            if(cabeza == ultimo){
                cabeza= temp;
                temp.setNext(cabeza);
            }
            else{
                Node<T> aux = cabeza;
                while(!aux.getNext().equals(ultimo)){
                    aux = aux.getNext();
                }
                
                aux.getNext().setNext(null);
                aux.setNext(temp);
                temp.setNext(cabeza);
            }
            temp = ultimo;
        }
    }
    
}
