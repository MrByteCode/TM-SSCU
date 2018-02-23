
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GSharedInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GSharedInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="administrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gSharedFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextBalanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GSharedInfo", propOrder = {
    "administrator",
    "gSharedFuncFlag",
    "threshold",
    "balanceDate",
    "nextBalanceDate"
})
public class GSharedInfo {

    protected String administrator;
    protected String gSharedFuncFlag;
    protected String threshold;
    protected String balanceDate;
    protected String nextBalanceDate;

    /**
     * Obtiene el valor de la propiedad administrator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrator() {
        return administrator;
    }

    /**
     * Define el valor de la propiedad administrator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrator(String value) {
        this.administrator = value;
    }

    /**
     * Obtiene el valor de la propiedad gSharedFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSharedFuncFlag() {
        return gSharedFuncFlag;
    }

    /**
     * Define el valor de la propiedad gSharedFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSharedFuncFlag(String value) {
        this.gSharedFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad threshold.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreshold() {
        return threshold;
    }

    /**
     * Define el valor de la propiedad threshold.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreshold(String value) {
        this.threshold = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceDate() {
        return balanceDate;
    }

    /**
     * Define el valor de la propiedad balanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceDate(String value) {
        this.balanceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad nextBalanceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextBalanceDate() {
        return nextBalanceDate;
    }

    /**
     * Define el valor de la propiedad nextBalanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextBalanceDate(String value) {
        this.nextBalanceDate = value;
    }

}
