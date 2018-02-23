
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SMSBroadcastCode2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SMSBroadcastCode2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsBroadcastCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSBroadcastCode2", propOrder = {
    "spID",
    "enterpriseID",
    "smsListID",
    "smsBroadcastCode",
    "description"
})
public class SMSBroadcastCode2 {

    protected String spID;
    protected String enterpriseID;
    protected String smsListID;
    protected String smsBroadcastCode;
    protected String description;

    /**
     * Obtiene el valor de la propiedad spID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpID() {
        return spID;
    }

    /**
     * Define el valor de la propiedad spID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpID(String value) {
        this.spID = value;
    }

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
     * Obtiene el valor de la propiedad smsListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsListID() {
        return smsListID;
    }

    /**
     * Define el valor de la propiedad smsListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsListID(String value) {
        this.smsListID = value;
    }

    /**
     * Obtiene el valor de la propiedad smsBroadcastCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsBroadcastCode() {
        return smsBroadcastCode;
    }

    /**
     * Define el valor de la propiedad smsBroadcastCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsBroadcastCode(String value) {
        this.smsBroadcastCode = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
