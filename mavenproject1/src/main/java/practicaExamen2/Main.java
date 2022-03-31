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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        list lista = new list();
        
        lista.insertar("Adrian");
        lista.insertar("carla");
        lista.insertar("Mario");
        lista.insertar("carlos");
        
        lista.get(3);
        lista.get(4);
        
        Circular lisCircular = new Circular();
        
        lisCircular.insert(4);
        lisCircular.insert(5);
        lisCircular.insert(6);
        lisCircular.insert(7);
        
        lisCircular.print();
        
        lisCircular.remove(9);
        
        lisCircular.print();
        
        CircularDoble cirDoble = new CircularDoble();
        
        Carro carro = new Carro("tesla","nuevo");
        Carro carro1 = new Carro("honda","viejo");
        Carro carro2 = new Carro("mazda","viejo");
        Carro carro3 = new Carro("ferrari","nuevo");
        Carro carro4 = new Carro("toyota","viejo");
        
        cirDoble.insert(carro);
        cirDoble.insert(carro1);
        cirDoble.insert(carro2);
        cirDoble.insert(carro3);
        cirDoble.insert(carro4);
        
    }
    
}
