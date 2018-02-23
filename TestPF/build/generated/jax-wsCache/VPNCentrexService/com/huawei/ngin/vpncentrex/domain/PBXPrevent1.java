
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PBXPrevent1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PBXPrevent1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerGMNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calledGMNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PBXPrevent1", propOrder = {
    "callerGMNumber",
    "calledGMNumber"
})
public class PBXPrevent1 {

    protected String callerGMNumber;
    protected String calledGMNumber;

    /**
     * Obtiene el valor de la propiedad callerGMNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerGMNumber() {
        return callerGMNumber;
    }

    /**
     * Define el valor de la propiedad callerGMNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerGMNumber(String value) {
        this.callerGMNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad calledGMNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledGMNumber() {
        return calledGMNumber;
    }

    /**
     * Define el valor de la propiedad calledGMNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledGMNumber(String value) {
        this.calledGMNumber = value;
    }

}
