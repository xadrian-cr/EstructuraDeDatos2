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
public class list {
    
    private node cabeza;

    public list() {
    }
    
    public void insertar(Persona p){
        
        if (cabeza == null) {
       
            cabeza = new node(p);
        }
        else if (p.getId() < cabeza.getPersona().getId()){
            
            node nuevo = new node(p);
            nuevo.setNext(cabeza);
            cabeza = nuevo;
        }
        else if (p.getId() < cabeza.getPersona().getId()){
            
            if (cabeza.getNext() == null){
                node nuevo = new node(p);
                cabeza.setNext(nuevo);
            }
            else{
                
                node aux = cabeza;
                while ( aux.getNext() != null && aux.getNext().getPersona().getId() < p.getId() ) {
                    
                    aux = aux.getNext();
                }
                
                node temp = new node(p);
                aux.setNext(temp);
                temp.setNext(aux.getNext());
            }
        }  
    }
    
    public void print(){
        node aux = cabeza;
        while (aux!=null){
            System.out.println(aux.getPersona().toString());
            aux = aux.getNext();
        }
    }
    
    public boolean existe(int id){
        node aux = cabeza;
        boolean bandera = false;
        while (aux != null){
            if (id == aux.getPersona().getId()) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }
    
    public void modificar (Persona p){
        node aux = cabeza;
        while ( aux.getNext() != null && aux.getPersona().getId() == p.getId()) {
            aux = aux.getNext();
        }

        node temp = new node(p);
        aux.setNext(temp);
    }
    
    public void eliminar (int id){
        if (cabeza == null) {
       
            System.out.println("La lista esta vacia");
        }
        
        node aux = cabeza;
        while ( aux.getNext() != null && aux.getNext().getPersona().getId() == id) {
            aux = aux.getNext();
        }

        aux.setNext(null);
        aux.setNext(aux.getNext());
        
        
    }

    public node getCabeza() {
        return cabeza;
    }

    public void setCabeza(node cabeza) {
        this.cabeza = cabeza;
    }
    
    
    
}
