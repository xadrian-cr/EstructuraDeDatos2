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
public class queue {
    
    private node head;
    private node tail;

    public queue() {
    }

    public queue(node head, node tail) {
        this.head = null;
        this.tail = null;
    }

    public node getHead() {
        return head;
    }

    public void setHead(node head) {
        this.head = head;
    }

    public node getTail() {
        return tail;
    }

    public void setTail(node tail) {
        this.tail = tail;
    }
    
    public void insertar(int dato){
        node newNode = new node();
        newNode.setValue(dato);
        newNode.setNext(null);
        
        if (head == null & tail == null){
            head = newNode;
            tail = newNode;
        }
        System.out.println("El valor anterior del tail es: " + tail.getValue());
        tail.setNext(newNode);
        tail= newNode;
        System.out.println("El valor actual del tail es: " + tail.getValue());
    }
    
    public void extraer(){ 
        System.out.println("El valor actual del hrad es: " + head.getValue());
        
        head = head.getNext();
        
        System.out.println("El valor actual del hrad es: " + head.getValue());
    }
    
    public boolean isEmpty(){
        boolean cola = false;
        if(head == null & tail == null){
            cola = true;
            System.out.println("La cola está vacía");
        }
        else{
            System.out.println("La cola no está vacía");
            cola = false;
        }
        return cola;
    }
    
    public int lenght (){
        int resultado = 0;
        
        node node = this.head;
        
        if (isEmpty()){
            return resultado;
        }
        
        while( node != null ){

            node = node.getNext();
            resultado++;
            
        }
        
        return resultado;
        
    }
}
