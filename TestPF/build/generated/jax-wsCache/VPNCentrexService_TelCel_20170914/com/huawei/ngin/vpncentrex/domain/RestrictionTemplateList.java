
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RestrictionTemplateList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RestrictionTemplateList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="templateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permissionTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overrideFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionTemplateList", propOrder = {
    "templateID",
    "templateName",
    "typeFlag",
    "permissionTag",
    "restItemType",
    "priority",
    "overrideFlag"
})
public class RestrictionTemplateList {

    protected String templateID;
    protected String templateName;
    protected String typeFlag;
    protected String permissionTag;
    protected String restItemType;
    protected String priority;
    protected String overrideFlag;

    /**
     * Obtiene el valor de la propiedad templateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Define el valor de la propiedad templateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

    /**
     * Obtiene el valor de la propiedad templateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Define el valor de la propiedad templateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Obtiene el valor de la propiedad typeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeFlag() {
        return typeFlag;
    }

    /**
     * Define el valor de la propiedad typeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeFlag(String value) {
        this.typeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad permissionTag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionTag() {
        return permissionTag;
    }

    /**
     * Define el valor de la propiedad permissionTag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionTag(String value) {
        this.permissionTag = value;
    }

    /**
     * Obtiene el valor de la propiedad restItemType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestItemType() {
        return restItemType;
    }

    /**
     * Define el valor de la propiedad restItemType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestItemType(String value) {
        this.restItemType = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Obtiene el valor de la propiedad overrideFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideFlag() {
        return overrideFlag;
    }

    /**
     * Define el valor de la propiedad overrideFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideFlag(String value) {
        this.overrideFlag = value;
    }

}
