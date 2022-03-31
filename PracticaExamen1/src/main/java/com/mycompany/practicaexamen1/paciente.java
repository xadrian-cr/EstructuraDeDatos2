/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicaexamen1;

/**
 *
 * @author adria
 */
public abstract class paciente {
    
    int cedula;
    String nombreDePaciente;
    String sintomas;
    String diagnostico;
    String tratamiento;
    
    public paciente() {
    }

    public paciente(int cedula, String nombreDePaciente, String sintomas, String diagnostico, String tratamiento) {
        this.cedula = cedula;
        this.nombreDePaciente = nombreDePaciente;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
    
    
     

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreDePaciente() {
        return nombreDePaciente;
    }

    public void setNombreDePaciente(String nombreDePaciente) {
        this.nombreDePaciente = nombreDePaciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "paciente{" + "cedula=" + cedula + ", nombreDePaciente=" + nombreDePaciente + ", sintomas=" + sintomas + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + '}';
    }
    
    
    

    
}

