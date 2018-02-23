
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FunctionProfile1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FunctionProfile1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vpnFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vpnCentrexFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vpnFuncFlagExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vpnMMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vpnSMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vpnGPRSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionProfile1", propOrder = {
    "spID",
    "functionProfileID",
    "functionProfileName",
    "vpnFuncFlag",
    "vpnCentrexFuncFlag",
    "vpnFuncFlagExt",
    "vpnMMSFuncFlag",
    "vpnSMSFuncFlag",
    "vpnGPRSFuncFlag"
})
public class FunctionProfile1 {

    protected String spID;
    protected String functionProfileID;
    protected String functionProfileName;
    protected String vpnFuncFlag;
    protected String vpnCentrexFuncFlag;
    protected String vpnFuncFlagExt;
    protected String vpnMMSFuncFlag;
    protected String vpnSMSFuncFlag;
    protected String vpnGPRSFuncFlag;

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
     * Obtiene el valor de la propiedad functionProfileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionProfileID() {
        return functionProfileID;
    }

    /**
     * Define el valor de la propiedad functionProfileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionProfileID(String value) {
        this.functionProfileID = value;
    }

    /**
     * Obtiene el valor de la propiedad functionProfileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionProfileName() {
        return functionProfileName;
    }

    /**
     * Define el valor de la propiedad functionProfileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionProfileName(String value) {
        this.functionProfileName = value;
    }

    /**
     * Obtiene el valor de la propiedad vpnFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnFuncFlag() {
        return vpnFuncFlag;
    }

    /**
     * Define el valor de la propiedad vpnFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnFuncFlag(String value) {
        this.vpnFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad vpnCentrexFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnCentrexFuncFlag() {
        return vpnCentrexFuncFlag;
    }

    /**
     * Define el valor de la propiedad vpnCentrexFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnCentrexFuncFlag(String value) {
        this.vpnCentrexFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad vpnFuncFlagExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnFuncFlagExt() {
        return vpnFuncFlagExt;
    }

    /**
     * Define el valor de la propiedad vpnFuncFlagExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnFuncFlagExt(String value) {
        this.vpnFuncFlagExt = value;
    }

    /**
     * Obtiene el valor de la propiedad vpnMMSFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnMMSFuncFlag() {
        return vpnMMSFuncFlag;
    }

    /**
     * Define el valor de la propiedad vpnMMSFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnMMSFuncFlag(String value) {
        this.vpnMMSFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad vpnSMSFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnSMSFuncFlag() {
        return vpnSMSFuncFlag;
    }

    /**
     * Define el valor de la propiedad vpnSMSFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnSMSFuncFlag(String value) {
        this.vpnSMSFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad vpnGPRSFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnGPRSFuncFlag() {
        return vpnGPRSFuncFlag;
    }

    /**
     * Define el valor de la propiedad vpnGPRSFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnGPRSFuncFlag(String value) {
        this.vpnGPRSFuncFlag = value;
    }

}
