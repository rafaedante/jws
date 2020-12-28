/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invertir;

import com.error.DetalleError;
import com.error.NombreInexistenteException;
import com.model.Cotizacion;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author rafaeli
 */
@WebService(serviceName="ConsultaSoap")
public class ConsultaSoap {
    
    @WebMethod(operationName="Hola")
    public String Hola(@WebParam(name="nombre") String nombre){
        return "Hola " + nombre + "!!!!";
    }
    
    @WebMethod(operationName="obtenerCotizaciones")
    public List<Cotizacion> obtenerCotizaciones() {
        
        ArrayList<Cotizacion> lista = new ArrayList<>();
        
        lista.add(new Cotizacion("AMAZON", 700d));
        lista.add(new Cotizacion("GOOGLE", 500d));
        lista.add(new Cotizacion("FACEBOOK", 300d));
        
        return lista;    
    }
    
    @WebMethod(operationName="provocarError")
    public String provocarError(@WebParam(name="name") String txt) throws NombreInexistenteException {
        if ("juan".equals(txt)) {
            throw new NombreInexistenteException(new DetalleError("500","Inexistente"), "juan");
        }
        
        return "Hola " + txt + " !!!!!";
    }
    
}
