
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para C2CGroup1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="C2CGroup1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callingEnterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calledEnterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C2CGroup1", propOrder = {
    "callingEnterpriseID",
    "calledEnterpriseID"
})
public class C2CGroup1 {

    protected String callingEnterpriseID;
    protected String calledEnterpriseID;

    /**
     * Obtiene el valor de la propiedad callingEnterpriseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingEnterpriseID() {
        return callingEnterpriseID;
    }

    /**
     * Define el valor de la propiedad callingEnterpriseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingEnterpriseID(String value) {
        this.callingEnterpriseID = value;
    }

    /**
     * Obtiene el valor de la propiedad calledEnterpriseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledEnterpriseID() {
        return calledEnterpriseID;
    }

    /**
     * Define el valor de la propiedad calledEnterpriseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledEnterpriseID(String value) {
        this.calledEnterpriseID = value;
    }

}
