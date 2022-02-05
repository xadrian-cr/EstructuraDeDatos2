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
public class recursion {
    
    static int arr [] = {12,32,5,7,9};
    
    //el metodo recursivo debe tener una condicion de parada o 
    //una condicion base que nos permita devolver un valor
    //debe tener una llamada a sí misma
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        else {
            return (n*factorial(n-1));
        }
    }
    
    public static int buscarElemento(int arr[],int i,int n , int f){
        if(f < 1){
            return -1;
        }
        if (arr[i]==n){
            return i;
        }
        if (arr[f] == n){
            return n;
        }
        else{
            return buscarElemento(arr,1+i,n,f-1);
        }
    }
}
