/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.error;

/**
 *
 * @author rafaeli
 */
public class NombreInexistenteException extends Exception{
    
    private DetalleError faulInfo;

    public NombreInexistenteException() {
    }

    public NombreInexistenteException(DetalleError faulInfo, String message) {
        super(message);
        this.faulInfo = faulInfo;
    }

    public NombreInexistenteException(DetalleError faulInfo, String message, Throwable cause) {
        super(message, cause);
        this.faulInfo = faulInfo;
    }

    public DetalleError getFaulInfo() {
        return faulInfo;
    }    
    
    
}
