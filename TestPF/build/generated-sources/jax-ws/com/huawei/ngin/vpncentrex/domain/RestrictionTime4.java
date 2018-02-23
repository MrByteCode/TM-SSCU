
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RestrictionTime4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RestrictionTime4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeIDName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeIDDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionTime4", propOrder = {
    "enterpriseID",
    "timeID",
    "timeItemID",
    "timeIDName",
    "timeIDDescription"
})
public class RestrictionTime4 {

    protected String enterpriseID;
    protected String timeID;
    protected String timeItemID;
    protected String timeIDName;
    protected String timeIDDescription;

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
     * Obtiene el valor de la propiedad timeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeID() {
        return timeID;
    }

    /**
     * Define el valor de la propiedad timeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeID(String value) {
        this.timeID = value;
    }

    /**
     * Obtiene el valor de la propiedad timeItemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeItemID() {
        return timeItemID;
    }

    /**
     * Define el valor de la propiedad timeItemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeItemID(String value) {
        this.timeItemID = value;
    }

    /**
     * Obtiene el valor de la propiedad timeIDName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeIDName() {
        return timeIDName;
    }

    /**
     * Define el valor de la propiedad timeIDName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeIDName(String value) {
        this.timeIDName = value;
    }

    /**
     * Obtiene el valor de la propiedad timeIDDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeIDDescription() {
        return timeIDDescription;
    }

    /**
     * Define el valor de la propiedad timeIDDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeIDDescription(String value) {
        this.timeIDDescription = value;
    }

}
