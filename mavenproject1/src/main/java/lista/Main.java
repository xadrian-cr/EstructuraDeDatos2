/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author adria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        list lista = new list ();
        
        lista.insertar(new Persona (20, "Adrian"));
        lista.insertar(new Persona (23, "Andres"));
        lista.insertar(new Persona (4, "Juan"));
        lista.insertar(new Persona (87, "Gabo"));
        lista.insertar(new Persona (1, "Dylan"));
        lista.print();
        System.out.println("----------------------------------------------");
        lista.modificar(new Persona (20, "Julian"));
        lista.print();
        
        System.out.println("----------------------------------------------");
        lista.eliminar(20);
        lista.print();
    }
    
    
    
}
