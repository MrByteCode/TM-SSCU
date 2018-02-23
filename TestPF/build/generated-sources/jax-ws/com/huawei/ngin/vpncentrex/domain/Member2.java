
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Member2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Member2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localtoIVPNsyncctrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialResProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsSpecialResProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsSpecialResProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsSpecialResProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsPkgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="joinIVPNProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profilePriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="terminalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNSMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNSMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNMMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNMMSControlFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNGprsFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curBusOnNetConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curBusOffNetConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curBusVirtualConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curBusInterVirtualConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curBusIntlConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curSMSOnNetConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curSMSVirtualOnNetConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curSMSC2CConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curSMSOffNetConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curMMSOnNetConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curMMSVirtualOnNetConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curMMSC2CConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curMMSOffNetConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curGPRSVolUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curGPRSDurUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curGPRSNatRoamingVolUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curGPRSNatRoamingDurUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curGPRSIntRoamingVolUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curGPRSIntRoamingDurUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memCentrexFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdUnconNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdNoAnsNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdBusyNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voiceMailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retrieveLeaveVoiceMailNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aslCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialCLIPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsSpecialCLIPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="didTransMobileNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxDailyRemoteCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierCodeListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blackListState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blacklistTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="singleNotificationSMSStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="singleNotificationMMSStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subcribeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cpc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxSimulCCBSCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxReceiveCCBSCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numBasedRoutingListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oneNumberListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="softPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ringMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newBillingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdNotReachNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdOffLineNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callLimitGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curMonPkgFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rentLeftFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entRentLeftFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextMonPkgFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curPkgActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attendantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNFuncFlagExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curBusC2CConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curRoamingConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curSMSRoamingConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curMMSRoamingConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdAnonymousNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presentedSpecialPrivateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presentedSpecialPublicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voiceMailRetrievalPublicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costDistributionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="normalProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curBusinessTribeConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curOthersConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curSMSBusinessTribeConsumUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member2", propOrder = {
    "fullNumber",
    "enterpriseID",
    "groupID",
    "profileID",
    "localtoIVPNsyncctrl",
    "specialResProfileID",
    "smsSpecialResProfileID",
    "mmsSpecialResProfileID",
    "gprsSpecialResProfileID",
    "gprsPkgId",
    "joinIVPNProperty",
    "profilePriority",
    "pnpn",
    "userID",
    "userName",
    "networkType",
    "property",
    "terminalType",
    "userType",
    "status",
    "memVPNFuncFlag",
    "memVPNControlFlag",
    "memVPNSMSFuncFlag",
    "memVPNSMSControlFlag",
    "memVPNMMSFuncFlag",
    "memVPNMMSControlFlag",
    "memVPNGprsFuncFlag",
    "curBusOnNetConsumUsage",
    "curBusOffNetConsumUsage",
    "curBusVirtualConsumUsage",
    "curBusInterVirtualConsumUsage",
    "curBusIntlConsumUsage",
    "curSMSOnNetConsumUsage",
    "curSMSVirtualOnNetConsumUsage",
    "curSMSC2CConsumUsage",
    "curSMSOffNetConsumUsage",
    "curMMSOnNetConsumUsage",
    "curMMSVirtualOnNetConsumUsage",
    "curMMSC2CConsumUsage",
    "curMMSOffNetConsumUsage",
    "curGPRSVolUsage",
    "curGPRSDurUsage",
    "curGPRSNatRoamingVolUsage",
    "curGPRSNatRoamingDurUsage",
    "curGPRSIntRoamingVolUsage",
    "curGPRSIntRoamingDurUsage",
    "huntingListID",
    "createTime",
    "modifyTime",
    "memCentrexFuncFlag",
    "fwdUnconNum",
    "fwdNoAnsNum",
    "fwdBusyNum",
    "chargeType",
    "voiceMailNumber",
    "retrieveLeaveVoiceMailNum",
    "emailAddress",
    "countryCode",
    "aslCode",
    "specialCLIPNumber",
    "smsSpecialCLIPNumber",
    "didTransMobileNum",
    "timeZone",
    "maxDailyRemoteCall",
    "carrierType",
    "carrierCodeListID",
    "blackListState",
    "blacklistTime",
    "validStartTime",
    "validEndTime",
    "usageLimit",
    "consumptionLimit",
    "singleNotificationSMSStatus",
    "singleNotificationMMSStatus",
    "carrierID",
    "accessType",
    "subcribeType",
    "gmNumber",
    "costCode",
    "cpc",
    "maxSimulCCBSCalls",
    "maxReceiveCCBSCalls",
    "numBasedRoutingListID",
    "oneNumberListID",
    "appType",
    "functionProfileID",
    "softPhoneNum",
    "ringMode",
    "billingDate",
    "newBillingDate",
    "fwdNotReachNum",
    "fwdOffLineNum",
    "callLimitGroupName",
    "curMonPkgFeeType",
    "rentLeftFee",
    "entRentLeftFee",
    "nextMonPkgFeeType",
    "curPkgActiveDate",
    "attendantType",
    "memVPNFuncFlagExt",
    "curBusC2CConsumUsage",
    "curRoamingConsumUsage",
    "curSMSRoamingConsumUsage",
    "curMMSRoamingConsumUsage",
    "fwdAnonymousNum",
    "presentedSpecialPrivateNumber",
    "presentedSpecialPublicNumber",
    "voiceMailRetrievalPublicNumber",
    "destinationNumber",
    "costDistributionCode",
    "normalProfileID",
    "curBusinessTribeConsumUsage",
    "curOthersConsumUsage",
    "curSMSBusinessTribeConsumUsage"
})
public class Member2 {

