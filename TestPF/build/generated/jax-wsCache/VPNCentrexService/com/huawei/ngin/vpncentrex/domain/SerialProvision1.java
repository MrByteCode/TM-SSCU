
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SerialProvision1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SerialProvision1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serialIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialProvision1", propOrder = {
    "serialIndex",
    "countryCode",
    "areaCode",
    "serialCode",
    "serialDesc"
})
public class SerialProvision1 {

    protected String serialIndex;
    protected String countryCode;
    protected String areaCode;
    protected String serialCode;
    protected String serialDesc;

    /**
     * Obtiene el valor de la propiedad serialIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialIndex() {
        return serialIndex;
    }

    /**
     * Define el valor de la propiedad serialIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialIndex(String value) {
        this.serialIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad areaCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Define el valor de la propiedad areaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Obtiene el valor de la propiedad serialCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialCode() {
        return serialCode;
    }

    /**
     * Define el valor de la propiedad serialCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialCode(String value) {
        this.serialCode = value;
    }

    /**
     * Obtiene el valor de la propiedad serialDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialDesc() {
        return serialDesc;
    }

    /**
     * Define el valor de la propiedad serialDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialDesc(String value) {
        this.serialDesc = value;
    }

}
