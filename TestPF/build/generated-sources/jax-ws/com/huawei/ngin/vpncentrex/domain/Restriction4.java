
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Restriction4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Restriction4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zoneFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flowType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roamingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teleserviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holidayID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cpcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permissionTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionTemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ruleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restriction4", propOrder = {
    "enterpriseID",
    "restrictionID",
    "restItemID",
    "zoneFlag",
    "restrictionName",
    "flowType",
    "callType",
    "destinationType",
    "callFlag",
    "roamingType",
    "teleserviceType",
    "timeID",
    "holidayID",
    "userListID",
    "cpcType",
    "permissionTag",
    "restItemType",
    "restrictionTemplateID",
    "ruleName",
    "destinationTypeID"
})
public class Restriction4 {

    protected String enterpriseID;
    protected String restrictionID;
    protected String restItemID;
    protected String zoneFlag;
    protected String restrictionName;
    protected String flowType;
    protected String callType;
    protected String destinationType;
    protected String callFlag;
    protected String roamingType;
    protected String teleserviceType;
    protected String timeID;
    protected String holidayID;
    protected String userListID;
    protected String cpcType;
    protected String permissionTag;
    protected String restItemType;
    protected String restrictionTemplateID;
    protected String ruleName;
    protected String destinationTypeID;

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
     * Obtiene el valor de la propiedad restrictionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionID() {
        return restrictionID;
    }

    /**
     * Define el valor de la propiedad restrictionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionID(String value) {
        this.restrictionID = value;
    }

    /**
     * Obtiene el valor de la propiedad restItemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestItemID() {
        return restItemID;
    }

    /**
     * Define el valor de la propiedad restItemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestItemID(String value) {
        this.restItemID = value;
    }

    /**
     * Obtiene el valor de la propiedad zoneFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneFlag() {
        return zoneFlag;
    }

    /**
     * Define el valor de la propiedad zoneFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneFlag(String value) {
        this.zoneFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionName() {
        return restrictionName;
    }

    /**
     * Define el valor de la propiedad restrictionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionName(String value) {
        this.restrictionName = value;
    }

    /**
     * Obtiene el valor de la propiedad flowType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowType() {
        return flowType;
    }

    /**
     * Define el valor de la propiedad flowType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowType(String value) {
        this.flowType = value;
    }

    /**
     * Obtiene el valor de la propiedad callType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallType() {
        return callType;
    }

    /**
     * Define el valor de la propiedad callType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallType(String value) {
        this.callType = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationType() {
        return destinationType;
    }

    /**
     * Define el valor de la propiedad destinationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationType(String value) {
        this.destinationType = value;
    }

    /**
     * Obtiene el valor de la propiedad callFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFlag() {
        return callFlag;
    }

    /**
     * Define el valor de la propiedad callFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallFlag(String value) {
        this.callFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad roamingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoamingType() {
        return roamingType;
    }

    /**
     * Define el valor de la propiedad roamingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoamingType(String value) {
        this.roamingType = value;
    }

    /**
     * Obtiene el valor de la propiedad teleserviceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeleserviceType() {
        return teleserviceType;
    }

    /**
     * Define el valor de la propiedad teleserviceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeleserviceType(String value) {
        this.teleserviceType = value;
    }

    /**
     * Obtiene el valor de la propiedad timeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeID() {
        return timeID;
    }

    /**
     * Define el valor de la propiedad timeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeID(String value) {
        this.timeID = value;
    }

    /**
     * Obtiene el valor de la propiedad holidayID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayID() {
        return holidayID;
    }

    /**
     * Define el valor de la propiedad holidayID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayID(String value) {
        this.holidayID = value;
    }

    /**
     * Obtiene el valor de la propiedad userListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserListID() {
        return userListID;
    }

    /**
     * Define el valor de la propiedad userListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserListID(String value) {
        this.userListID = value;
    }

    /**
     * Obtiene el valor de la propiedad cpcType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpcType() {
        return cpcType;
    }

    /**
     * Define el valor de la propiedad cpcType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpcType(String value) {
        this.cpcType = value;
    }

    /**
     * Obtiene el valor de la propiedad permissionTag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionTag() {
        return permissionTag;
    }

    /**
     * Define el valor de la propiedad permissionTag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionTag(String value) {
        this.permissionTag = value;
    }

    /**
     * Obtiene el valor de la propiedad restItemType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestItemType() {
        return restItemType;
    }

    /**
     * Define el valor de la propiedad restItemType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestItemType(String value) {
        this.restItemType = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictionTemplateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionTemplateID() {
        return restrictionTemplateID;
    }

    /**
     * Define el valor de la propiedad restrictionTemplateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionTemplateID(String value) {
        this.restrictionTemplateID = value;
    }

    /**
     * Obtiene el valor de la propiedad ruleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Define el valor de la propiedad ruleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleName(String value) {
        this.ruleName = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationTypeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationTypeID() {
        return destinationTypeID;
    }

    /**
     * Define el valor de la propiedad destinationTypeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationTypeID(String value) {
        this.destinationTypeID = value;
    }

}
