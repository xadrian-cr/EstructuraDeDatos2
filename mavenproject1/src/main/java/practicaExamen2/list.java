/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaExamen2;

/**
 *
 * @author adria
 */
public class list {
    
    private Node cabeza;

    public list() {
    }
    
    public void insertar(String nombre){
        
        if (cabeza == null) {
       
            cabeza = new Node(nombre);
        }
        
        else if (cabeza.getNext() == null){
            Node node = new Node(nombre);
            cabeza.setNext(node);
        }
        
        else{
            Node aux = cabeza;
            while( aux.getNext() != null ){
                aux = aux.getNext();
            }
            
            Node temp = new Node(nombre);
            aux.setNext(temp);
            
        }  
    }
        
    public void print(){
        Node aux = cabeza;
        while (aux!=null){
            System.out.println(aux.getData().toString());
            aux = aux.getNext();
            
        }
        
    }
    
    public void get(int index){
        
        if (cabeza == null || cabeza.getNext() == null || cabeza.getNext().getNext() == null){
            System.out.println("No se encontraron valores deseados en la lista");
        }
        else{
            //Node aux = cabeza.getNext();
            Node aux = cabeza;
            int i = 2;
            
            if (index == 2) {
                System.out.println("El dato anterior es: " + aux.getData().toString());
                System.out.println("El dato seleccionado es: " + aux.getNext().getData().toString());
                System.out.println("El dato cotinuo es: " + aux.getNext().getNext().getData().toString());
            }
            else{
                while (i != index){
                    //aux = aux.getNext();
                    aux = aux.getNext();
                    i = i + 1; 
                }
                if (aux.getNext().getNext() == null) {
                    System.out.println("No se encontraron valores deseados en la lista");
                }
                else{
                    System.out.println("El dato anterior es: " + aux.getData().toString());
                    System.out.println("El dato seleccionado es: " + aux.getNext().getData().toString());
                    System.out.println("El dato cotinuo es: " + aux.getNext().getNext().getData().toString());
            
                }
            }
        }
    }
    

    public Node getCabeza() {
        return cabeza;
    }

    public void setCabeza(Node cabeza) {
        this.cabeza = cabeza;
    }
    
    
}
