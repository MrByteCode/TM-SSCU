
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SerialProvision2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SerialProvision2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serialIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SerialProvision2", propOrder = {
    "serialIndex",
    "serialCode",
    "serialDesc"
})
public class SerialProvision2 {

    protected String serialIndex;
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
