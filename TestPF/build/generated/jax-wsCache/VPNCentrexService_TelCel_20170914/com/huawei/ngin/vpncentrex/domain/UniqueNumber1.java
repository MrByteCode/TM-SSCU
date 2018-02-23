
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UniqueNumber1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UniqueNumber1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uniqueNumberListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privateUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultPublicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "UniqueNumber1", propOrder = {
    "enterpriseID",
    "groupID",
    "uniqueNumberListID",
    "privateUniqueNumber",
    "publicUniqueNumber",
    "defaultPublicNumber",
    "noAnswerTimeout"
})
public class UniqueNumber1 {

    protected String enterpriseID;
    protected String groupID;
    protected String uniqueNumberListID;
    protected String privateUniqueNumber;
    protected String publicUniqueNumber;
    protected String defaultPublicNumber;
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
     * Obtiene el valor de la propiedad groupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Define el valor de la propiedad groupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Obtiene el valor de la propiedad uniqueNumberListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueNumberListID() {
        return uniqueNumberListID;
    }

    /**
     * Define el valor de la propiedad uniqueNumberListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueNumberListID(String value) {
        this.uniqueNumberListID = value;
    }

    /**
     * Obtiene el valor de la propiedad privateUniqueNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateUniqueNumber() {
        return privateUniqueNumber;
    }

    /**
     * Define el valor de la propiedad privateUniqueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateUniqueNumber(String value) {
        this.privateUniqueNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad publicUniqueNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicUniqueNumber() {
        return publicUniqueNumber;
    }

    /**
     * Define el valor de la propiedad publicUniqueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicUniqueNumber(String value) {
        this.publicUniqueNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultPublicNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPublicNumber() {
        return defaultPublicNumber;
    }

    /**
     * Define el valor de la propiedad defaultPublicNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPublicNumber(String value) {
        this.defaultPublicNumber = value;
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
