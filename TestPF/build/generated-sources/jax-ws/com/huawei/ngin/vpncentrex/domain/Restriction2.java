
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Restriction2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Restriction2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restriction2", propOrder = {
    "enterpriseID",
    "restrictionID",
    "restItemID"
})
public class Restriction2 {

    protected String enterpriseID;
    protected String restrictionID;
    protected String restItemID;

    /**
     * Obtiene el valor de la propiedad enterpriseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseID() {
        return enterpriseID;
    }

    /**
     * Define el valor de la propiedad enterpriseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseID(String value) {
        this.enterpriseID = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionID() {
        return restrictionID;
    }

    /**
     * Define el valor de la propiedad restrictionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionID(String value) {
        this.restrictionID = value;
    }

    /**
     * Obtiene el valor de la propiedad restItemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestItemID() {
        return restItemID;
    }

    /**
     * Define el valor de la propiedad restItemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestItemID(String value) {
        this.restItemID = value;
    }

}
