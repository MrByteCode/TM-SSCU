
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IVPNEnterpriseRelation2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IVPNEnterpriseRelation2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ivpnEnterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ivpnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localVPNNodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVPNEnterpriseRelation2", propOrder = {
    "ivpnEnterpriseID",
    "ivpnCode",
    "localVPNNodeID",
    "enterpriseID"
})
public class IVPNEnterpriseRelation2 {

    protected String ivpnEnterpriseID;
    protected String ivpnCode;
    protected String localVPNNodeID;
    protected String enterpriseID;

    /**
     * Obtiene el valor de la propiedad ivpnEnterpriseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvpnEnterpriseID() {
        return ivpnEnterpriseID;
    }

    /**
     * Define el valor de la propiedad ivpnEnterpriseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvpnEnterpriseID(String value) {
        this.ivpnEnterpriseID = value;
    }

    /**
     * Obtiene el valor de la propiedad ivpnCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvpnCode() {
        return ivpnCode;
    }

    /**
     * Define el valor de la propiedad ivpnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvpnCode(String value) {
        this.ivpnCode = value;
    }

    /**
     * Obtiene el valor de la propiedad localVPNNodeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalVPNNodeID() {
        return localVPNNodeID;
    }

    /**
     * Define el valor de la propiedad localVPNNodeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalVPNNodeID(String value) {
        this.localVPNNodeID = value;
    }

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

}
