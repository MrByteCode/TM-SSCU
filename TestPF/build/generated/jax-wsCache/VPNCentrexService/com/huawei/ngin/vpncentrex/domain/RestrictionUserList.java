
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RestrictionUserList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RestrictionUserList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userListDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionUserList", propOrder = {
    "enterpriseID",
    "userListID",
    "number",
    "numberEnd",
    "screenNumType",
    "userListName",
    "userListDescription",
    "queryMode"
})
public class RestrictionUserList {

    protected String enterpriseID;
    protected String userListID;
    protected String number;
    protected String numberEnd;
    protected String screenNumType;
    protected String userListName;
    protected String userListDescription;
    protected String queryMode;

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
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad numberEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberEnd() {
        return numberEnd;
    }

    /**
     * Define el valor de la propiedad numberEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberEnd(String value) {
        this.numberEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumType() {
        return screenNumType;
    }

    /**
     * Define el valor de la propiedad screenNumType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumType(String value) {
        this.screenNumType = value;
    }

    /**
     * Obtiene el valor de la propiedad userListName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserListName() {
        return userListName;
    }

    /**
     * Define el valor de la propiedad userListName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserListName(String value) {
        this.userListName = value;
    }

    /**
     * Obtiene el valor de la propiedad userListDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserListDescription() {
        return userListDescription;
    }

    /**
     * Define el valor de la propiedad userListDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserListDescription(String value) {
        this.userListDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad queryMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryMode() {
        return queryMode;
    }

    /**
     * Define el valor de la propiedad queryMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryMode(String value) {
        this.queryMode = value;
    }

}
