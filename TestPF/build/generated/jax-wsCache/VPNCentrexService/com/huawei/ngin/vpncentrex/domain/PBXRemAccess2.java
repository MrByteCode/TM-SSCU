
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PBXRemAccess2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PBXRemAccess2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxDailyRemoteCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastRemoteCallTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blackListState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blacklistTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PBXRemAccess2", propOrder = {
    "gmNumber",
    "enterpriseID",
    "remUserID",
    "maxDailyRemoteCall",
    "lastRemoteCallTime",
    "blackListState",
    "blacklistTime"
})
public class PBXRemAccess2 {

    protected String gmNumber;
    protected String enterpriseID;
    protected String remUserID;
    protected String maxDailyRemoteCall;
    protected String lastRemoteCallTime;
    protected String blackListState;
    protected String blacklistTime;

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
     * Obtiene el valor de la propiedad remUserID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemUserID() {
        return remUserID;
    }

    /**
     * Define el valor de la propiedad remUserID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemUserID(String value) {
        this.remUserID = value;
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
     * Obtiene el valor de la propiedad lastRemoteCallTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRemoteCallTime() {
        return lastRemoteCallTime;
    }

    /**
     * Define el valor de la propiedad lastRemoteCallTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRemoteCallTime(String value) {
        this.lastRemoteCallTime = value;
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

}
