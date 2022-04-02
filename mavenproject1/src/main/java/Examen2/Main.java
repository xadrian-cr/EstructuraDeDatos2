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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1> get");
        System.out.println("=========================================================================");
        Persona persona1 = new Persona(12,"adrian","costarricense");
        Persona persona2 = new Persona(13,"andres","nicaraguense");
        Persona persona3 = new Persona(14,"carlos","argentino");
        Persona persona4 = new Persona(15,"Marta","mexicana");
        
        Lista lista = new Lista();
        
        lista.insertar(persona1);
        lista.insertar(persona2);
        lista.insertar(persona3);
        lista.insertar(persona4);
        
        lista.get(2);
        lista.get(3);
        lista.get(4);
        System.out.println("=========================================================================");
        
        System.out.println("Ejercicio 1: existe");
        System.out.println("=========================================================================");
        
        System.out.println(lista.existe(12));
        System.out.println(lista.existe(16));
        System.out.println("=========================================================================");
        
        System.out.println("Ejercicio 2");
        System.out.println("=========================================================================");
        ListaCircular circular = new ListaCircular();
        
        circular.insert(1);
        circular.insert(2);
        circular.insert(3);
        circular.insert(4);
        circular.insert(5);
        
        circular.print();
        
        circular.remove();
        
        circular.print();
        
        System.out.println("=========================================================================");
        
        System.out.println("Ejercicio 3 insertar");
        System.out.println("=========================================================================");
        
        Moto moto1 = new Moto(1,"nueva");
        Moto moto2 = new Moto(2,"nueva");
        Moto moto3 = new Moto(3,"vieja");
        Moto moto4 = new Moto(4,"vieja");
        Moto moto5 = new Moto(5,"nueva");
        Moto moto6 = new Moto(6,"vieja");
        
        ListaCircularDoble doble = new ListaCircularDoble ();
        doble.insert(moto1);
        doble.insert(moto2);
        doble.insert(moto3);
        doble.insert(moto4);
        doble.insert(moto5);
        doble.insert(moto6);
        
       doble.existe(2);
       doble.existe(8);
       
       System.out.println("=========================================================================");
    }
    
}
