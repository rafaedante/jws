/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.service;

import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author rafaeli
 */
@Path("/restapi")
public class ApiRest {
    
    @GET
    @Path("/rnd")
    @Produces(MediaType.APPLICATION_JSON)
    public Response generateRndNumber(){
        Random rnd = new Random();
        return Response.ok(
                response("Numero Aleatorio", "", String.valueOf(rnd.nextDouble())),
                MediaType.APPLICATION_JSON).build();
    }
    
    @GET
    @Path("/fibo/{value}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFibo(@PathParam("value") int value){
        if(value <= 0){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(
                    response("Fibonacci", String.valueOf(value),"El numero debe ser mayor a cero")).build();
        }
         int fibo1 = 1;
         int fibo2 =1;
         int aux = 1;
         String cadena = "1";
         for(int i=2; i<= value; i++){
             fibo2 += aux;
             aux = fibo1;
             fibo1 = fibo2;
             cadena += " " + aux;
         }
         
         return Response.ok(
                 response("Fibonacci", String.valueOf(value), cadena), 
                 MediaType.APPLICATION_JSON).build();
    }
    
    
    private String response(String operation, String parameter, String result){
        JSONObject obj = new JSONObject();
        try {
            obj.put("operation", operation);
            obj.put("parameter", parameter);
            obj.put("result", result);
            return obj.toString(4);
        }catch(JSONException ex){
            System.err.println("JSONException: " + ex.getMessage());
        }
        return "";
    }
    
}
