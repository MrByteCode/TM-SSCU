
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Profile1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Profile1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="optionForRestriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paForZoneFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="informative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="informativeOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interruptionOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sendAlarmPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalExtNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="onNetConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offNetConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="virtualConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interOnNetConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interVirtualConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsDisplayNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsOnNetConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsVirtualOnNetConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsC2CConsumptionLimt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsOffNetConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsOnNetConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsVirtualOnNetConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsC2CConsumptionLimt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsOffNetConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsVolLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsDurLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsNatRoamingVolLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsNatRoamingDurLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsIntRoamingVolLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsIntRoamingDurLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c2cConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roamingConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsRoamingConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsRoamingConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessTribeConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="othersConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsBusinessTribeConsumptionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile1", propOrder = {
    "enterpriseID",
    "profileID",
    "profileName",
    "restrictionID",
    "discountIndex",
    "optionForRestriction",
    "paForZoneFlag",
    "languageID",
    "informative",
    "informativeOption",
    "interruptionOption",
    "sendAlarmPercentage",
    "additionalExtNumber",
    "onNetConsumptionLimit",
    "offNetConsumptionLimit",
    "virtualConsumptionLimit",
    "interOnNetConsumptionLimit",
    "interVirtualConsumptionLimit",
    "smsConsumptionLimit",
    "smsDisplayNumber",
    "smsOnNetConsumptionLimit",
    "smsVirtualOnNetConsumptionLimit",
    "smsC2CConsumptionLimt",
    "smsOffNetConsumptionLimit",
    "mmsOnNetConsumptionLimit",
    "mmsVirtualOnNetConsumptionLimit",
    "mmsC2CConsumptionLimt",
    "mmsOffNetConsumptionLimit",
    "gprsVolLimit",
    "gprsDurLimit",
    "gprsNatRoamingVolLimit",
    "gprsNatRoamingDurLimit",
    "gprsIntRoamingVolLimit",
    "gprsIntRoamingDurLimit",
    "c2CConsumptionLimit",
    "roamingConsumptionLimit",
    "smsRoamingConsumptionLimit",
    "mmsRoamingConsumptionLimit",
    "profileType",
    "businessTribeConsumptionLimit",
    "othersConsumptionLimit",
    "smsBusinessTribeConsumptionLimit"
})
public class Profile1 {

    protected String enterpriseID;
    protected String profileID;
    protected String profileName;
    protected String restrictionID;
    protected String discountIndex;
    protected String optionForRestriction;
    protected String paForZoneFlag;
    protected String languageID;
    protected String informative;
    protected String informativeOption;
    protected String interruptionOption;
    protected String sendAlarmPercentage;
    protected String additionalExtNumber;
    protected String onNetConsumptionLimit;
    protected String offNetConsumptionLimit;
    protected String virtualConsumptionLimit;
    protected String interOnNetConsumptionLimit;
    protected String interVirtualConsumptionLimit;
    protected String smsConsumptionLimit;
    protected String smsDisplayNumber;
    protected String smsOnNetConsumptionLimit;
    protected String smsVirtualOnNetConsumptionLimit;
    protected String smsC2CConsumptionLimt;
    protected String smsOffNetConsumptionLimit;
    protected String mmsOnNetConsumptionLimit;
    protected String mmsVirtualOnNetConsumptionLimit;
    protected String mmsC2CConsumptionLimt;
    protected String mmsOffNetConsumptionLimit;
    protected String gprsVolLimit;
    protected String gprsDurLimit;
    protected String gprsNatRoamingVolLimit;
    protected String gprsNatRoamingDurLimit;
    protected String gprsIntRoamingVolLimit;
    protected String gprsIntRoamingDurLimit;
    @XmlElement(name = "c2cConsumptionLimit")
    protected String c2CConsumptionLimit;
    protected String roamingConsumptionLimit;
    protected String smsRoamingConsumptionLimit;
    protected String mmsRoamingConsumptionLimit;
    protected String profileType;
    protected String businessTribeConsumptionLimit;
    protected String othersConsumptionLimit;
    protected String smsBusinessTribeConsumptionLimit;

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
     * Obtiene el valor de la propiedad discountIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountIndex() {
        return discountIndex;
    }

