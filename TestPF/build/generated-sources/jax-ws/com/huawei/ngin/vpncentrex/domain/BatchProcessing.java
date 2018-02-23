
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BatchProcessing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BatchProcessing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callConsumption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicPhoneScreening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialResProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchProcessing", propOrder = {
    "enterpriseID",
    "groupID",
    "modifyType",
    "callConsumption",
    "publicPhoneScreening",
    "profileID",
    "specialResProfileID",
    "consumptionLimit"
})
public class BatchProcessing {

    protected String enterpriseID;
    protected String groupID;
    protected String modifyType;
    protected String callConsumption;
    protected String publicPhoneScreening;
    protected String profileID;
    protected String specialResProfileID;
    protected String consumptionLimit;

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
     * Obtiene el valor de la propiedad groupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Define el valor de la propiedad groupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyType() {
        return modifyType;
    }

    /**
     * Define el valor de la propiedad modifyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyType(String value) {
        this.modifyType = value;
    }

    /**
     * Obtiene el valor de la propiedad callConsumption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallConsumption() {
        return callConsumption;
    }

    /**
     * Define el valor de la propiedad callConsumption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallConsumption(String value) {
        this.callConsumption = value;
    }

    /**
     * Obtiene el valor de la propiedad publicPhoneScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicPhoneScreening() {
        return publicPhoneScreening;
    }

    /**
     * Define el valor de la propiedad publicPhoneScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicPhoneScreening(String value) {
        this.publicPhoneScreening = value;
    }

    /**
     * Obtiene el valor de la propiedad profileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Define el valor de la propiedad profileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Obtiene el valor de la propiedad specialResProfileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialResProfileID() {
        return specialResProfileID;
    }

    /**
     * Define el valor de la propiedad specialResProfileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialResProfileID(String value) {
        this.specialResProfileID = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumptionLimit() {
        return consumptionLimit;
    }

    /**
     * Define el valor de la propiedad consumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumptionLimit(String value) {
        this.consumptionLimit = value;
    }

}
