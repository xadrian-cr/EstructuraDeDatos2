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
public class CircularDoble {
    
    public Node cabeza;
    public Node ultimo;

    public CircularDoble() {
    }
    
    public void insert(Carro carro){
        
        if (cabeza == null){
            
            cabeza = new Node(carro);
            ultimo = cabeza;
            
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        } else if (carro.getEstado() == "nuevo" || carro.getEstado() == "Nuevo") {
            
            Node aux = new Node(carro);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        } else if (carro.getEstado() == "viejo" || carro.getEstado() == "Viejo") {
            
            Node aux = new Node(carro);
            aux.setBack(ultimo);
            cabeza.setBack(aux);
            ultimo = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        } else {
            System.out.println("El modelo debe de ser Nuevo o Viejo");
        }
        
    }

    @Override
    public String toString() {
        Node aux = cabeza;
        String s = "lista: ";
        if (aux != null) {
            s += aux + ",";
            aux = aux.getNext();
            while (aux != cabeza){
                s += aux + ", ";
                aux = aux.getNext();
            }
        }
        else{
            s += "vacia";
        }
        return s;
    }
    
    
    
}
