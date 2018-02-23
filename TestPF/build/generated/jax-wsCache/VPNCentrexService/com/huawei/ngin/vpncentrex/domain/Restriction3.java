
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Restriction3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Restriction3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ruleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restriction3", propOrder = {
    "enterpriseID",
    "restrictionID",
    "restItemID",
    "ruleName",
    "restrictionName",
    "queryMode"
})
public class Restriction3 {

    protected String enterpriseID;
    protected String restrictionID;
    protected String restItemID;
    protected String ruleName;
    protected String restrictionName;
    protected String queryMode;

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
     * Obtiene el valor de la propiedad restrictionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionID() {
        return restrictionID;
    }

    /**
     * Define el valor de la propiedad restrictionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionID(String value) {
        this.restrictionID = value;
    }

    /**
     * Obtiene el valor de la propiedad restItemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestItemID() {
        return restItemID;
    }

    /**
     * Define el valor de la propiedad restItemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestItemID(String value) {
        this.restItemID = value;
    }

    /**
     * Obtiene el valor de la propiedad ruleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Define el valor de la propiedad ruleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleName(String value) {
        this.ruleName = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionName() {
        return restrictionName;
    }

    /**
     * Define el valor de la propiedad restrictionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionName(String value) {
        this.restrictionName = value;
    }

    /**
     * Obtiene el valor de la propiedad queryMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryMode() {
        return queryMode;
    }

    /**
     * Define el valor de la propiedad queryMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryMode(String value) {
        this.queryMode = value;
    }

}
