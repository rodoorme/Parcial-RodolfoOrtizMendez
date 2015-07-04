/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialrodolfoortiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class GeneradorCalificaciones {
     public ArrayList<Evaluacion> generarcalif(){
         
        ArrayList<Evaluacion> al = new ArrayList<Evaluacion>();
     
        //al.add("petra");
        
        Evaluacion e=new Evaluacion();
        e.setNombre("petra");
        e.setCalificacion((float) 5.8);
        e.setNombre("jose");
        e.setCalificacion((float) 7.4);
        e.setNombre("roberta");
        e.setCalificacion((float) 8.6);
        return al;
    }
    
    
    
}
