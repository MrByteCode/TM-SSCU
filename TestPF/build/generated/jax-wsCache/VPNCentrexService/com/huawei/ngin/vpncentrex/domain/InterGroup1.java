
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InterGroup1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InterGroup1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callingGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calledGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_callingGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_calledGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterGroup1", propOrder = {
    "enterpriseID",
    "callingGroupID",
    "calledGroupID",
    "mCallingGroupName",
    "mCalledGroupName"
})
public class InterGroup1 {

    protected String enterpriseID;
    protected String callingGroupID;
    protected String calledGroupID;
    @XmlElement(name = "m_callingGroupName")
    protected String mCallingGroupName;
    @XmlElement(name = "m_calledGroupName")
    protected String mCalledGroupName;

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
     * Obtiene el valor de la propiedad callingGroupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingGroupID() {
        return callingGroupID;
    }

    /**
     * Define el valor de la propiedad callingGroupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingGroupID(String value) {
        this.callingGroupID = value;
    }

    /**
     * Obtiene el valor de la propiedad calledGroupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledGroupID() {
        return calledGroupID;
    }

    /**
     * Define el valor de la propiedad calledGroupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledGroupID(String value) {
        this.calledGroupID = value;
    }

    /**
     * Obtiene el valor de la propiedad mCallingGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCallingGroupName() {
        return mCallingGroupName;
    }

    /**
     * Define el valor de la propiedad mCallingGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCallingGroupName(String value) {
        this.mCallingGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad mCalledGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCalledGroupName() {
        return mCalledGroupName;
    }

    /**
     * Define el valor de la propiedad mCalledGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCalledGroupName(String value) {
        this.mCalledGroupName = value;
    }

}
