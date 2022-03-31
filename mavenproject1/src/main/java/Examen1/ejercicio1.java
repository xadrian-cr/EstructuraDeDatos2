/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

/**
 *
 * @author adria
 */
public class ejercicio1 {
    
    public ejercicio1() {
    }
    
    public double calcCos(int x, int n){
        
        if ( n == 0){
            return x;
        }
        
        return calcCos(x,n-1) + (Math.pow(-1,n)/factorial(2*n))*Math.pow(x,2*n) ;
        
    }

    
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }

}
