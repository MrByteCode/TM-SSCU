
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Member complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Member"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profilePriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localtoIVPNsyncctrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialResProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsSpecialResProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsSpecialResProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsSpecialResProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="terminalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memCentrexFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNSMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNSMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNMMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNMMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNGprsFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdUnconNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdNoAnsNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdBusyNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voiceMailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aslCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retrieveLeaveVoiceMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialCLIPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsSpecialCLIPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="didTransMobileNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxDailyRemoteCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierCodeListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consumptionlimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsPkgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subcribeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cpc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numBasedRoutingListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oneNumberListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="softPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ringMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdNotReachNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdOffLineNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callLimitGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxSimulCCBSCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxReceiveCCBSCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curMonPkgFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curPkgActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attendantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNFuncFlagExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdAnonymousNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Member", propOrder = {
    "fullNumber",
    "enterpriseID",
    "groupID",
    "profileID",
    "profilePriority",
    "localtoIVPNsyncctrl",
    "specialResProfileID",
    "smsSpecialResProfileID",
    "mmsSpecialResProfileID",
    "gprsSpecialResProfileID",
    "pnpn",
    "userName",
    "networkType",
    "property",
    "terminalType",
    "userType",
    "status",
    "memVPNFuncFlag",
    "memVPNControlFlag",
    "huntingListID",
    "memCentrexFuncFlag",
    "memVPNSMSFuncFlag",
    "memVPNSMSControlFlag",
    "memVPNMMSFuncFlag",
    "memVPNMMSControlFlag",
    "memVPNGprsFuncFlag",
    "fwdUnconNum",
    "fwdNoAnsNum",
    "fwdBusyNum",
    "chargeType",
    "voiceMailNumber",
    "emailAddress",
    "aslCode",
    "retrieveLeaveVoiceMail",
    "specialCLIPNumber",
    "smsSpecialCLIPNumber",
    "didTransMobileNum",
    "timeZone",
    "maxDailyRemoteCall",
    "carrierID",
    "carrierType",
    "carrierCodeListID",
    "consumptionlimit",
    "gprsPkgId",
    "billingDate",
    "accessType",
    "subcribeType",
    "validStartTime",
    "validEndTime",
    "gmNumber",
    "costCode",
    "cpc",
    "numBasedRoutingListID",
    "oneNumberListID",
    "appType",
    "functionProfileID",
    "softPhoneNum",
    "ringMode",
    "fwdNotReachNum",
    "fwdOffLineNum",
    "callLimitGroupName",
    "maxSimulCCBSCalls",
    "maxReceiveCCBSCalls",
    "curMonPkgFeeType",
    "curPkgActiveDate",
    "attendantType",
    "memVPNFuncFlagExt",
    "pin",
    "fwdAnonymousNum",
    "presentedSpecialPrivateNumber",
    "presentedSpecialPublicNumber",
    "voiceMailRetrievalPublicNumber",
    "destinationNumber",
    "costDistributionCode",
    "normalProfileID"
})
public class Member {

    protected String fullNumber;
    protected String enterpriseID;
    protected String groupID;
    protected String profileID;
    protected String profilePriority;
    protected String localtoIVPNsyncctrl;
    protected String specialResProfileID;
    protected String smsSpecialResProfileID;
    protected String mmsSpecialResProfileID;
    protected String gprsSpecialResProfileID;
    protected String pnpn;
    protected String userName;
    protected String networkType;
    protected String property;
    protected String terminalType;
    protected String userType;
    protected String status;
    protected String memVPNFuncFlag;
    protected String memVPNControlFlag;
    protected String huntingListID;
    protected String memCentrexFuncFlag;
    protected String memVPNSMSFuncFlag;
    protected String memVPNSMSControlFlag;
    protected String memVPNMMSFuncFlag;
    protected String memVPNMMSControlFlag;
    protected String memVPNGprsFuncFlag;
    protected String fwdUnconNum;
    protected String fwdNoAnsNum;
    protected String fwdBusyNum;
    protected String chargeType;
    protected String voiceMailNumber;
    protected String emailAddress;
    protected String aslCode;
    protected String retrieveLeaveVoiceMail;
    protected String specialCLIPNumber;
    protected String smsSpecialCLIPNumber;
    protected String didTransMobileNum;
    protected String timeZone;
    protected String maxDailyRemoteCall;
    protected String carrierID;
    protected String carrierType;
    protected String carrierCodeListID;
    protected String consumptionlimit;
    protected String gprsPkgId;
    protected String billingDate;
    protected String accessType;
    protected String subcribeType;
    protected String validStartTime;
    protected String validEndTime;
    protected String gmNumber;
    protected String costCode;
    protected String cpc;
    protected String numBasedRoutingListID;
    protected String oneNumberListID;
    protected String appType;
    protected String functionProfileID;
    protected String softPhoneNum;
    protected String ringMode;
    protected String fwdNotReachNum;
    protected String fwdOffLineNum;
    protected String callLimitGroupName;
    protected String maxSimulCCBSCalls;
    protected String maxReceiveCCBSCalls;
    protected String curMonPkgFeeType;
    protected String curPkgActiveDate;
    protected String attendantType;
    protected String memVPNFuncFlagExt;
    protected String pin;
    protected String fwdAnonymousNum;
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
     * Obtiene el valor de la propiedad smsSpecialResProfileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsSpecialResProfileID() {
        return smsSpecialResProfileID;
    }

