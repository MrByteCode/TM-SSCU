
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonalHunting3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonalHunting3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callForwardingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userHuntingSeqListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unconditionalHuntingSeqListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingTimeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conditionalHuntingSeqListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalHunting3", propOrder = {
    "enterpriseID",
    "huntingListID",
    "callForwardingType",
    "huntingType",
    "userHuntingSeqListID",
    "unconditionalHuntingSeqListID",
    "huntingTimeID",
    "conditionalHuntingSeqListID",
    "noAnswerTimeout"
})
public class PersonalHunting3 {

    protected String enterpriseID;
    protected String huntingListID;
    protected String callForwardingType;
    protected String huntingType;
    protected String userHuntingSeqListID;
    protected String unconditionalHuntingSeqListID;
    protected String huntingTimeID;
    protected String conditionalHuntingSeqListID;
    protected String noAnswerTimeout;

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
     * Obtiene el valor de la propiedad callForwardingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardingType() {
        return callForwardingType;
    }

    /**
     * Define el valor de la propiedad callForwardingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardingType(String value) {
        this.callForwardingType = value;
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
     * Obtiene el valor de la propiedad unconditionalHuntingSeqListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalHuntingSeqListID() {
        return unconditionalHuntingSeqListID;
    }

    /**
     * Define el valor de la propiedad unconditionalHuntingSeqListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalHuntingSeqListID(String value) {
        this.unconditionalHuntingSeqListID = value;
    }

    /**
     * Obtiene el valor de la propiedad huntingTimeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntingTimeID() {
        return huntingTimeID;
    }

    /**
     * Define el valor de la propiedad huntingTimeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntingTimeID(String value) {
        this.huntingTimeID = value;
    }

    /**
     * Obtiene el valor de la propiedad conditionalHuntingSeqListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalHuntingSeqListID() {
        return conditionalHuntingSeqListID;
    }

    /**
     * Define el valor de la propiedad conditionalHuntingSeqListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalHuntingSeqListID(String value) {
        this.conditionalHuntingSeqListID = value;
    }

    /**
     * Obtiene el valor de la propiedad noAnswerTimeout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAnswerTimeout() {
        return noAnswerTimeout;
    }

    /**
     * Define el valor de la propiedad noAnswerTimeout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAnswerTimeout(String value) {
        this.noAnswerTimeout = value;
    }

}
