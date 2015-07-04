/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialrodolfoortiz;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOEvaluacion{
 static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
    
    public void abrirSesion(){
        //factory= HibernateUtilidades.getSessionFactory();
        session= factory.openSession();
        tranza= session.beginTransaction();
    
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
        
    }
    
    public DAOEvaluacion(){
    
    }
    
    //Creamos el insert
    public void guardar(Evaluacion f)throws Exception{
        //Aqui poner el codigo de tu guardado
        //despues invocas el metodo cerrar todo
        abrirSesion();
        session.save(f);
        cerrarTodo();
    }
  
    
    
    
    
    
    //Creamos el insert

   
    
}

