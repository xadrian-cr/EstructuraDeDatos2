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
public class Lista {
    
    private node cabeza;

    public Lista() {
    }
    
    public void insertar(Persona persona){
        
        if (cabeza == null) {
       
            cabeza = new node(persona);
        }
        
        else if (cabeza.getNext() == null){
            node aux = new node(persona);
            cabeza.setNext(aux);
        }
        
        else{
            node aux = cabeza;
            while( aux.getNext() != null ){
                aux = aux.getNext();
            }
            
            node temp = new node(persona);
            aux.setNext(temp);
            
        }  
    }
    
    public void get(int index){
        
        if (cabeza == null || cabeza.getNext() == null || cabeza.getNext().getNext() == null){
            System.out.println("No se encontraron valores deseados en la lista");
        }
        else{
            node aux = cabeza;
            int i = 2;
            
            if (index == 2) {
                System.out.println("El dato anterior es: " + aux.getPersona().toString());
                System.out.println("El dato seleccionado es: " + aux.getNext().getPersona().toString());
                System.out.println("El dato cotinuo es: " + aux.getNext().getNext().getPersona().toString());
            }
            else{
                while (i != index){
                    aux = aux.getNext();
                    i = i + 1; 
                }
                if (aux.getNext().getNext() == null) {
                    System.out.println("No se encontraron valores deseados en la lista");
                }
                else{
                    System.out.println("El dato anterior es: " + aux.getPersona().toString());
                    System.out.println("El dato seleccionado es: " + aux.getNext().getPersona().toString());
                    System.out.println("El dato cotinuo es: " + aux.getNext().getNext().getPersona().toString());
            
                }
            }
        }
    }
    
    public boolean existe(int cedula){
        node aux = cabeza;
        boolean terminal = false;
        while (aux!= null){
            if (cedula == aux.getPersona().getCedula()) {
                return true;
            }
            aux = aux.getNext();
        }
        return terminal;
    }
    
    
}
