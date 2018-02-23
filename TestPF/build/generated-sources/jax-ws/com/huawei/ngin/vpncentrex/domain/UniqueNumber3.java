
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UniqueNumber3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UniqueNumber3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uniqueNumberListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privateUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueNumber3", propOrder = {
    "enterpriseID",
    "groupID",
    "uniqueNumberListID",
    "privateUniqueNumber",
    "publicUniqueNumber"
})
public class UniqueNumber3 {

    protected String enterpriseID;
    protected String groupID;
    protected String uniqueNumberListID;
    protected String privateUniqueNumber;
    protected String publicUniqueNumber;

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

}
