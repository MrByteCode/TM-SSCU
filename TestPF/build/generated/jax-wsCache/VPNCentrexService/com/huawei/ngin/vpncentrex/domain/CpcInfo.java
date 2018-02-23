
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CpcInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CpcInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cpc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="q825" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpcInfo", propOrder = {
    "cpc",
    "q825",
    "displayInfo",
    "displayFlag"
})
public class CpcInfo {

    protected String cpc;
    protected String q825;
    protected String displayInfo;
    protected String displayFlag;

    /**
     * Obtiene el valor de la propiedad cpc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpc() {
        return cpc;
    }

    /**
     * Define el valor de la propiedad cpc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpc(String value) {
        this.cpc = value;
    }

    /**
     * Obtiene el valor de la propiedad q825.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQ825() {
        return q825;
    }

    /**
     * Define el valor de la propiedad q825.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQ825(String value) {
        this.q825 = value;
    }

    /**
     * Obtiene el valor de la propiedad displayInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayInfo() {
        return displayInfo;
    }

    /**
     * Define el valor de la propiedad displayInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayInfo(String value) {
        this.displayInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad displayFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFlag() {
        return displayFlag;
    }

    /**
     * Define el valor de la propiedad displayFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFlag(String value) {
        this.displayFlag = value;
    }

}
