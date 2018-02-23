
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MemberSAccountUsage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MemberSAccountUsage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mVGPRSVolUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mVGPRSDurUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mVGPRSNatRoamingVolUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mVGPRSNatRoamingDurUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mVGPRSIntRoamingVolUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mVGPRSIntRoamingDurUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberSAccountUsage", propOrder = {
    "mvgprsVolUsage",
    "mvgprsDurUsage",
    "mvgprsNatRoamingVolUsage",
    "mvgprsNatRoamingDurUsage",
    "mvgprsIntRoamingVolUsage",
    "mvgprsIntRoamingDurUsage"
})
public class MemberSAccountUsage {

    @XmlElement(name = "mVGPRSVolUsage")
    protected String mvgprsVolUsage;
    @XmlElement(name = "mVGPRSDurUsage")
    protected String mvgprsDurUsage;
    @XmlElement(name = "mVGPRSNatRoamingVolUsage")
    protected String mvgprsNatRoamingVolUsage;
    @XmlElement(name = "mVGPRSNatRoamingDurUsage")
    protected String mvgprsNatRoamingDurUsage;
    @XmlElement(name = "mVGPRSIntRoamingVolUsage")
    protected String mvgprsIntRoamingVolUsage;
    @XmlElement(name = "mVGPRSIntRoamingDurUsage")
    protected String mvgprsIntRoamingDurUsage;

    /**
     * Obtiene el valor de la propiedad mvgprsVolUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSVolUsage() {
        return mvgprsVolUsage;
    }

    /**
     * Define el valor de la propiedad mvgprsVolUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSVolUsage(String value) {
        this.mvgprsVolUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgprsDurUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSDurUsage() {
        return mvgprsDurUsage;
    }

    /**
     * Define el valor de la propiedad mvgprsDurUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSDurUsage(String value) {
        this.mvgprsDurUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgprsNatRoamingVolUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSNatRoamingVolUsage() {
        return mvgprsNatRoamingVolUsage;
    }

    /**
     * Define el valor de la propiedad mvgprsNatRoamingVolUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSNatRoamingVolUsage(String value) {
        this.mvgprsNatRoamingVolUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgprsNatRoamingDurUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSNatRoamingDurUsage() {
        return mvgprsNatRoamingDurUsage;
    }

    /**
     * Define el valor de la propiedad mvgprsNatRoamingDurUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSNatRoamingDurUsage(String value) {
        this.mvgprsNatRoamingDurUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgprsIntRoamingVolUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSIntRoamingVolUsage() {
        return mvgprsIntRoamingVolUsage;
    }

    /**
     * Define el valor de la propiedad mvgprsIntRoamingVolUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSIntRoamingVolUsage(String value) {
        this.mvgprsIntRoamingVolUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgprsIntRoamingDurUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSIntRoamingDurUsage() {
        return mvgprsIntRoamingDurUsage;
    }

    /**
     * Define el valor de la propiedad mvgprsIntRoamingDurUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSIntRoamingDurUsage(String value) {
        this.mvgprsIntRoamingDurUsage = value;
    }

}
