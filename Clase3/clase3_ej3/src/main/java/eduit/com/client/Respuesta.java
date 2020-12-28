/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.client;

/**
 *
 * @author rafaeli
 */
public class Respuesta {
    private String result;
    private String parameter;
    private String operation;

    public Respuesta() {
    }

    public Respuesta(String result, String parameter, String operation) {
        this.result = result;
        this.parameter = parameter;
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "result=" + result + ", parameter=" + parameter + ", operation=" + operation + '}';
    }
    
    
}

