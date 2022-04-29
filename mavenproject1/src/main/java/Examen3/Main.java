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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arbol arbol = new Arbol();
        
        arbol.inserta(60);
        arbol.inserta(90);
        arbol.inserta(80);
        arbol.inserta(56);
        arbol.inserta(70);
        
        arbol.inOrden();
    }
    
}
