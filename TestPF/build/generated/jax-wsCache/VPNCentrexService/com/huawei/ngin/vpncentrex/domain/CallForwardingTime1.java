
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CallForwardingTime1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CallForwardingTime1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callForwardingTimeItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwdTimeNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginWeekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endWeekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginYearDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endYearDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallForwardingTime1", propOrder = {
    "enterpriseID",
    "fullNumber",
    "callForwardingTimeItemID",
    "fwdTimeNum",
    "timeType",
    "beginWeekDay",
    "endWeekDay",
    "beginYearDay",
    "endYearDay",
    "beginTime",
    "endTime",
    "description"
})
public class CallForwardingTime1 {

    protected String enterpriseID;
    protected String fullNumber;
    protected String callForwardingTimeItemID;
    protected String fwdTimeNum;
    protected String timeType;
    protected String beginWeekDay;
    protected String endWeekDay;
    protected String beginYearDay;
    protected String endYearDay;
    protected String beginTime;
    protected String endTime;
    protected String description;

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
     * Obtiene el valor de la propiedad callForwardingTimeItemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardingTimeItemID() {
        return callForwardingTimeItemID;
    }

    /**
     * Define el valor de la propiedad callForwardingTimeItemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardingTimeItemID(String value) {
        this.callForwardingTimeItemID = value;
    }

    /**
     * Obtiene el valor de la propiedad fwdTimeNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdTimeNum() {
        return fwdTimeNum;
    }

    /**
     * Define el valor de la propiedad fwdTimeNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdTimeNum(String value) {
        this.fwdTimeNum = value;
    }

    /**
     * Obtiene el valor de la propiedad timeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeType() {
        return timeType;
    }

    /**
     * Define el valor de la propiedad timeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeType(String value) {
        this.timeType = value;
    }

    /**
     * Obtiene el valor de la propiedad beginWeekDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginWeekDay() {
        return beginWeekDay;
    }

    /**
     * Define el valor de la propiedad beginWeekDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginWeekDay(String value) {
        this.beginWeekDay = value;
    }

    /**
     * Obtiene el valor de la propiedad endWeekDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndWeekDay() {
        return endWeekDay;
    }

    /**
     * Define el valor de la propiedad endWeekDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndWeekDay(String value) {
        this.endWeekDay = value;
    }

    /**
     * Obtiene el valor de la propiedad beginYearDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginYearDay() {
        return beginYearDay;
    }

    /**
     * Define el valor de la propiedad beginYearDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginYearDay(String value) {
        this.beginYearDay = value;
    }

    /**
     * Obtiene el valor de la propiedad endYearDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndYearDay() {
        return endYearDay;
    }

    /**
     * Define el valor de la propiedad endYearDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndYearDay(String value) {
        this.endYearDay = value;
    }

    /**
     * Obtiene el valor de la propiedad beginTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * Define el valor de la propiedad beginTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginTime(String value) {
        this.beginTime = value;
    }

    /**
     * Obtiene el valor de la propiedad endTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Define el valor de la propiedad endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
