/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2_cl2;

import com.invertir.ConsultaSoap;
import com.invertir.ConsultaSoap_Service;
import com.invertir.Cotizacion;
import com.invertir.NombreInexistenteException_Exception;
import java.util.List;

/**
 *
 * @author rafaeli
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConsultaSoap_Service service = new ConsultaSoap_Service();
        ConsultaSoap port = service.getConsultaSoapPort();
        
        String miHola = port.hola("Rafael");
        System.out.println("La respuesta del metodo cliente Hola es: " + miHola);
        
        List<Cotizacion> lista = port.obtenerCotizaciones();
        System.out.println("----------------------------------");
        System.out.println("La respuesta del metodo cliente lista de cotizaciones");
        
        for(Cotizacion i : lista) {
            System.out.println("La cotizacion de " + i.getNombre() + " es $" + i.getCotizacion());
        }
        
        System.out.println("----------------------------------");
        System.out.println("La respuesta del metodo cliente provocar error");
        
        String respuesta;
        try {
            respuesta = port.provocarError("juan");
            System.out.println("La respuesta del metodo cliente provocar error es: " + respuesta);
        }catch(NombreInexistenteException_Exception ex) {
            System.out.println("Se genero un error con codigo: " + ex.getFaultInfo().getFaulInfo().getCodigoError() +
                    " descripcion del error es: " + ex.getFaultInfo().getFaulInfo().getDescError());        
        }catch(Exception ex) {
            System.out.println("Se genero un error: " + ex.getMessage());
        }
        
    }
    
}