    protected String fullNumber;
    protected String enterpriseID;
    protected String groupID;
    protected String profileID;
    protected String localtoIVPNsyncctrl;
    protected String specialResProfileID;
    protected String smsSpecialResProfileID;
    protected String mmsSpecialResProfileID;
    protected String gprsSpecialResProfileID;
    protected String gprsPkgId;
    protected String joinIVPNProperty;
    protected String profilePriority;
    protected String pnpn;
    protected String userID;
    protected String userName;
    protected String networkType;
    protected String property;
    protected String terminalType;
    protected String userType;
    protected String status;
    protected String memVPNFuncFlag;
    protected String memVPNControlFlag;
    protected String memVPNSMSFuncFlag;
    protected String memVPNSMSControlFlag;
    protected String memVPNMMSFuncFlag;
    protected String memVPNMMSControlFlag;
    protected String memVPNGprsFuncFlag;
    protected String curBusOnNetConsumUsage;
    protected String curBusOffNetConsumUsage;
    protected String curBusVirtualConsumUsage;
    protected String curBusInterVirtualConsumUsage;
    protected String curBusIntlConsumUsage;
    protected String curSMSOnNetConsumUsage;
    protected String curSMSVirtualOnNetConsumUsage;
    protected String curSMSC2CConsumUsage;
    protected String curSMSOffNetConsumUsage;
    protected String curMMSOnNetConsumUsage;
    protected String curMMSVirtualOnNetConsumUsage;
    protected String curMMSC2CConsumUsage;
    protected String curMMSOffNetConsumUsage;
    protected String curGPRSVolUsage;
    protected String curGPRSDurUsage;
    protected String curGPRSNatRoamingVolUsage;
    protected String curGPRSNatRoamingDurUsage;
    protected String curGPRSIntRoamingVolUsage;
    protected String curGPRSIntRoamingDurUsage;
    protected String huntingListID;
    protected String createTime;
    protected String modifyTime;
    protected String memCentrexFuncFlag;
    protected String fwdUnconNum;
    protected String fwdNoAnsNum;
    protected String fwdBusyNum;
    protected String chargeType;
    protected String voiceMailNumber;
    protected String retrieveLeaveVoiceMailNum;
    protected String emailAddress;
    protected String countryCode;
    protected String aslCode;
    protected String specialCLIPNumber;
    protected String smsSpecialCLIPNumber;
    protected String didTransMobileNum;
    protected String timeZone;
    protected String maxDailyRemoteCall;
    protected String carrierType;
    protected String carrierCodeListID;
    protected String blackListState;
    protected String blacklistTime;
    protected String validStartTime;
    protected String validEndTime;
    protected String usageLimit;
    protected String consumptionLimit;
    protected String singleNotificationSMSStatus;
    protected String singleNotificationMMSStatus;
    protected String carrierID;
    protected String accessType;
    protected String subcribeType;
    protected String gmNumber;
    protected String costCode;
    protected String cpc;
    protected String maxSimulCCBSCalls;
    protected String maxReceiveCCBSCalls;
    protected String numBasedRoutingListID;
    protected String oneNumberListID;
    protected String appType;
    protected String functionProfileID;
    protected String softPhoneNum;
    protected String ringMode;
    protected String billingDate;
    protected String newBillingDate;
    protected String fwdNotReachNum;
    protected String fwdOffLineNum;
    protected String callLimitGroupName;
    protected String curMonPkgFeeType;
    protected String rentLeftFee;
    protected String entRentLeftFee;
    protected String nextMonPkgFeeType;
    protected String curPkgActiveDate;
    protected String attendantType;
    protected String memVPNFuncFlagExt;
    protected String curBusC2CConsumUsage;
    protected String curRoamingConsumUsage;
    protected String curSMSRoamingConsumUsage;
    protected String curMMSRoamingConsumUsage;
    protected String fwdAnonymousNum;
    protected String presentedSpecialPrivateNumber;
    protected String presentedSpecialPublicNumber;
    protected String voiceMailRetrievalPublicNumber;
    protected String destinationNumber;
    protected String costDistributionCode;
    protected String normalProfileID;
    protected String curBusinessTribeConsumUsage;
    protected String curOthersConsumUsage;
    protected String curSMSBusinessTribeConsumUsage;

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
     * Obtiene el valor de la propiedad joinIVPNProperty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinIVPNProperty() {
        return joinIVPNProperty;
    }

