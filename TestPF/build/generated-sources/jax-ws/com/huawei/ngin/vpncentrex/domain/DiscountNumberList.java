
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DiscountNumberList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DiscountNumberList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountNumberEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preferentialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountNumberList", propOrder = {
    "discountNumber",
    "discountNumberEnd",
    "numberFormat",
    "preferentialType"
})
public class DiscountNumberList {

    protected String discountNumber;
    protected String discountNumberEnd;
    protected String numberFormat;
    protected String preferentialType;

    /**
     * Obtiene el valor de la propiedad discountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountNumber() {
        return discountNumber;
    }

    /**
     * Define el valor de la propiedad discountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountNumber(String value) {
        this.discountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad discountNumberEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountNumberEnd() {
        return discountNumberEnd;
    }

    /**
     * Define el valor de la propiedad discountNumberEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountNumberEnd(String value) {
        this.discountNumberEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad numberFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberFormat() {
        return numberFormat;
    }

    /**
     * Define el valor de la propiedad numberFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberFormat(String value) {
        this.numberFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad preferentialType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferentialType() {
        return preferentialType;
    }

    /**
     * Define el valor de la propiedad preferentialType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferentialType(String value) {
        this.preferentialType = value;
    }

}
