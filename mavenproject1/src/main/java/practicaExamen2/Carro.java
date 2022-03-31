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
public class Carro {
    
    public String marca;
    public String estado;

    public Carro(String marca, String estado) {
        this.marca = marca;
        this.estado = estado;
    }
    
    public Carro(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", estado=" + estado + '}';
    }
    
    
    
}
