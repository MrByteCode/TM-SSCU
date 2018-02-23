
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Member1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Member1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profilePriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="terminalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNSMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNSMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNGprsFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdUnconNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voiceMailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNFuncFlagExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presentedSpecialPrivateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presentedSpecialPublicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voiceMailRetrievalPublicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costDistributionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Member1", propOrder = {
    "fullNumber",
    "enterpriseID",
    "groupID",
    "profileID",
    "profilePriority",
    "pnpn",
    "userName",
    "networkType",
    "terminalType",
    "userType",
    "status",
    "memVPNFuncFlag",
    "memVPNControlFlag",
    "memVPNSMSFuncFlag",
    "memVPNSMSControlFlag",
    "memVPNGprsFuncFlag",
    "fwdUnconNum",
    "chargeType",
    "voiceMailNumber",
    "emailAddress",
    "timeZone",
    "validStartTime",
    "validEndTime",
    "gmNumber",
    "memVPNFuncFlagExt",
    "presentedSpecialPrivateNumber",
    "presentedSpecialPublicNumber",
    "voiceMailRetrievalPublicNumber",
    "destinationNumber",
    "costDistributionCode",
    "normalProfileID"
})
public class Member1 {

    protected String fullNumber;
    protected String enterpriseID;
    protected String groupID;
    protected String profileID;
    protected String profilePriority;
    protected String pnpn;
    protected String userName;
    protected String networkType;
    protected String terminalType;
    protected String userType;
    protected String status;
    protected String memVPNFuncFlag;
    protected String memVPNControlFlag;
    protected String memVPNSMSFuncFlag;
    protected String memVPNSMSControlFlag;
    protected String memVPNGprsFuncFlag;
    protected String fwdUnconNum;
    protected String chargeType;
    protected String voiceMailNumber;
    protected String emailAddress;
    protected String timeZone;
    protected String validStartTime;
    protected String validEndTime;
    protected String gmNumber;
    protected String memVPNFuncFlagExt;
    protected String presentedSpecialPrivateNumber;
    protected String presentedSpecialPublicNumber;
    protected String voiceMailRetrievalPublicNumber;
    protected String destinationNumber;
    protected String costDistributionCode;
    protected String normalProfileID;

    /**
     * Obtiene el valor de la propiedad fullNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNumber() {
        return fullNumber;
    }

    /**
     * Define el valor de la propiedad fullNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNumber(String value) {
        this.fullNumber = value;
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
     * Obtiene el valor de la propiedad profilePriority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilePriority() {
        return profilePriority;
    }

    /**
     * Define el valor de la propiedad profilePriority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilePriority(String value) {
        this.profilePriority = value;
    }

    /**
     * Obtiene el valor de la propiedad pnpn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpn() {
        return pnpn;
    }

    /**
     * Define el valor de la propiedad pnpn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpn(String value) {
        this.pnpn = value;
    }

    /**
     * Obtiene el valor de la propiedad userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Define el valor de la propiedad userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtiene el valor de la propiedad networkType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Define el valor de la propiedad networkType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Define el valor de la propiedad terminalType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * Obtiene el valor de la propiedad userType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Define el valor de la propiedad userType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
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

    /**
     * Obtiene el valor de la propiedad memVPNFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemVPNFuncFlag() {
        return memVPNFuncFlag;
    }

    /**
     * Define el valor de la propiedad memVPNFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemVPNFuncFlag(String value) {
        this.memVPNFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad memVPNControlFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemVPNControlFlag() {
        return memVPNControlFlag;
    }

    /**
     * Define el valor de la propiedad memVPNControlFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemVPNControlFlag(String value) {
        this.memVPNControlFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad memVPNSMSFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemVPNSMSFuncFlag() {
        return memVPNSMSFuncFlag;
    }

    /**
     * Define el valor de la propiedad memVPNSMSFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemVPNSMSFuncFlag(String value) {
        this.memVPNSMSFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad memVPNSMSControlFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemVPNSMSControlFlag() {
        return memVPNSMSControlFlag;
    }

    /**
     * Define el valor de la propiedad memVPNSMSControlFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemVPNSMSControlFlag(String value) {
        this.memVPNSMSControlFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad memVPNGprsFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemVPNGprsFuncFlag() {
        return memVPNGprsFuncFlag;
    }

    /**
     * Define el valor de la propiedad memVPNGprsFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemVPNGprsFuncFlag(String value) {
        this.memVPNGprsFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad fwdUnconNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdUnconNum() {
        return fwdUnconNum;
    }

    /**
     * Define el valor de la propiedad fwdUnconNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdUnconNum(String value) {
        this.fwdUnconNum = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Define el valor de la propiedad chargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * Obtiene el valor de la propiedad voiceMailNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailNumber() {
        return voiceMailNumber;
    }

    /**
     * Define el valor de la propiedad voiceMailNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailNumber(String value) {
        this.voiceMailNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Define el valor de la propiedad emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
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
     * Obtiene el valor de la propiedad gmNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmNumber() {
        return gmNumber;
    }

    /**
     * Define el valor de la propiedad gmNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmNumber(String value) {
        this.gmNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad memVPNFuncFlagExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemVPNFuncFlagExt() {
        return memVPNFuncFlagExt;
    }

    /**
     * Define el valor de la propiedad memVPNFuncFlagExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemVPNFuncFlagExt(String value) {
        this.memVPNFuncFlagExt = value;
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
     * Obtiene el valor de la propiedad voiceMailRetrievalPublicNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailRetrievalPublicNumber() {
        return voiceMailRetrievalPublicNumber;
    }

    /**
     * Define el valor de la propiedad voiceMailRetrievalPublicNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailRetrievalPublicNumber(String value) {
        this.voiceMailRetrievalPublicNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationNumber() {
        return destinationNumber;
    }

    /**
     * Define el valor de la propiedad destinationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationNumber(String value) {
        this.destinationNumber = value;
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

}
