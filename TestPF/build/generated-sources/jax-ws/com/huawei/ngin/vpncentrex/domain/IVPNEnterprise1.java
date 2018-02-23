
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IVPNEnterprise1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IVPNEnterprise1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ivpnEnterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ivpnenterpriseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ivpnDialPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVPNEnterprise1", propOrder = {
    "ivpnEnterpriseID",
    "ivpnenterpriseName",
    "activeFlag",
    "validStartTime",
    "validEndTime",
    "createTime",
    "ivpnDialPlan",
    "entVPNFuncFlag",
    "timeZone"
})
public class IVPNEnterprise1 {

    protected String ivpnEnterpriseID;
    protected String ivpnenterpriseName;
    protected String activeFlag;
    protected String validStartTime;
    protected String validEndTime;
    protected String createTime;
    protected String ivpnDialPlan;
    protected String entVPNFuncFlag;
    protected String timeZone;

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

    /**
     * Obtiene el valor de la propiedad activeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Define el valor de la propiedad activeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveFlag(String value) {
        this.activeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad validStartTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidStartTime() {
        return validStartTime;
    }

    /**
     * Define el valor de la propiedad validStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidStartTime(String value) {
        this.validStartTime = value;
    }

    /**
     * Obtiene el valor de la propiedad validEndTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidEndTime() {
        return validEndTime;
    }

    /**
     * Define el valor de la propiedad validEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidEndTime(String value) {
        this.validEndTime = value;
    }

    /**
     * Obtiene el valor de la propiedad createTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Define el valor de la propiedad createTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * Obtiene el valor de la propiedad ivpnDialPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvpnDialPlan() {
        return ivpnDialPlan;
    }

    /**
     * Define el valor de la propiedad ivpnDialPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvpnDialPlan(String value) {
        this.ivpnDialPlan = value;
    }

    /**
     * Obtiene el valor de la propiedad entVPNFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntVPNFuncFlag() {
        return entVPNFuncFlag;
    }

    /**
     * Define el valor de la propiedad entVPNFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntVPNFuncFlag(String value) {
        this.entVPNFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad timeZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Define el valor de la propiedad timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

}
