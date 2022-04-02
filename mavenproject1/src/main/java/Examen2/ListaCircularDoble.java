/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

/**
 *
 * @author adria
 */
public class ListaCircularDoble {

    public node cabeza;
    public node ultimo;

    public void insert(Moto moto) {

        if (cabeza == null) {

            cabeza = new node(moto);
            ultimo = cabeza;

            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (moto.getEstado() == "nueva" || moto.getEstado() == "Nueva") {

            node aux = new node(moto);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (moto.getEstado() == "vieja" || moto.getEstado() == "Vieja") {

            node aux = new node(moto);
            aux.setBack(ultimo);
            cabeza.setBack(aux);
            ultimo = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else {
            System.out.println("El modelo debe de ser Nueca o Vieja");
        }

    }

    public boolean existe(int p) {

        if (cabeza == null) {
            return false;
            
        } else if (cabeza.getMoto().placa == p|| p == ultimo.getMoto().placa) {

            return true;

        } else {
            node aux = cabeza;
            while (aux.getMoto().getPlaca() != p && aux.getNext() != ultimo) {
                aux = aux.getNext();
            }
            if (aux.getMoto().getPlaca() == p) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    public void print(){
        node aux = cabeza;
        while (aux.getNext() != cabeza){
            aux = aux.getNext();
            System.out.println(aux.getMoto().toString());
        }
        System.out.println(aux.getMoto().toString());
    }

}