    /**
     * Define el valor de la propiedad smsSpecialResProfileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsSpecialResProfileID(String value) {
        this.smsSpecialResProfileID = value;
    }

    /**
     * Obtiene el valor de la propiedad mmsSpecialResProfileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsSpecialResProfileID() {
        return mmsSpecialResProfileID;
    }

    /**
     * Define el valor de la propiedad mmsSpecialResProfileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsSpecialResProfileID(String value) {
        this.mmsSpecialResProfileID = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsSpecialResProfileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsSpecialResProfileID() {
        return gprsSpecialResProfileID;
    }

    /**
     * Define el valor de la propiedad gprsSpecialResProfileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsSpecialResProfileID(String value) {
        this.gprsSpecialResProfileID = value;
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
     * Obtiene el valor de la propiedad huntingListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntingListID() {
        return huntingListID;
    }

    /**
     * Define el valor de la propiedad huntingListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntingListID(String value) {
        this.huntingListID = value;
    }

    /**
     * Obtiene el valor de la propiedad memCentrexFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemCentrexFuncFlag() {
        return memCentrexFuncFlag;
    }

    /**
     * Define el valor de la propiedad memCentrexFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemCentrexFuncFlag(String value) {
        this.memCentrexFuncFlag = value;
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
     * Obtiene el valor de la propiedad memVPNMMSFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemVPNMMSFuncFlag() {
        return memVPNMMSFuncFlag;
    }

    /**
     * Define el valor de la propiedad memVPNMMSFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemVPNMMSFuncFlag(String value) {
        this.memVPNMMSFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad memVPNMMSControlFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemVPNMMSControlFlag() {
        return memVPNMMSControlFlag;
    }

    /**
     * Define el valor de la propiedad memVPNMMSControlFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemVPNMMSControlFlag(String value) {
        this.memVPNMMSControlFlag = value;
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
     * Obtiene el valor de la propiedad fwdNoAnsNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdNoAnsNum() {
        return fwdNoAnsNum;
    }

    /**
     * Define el valor de la propiedad fwdNoAnsNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdNoAnsNum(String value) {
        this.fwdNoAnsNum = value;
    }

    /**
     * Obtiene el valor de la propiedad fwdBusyNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdBusyNum() {
        return fwdBusyNum;
    }

    /**
     * Define el valor de la propiedad fwdBusyNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdBusyNum(String value) {
        this.fwdBusyNum = value;
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
     * Obtiene el valor de la propiedad aslCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAslCode() {
        return aslCode;
    }

    /**
     * Define el valor de la propiedad aslCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAslCode(String value) {
        this.aslCode = value;
    }

    /**
     * Obtiene el valor de la propiedad retrieveLeaveVoiceMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrieveLeaveVoiceMail() {
        return retrieveLeaveVoiceMail;
    }

    /**
     * Define el valor de la propiedad retrieveLeaveVoiceMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrieveLeaveVoiceMail(String value) {
        this.retrieveLeaveVoiceMail = value;
    }

    /**
     * Obtiene el valor de la propiedad specialCLIPNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCLIPNumber() {
        return specialCLIPNumber;
    }

    /**
     * Define el valor de la propiedad specialCLIPNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCLIPNumber(String value) {
        this.specialCLIPNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad smsSpecialCLIPNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsSpecialCLIPNumber() {
        return smsSpecialCLIPNumber;
    }

    /**
     * Define el valor de la propiedad smsSpecialCLIPNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsSpecialCLIPNumber(String value) {
        this.smsSpecialCLIPNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad didTransMobileNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDidTransMobileNum() {
        return didTransMobileNum;
    }

    /**
     * Define el valor de la propiedad didTransMobileNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDidTransMobileNum(String value) {
        this.didTransMobileNum = value;
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
     * Obtiene el valor de la propiedad maxDailyRemoteCall.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDailyRemoteCall() {
        return maxDailyRemoteCall;
    }

    /**
     * Define el valor de la propiedad maxDailyRemoteCall.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDailyRemoteCall(String value) {
        this.maxDailyRemoteCall = value;
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
     * Obtiene el valor de la propiedad carrierType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierType() {
        return carrierType;
    }

    /**
     * Define el valor de la propiedad carrierType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierType(String value) {
        this.carrierType = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierCodeListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCodeListID() {
        return carrierCodeListID;
    }

    /**
     * Define el valor de la propiedad carrierCodeListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCodeListID(String value) {
        this.carrierCodeListID = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionlimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumptionlimit() {
        return consumptionlimit;
    }

    /**
     * Define el valor de la propiedad consumptionlimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumptionlimit(String value) {
        this.consumptionlimit = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsPkgId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsPkgId() {
        return gprsPkgId;
    }

    /**
     * Define el valor de la propiedad gprsPkgId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsPkgId(String value) {
        this.gprsPkgId = value;
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
     * Obtiene el valor de la propiedad accessType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * Define el valor de la propiedad accessType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessType(String value) {
        this.accessType = value;
    }

    /**
     * Obtiene el valor de la propiedad subcribeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcribeType() {
        return subcribeType;
    }

    /**
     * Define el valor de la propiedad subcribeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcribeType(String value) {
        this.subcribeType = value;
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
     * Obtiene el valor de la propiedad cpc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpc() {
        return cpc;
    }

    /**
     * Define el valor de la propiedad cpc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpc(String value) {
        this.cpc = value;
    }

    /**
     * Obtiene el valor de la propiedad numBasedRoutingListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumBasedRoutingListID() {
        return numBasedRoutingListID;
    }

    /**
     * Define el valor de la propiedad numBasedRoutingListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumBasedRoutingListID(String value) {
        this.numBasedRoutingListID = value;
    }

    /**
     * Obtiene el valor de la propiedad oneNumberListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneNumberListID() {
        return oneNumberListID;
    }

    /**
     * Define el valor de la propiedad oneNumberListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneNumberListID(String value) {
        this.oneNumberListID = value;
    }

    /**
     * Obtiene el valor de la propiedad appType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppType() {
        return appType;
    }

    /**
     * Define el valor de la propiedad appType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppType(String value) {
        this.appType = value;
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
     * Obtiene el valor de la propiedad softPhoneNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftPhoneNum() {
        return softPhoneNum;
    }

    /**
     * Define el valor de la propiedad softPhoneNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftPhoneNum(String value) {
        this.softPhoneNum = value;
    }

    /**
     * Obtiene el valor de la propiedad ringMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingMode() {
        return ringMode;
    }

    /**
     * Define el valor de la propiedad ringMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingMode(String value) {
        this.ringMode = value;
    }

    /**
     * Obtiene el valor de la propiedad fwdNotReachNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdNotReachNum() {
        return fwdNotReachNum;
    }

    /**
     * Define el valor de la propiedad fwdNotReachNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdNotReachNum(String value) {
        this.fwdNotReachNum = value;
    }

    /**
     * Obtiene el valor de la propiedad fwdOffLineNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdOffLineNum() {
        return fwdOffLineNum;
    }

    /**
     * Define el valor de la propiedad fwdOffLineNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdOffLineNum(String value) {
        this.fwdOffLineNum = value;
    }

    /**
     * Obtiene el valor de la propiedad callLimitGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallLimitGroupName() {
        return callLimitGroupName;
    }

    /**
     * Define el valor de la propiedad callLimitGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallLimitGroupName(String value) {
        this.callLimitGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad maxSimulCCBSCalls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSimulCCBSCalls() {
        return maxSimulCCBSCalls;
    }

    /**
     * Define el valor de la propiedad maxSimulCCBSCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSimulCCBSCalls(String value) {
        this.maxSimulCCBSCalls = value;
    }

    /**
     * Obtiene el valor de la propiedad maxReceiveCCBSCalls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxReceiveCCBSCalls() {
        return maxReceiveCCBSCalls;
    }

    /**
     * Define el valor de la propiedad maxReceiveCCBSCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxReceiveCCBSCalls(String value) {
        this.maxReceiveCCBSCalls = value;
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
     * Obtiene el valor de la propiedad attendantType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantType() {
        return attendantType;
    }

    /**
     * Define el valor de la propiedad attendantType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantType(String value) {
        this.attendantType = value;
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
     * Obtiene el valor de la propiedad pin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Define el valor de la propiedad pin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Obtiene el valor de la propiedad fwdAnonymousNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdAnonymousNum() {
        return fwdAnonymousNum;
    }

    /**
     * Define el valor de la propiedad fwdAnonymousNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdAnonymousNum(String value) {
        this.fwdAnonymousNum = value;
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
