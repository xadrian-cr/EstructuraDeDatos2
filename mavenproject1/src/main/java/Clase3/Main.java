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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack pila = new stack ();
        
        System.out.println(pila.getLenght());
        pila.push(5);
        System.out.println(pila.getLenght());
        
    }
    
}
