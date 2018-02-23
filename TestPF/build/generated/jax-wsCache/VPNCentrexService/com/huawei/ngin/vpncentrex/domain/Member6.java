
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Member6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Member6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="memCentrexFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memVPNFuncFlagExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blackListState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oneNumberListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member6", propOrder = {
    "fullNumber",
    "enterpriseID",
    "enterpriseName",
    "groupID",
    "groupName",
    "profileID",
    "profileName",
    "userID",
    "userName",
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
    "memCentrexFuncFlag",
    "memVPNFuncFlagExt",
    "huntingListID",
    "blackListState",
    "oneNumberListID"
})
public class Member6 {

    protected String fullNumber;
    protected String enterpriseID;
    protected String enterpriseName;
    protected String groupID;
    protected String groupName;
    protected String profileID;
    protected String profileName;
    protected String userID;
    protected String userName;
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
    protected String memCentrexFuncFlag;
    protected String memVPNFuncFlagExt;
    protected String huntingListID;
    protected String blackListState;
    protected String oneNumberListID;

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
     * Obtiene el valor de la propiedad profileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Define el valor de la propiedad profileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
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

}
