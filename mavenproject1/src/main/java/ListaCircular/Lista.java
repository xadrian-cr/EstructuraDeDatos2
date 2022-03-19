/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircular;

/**
 *
 * @author aWX1120663
 */
public class Lista {
    
    private node cabeza;
    private node ultimo;
    
    public void insert (Persona persona){
        
        if (cabeza == null){
            cabeza = new node(persona);
            ultimo = cabeza;
            cabeza.setNext(cabeza);
        }
        else if ( persona.getId() > cabeza.getValue().getId() ){
            node aux = new node (persona);
            aux.setNext(cabeza);
            ultimo.setNext(aux);
            cabeza = aux;
        }
        else if (persona.getId() <= ultimo.getValue().getId()){
            node aux = new node (persona);
            ultimo.setNext(aux);
            aux.setNext(cabeza);
            ultimo = aux;
            
            //version presentación
            //ultimo.getNext(new node(persona));
            //ultimo = ultimo.getNext();
            //ultimo.setNext(caveza)
        }
        //insertar en el medio 
        else{
            
            node temp = cabeza;
            node aux = new node(persona);
            
            while(persona.getId() > temp.getNext().getValue().getId() ){
                temp = temp.getNext();
            }
            aux.setNext(temp.getNext());
            temp.setNext(aux);
            
        }
    }
    
    @Override
    public String toString(){
        node aux = cabeza;
        String contenido = "lista :";
        
        if (aux != null){
            contenido += "Está vacía";
        }
        else {
            contenido += aux +", ";
            aux = aux.getNext();
            while (aux != cabeza){
                contenido += aux + ", ";
                aux = aux.getNext();
            }
        }
        return contenido;
    }
    
}
