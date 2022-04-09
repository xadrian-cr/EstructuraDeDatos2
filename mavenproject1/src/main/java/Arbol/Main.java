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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        
        arbol.inserta(50);
        arbol.inserta(20);
        arbol.inserta(80);
        arbol.inserta(15);
        arbol.inserta(30);
        
        arbol.inOrden();
    }
    
}
