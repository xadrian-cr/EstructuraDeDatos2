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
public class ejercicio2<T> {
    
   public node<T> top = null;
   
    public ejercicio2() {
    }
  
    public void push(T value,T marca, T talla){
        node nuevo = new node<T>(value,marca,talla);
        
        if (top == null){
            top = nuevo;
        }
        
        else{
            if (marca == "Bunny"){
                nuevo.setNext(top.getNext());
                top.setNext(nuevo);
            }
            else{
                if (marca != top.getMarca() && talla != top.getTalla()){
                    nuevo.setNext(top);
                    nuevo = top;
                }
                System.out.println("la camisa no se puede agregar");
            }
        }    
        
    }
    
}