    /**
     * Define el valor de la propiedad discountIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountIndex(String value) {
        this.discountIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad optionForRestriction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionForRestriction() {
        return optionForRestriction;
    }

    /**
     * Define el valor de la propiedad optionForRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionForRestriction(String value) {
        this.optionForRestriction = value;
    }

    /**
     * Obtiene el valor de la propiedad paForZoneFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaForZoneFlag() {
        return paForZoneFlag;
    }

    /**
     * Define el valor de la propiedad paForZoneFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaForZoneFlag(String value) {
        this.paForZoneFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad languageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * Define el valor de la propiedad languageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * Obtiene el valor de la propiedad informative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformative() {
        return informative;
    }

    /**
     * Define el valor de la propiedad informative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformative(String value) {
        this.informative = value;
    }

    /**
     * Obtiene el valor de la propiedad informativeOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformativeOption() {
        return informativeOption;
    }

    /**
     * Define el valor de la propiedad informativeOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformativeOption(String value) {
        this.informativeOption = value;
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
     * Obtiene el valor de la propiedad sendAlarmPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendAlarmPercentage() {
        return sendAlarmPercentage;
    }

    /**
     * Define el valor de la propiedad sendAlarmPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendAlarmPercentage(String value) {
        this.sendAlarmPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalExtNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalExtNumber() {
        return additionalExtNumber;
    }

    /**
     * Define el valor de la propiedad additionalExtNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalExtNumber(String value) {
        this.additionalExtNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad onNetConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnNetConsumptionLimit() {
        return onNetConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad onNetConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnNetConsumptionLimit(String value) {
        this.onNetConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad offNetConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffNetConsumptionLimit() {
        return offNetConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad offNetConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffNetConsumptionLimit(String value) {
        this.offNetConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad virtualConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualConsumptionLimit() {
        return virtualConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad virtualConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualConsumptionLimit(String value) {
        this.virtualConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad interOnNetConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterOnNetConsumptionLimit() {
        return interOnNetConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad interOnNetConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterOnNetConsumptionLimit(String value) {
        this.interOnNetConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad interVirtualConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterVirtualConsumptionLimit() {
        return interVirtualConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad interVirtualConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterVirtualConsumptionLimit(String value) {
        this.interVirtualConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad smsConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsConsumptionLimit() {
        return smsConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad smsConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsConsumptionLimit(String value) {
        this.smsConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad smsDisplayNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsDisplayNumber() {
        return smsDisplayNumber;
    }

    /**
     * Define el valor de la propiedad smsDisplayNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsDisplayNumber(String value) {
        this.smsDisplayNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad smsOnNetConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsOnNetConsumptionLimit() {
        return smsOnNetConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad smsOnNetConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsOnNetConsumptionLimit(String value) {
        this.smsOnNetConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad smsVirtualOnNetConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsVirtualOnNetConsumptionLimit() {
        return smsVirtualOnNetConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad smsVirtualOnNetConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsVirtualOnNetConsumptionLimit(String value) {
        this.smsVirtualOnNetConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad smsC2CConsumptionLimt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsC2CConsumptionLimt() {
        return smsC2CConsumptionLimt;
    }

    /**
     * Define el valor de la propiedad smsC2CConsumptionLimt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsC2CConsumptionLimt(String value) {
        this.smsC2CConsumptionLimt = value;
    }

    /**
     * Obtiene el valor de la propiedad smsOffNetConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsOffNetConsumptionLimit() {
        return smsOffNetConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad smsOffNetConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsOffNetConsumptionLimit(String value) {
        this.smsOffNetConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad mmsOnNetConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsOnNetConsumptionLimit() {
        return mmsOnNetConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad mmsOnNetConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsOnNetConsumptionLimit(String value) {
        this.mmsOnNetConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad mmsVirtualOnNetConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsVirtualOnNetConsumptionLimit() {
        return mmsVirtualOnNetConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad mmsVirtualOnNetConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsVirtualOnNetConsumptionLimit(String value) {
        this.mmsVirtualOnNetConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad mmsC2CConsumptionLimt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsC2CConsumptionLimt() {
        return mmsC2CConsumptionLimt;
    }

    /**
     * Define el valor de la propiedad mmsC2CConsumptionLimt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsC2CConsumptionLimt(String value) {
        this.mmsC2CConsumptionLimt = value;
    }

    /**
     * Obtiene el valor de la propiedad mmsOffNetConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsOffNetConsumptionLimit() {
        return mmsOffNetConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad mmsOffNetConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsOffNetConsumptionLimit(String value) {
        this.mmsOffNetConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsVolLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsVolLimit() {
        return gprsVolLimit;
    }

    /**
     * Define el valor de la propiedad gprsVolLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsVolLimit(String value) {
        this.gprsVolLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsDurLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsDurLimit() {
        return gprsDurLimit;
    }

    /**
     * Define el valor de la propiedad gprsDurLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsDurLimit(String value) {
        this.gprsDurLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsNatRoamingVolLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsNatRoamingVolLimit() {
        return gprsNatRoamingVolLimit;
    }

    /**
     * Define el valor de la propiedad gprsNatRoamingVolLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsNatRoamingVolLimit(String value) {
        this.gprsNatRoamingVolLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsNatRoamingDurLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsNatRoamingDurLimit() {
        return gprsNatRoamingDurLimit;
    }

    /**
     * Define el valor de la propiedad gprsNatRoamingDurLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsNatRoamingDurLimit(String value) {
        this.gprsNatRoamingDurLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsIntRoamingVolLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsIntRoamingVolLimit() {
        return gprsIntRoamingVolLimit;
    }

    /**
     * Define el valor de la propiedad gprsIntRoamingVolLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsIntRoamingVolLimit(String value) {
        this.gprsIntRoamingVolLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsIntRoamingDurLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsIntRoamingDurLimit() {
        return gprsIntRoamingDurLimit;
    }

    /**
     * Define el valor de la propiedad gprsIntRoamingDurLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsIntRoamingDurLimit(String value) {
        this.gprsIntRoamingDurLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad c2CConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC2CConsumptionLimit() {
        return c2CConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad c2CConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC2CConsumptionLimit(String value) {
        this.c2CConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad roamingConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoamingConsumptionLimit() {
        return roamingConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad roamingConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoamingConsumptionLimit(String value) {
        this.roamingConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad smsRoamingConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsRoamingConsumptionLimit() {
        return smsRoamingConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad smsRoamingConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsRoamingConsumptionLimit(String value) {
        this.smsRoamingConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad mmsRoamingConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsRoamingConsumptionLimit() {
        return mmsRoamingConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad mmsRoamingConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsRoamingConsumptionLimit(String value) {
        this.mmsRoamingConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad profileType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * Define el valor de la propiedad profileType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * Obtiene el valor de la propiedad businessTribeConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTribeConsumptionLimit() {
        return businessTribeConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad businessTribeConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTribeConsumptionLimit(String value) {
        this.businessTribeConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad othersConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthersConsumptionLimit() {
        return othersConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad othersConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthersConsumptionLimit(String value) {
        this.othersConsumptionLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad smsBusinessTribeConsumptionLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsBusinessTribeConsumptionLimit() {
        return smsBusinessTribeConsumptionLimit;
    }

    /**
     * Define el valor de la propiedad smsBusinessTribeConsumptionLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsBusinessTribeConsumptionLimit(String value) {
        this.smsBusinessTribeConsumptionLimit = value;
    }

}
