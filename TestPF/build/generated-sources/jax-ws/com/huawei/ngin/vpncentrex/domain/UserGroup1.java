
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UserGroup1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UserGroup1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localtoIVPNsyncctrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpVPNFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpVPNControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpCentrexFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpVPNSMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpVPNSMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpVPNMMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpVPNMMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpVPNGprsFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnpPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnpnLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpVPNFuncFlagExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presentedSpecialPrivateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presentedSpecialPublicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costDistributionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="normalProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserGroup1", propOrder = {
    "enterpriseID",
    "groupID",
    "groupCode",
    "groupName",
    "profileID",
    "localtoIVPNsyncctrl",
    "defaultOperator",
    "timeZone",
    "grpVPNFuncFlag",
    "grpVPNControlFlag",
    "grpCentrexFuncFlag",
    "grpVPNSMSFuncFlag",
    "grpVPNSMSControlFlag",
    "grpVPNMMSFuncFlag",
    "grpVPNMMSControlFlag",
    "grpVPNGprsFuncFlag",
    "pnpPolicyID",
    "property",
    "carrierID",
    "pnpnLen",
    "costCode",
    "grpVPNFuncFlagExt",
    "presentedSpecialPrivateNumber",
    "presentedSpecialPublicNumber",
    "costDistributionCode",
    "normalProfileID",
    "status"
})
public class UserGroup1 {

    protected String enterpriseID;
    protected String groupID;
    protected String groupCode;
    protected String groupName;
    protected String profileID;
    protected String localtoIVPNsyncctrl;
    protected String defaultOperator;
    protected String timeZone;
    protected String grpVPNFuncFlag;
    protected String grpVPNControlFlag;
    protected String grpCentrexFuncFlag;
    protected String grpVPNSMSFuncFlag;
    protected String grpVPNSMSControlFlag;
    protected String grpVPNMMSFuncFlag;
    protected String grpVPNMMSControlFlag;
    protected String grpVPNGprsFuncFlag;
    protected String pnpPolicyID;
    protected String property;
    protected String carrierID;
    protected String pnpnLen;
    protected String costCode;
    protected String grpVPNFuncFlagExt;
    protected String presentedSpecialPrivateNumber;
    protected String presentedSpecialPublicNumber;
    protected String costDistributionCode;
    protected String normalProfileID;
    protected String status;

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
     * Obtiene el valor de la propiedad groupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Define el valor de la propiedad groupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Define el valor de la propiedad groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
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
     * Obtiene el valor de la propiedad localtoIVPNsyncctrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaltoIVPNsyncctrl() {
        return localtoIVPNsyncctrl;
    }

    /**
     * Define el valor de la propiedad localtoIVPNsyncctrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaltoIVPNsyncctrl(String value) {
        this.localtoIVPNsyncctrl = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultOperator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultOperator() {
        return defaultOperator;
    }

    /**
     * Define el valor de la propiedad defaultOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultOperator(String value) {
        this.defaultOperator = value;
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

    /**
     * Obtiene el valor de la propiedad grpVPNFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpVPNFuncFlag() {
        return grpVPNFuncFlag;
    }

    /**
     * Define el valor de la propiedad grpVPNFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpVPNFuncFlag(String value) {
        this.grpVPNFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad grpVPNControlFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpVPNControlFlag() {
        return grpVPNControlFlag;
    }

    /**
     * Define el valor de la propiedad grpVPNControlFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpVPNControlFlag(String value) {
        this.grpVPNControlFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad grpCentrexFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpCentrexFuncFlag() {
        return grpCentrexFuncFlag;
    }

    /**
     * Define el valor de la propiedad grpCentrexFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpCentrexFuncFlag(String value) {
        this.grpCentrexFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad grpVPNSMSFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpVPNSMSFuncFlag() {
        return grpVPNSMSFuncFlag;
    }

    /**
     * Define el valor de la propiedad grpVPNSMSFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpVPNSMSFuncFlag(String value) {
        this.grpVPNSMSFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad grpVPNSMSControlFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpVPNSMSControlFlag() {
        return grpVPNSMSControlFlag;
    }

    /**
     * Define el valor de la propiedad grpVPNSMSControlFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpVPNSMSControlFlag(String value) {
        this.grpVPNSMSControlFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad grpVPNMMSFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpVPNMMSFuncFlag() {
        return grpVPNMMSFuncFlag;
    }

    /**
     * Define el valor de la propiedad grpVPNMMSFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpVPNMMSFuncFlag(String value) {
        this.grpVPNMMSFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad grpVPNMMSControlFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpVPNMMSControlFlag() {
        return grpVPNMMSControlFlag;
    }

    /**
     * Define el valor de la propiedad grpVPNMMSControlFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpVPNMMSControlFlag(String value) {
        this.grpVPNMMSControlFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad grpVPNGprsFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpVPNGprsFuncFlag() {
        return grpVPNGprsFuncFlag;
    }

    /**
     * Define el valor de la propiedad grpVPNGprsFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpVPNGprsFuncFlag(String value) {
        this.grpVPNGprsFuncFlag = value;
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
     * Obtiene el valor de la propiedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Define el valor de la propiedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierID() {
        return carrierID;
    }

    /**
     * Define el valor de la propiedad carrierID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierID(String value) {
        this.carrierID = value;
    }

    /**
     * Obtiene el valor de la propiedad pnpnLen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpnLen() {
        return pnpnLen;
    }

    /**
     * Define el valor de la propiedad pnpnLen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpnLen(String value) {
        this.pnpnLen = value;
    }

    /**
     * Obtiene el valor de la propiedad costCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCode() {
        return costCode;
    }

    /**
     * Define el valor de la propiedad costCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCode(String value) {
        this.costCode = value;
    }

    /**
     * Obtiene el valor de la propiedad grpVPNFuncFlagExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpVPNFuncFlagExt() {
        return grpVPNFuncFlagExt;
    }

    /**
     * Define el valor de la propiedad grpVPNFuncFlagExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpVPNFuncFlagExt(String value) {
        this.grpVPNFuncFlagExt = value;
    }

    /**
     * Obtiene el valor de la propiedad presentedSpecialPrivateNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentedSpecialPrivateNumber() {
        return presentedSpecialPrivateNumber;
    }

    /**
     * Define el valor de la propiedad presentedSpecialPrivateNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentedSpecialPrivateNumber(String value) {
        this.presentedSpecialPrivateNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad presentedSpecialPublicNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentedSpecialPublicNumber() {
        return presentedSpecialPublicNumber;
    }

    /**
     * Define el valor de la propiedad presentedSpecialPublicNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentedSpecialPublicNumber(String value) {
        this.presentedSpecialPublicNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad costDistributionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostDistributionCode() {
        return costDistributionCode;
    }

    /**
     * Define el valor de la propiedad costDistributionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostDistributionCode(String value) {
        this.costDistributionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad normalProfileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalProfileID() {
        return normalProfileID;
    }

    /**
     * Define el valor de la propiedad normalProfileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalProfileID(String value) {
        this.normalProfileID = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
