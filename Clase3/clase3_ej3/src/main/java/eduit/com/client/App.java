package eduit.com.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.ClientConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String URL_API = 
            "http://localhost:8080/clase3_ej1/service/restapi/fibo/0";
    
    public static void main( String[] args )
    {
        Client client = ClientBuilder.newClient(
        new ClientConfig().register(JacksonJsonProvider.class));
        
        WebTarget webTarget = client.target(URL_API);
        
        Response response = webTarget.request(MediaType.APPLICATION_JSON_TYPE).get();

        System.out.println( "GET BODY: " +  response.readEntity(Respuesta.class));
    }
}
