
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseEmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ivpnDialPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localtoIVPNsyncctrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minPNPNLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxPNPNLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxGroupCodeLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minGroupCodeLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chargingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="centrexFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNSMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNSMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNMMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNMMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxSNLNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxHuntingGroupNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxHuntUsers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxPickupGroupNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxPickupUsers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="helpDeskDefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privatePayPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnpPolicyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsPrivatePayPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxConcurrentCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hiredConcurrentCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fixEscapePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attendantCQTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attendantCQLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dsAttendantFailMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entDirectoryDspCfg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpHuntCQTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpHuntCQLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grpHuntCQAnnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="welcomeAnnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useMultiLanguageAnnForEnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memberCQAnnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callHoldAnnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callWaitingAnnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attendantCQAnnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="designatedPickupSAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enable24HourAttendant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InterruptionOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newBillingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comboFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curMonPkgFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextMonPkgFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curPkgActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNFuncFlagExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entVPNGprsFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobileEscapePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "countryCode",
    "enterpriseName",
    "enterpriseEmailID",
    "userID",
    "ivpnDialPlan",
    "localtoIVPNsyncctrl",
    "minPNPNLen",
    "maxPNPNLen",
    "maxGroupCodeLen",
    "minGroupCodeLen",
    "chargingNumber",
    "activeFlag",
    "validStartTime",
    "validEndTime",
    "entVPNFuncFlag",
    "entVPNControlFlag",
    "centrexFuncFlag",
    "entVPNSMSFuncFlag",
    "entVPNSMSControlFlag",
    "entVPNMMSFuncFlag",
    "entVPNMMSControlFlag",
    "createTime",
    "property",
    "profileID",
    "maxSNLNum",
    "maxHuntingGroupNum",
    "maxHuntUsers",
    "maxPickupGroupNum",
    "maxPickupUsers",
    "helpDeskDefNum",
    "timeZone",
    "privatePayPrefix",
    "pnpPolicyType",
    "smsPrivatePayPrefix",
    "maxConcurrentCall",
    "hiredConcurrentCalls",
    "carrierID",
    "fixEscapePrefix",
    "costCode",
    "attendantCQTime",
    "attendantCQLength",
    "dsAttendantFailMode",
    "entDirectoryDspCfg",
    "grpHuntCQTime",
    "grpHuntCQLength",
    "grpHuntCQAnnID",
    "welcomeAnnID",
    "useMultiLanguageAnnForEnt",
    "memberCQAnnID",
    "callHoldAnnID",
    "callWaitingAnnID",
    "attendantCQAnnID",
    "designatedPickupSAC",
    "enable24HourAttendant",
    "interruptionOption",
    "billingDate",
    "newBillingDate",
    "comboFlag",
    "operatorCode",
    "curMonPkgFeeType",
    "nextMonPkgFeeType",
    "curPkgActiveDate",
    "entVPNFuncFlagExt",
    "entVPNGprsFuncFlag",
    "mobileEscapePrefix",
    "address",
    "webURL",
    "contactInfo",
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
    protected String countryCode;
    protected String enterpriseName;
    protected String enterpriseEmailID;
    protected String userID;
    protected String ivpnDialPlan;
    protected String localtoIVPNsyncctrl;
    protected String minPNPNLen;
    protected String maxPNPNLen;
    protected String maxGroupCodeLen;
    protected String minGroupCodeLen;
    protected String chargingNumber;
    protected String activeFlag;
    protected String validStartTime;
    protected String validEndTime;
    protected String entVPNFuncFlag;
    protected String entVPNControlFlag;
    protected String centrexFuncFlag;
    protected String entVPNSMSFuncFlag;
    protected String entVPNSMSControlFlag;
    protected String entVPNMMSFuncFlag;
    protected String entVPNMMSControlFlag;
    protected String createTime;
    protected String property;
    protected String profileID;
    protected String maxSNLNum;
    protected String maxHuntingGroupNum;
    protected String maxHuntUsers;
    protected String maxPickupGroupNum;
    protected String maxPickupUsers;
    protected String helpDeskDefNum;
    protected String timeZone;
    protected String privatePayPrefix;
    protected String pnpPolicyType;
    protected String smsPrivatePayPrefix;
    protected String maxConcurrentCall;
    protected String hiredConcurrentCalls;
    protected String carrierID;
    protected String fixEscapePrefix;
    protected String costCode;
    protected String attendantCQTime;
    protected String attendantCQLength;
    protected String dsAttendantFailMode;
    protected String entDirectoryDspCfg;
    protected String grpHuntCQTime;
    protected String grpHuntCQLength;
    protected String grpHuntCQAnnID;
    protected String welcomeAnnID;
    protected String useMultiLanguageAnnForEnt;
    protected String memberCQAnnID;
    protected String callHoldAnnID;
    protected String callWaitingAnnID;
    protected String attendantCQAnnID;
    protected String designatedPickupSAC;
    protected String enable24HourAttendant;
    @XmlElement(name = "InterruptionOption")
    protected String interruptionOption;
    protected String billingDate;
    protected String newBillingDate;
    protected String comboFlag;
    protected String operatorCode;
    protected String curMonPkgFeeType;
    protected String nextMonPkgFeeType;
    protected String curPkgActiveDate;
    protected String entVPNFuncFlagExt;
    protected String entVPNGprsFuncFlag;
    protected String mobileEscapePrefix;
    protected String address;
    protected String webURL;
    protected String contactInfo;
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
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
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
     * Obtiene el valor de la propiedad userID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Define el valor de la propiedad userID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
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
     * Obtiene el valor de la propiedad chargingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargingNumber() {
        return chargingNumber;
    }

    /**
     * Define el valor de la propiedad chargingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargingNumber(String value) {
        this.chargingNumber = value;
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
     * Obtiene el valor de la propiedad centrexFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentrexFuncFlag() {
        return centrexFuncFlag;
    }

    /**
     * Define el valor de la propiedad centrexFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentrexFuncFlag(String value) {
        this.centrexFuncFlag = value;
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
     * Obtiene el valor de la propiedad entVPNMMSFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntVPNMMSFuncFlag() {
        return entVPNMMSFuncFlag;
    }

    /**
     * Define el valor de la propiedad entVPNMMSFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntVPNMMSFuncFlag(String value) {
        this.entVPNMMSFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad entVPNMMSControlFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntVPNMMSControlFlag() {
        return entVPNMMSControlFlag;
    }

    /**
     * Define el valor de la propiedad entVPNMMSControlFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntVPNMMSControlFlag(String value) {
        this.entVPNMMSControlFlag = value;
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
     * Obtiene el valor de la propiedad maxSNLNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSNLNum() {
        return maxSNLNum;
    }

    /**
     * Define el valor de la propiedad maxSNLNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSNLNum(String value) {
        this.maxSNLNum = value;
    }

    /**
     * Obtiene el valor de la propiedad maxHuntingGroupNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxHuntingGroupNum() {
        return maxHuntingGroupNum;
    }

    /**
     * Define el valor de la propiedad maxHuntingGroupNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxHuntingGroupNum(String value) {
        this.maxHuntingGroupNum = value;
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
     * Obtiene el valor de la propiedad maxPickupGroupNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPickupGroupNum() {
        return maxPickupGroupNum;
    }

    /**
     * Define el valor de la propiedad maxPickupGroupNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPickupGroupNum(String value) {
        this.maxPickupGroupNum = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPickupUsers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPickupUsers() {
        return maxPickupUsers;
    }

    /**
     * Define el valor de la propiedad maxPickupUsers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPickupUsers(String value) {
        this.maxPickupUsers = value;
    }

    /**
     * Obtiene el valor de la propiedad helpDeskDefNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpDeskDefNum() {
        return helpDeskDefNum;
    }

    /**
     * Define el valor de la propiedad helpDeskDefNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpDeskDefNum(String value) {
        this.helpDeskDefNum = value;
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
     * Obtiene el valor de la propiedad maxConcurrentCall.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurrentCall() {
        return maxConcurrentCall;
    }

    /**
     * Define el valor de la propiedad maxConcurrentCall.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurrentCall(String value) {
        this.maxConcurrentCall = value;
    }

    /**
     * Obtiene el valor de la propiedad hiredConcurrentCalls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredConcurrentCalls() {
        return hiredConcurrentCalls;
    }

    /**
     * Define el valor de la propiedad hiredConcurrentCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredConcurrentCalls(String value) {
        this.hiredConcurrentCalls = value;
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
     * Obtiene el valor de la propiedad fixEscapePrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixEscapePrefix() {
        return fixEscapePrefix;
    }

    /**
     * Define el valor de la propiedad fixEscapePrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixEscapePrefix(String value) {
        this.fixEscapePrefix = value;
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
     * Obtiene el valor de la propiedad attendantCQTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantCQTime() {
        return attendantCQTime;
    }

    /**
     * Define el valor de la propiedad attendantCQTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantCQTime(String value) {
        this.attendantCQTime = value;
    }

    /**
     * Obtiene el valor de la propiedad attendantCQLength.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantCQLength() {
        return attendantCQLength;
    }

    /**
     * Define el valor de la propiedad attendantCQLength.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantCQLength(String value) {
        this.attendantCQLength = value;
    }

    /**
     * Obtiene el valor de la propiedad dsAttendantFailMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsAttendantFailMode() {
        return dsAttendantFailMode;
    }

    /**
     * Define el valor de la propiedad dsAttendantFailMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsAttendantFailMode(String value) {
        this.dsAttendantFailMode = value;
    }

    /**
     * Obtiene el valor de la propiedad entDirectoryDspCfg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntDirectoryDspCfg() {
        return entDirectoryDspCfg;
    }

    /**
     * Define el valor de la propiedad entDirectoryDspCfg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntDirectoryDspCfg(String value) {
        this.entDirectoryDspCfg = value;
    }

    /**
     * Obtiene el valor de la propiedad grpHuntCQTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpHuntCQTime() {
        return grpHuntCQTime;
    }

    /**
     * Define el valor de la propiedad grpHuntCQTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpHuntCQTime(String value) {
        this.grpHuntCQTime = value;
    }

    /**
     * Obtiene el valor de la propiedad grpHuntCQLength.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpHuntCQLength() {
        return grpHuntCQLength;
    }

    /**
     * Define el valor de la propiedad grpHuntCQLength.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpHuntCQLength(String value) {
        this.grpHuntCQLength = value;
    }

    /**
     * Obtiene el valor de la propiedad grpHuntCQAnnID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpHuntCQAnnID() {
        return grpHuntCQAnnID;
    }

    /**
     * Define el valor de la propiedad grpHuntCQAnnID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpHuntCQAnnID(String value) {
        this.grpHuntCQAnnID = value;
    }

    /**
     * Obtiene el valor de la propiedad welcomeAnnID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeAnnID() {
        return welcomeAnnID;
    }

    /**
     * Define el valor de la propiedad welcomeAnnID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeAnnID(String value) {
        this.welcomeAnnID = value;
    }

    /**
     * Obtiene el valor de la propiedad useMultiLanguageAnnForEnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseMultiLanguageAnnForEnt() {
        return useMultiLanguageAnnForEnt;
    }

    /**
     * Define el valor de la propiedad useMultiLanguageAnnForEnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseMultiLanguageAnnForEnt(String value) {
        this.useMultiLanguageAnnForEnt = value;
    }

    /**
     * Obtiene el valor de la propiedad memberCQAnnID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCQAnnID() {
        return memberCQAnnID;
    }

    /**
     * Define el valor de la propiedad memberCQAnnID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCQAnnID(String value) {
        this.memberCQAnnID = value;
    }

    /**
     * Obtiene el valor de la propiedad callHoldAnnID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallHoldAnnID() {
        return callHoldAnnID;
    }

    /**
     * Define el valor de la propiedad callHoldAnnID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallHoldAnnID(String value) {
        this.callHoldAnnID = value;
    }

    /**
     * Obtiene el valor de la propiedad callWaitingAnnID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallWaitingAnnID() {
        return callWaitingAnnID;
    }

    /**
     * Define el valor de la propiedad callWaitingAnnID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallWaitingAnnID(String value) {
        this.callWaitingAnnID = value;
    }

    /**
     * Obtiene el valor de la propiedad attendantCQAnnID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantCQAnnID() {
        return attendantCQAnnID;
    }

    /**
     * Define el valor de la propiedad attendantCQAnnID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantCQAnnID(String value) {
        this.attendantCQAnnID = value;
    }

    /**
     * Obtiene el valor de la propiedad designatedPickupSAC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedPickupSAC() {
        return designatedPickupSAC;
    }

    /**
     * Define el valor de la propiedad designatedPickupSAC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedPickupSAC(String value) {
        this.designatedPickupSAC = value;
    }

    /**
     * Obtiene el valor de la propiedad enable24HourAttendant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnable24HourAttendant() {
        return enable24HourAttendant;
    }

    /**
     * Define el valor de la propiedad enable24HourAttendant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnable24HourAttendant(String value) {
        this.enable24HourAttendant = value;
    }

    /**
     * Obtiene el valor de la propiedad interruptionOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterruptionOption() {
        return interruptionOption;
    }

    /**
     * Define el valor de la propiedad interruptionOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterruptionOption(String value) {
        this.interruptionOption = value;
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
     * Obtiene el valor de la propiedad comboFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComboFlag() {
        return comboFlag;
    }

    /**
     * Define el valor de la propiedad comboFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComboFlag(String value) {
        this.comboFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Define el valor de la propiedad operatorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad curMonPkgFeeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurMonPkgFeeType() {
        return curMonPkgFeeType;
    }

    /**
     * Define el valor de la propiedad curMonPkgFeeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurMonPkgFeeType(String value) {
        this.curMonPkgFeeType = value;
    }

    /**
     * Obtiene el valor de la propiedad nextMonPkgFeeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextMonPkgFeeType() {
        return nextMonPkgFeeType;
    }

    /**
     * Define el valor de la propiedad nextMonPkgFeeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextMonPkgFeeType(String value) {
        this.nextMonPkgFeeType = value;
    }

    /**
     * Obtiene el valor de la propiedad curPkgActiveDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurPkgActiveDate() {
        return curPkgActiveDate;
    }

    /**
     * Define el valor de la propiedad curPkgActiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurPkgActiveDate(String value) {
        this.curPkgActiveDate = value;
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
     * Obtiene el valor de la propiedad mobileEscapePrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileEscapePrefix() {
        return mobileEscapePrefix;
    }

    /**
     * Define el valor de la propiedad mobileEscapePrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileEscapePrefix(String value) {
        this.mobileEscapePrefix = value;
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
     * Obtiene el valor de la propiedad contactInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * Define el valor de la propiedad contactInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfo(String value) {
        this.contactInfo = value;
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
