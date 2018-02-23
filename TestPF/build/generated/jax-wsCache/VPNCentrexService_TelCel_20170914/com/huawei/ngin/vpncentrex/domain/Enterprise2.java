
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Enterprise2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Enterprise2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseEmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minPNPNLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxPNPNLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxGroupCodeLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minGroupCodeLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNSMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNSMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxHuntUsers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privatePayPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnpPolicyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsPrivatePayPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newBillingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNFuncFlagExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNGprsFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxWhiteListNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxBlackListNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presentedSpecialPrivateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presentedSpecialPublicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voiceMailRetrievalPrivateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reservedPublicNumberListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerControlNumberCFU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerControlNumberPersonalHunting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="onlineChargingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="normalProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enterprise2", propOrder = {
    "enterpriseID",
    "spID",
    "enterpriseName",
    "enterpriseEmailID",
    "minPNPNLen",
    "maxPNPNLen",
    "maxGroupCodeLen",
    "minGroupCodeLen",
    "activeFlag",
    "validStartTime",
    "validEndTime",
    "entVPNFuncFlag",
    "entVPNControlFlag",
    "entVPNSMSFuncFlag",
    "entVPNSMSControlFlag",
    "profileID",
    "maxHuntUsers",
    "timeZone",
    "privatePayPrefix",
    "pnpPolicyType",
    "smsPrivatePayPrefix",
    "billingDate",
    "newBillingDate",
    "entVPNFuncFlagExt",
    "entVPNGprsFuncFlag",
    "address",
    "webURL",
    "maxWhiteListNum",
    "maxBlackListNum",
    "presentedSpecialPrivateNumber",
    "presentedSpecialPublicNumber",
    "voiceMailRetrievalPrivateNumber",
    "reservedPublicNumberListID",
    "customerControlNumberCFU",
    "customerControlNumberPersonalHunting",
    "customerID",
    "onlineChargingMethod",
    "normalProfileID"
})
public class Enterprise2 {

    protected String enterpriseID;
    protected String spID;
    protected String enterpriseName;
    protected String enterpriseEmailID;
    protected String minPNPNLen;
    protected String maxPNPNLen;
    protected String maxGroupCodeLen;
    protected String minGroupCodeLen;
    protected String activeFlag;
    protected String validStartTime;
    protected String validEndTime;
    protected String entVPNFuncFlag;
    protected String entVPNControlFlag;
    protected String entVPNSMSFuncFlag;
    protected String entVPNSMSControlFlag;
    protected String profileID;
    protected String maxHuntUsers;
    protected String timeZone;
    protected String privatePayPrefix;
    protected String pnpPolicyType;
    protected String smsPrivatePayPrefix;
    protected String billingDate;
    protected String newBillingDate;
    protected String entVPNFuncFlagExt;
    protected String entVPNGprsFuncFlag;
    protected String address;
    protected String webURL;
    protected String maxWhiteListNum;
    protected String maxBlackListNum;
    protected String presentedSpecialPrivateNumber;
    protected String presentedSpecialPublicNumber;
    protected String voiceMailRetrievalPrivateNumber;
    protected String reservedPublicNumberListID;
    protected String customerControlNumberCFU;
    protected String customerControlNumberPersonalHunting;
    protected String customerID;
    protected String onlineChargingMethod;
    protected String normalProfileID;

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
     * Obtiene el valor de la propiedad enterpriseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * Define el valor de la propiedad enterpriseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseName(String value) {
        this.enterpriseName = value;
    }

