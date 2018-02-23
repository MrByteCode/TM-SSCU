
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IVPNEnterprise complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IVPNEnterprise"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ivpnEnterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ivpnenterpriseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVPNEnterprise", propOrder = {
    "ivpnEnterpriseID",
    "ivpnenterpriseName"
})
public class IVPNEnterprise {

    protected String ivpnEnterpriseID;
    protected String ivpnenterpriseName;

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
     * Obtiene el valor de la propiedad ivpnenterpriseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvpnenterpriseName() {
        return ivpnenterpriseName;
    }

    /**
     * Define el valor de la propiedad ivpnenterpriseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvpnenterpriseName(String value) {
        this.ivpnenterpriseName = value;
    }

}
