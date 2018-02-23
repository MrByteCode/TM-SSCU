
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EntAnn2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntAnn2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="annID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="annState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntAnn2", propOrder = {
    "enterpriseID",
    "annID",
    "annState",
    "languageID",
    "rejectReason"
})
public class EntAnn2 {

    protected String enterpriseID;
    protected String annID;
    protected String annState;
    protected String languageID;
    protected String rejectReason;

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
     * Obtiene el valor de la propiedad annID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnID() {
        return annID;
    }

    /**
     * Define el valor de la propiedad annID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnID(String value) {
        this.annID = value;
    }

    /**
     * Obtiene el valor de la propiedad annState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnState() {
        return annState;
    }

    /**
     * Define el valor de la propiedad annState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnState(String value) {
        this.annState = value;
    }

    /**
     * Obtiene el valor de la propiedad languageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * Define el valor de la propiedad languageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * Obtiene el valor de la propiedad rejectReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Define el valor de la propiedad rejectReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

}
