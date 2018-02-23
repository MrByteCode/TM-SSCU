
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para centrexNumber complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="centrexNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxWaitingLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="callCenterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callCenterShow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttendantRegCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttendantDeregCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "centrexNumber", propOrder = {
    "mainNumber",
    "maxWaitingLength",
    "callCenterType",
    "callCenterShow",
    "attendantRegCode",
    "attendantDeregCode"
})
public class CentrexNumber {

    protected String mainNumber;
    protected Integer maxWaitingLength;
    protected String callCenterType;
    protected String callCenterShow;
    @XmlElement(name = "AttendantRegCode")
    protected String attendantRegCode;
    @XmlElement(name = "AttendantDeregCode")
    protected String attendantDeregCode;

    /**
     * Obtiene el valor de la propiedad mainNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainNumber() {
        return mainNumber;
    }

    /**
     * Define el valor de la propiedad mainNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainNumber(String value) {
        this.mainNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad maxWaitingLength.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxWaitingLength() {
        return maxWaitingLength;
    }

    /**
     * Define el valor de la propiedad maxWaitingLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxWaitingLength(Integer value) {
        this.maxWaitingLength = value;
    }

    /**
     * Obtiene el valor de la propiedad callCenterType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCenterType() {
        return callCenterType;
    }

    /**
     * Define el valor de la propiedad callCenterType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCenterType(String value) {
        this.callCenterType = value;
    }

    /**
     * Obtiene el valor de la propiedad callCenterShow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCenterShow() {
        return callCenterShow;
    }

    /**
     * Define el valor de la propiedad callCenterShow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCenterShow(String value) {
        this.callCenterShow = value;
    }

    /**
     * Obtiene el valor de la propiedad attendantRegCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantRegCode() {
        return attendantRegCode;
    }

    /**
     * Define el valor de la propiedad attendantRegCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantRegCode(String value) {
        this.attendantRegCode = value;
    }

    /**
     * Obtiene el valor de la propiedad attendantDeregCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantDeregCode() {
        return attendantDeregCode;
    }

    /**
     * Define el valor de la propiedad attendantDeregCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantDeregCode(String value) {
        this.attendantDeregCode = value;
    }

}
