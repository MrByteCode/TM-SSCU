
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoutingBasedOnCaller2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoutingBasedOnCaller2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numBasedRoutingListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingBasedOnCaller2", propOrder = {
    "numBasedRoutingListID",
    "callingNumber",
    "numberFormat"
})
public class RoutingBasedOnCaller2 {

    protected String numBasedRoutingListID;
    protected String callingNumber;
    protected String numberFormat;

    /**
     * Obtiene el valor de la propiedad numBasedRoutingListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumBasedRoutingListID() {
        return numBasedRoutingListID;
    }

    /**
     * Define el valor de la propiedad numBasedRoutingListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumBasedRoutingListID(String value) {
        this.numBasedRoutingListID = value;
    }

    /**
     * Obtiene el valor de la propiedad callingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingNumber() {
        return callingNumber;
    }

    /**
     * Define el valor de la propiedad callingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingNumber(String value) {
        this.callingNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad numberFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberFormat() {
        return numberFormat;
    }

    /**
     * Define el valor de la propiedad numberFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberFormat(String value) {
        this.numberFormat = value;
    }

}
