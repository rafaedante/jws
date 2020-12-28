
package com.invertir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NombreInexistenteException complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NombreInexistenteException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faulInfo" type="{http://invertir.com/}detalleError" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NombreInexistenteException", propOrder = {
    "faulInfo",
    "message"
})
public class NombreInexistenteException {

    protected DetalleError faulInfo;
    protected String message;

    /**
     * Obtiene el valor de la propiedad faulInfo.
     * 
     * @return
     *     possible object is
     *     {@link DetalleError }
     *     
     */
    public DetalleError getFaulInfo() {
        return faulInfo;
    }

    /**
     * Define el valor de la propiedad faulInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleError }
     *     
     */
    public void setFaulInfo(DetalleError value) {
        this.faulInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
