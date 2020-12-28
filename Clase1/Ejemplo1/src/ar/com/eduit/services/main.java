/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.services;

import ar.com.eduit.service.ServicioInicial;
import javax.xml.ws.Endpoint;

/**
 *
 * @author rafaeli
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando web service");
        Endpoint.publish("http://127.0.0.1:8080/ws/MiServicio", new ServicioInicial());
        System.out.println("web service corriendo");
    }
    
}
