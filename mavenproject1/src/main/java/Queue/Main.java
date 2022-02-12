/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author adria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        queue cola = new queue();
        
        cola.insertar(34);
        cola.insertar(36);
        cola.insertar(54);
        cola.insertar(74);
        
        System.out.println(cola.lenght());
    }
    
}
