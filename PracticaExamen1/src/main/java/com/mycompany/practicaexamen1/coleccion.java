
package com.mycompany.practicaexamen1;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 *
 * @author adria
 */
public class coleccion extends paciente{

    int lenght = 0;    
    ArrayList<paciente> array = new ArrayList<>();
    
    
    public coleccion() {
    }
    
    
    
    public void Agregar(){
        
        array.add(new paciente(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula: ")),JOptionPane.showInputDialog("Ingrese el nombre: " ),JOptionPane.showInputDialog("Ingrese el sintoma: " ),JOptionPane.showInputDialog("Inrgese el diagnostico" ), JOptionPane.showInputDialog("Ingrese el tratamiento: " )) { });

    }
    
    
    public void consultar(){
        
        for (int i = 0; i < array.size()-1; i++) {
            String dato = JOptionPane.showInputDialog("Ingrese el nombre del paciente: " );
            
            if (array.get(i).nombreDePaciente == dato) {
                System.out.println(array.get(i));
            }
            else {
                System.out.println("No se tiene paciente");
            }
        }
    }
}
