
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SNLInfoList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SNLInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shortNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SNLInfoList", propOrder = {
    "enterpriseID",
    "shortNumber",
    "numberType",
    "destinationNumber"
})
public class SNLInfoList {

    protected String enterpriseID;
    protected String shortNumber;
    protected String numberType;
    protected String destinationNumber;

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
     * Obtiene el valor de la propiedad shortNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNumber() {
        return shortNumber;
    }

    /**
     * Define el valor de la propiedad shortNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNumber(String value) {
        this.shortNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad numberType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberType() {
        return numberType;
    }

    /**
     * Define el valor de la propiedad numberType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberType(String value) {
        this.numberType = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationNumber() {
        return destinationNumber;
    }

    /**
     * Define el valor de la propiedad destinationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationNumber(String value) {
        this.destinationNumber = value;
    }

}
