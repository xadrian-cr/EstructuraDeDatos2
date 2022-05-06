/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListaCircular;

/**
 *
 * @author aWX1120663
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Lista lista = new Lista();
        Persona persona1 = new Persona(1,"adrian");
        
        lista.insert(persona1);
        lista.insert(new Persona(7,"marco"));
        lista.insert(new Persona(5,"solis"));
        lista.insert(new Persona(3,"alonso"));
        
        System.out.println(lista);
        
    }
    
}
