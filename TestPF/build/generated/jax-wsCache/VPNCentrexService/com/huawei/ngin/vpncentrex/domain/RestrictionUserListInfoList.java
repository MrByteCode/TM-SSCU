
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RestrictionUserListInfoList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RestrictionUserListInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionUserListInfoList", propOrder = {
    "number",
    "numberEnd",
    "screenNumType"
})
public class RestrictionUserListInfoList {

    protected String number;
    protected String numberEnd;
    protected String screenNumType;

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad numberEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberEnd() {
        return numberEnd;
    }

    /**
     * Define el valor de la propiedad numberEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberEnd(String value) {
        this.numberEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumType() {
        return screenNumType;
    }

    /**
     * Define el valor de la propiedad screenNumType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumType(String value) {
        this.screenNumType = value;
    }

}
