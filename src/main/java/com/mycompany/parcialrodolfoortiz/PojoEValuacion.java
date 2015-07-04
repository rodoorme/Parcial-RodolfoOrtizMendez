/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialrodolfoortiz;

import static com.mycompany.parcialrodolfoortiz.DAOEvaluacion.factory;
import static com.mycompany.parcialrodolfoortiz.DAOEvaluacion.session;
import static com.mycompany.parcialrodolfoortiz.DAOEvaluacion.tranza;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-107
 */
public class PojoEValuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        session= factory.openSession();
        tranza= session.beginTransaction();

                

                //Nos apuramos a hacer una transaccion(insercion,update, delete, select all, select id)
                    //Insertar
                Evaluacion e=new Evaluacion();
                e.setNombre("petra");
        e.setCalificacion((float) 5.8);
        e.setNombre("jose");
        e.setCalificacion((float) 7.4);
        e.setNombre("roberta");
        e.setCalificacion((float) 8.6);
                
                session.save(e);
                //Liberar la transaccion y despues cerrar la sesion 
                tranza.commit();
                session.close();
        
        
      
                
                System.out.println("Se inserto correctamente  tu registro");
                
    }
    
}
