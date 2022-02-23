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
public class InvertirNumero {
    
    private static int invertirNumero(int num, int pos){
        if (num < 10){
            return num;
        } else {
            return num%10 * ((int)Math.pow(10, pos) + invertirNumero(num/10, pos-1));
        }
    }
}