    /**
     * Define el valor de la propiedad joinIVPNProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinIVPNProperty(String value) {
        this.joinIVPNProperty = value;
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
     * Obtiene el valor de la propiedad curBusOnNetConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurBusOnNetConsumUsage() {
        return curBusOnNetConsumUsage;
    }

    /**
     * Define el valor de la propiedad curBusOnNetConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurBusOnNetConsumUsage(String value) {
        this.curBusOnNetConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curBusOffNetConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurBusOffNetConsumUsage() {
        return curBusOffNetConsumUsage;
    }

    /**
     * Define el valor de la propiedad curBusOffNetConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurBusOffNetConsumUsage(String value) {
        this.curBusOffNetConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curBusVirtualConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurBusVirtualConsumUsage() {
        return curBusVirtualConsumUsage;
    }

    /**
     * Define el valor de la propiedad curBusVirtualConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurBusVirtualConsumUsage(String value) {
        this.curBusVirtualConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curBusInterVirtualConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurBusInterVirtualConsumUsage() {
        return curBusInterVirtualConsumUsage;
    }

    /**
     * Define el valor de la propiedad curBusInterVirtualConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurBusInterVirtualConsumUsage(String value) {
        this.curBusInterVirtualConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curBusIntlConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurBusIntlConsumUsage() {
        return curBusIntlConsumUsage;
    }

    /**
     * Define el valor de la propiedad curBusIntlConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurBusIntlConsumUsage(String value) {
        this.curBusIntlConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curSMSOnNetConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurSMSOnNetConsumUsage() {
        return curSMSOnNetConsumUsage;
    }

    /**
     * Define el valor de la propiedad curSMSOnNetConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurSMSOnNetConsumUsage(String value) {
        this.curSMSOnNetConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curSMSVirtualOnNetConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurSMSVirtualOnNetConsumUsage() {
        return curSMSVirtualOnNetConsumUsage;
    }

    /**
     * Define el valor de la propiedad curSMSVirtualOnNetConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurSMSVirtualOnNetConsumUsage(String value) {
        this.curSMSVirtualOnNetConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curSMSC2CConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurSMSC2CConsumUsage() {
        return curSMSC2CConsumUsage;
    }

    /**
     * Define el valor de la propiedad curSMSC2CConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurSMSC2CConsumUsage(String value) {
        this.curSMSC2CConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curSMSOffNetConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurSMSOffNetConsumUsage() {
        return curSMSOffNetConsumUsage;
    }

    /**
     * Define el valor de la propiedad curSMSOffNetConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurSMSOffNetConsumUsage(String value) {
        this.curSMSOffNetConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curMMSOnNetConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurMMSOnNetConsumUsage() {
        return curMMSOnNetConsumUsage;
    }

    /**
     * Define el valor de la propiedad curMMSOnNetConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurMMSOnNetConsumUsage(String value) {
        this.curMMSOnNetConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curMMSVirtualOnNetConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurMMSVirtualOnNetConsumUsage() {
        return curMMSVirtualOnNetConsumUsage;
    }

    /**
     * Define el valor de la propiedad curMMSVirtualOnNetConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurMMSVirtualOnNetConsumUsage(String value) {
        this.curMMSVirtualOnNetConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curMMSC2CConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurMMSC2CConsumUsage() {
        return curMMSC2CConsumUsage;
    }

    /**
     * Define el valor de la propiedad curMMSC2CConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurMMSC2CConsumUsage(String value) {
        this.curMMSC2CConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curMMSOffNetConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurMMSOffNetConsumUsage() {
        return curMMSOffNetConsumUsage;
    }

    /**
     * Define el valor de la propiedad curMMSOffNetConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurMMSOffNetConsumUsage(String value) {
        this.curMMSOffNetConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curGPRSVolUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurGPRSVolUsage() {
        return curGPRSVolUsage;
    }

    /**
     * Define el valor de la propiedad curGPRSVolUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurGPRSVolUsage(String value) {
        this.curGPRSVolUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curGPRSDurUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurGPRSDurUsage() {
        return curGPRSDurUsage;
    }

    /**
     * Define el valor de la propiedad curGPRSDurUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurGPRSDurUsage(String value) {
        this.curGPRSDurUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curGPRSNatRoamingVolUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurGPRSNatRoamingVolUsage() {
        return curGPRSNatRoamingVolUsage;
    }

    /**
     * Define el valor de la propiedad curGPRSNatRoamingVolUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurGPRSNatRoamingVolUsage(String value) {
        this.curGPRSNatRoamingVolUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curGPRSNatRoamingDurUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurGPRSNatRoamingDurUsage() {
        return curGPRSNatRoamingDurUsage;
    }

    /**
     * Define el valor de la propiedad curGPRSNatRoamingDurUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurGPRSNatRoamingDurUsage(String value) {
        this.curGPRSNatRoamingDurUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curGPRSIntRoamingVolUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurGPRSIntRoamingVolUsage() {
        return curGPRSIntRoamingVolUsage;
    }

    /**
     * Define el valor de la propiedad curGPRSIntRoamingVolUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurGPRSIntRoamingVolUsage(String value) {
        this.curGPRSIntRoamingVolUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curGPRSIntRoamingDurUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurGPRSIntRoamingDurUsage() {
        return curGPRSIntRoamingDurUsage;
    }

    /**
     * Define el valor de la propiedad curGPRSIntRoamingDurUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurGPRSIntRoamingDurUsage(String value) {
        this.curGPRSIntRoamingDurUsage = value;
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
     * Obtiene el valor de la propiedad modifyTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * Define el valor de la propiedad modifyTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyTime(String value) {
        this.modifyTime = value;
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
     * Obtiene el valor de la propiedad retrieveLeaveVoiceMailNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrieveLeaveVoiceMailNum() {
        return retrieveLeaveVoiceMailNum;
    }

    /**
     * Define el valor de la propiedad retrieveLeaveVoiceMailNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrieveLeaveVoiceMailNum(String value) {
        this.retrieveLeaveVoiceMailNum = value;
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
     * Obtiene el valor de la propiedad blackListState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackListState() {
        return blackListState;
    }

    /**
     * Define el valor de la propiedad blackListState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackListState(String value) {
        this.blackListState = value;
    }

    /**
     * Obtiene el valor de la propiedad blacklistTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlacklistTime() {
        return blacklistTime;
    }

    /**
     * Define el valor de la propiedad blacklistTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlacklistTime(String value) {
        this.blacklistTime = value;
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
     * Obtiene el valor de la propiedad usageLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageLimit() {
        return usageLimit;
    }

    /**
     * Define el valor de la propiedad usageLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageLimit(String value) {
        this.usageLimit = value;
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

    /**
     * Obtiene el valor de la propiedad singleNotificationSMSStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleNotificationSMSStatus() {
        return singleNotificationSMSStatus;
    }

    /**
     * Define el valor de la propiedad singleNotificationSMSStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleNotificationSMSStatus(String value) {
        this.singleNotificationSMSStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad singleNotificationMMSStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleNotificationMMSStatus() {
        return singleNotificationMMSStatus;
    }

    /**
     * Define el valor de la propiedad singleNotificationMMSStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleNotificationMMSStatus(String value) {
        this.singleNotificationMMSStatus = value;
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
     * Obtiene el valor de la propiedad rentLeftFee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentLeftFee() {
        return rentLeftFee;
    }

    /**
     * Define el valor de la propiedad rentLeftFee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentLeftFee(String value) {
        this.rentLeftFee = value;
    }

    /**
     * Obtiene el valor de la propiedad entRentLeftFee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntRentLeftFee() {
        return entRentLeftFee;
    }

    /**
     * Define el valor de la propiedad entRentLeftFee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntRentLeftFee(String value) {
        this.entRentLeftFee = value;
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
     * Obtiene el valor de la propiedad curBusC2CConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurBusC2CConsumUsage() {
        return curBusC2CConsumUsage;
    }

    /**
     * Define el valor de la propiedad curBusC2CConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurBusC2CConsumUsage(String value) {
        this.curBusC2CConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curRoamingConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurRoamingConsumUsage() {
        return curRoamingConsumUsage;
    }

    /**
     * Define el valor de la propiedad curRoamingConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurRoamingConsumUsage(String value) {
        this.curRoamingConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curSMSRoamingConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurSMSRoamingConsumUsage() {
        return curSMSRoamingConsumUsage;
    }

    /**
     * Define el valor de la propiedad curSMSRoamingConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurSMSRoamingConsumUsage(String value) {
        this.curSMSRoamingConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curMMSRoamingConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurMMSRoamingConsumUsage() {
        return curMMSRoamingConsumUsage;
    }

    /**
     * Define el valor de la propiedad curMMSRoamingConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurMMSRoamingConsumUsage(String value) {
        this.curMMSRoamingConsumUsage = value;
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

    /**
     * Obtiene el valor de la propiedad curBusinessTribeConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurBusinessTribeConsumUsage() {
        return curBusinessTribeConsumUsage;
    }

    /**
     * Define el valor de la propiedad curBusinessTribeConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurBusinessTribeConsumUsage(String value) {
        this.curBusinessTribeConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curOthersConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurOthersConsumUsage() {
        return curOthersConsumUsage;
    }

    /**
     * Define el valor de la propiedad curOthersConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurOthersConsumUsage(String value) {
        this.curOthersConsumUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad curSMSBusinessTribeConsumUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurSMSBusinessTribeConsumUsage() {
        return curSMSBusinessTribeConsumUsage;
    }

    /**
     * Define el valor de la propiedad curSMSBusinessTribeConsumUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurSMSBusinessTribeConsumUsage(String value) {
        this.curSMSBusinessTribeConsumUsage = value;
    }

}
