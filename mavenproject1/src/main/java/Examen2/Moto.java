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
public class Moto {
    
    public int placa;
    public String estado;

    public Moto() {
    }
    
    public Moto(int placa, String estado) {
        this.placa = placa;
        this.estado = estado;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Moto{" + "marca=" + placa + ", estado=" + estado + '}';
    }
    
    
    
}
