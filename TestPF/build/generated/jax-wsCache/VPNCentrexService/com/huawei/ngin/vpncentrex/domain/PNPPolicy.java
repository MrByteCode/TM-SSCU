
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PNPPolicy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PNPPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnpPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnpPolicyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNPPolicy", propOrder = {
    "enterpriseID",
    "pnpPolicyID",
    "pnpPolicyDesc"
})
public class PNPPolicy {

    protected String enterpriseID;
    protected String pnpPolicyID;
    protected String pnpPolicyDesc;

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
     * Obtiene el valor de la propiedad pnpPolicyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpPolicyID() {
        return pnpPolicyID;
    }

    /**
     * Define el valor de la propiedad pnpPolicyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpPolicyID(String value) {
        this.pnpPolicyID = value;
    }

    /**
     * Obtiene el valor de la propiedad pnpPolicyDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpPolicyDesc() {
        return pnpPolicyDesc;
    }

    /**
     * Define el valor de la propiedad pnpPolicyDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpPolicyDesc(String value) {
        this.pnpPolicyDesc = value;
    }

}
