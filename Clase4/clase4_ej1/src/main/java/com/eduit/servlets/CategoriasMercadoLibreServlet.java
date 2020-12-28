/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.servlets;

import com.eduit.client.ApiMercadoLibre;
import com.eduit.entities.Categoria;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jettison.json.JSONException;

/**
 *
 * @author rafaeli
 */
public class CategoriasMercadoLibreServlet extends HttpServlet{   
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            ArrayList<Categoria> categorias = ApiMercadoLibre.getCategorias();
            request.setAttribute("categorias", categorias);
            request.getRequestDispatcher("CategoriasMercadoLibre.jsp").forward(request, response);
        } catch (JSONException ex) {
            Logger.getLogger(CategoriasMercadoLibreServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }//
    
}
