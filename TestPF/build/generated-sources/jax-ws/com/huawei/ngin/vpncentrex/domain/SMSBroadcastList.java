
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SMSBroadcastList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SMSBroadcastList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distributeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distributeNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSBroadcastList", propOrder = {
    "spID",
    "enterpriseID",
    "smsListID",
    "distributeNumber",
    "distributeNumberType"
})
public class SMSBroadcastList {

    protected String spID;
    protected String enterpriseID;
    protected String smsListID;
    protected String distributeNumber;
    protected String distributeNumberType;

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
     * Obtiene el valor de la propiedad distributeNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributeNumber() {
        return distributeNumber;
    }

    /**
     * Define el valor de la propiedad distributeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributeNumber(String value) {
        this.distributeNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad distributeNumberType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributeNumberType() {
        return distributeNumberType;
    }

    /**
     * Define el valor de la propiedad distributeNumberType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributeNumberType(String value) {
        this.distributeNumberType = value;
    }

}
