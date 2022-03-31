/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircularDoble;

/**
 *
 * @author adria
 */
public class Lista {
    
    public node cabeza;
    public node ultimo;

    public Lista() {
    }
    
    public void insert (Persona persona){
        
        if (cabeza == null){
            
            cabeza = new node(persona);
            ultimo = cabeza;
            
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        } else if (persona.getId() < cabeza.getPersona().getId()) {
            
            node aux = new node(persona);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        } else if (persona.getId() >= ultimo.getPersona().getId()) {
            
            node aux = new node(persona);
            aux.setBack(ultimo);
            cabeza.setBack(aux);
            ultimo = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else {
            
            node aux = new node(persona);
            while (aux.getNext().getPersona().getId() > persona.getId()) {
                aux = aux.getNext();
            }
            node temp = new node(persona);
            temp = aux.getNext();
            
            temp.setBack(aux);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
    }
        
        public boolean existe (int id){

            if (cabeza == null) {
                return false;
            }
            
            else if (cabeza.getPersona().getId() == id || ultimo.getPersona().getId() == id){
                
                return true;
            
            }
            else{
                node aux = cabeza;
                while (aux.getPersona().getId() != id && aux.getNext() != ultimo){
                    aux = aux.getNext();
                }
                if (aux.getPersona().getId() == id) {
                    return true;
                }
                else {
                    return false;
                }
            }     
        }
        
        public Persona extrae (int id){
            Persona p = null;
            
            if (cabeza == null) {
                return p ;
            }
            
            else if (cabeza.getPersona().getId() == id){
                
                node aux = cabeza;
                cabeza = aux.getNext();
                aux.setNext(null);
                aux.setBack(null);
                cabeza.setBack(ultimo);
                ultimo.setNext(cabeza);
                p = aux.getPersona();
                return p;
            
            }
            
            else if(ultimo.getPersona().getId() == id){
                
                node aux = ultimo;
                ultimo = aux.getBack();
                aux.setNext(null);
                aux.setBack(null);
                cabeza.setBack(ultimo);
                ultimo.setNext(cabeza);
                p = aux.getPersona();
                return p;
                
            }
            else{
                node aux = cabeza;
                while (aux.getPersona().getId() != id && aux.getNext() != ultimo){
                    aux = aux.getNext();
                }
                if (aux.getPersona().getId() == id) {
                    
                    aux.getBack().setNext(aux.getNext());
                    aux.getNext().setBack(aux.getBack());
                    aux.setNext(null);
                    aux.setBack(null);
                    p = aux.getPersona();
                    
                    return p;
                }
                else {
                    return p ;
                }
            }     
        }

    
        
        
}
    

