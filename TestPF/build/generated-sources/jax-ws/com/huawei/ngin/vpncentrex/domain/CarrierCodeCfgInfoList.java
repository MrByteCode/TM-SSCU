
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CarrierCodeCfgInfoList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CarrierCodeCfgInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierCodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationalCIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internationalCIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dialNationalCIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dialInternationalCIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierCodeCfgInfoList", propOrder = {
    "spID",
    "carrierCodeID",
    "carrierName",
    "nationalCIC",
    "internationalCIC",
    "dialNationalCIC",
    "dialInternationalCIC",
    "carrierType"
})
public class CarrierCodeCfgInfoList {

    protected String spID;
    protected String carrierCodeID;
    protected String carrierName;
    protected String nationalCIC;
    protected String internationalCIC;
    protected String dialNationalCIC;
    protected String dialInternationalCIC;
    protected String carrierType;

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
     * Obtiene el valor de la propiedad carrierCodeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCodeID() {
        return carrierCodeID;
    }

    /**
     * Define el valor de la propiedad carrierCodeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCodeID(String value) {
        this.carrierCodeID = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Define el valor de la propiedad carrierName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalCIC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalCIC() {
        return nationalCIC;
    }

    /**
     * Define el valor de la propiedad nationalCIC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalCIC(String value) {
        this.nationalCIC = value;
    }

    /**
     * Obtiene el valor de la propiedad internationalCIC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalCIC() {
        return internationalCIC;
    }

    /**
     * Define el valor de la propiedad internationalCIC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalCIC(String value) {
        this.internationalCIC = value;
    }

    /**
     * Obtiene el valor de la propiedad dialNationalCIC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialNationalCIC() {
        return dialNationalCIC;
    }

    /**
     * Define el valor de la propiedad dialNationalCIC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialNationalCIC(String value) {
        this.dialNationalCIC = value;
    }

    /**
     * Obtiene el valor de la propiedad dialInternationalCIC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialInternationalCIC() {
        return dialInternationalCIC;
    }

    /**
     * Define el valor de la propiedad dialInternationalCIC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialInternationalCIC(String value) {
        this.dialInternationalCIC = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierType() {
        return carrierType;
    }

    /**
     * Define el valor de la propiedad carrierType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierType(String value) {
        this.carrierType = value;
    }

}
