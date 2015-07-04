/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialrodolfoortiz;

import java.io.IOException;
import java.io.PrintWriter;
import static javassist.CtMethod.ConstParameter.string;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-107
 */
public class ServletExamen {
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Evaluacion e=new Evaluacion ();
        e.setNombre("Ana");
        e.setCalificacion(7);
        
                
}}
