/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaExamen;

/**
 *
 * @author adria
 */
public class StringAlRevez {
    
    String palabra;

    public StringAlRevez(String palabra) {
        this.palabra = palabra;
    }
    

    private String reverso(String palabra) {
        if (palabra.length() == 1){ 
            return palabra;
        } else {
            return reverso(palabra.substring(1)) + palabra.charAt(0);
        }
    }
    
    
}
