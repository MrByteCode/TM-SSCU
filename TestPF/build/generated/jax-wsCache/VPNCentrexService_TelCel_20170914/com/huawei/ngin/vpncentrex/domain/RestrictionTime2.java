
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RestrictionTime2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RestrictionTime2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginWeekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endWeekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginYearDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endYearDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeIDName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeIDDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionTime2", propOrder = {
    "enterpriseID",
    "timeID",
    "timeItemID",
    "timeType",
    "beginWeekDay",
    "endWeekDay",
    "beginYearDay",
    "endYearDay",
    "beginTime",
    "endTime",
    "timeIDName",
    "timeIDDescription"
})
public class RestrictionTime2 {

    protected String enterpriseID;
    protected String timeID;
    protected String timeItemID;
    protected String timeType;
    protected String beginWeekDay;
    protected String endWeekDay;
    protected String beginYearDay;
    protected String endYearDay;
    protected String beginTime;
    protected String endTime;
    protected String timeIDName;
    protected String timeIDDescription;

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
     * Obtiene el valor de la propiedad timeItemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeItemID() {
        return timeItemID;
    }

    /**
     * Define el valor de la propiedad timeItemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeItemID(String value) {
        this.timeItemID = value;
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
     * Obtiene el valor de la propiedad timeIDName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeIDName() {
        return timeIDName;
    }

    /**
     * Define el valor de la propiedad timeIDName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeIDName(String value) {
        this.timeIDName = value;
    }

    /**
     * Obtiene el valor de la propiedad timeIDDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeIDDescription() {
        return timeIDDescription;
    }

    /**
     * Define el valor de la propiedad timeIDDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeIDDescription(String value) {
        this.timeIDDescription = value;
    }

}
