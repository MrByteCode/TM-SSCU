
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EntIVRMenu1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntIVRMenu1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="menuID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="menuType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="menuDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="annID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="playSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promptVoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasSubMenu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentMenuID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntIVRMenu1", propOrder = {
    "enterpriseID",
    "menuID",
    "menuType",
    "enterKey",
    "menuDesc",
    "annID",
    "playSeq",
    "destNumber",
    "promptVoiceID",
    "hasSubMenu",
    "parentMenuID"
})
public class EntIVRMenu1 {

    protected String enterpriseID;
    protected String menuID;
    protected String menuType;
    protected String enterKey;
    protected String menuDesc;
    protected String annID;
    protected String playSeq;
    protected String destNumber;
    protected String promptVoiceID;
    protected String hasSubMenu;
    protected String parentMenuID;

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
     * Obtiene el valor de la propiedad menuID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuID() {
        return menuID;
    }

    /**
     * Define el valor de la propiedad menuID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuID(String value) {
        this.menuID = value;
    }

    /**
     * Obtiene el valor de la propiedad menuType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * Define el valor de la propiedad menuType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuType(String value) {
        this.menuType = value;
    }

    /**
     * Obtiene el valor de la propiedad enterKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterKey() {
        return enterKey;
    }

    /**
     * Define el valor de la propiedad enterKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterKey(String value) {
        this.enterKey = value;
    }

    /**
     * Obtiene el valor de la propiedad menuDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuDesc() {
        return menuDesc;
    }

    /**
     * Define el valor de la propiedad menuDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuDesc(String value) {
        this.menuDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad annID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnID() {
        return annID;
    }

    /**
     * Define el valor de la propiedad annID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnID(String value) {
        this.annID = value;
    }

    /**
     * Obtiene el valor de la propiedad playSeq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaySeq() {
        return playSeq;
    }

    /**
     * Define el valor de la propiedad playSeq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaySeq(String value) {
        this.playSeq = value;
    }

    /**
     * Obtiene el valor de la propiedad destNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestNumber() {
        return destNumber;
    }

    /**
     * Define el valor de la propiedad destNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestNumber(String value) {
        this.destNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad promptVoiceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptVoiceID() {
        return promptVoiceID;
    }

    /**
     * Define el valor de la propiedad promptVoiceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptVoiceID(String value) {
        this.promptVoiceID = value;
    }

    /**
     * Obtiene el valor de la propiedad hasSubMenu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasSubMenu() {
        return hasSubMenu;
    }

    /**
     * Define el valor de la propiedad hasSubMenu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasSubMenu(String value) {
        this.hasSubMenu = value;
    }

    /**
     * Obtiene el valor de la propiedad parentMenuID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMenuID() {
        return parentMenuID;
    }

    /**
     * Define el valor de la propiedad parentMenuID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMenuID(String value) {
        this.parentMenuID = value;
    }

}
