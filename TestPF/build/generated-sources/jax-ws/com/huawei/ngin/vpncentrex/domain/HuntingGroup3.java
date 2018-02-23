
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HuntingGroup3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HuntingGroup3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupHuntingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingFuncType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupPickupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HuntingGroup3", propOrder = {
    "enterpriseID",
    "huntGroupID",
    "groupHuntingCode",
    "huntingFuncType",
    "groupPickupCode",
    "groupName"
})
public class HuntingGroup3 {

    protected String enterpriseID;
    protected String huntGroupID;
    protected String groupHuntingCode;
    protected String huntingFuncType;
    protected String groupPickupCode;
    protected String groupName;

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
     * Obtiene el valor de la propiedad huntGroupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntGroupID() {
        return huntGroupID;
    }

    /**
     * Define el valor de la propiedad huntGroupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntGroupID(String value) {
        this.huntGroupID = value;
    }

    /**
     * Obtiene el valor de la propiedad groupHuntingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupHuntingCode() {
        return groupHuntingCode;
    }

    /**
     * Define el valor de la propiedad groupHuntingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupHuntingCode(String value) {
        this.groupHuntingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad huntingFuncType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntingFuncType() {
        return huntingFuncType;
    }

    /**
     * Define el valor de la propiedad huntingFuncType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntingFuncType(String value) {
        this.huntingFuncType = value;
    }

    /**
     * Obtiene el valor de la propiedad groupPickupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupPickupCode() {
        return groupPickupCode;
    }

    /**
     * Define el valor de la propiedad groupPickupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupPickupCode(String value) {
        this.groupPickupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Define el valor de la propiedad groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

}
