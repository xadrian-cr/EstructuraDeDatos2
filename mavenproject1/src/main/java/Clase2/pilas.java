/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

/**
 *
 * @author adria
 */
public class pilas {
    
    private node start;
    private int lenght;
    
    public void pilas (){
        start = null;
        lenght=0;
    }
    
    public boolean isEmpty(){
        return start == null;
    }
    
    public int getLenght(){
        return lenght;
    }
}