    /**
     * Obtiene el valor de la propiedad enterpriseEmailID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseEmailID() {
        return enterpriseEmailID;
    }

    /**
     * Define el valor de la propiedad enterpriseEmailID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseEmailID(String value) {
        this.enterpriseEmailID = value;
    }

    /**
     * Obtiene el valor de la propiedad minPNPNLen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinPNPNLen() {
        return minPNPNLen;
    }

    /**
     * Define el valor de la propiedad minPNPNLen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinPNPNLen(String value) {
        this.minPNPNLen = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPNPNLen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPNPNLen() {
        return maxPNPNLen;
    }

    /**
     * Define el valor de la propiedad maxPNPNLen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPNPNLen(String value) {
        this.maxPNPNLen = value;
    }

    /**
     * Obtiene el valor de la propiedad maxGroupCodeLen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxGroupCodeLen() {
        return maxGroupCodeLen;
    }

    /**
     * Define el valor de la propiedad maxGroupCodeLen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxGroupCodeLen(String value) {
        this.maxGroupCodeLen = value;
    }

    /**
     * Obtiene el valor de la propiedad minGroupCodeLen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinGroupCodeLen() {
        return minGroupCodeLen;
    }

    /**
     * Define el valor de la propiedad minGroupCodeLen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinGroupCodeLen(String value) {
        this.minGroupCodeLen = value;
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
     * Obtiene el valor de la propiedad entVPNControlFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntVPNControlFlag() {
        return entVPNControlFlag;
    }

    /**
     * Define el valor de la propiedad entVPNControlFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntVPNControlFlag(String value) {
        this.entVPNControlFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad entVPNSMSFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntVPNSMSFuncFlag() {
        return entVPNSMSFuncFlag;
    }

    /**
     * Define el valor de la propiedad entVPNSMSFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntVPNSMSFuncFlag(String value) {
        this.entVPNSMSFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad entVPNSMSControlFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntVPNSMSControlFlag() {
        return entVPNSMSControlFlag;
    }

    /**
     * Define el valor de la propiedad entVPNSMSControlFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntVPNSMSControlFlag(String value) {
        this.entVPNSMSControlFlag = value;
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
     * Obtiene el valor de la propiedad maxHuntUsers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxHuntUsers() {
        return maxHuntUsers;
    }

    /**
     * Define el valor de la propiedad maxHuntUsers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxHuntUsers(String value) {
        this.maxHuntUsers = value;
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
     * Obtiene el valor de la propiedad privatePayPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivatePayPrefix() {
        return privatePayPrefix;
    }

    /**
     * Define el valor de la propiedad privatePayPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivatePayPrefix(String value) {
        this.privatePayPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad pnpPolicyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpPolicyType() {
        return pnpPolicyType;
    }

    /**
     * Define el valor de la propiedad pnpPolicyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpPolicyType(String value) {
        this.pnpPolicyType = value;
    }

    /**
     * Obtiene el valor de la propiedad smsPrivatePayPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsPrivatePayPrefix() {
        return smsPrivatePayPrefix;
    }

    /**
     * Define el valor de la propiedad smsPrivatePayPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsPrivatePayPrefix(String value) {
        this.smsPrivatePayPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad billingDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDate() {
        return billingDate;
    }

    /**
     * Define el valor de la propiedad billingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDate(String value) {
        this.billingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad newBillingDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBillingDate() {
        return newBillingDate;
    }

    /**
     * Define el valor de la propiedad newBillingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBillingDate(String value) {
        this.newBillingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad entVPNFuncFlagExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntVPNFuncFlagExt() {
        return entVPNFuncFlagExt;
    }

    /**
     * Define el valor de la propiedad entVPNFuncFlagExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntVPNFuncFlagExt(String value) {
        this.entVPNFuncFlagExt = value;
    }

    /**
     * Obtiene el valor de la propiedad entVPNGprsFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntVPNGprsFuncFlag() {
        return entVPNGprsFuncFlag;
    }

    /**
     * Define el valor de la propiedad entVPNGprsFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntVPNGprsFuncFlag(String value) {
        this.entVPNGprsFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad webURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebURL() {
        return webURL;
    }

    /**
     * Define el valor de la propiedad webURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebURL(String value) {
        this.webURL = value;
    }

    /**
     * Obtiene el valor de la propiedad maxWhiteListNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWhiteListNum() {
        return maxWhiteListNum;
    }

    /**
     * Define el valor de la propiedad maxWhiteListNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWhiteListNum(String value) {
        this.maxWhiteListNum = value;
    }

    /**
     * Obtiene el valor de la propiedad maxBlackListNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxBlackListNum() {
        return maxBlackListNum;
    }

    /**
     * Define el valor de la propiedad maxBlackListNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxBlackListNum(String value) {
        this.maxBlackListNum = value;
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
     * Obtiene el valor de la propiedad voiceMailRetrievalPrivateNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailRetrievalPrivateNumber() {
        return voiceMailRetrievalPrivateNumber;
    }

    /**
     * Define el valor de la propiedad voiceMailRetrievalPrivateNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailRetrievalPrivateNumber(String value) {
        this.voiceMailRetrievalPrivateNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad reservedPublicNumberListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedPublicNumberListID() {
        return reservedPublicNumberListID;
    }

    /**
     * Define el valor de la propiedad reservedPublicNumberListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedPublicNumberListID(String value) {
        this.reservedPublicNumberListID = value;
    }

    /**
     * Obtiene el valor de la propiedad customerControlNumberCFU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerControlNumberCFU() {
        return customerControlNumberCFU;
    }

    /**
     * Define el valor de la propiedad customerControlNumberCFU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerControlNumberCFU(String value) {
        this.customerControlNumberCFU = value;
    }

    /**
     * Obtiene el valor de la propiedad customerControlNumberPersonalHunting.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerControlNumberPersonalHunting() {
        return customerControlNumberPersonalHunting;
    }

    /**
     * Define el valor de la propiedad customerControlNumberPersonalHunting.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerControlNumberPersonalHunting(String value) {
        this.customerControlNumberPersonalHunting = value;
    }

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Obtiene el valor de la propiedad onlineChargingMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineChargingMethod() {
        return onlineChargingMethod;
    }

    /**
     * Define el valor de la propiedad onlineChargingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineChargingMethod(String value) {
        this.onlineChargingMethod = value;
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

}
