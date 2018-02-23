
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AttendantWorkTime1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AttendantWorkTime1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttendantWorkTime1", propOrder = {
    "enterpriseID",
    "timeID",
    "timeItemID"
})
public class AttendantWorkTime1 {

    protected String enterpriseID;
    protected String timeID;
    protected String timeItemID;

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

}