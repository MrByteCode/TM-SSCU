
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="callingGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calledGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "callingGroupName",
    "calledGroupName"
})
public class InterGroup1 {

    protected String enterpriseID;
    protected String callingGroupID;
    protected String calledGroupID;
    protected String callingGroupName;
    protected String calledGroupName;

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
     * Obtiene el valor de la propiedad callingGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingGroupName() {
        return callingGroupName;
    }

    /**
     * Define el valor de la propiedad callingGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingGroupName(String value) {
        this.callingGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad calledGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledGroupName() {
        return calledGroupName;
    }

    /**
     * Define el valor de la propiedad calledGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledGroupName(String value) {
        this.calledGroupName = value;
    }

}
