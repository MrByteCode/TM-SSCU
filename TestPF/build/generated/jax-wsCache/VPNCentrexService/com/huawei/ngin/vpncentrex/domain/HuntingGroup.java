
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HuntingGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HuntingGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupHuntingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userHuntingSeqListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultRouteNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierCodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingFuncType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupPickupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntGroupMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HuntingGroup", propOrder = {
    "enterpriseID",
    "groupHuntingCode",
    "groupName",
    "huntingType",
    "userHuntingSeqListID",
    "defaultRouteNum",
    "carrierCodeID",
    "huntingFuncType",
    "groupPickupCode",
    "huntGroupMode"
})
public class HuntingGroup {

    protected String enterpriseID;
    protected String groupHuntingCode;
    protected String groupName;
    protected String huntingType;
    protected String userHuntingSeqListID;
    protected String defaultRouteNum;
    protected String carrierCodeID;
    protected String huntingFuncType;
    protected String groupPickupCode;
    protected String huntGroupMode;

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
     * Obtiene el valor de la propiedad groupHuntingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupHuntingCode() {
        return groupHuntingCode;
    }

    /**
     * Define el valor de la propiedad groupHuntingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupHuntingCode(String value) {
        this.groupHuntingCode = value;
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
     * Obtiene el valor de la propiedad huntingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntingType() {
        return huntingType;
    }

    /**
     * Define el valor de la propiedad huntingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntingType(String value) {
        this.huntingType = value;
    }

    /**
     * Obtiene el valor de la propiedad userHuntingSeqListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHuntingSeqListID() {
        return userHuntingSeqListID;
    }

    /**
     * Define el valor de la propiedad userHuntingSeqListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHuntingSeqListID(String value) {
        this.userHuntingSeqListID = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultRouteNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRouteNum() {
        return defaultRouteNum;
    }

    /**
     * Define el valor de la propiedad defaultRouteNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRouteNum(String value) {
        this.defaultRouteNum = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierCodeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCodeID() {
        return carrierCodeID;
    }

    /**
     * Define el valor de la propiedad carrierCodeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCodeID(String value) {
        this.carrierCodeID = value;
    }

    /**
     * Obtiene el valor de la propiedad huntingFuncType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntingFuncType() {
        return huntingFuncType;
    }

    /**
     * Define el valor de la propiedad huntingFuncType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntingFuncType(String value) {
        this.huntingFuncType = value;
    }

    /**
     * Obtiene el valor de la propiedad groupPickupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupPickupCode() {
        return groupPickupCode;
    }

    /**
     * Define el valor de la propiedad groupPickupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupPickupCode(String value) {
        this.groupPickupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad huntGroupMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntGroupMode() {
        return huntGroupMode;
    }

    /**
     * Define el valor de la propiedad huntGroupMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntGroupMode(String value) {
        this.huntGroupMode = value;
    }

}
