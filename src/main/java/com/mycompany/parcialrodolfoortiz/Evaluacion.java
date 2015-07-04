/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialrodolfoortiz;

/**
 *
 * @author T-107
 */
public class Evaluacion {
    
    private String nombre;
    private float calificacion;

    public Evaluacion(String nombre, float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    Evaluacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
