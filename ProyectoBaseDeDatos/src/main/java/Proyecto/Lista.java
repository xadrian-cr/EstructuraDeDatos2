/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author adria
 */
public class Lista <T> {
 
    
    private Node<T> root;
    public int length = 0;  
    
    
    public void insert(T value){
        Node<T> temp = new Node<>(value);
        
        //Cuando esta vacia la lista, el elemento seria el root (la raiz)
        if(root == null){
            root = temp; 
        }
        else{
            //actual se utiliza para navegar la lista sin perder la referencia
            //del root
            Node<T> actual = root;

            //While para recorrer la lista hasta llegar al final
            while(actual.getNext() != null){
                actual = actual.getNext();
            }
             actual.setNext(temp);
        }
        length +=1;
    }
    
}
