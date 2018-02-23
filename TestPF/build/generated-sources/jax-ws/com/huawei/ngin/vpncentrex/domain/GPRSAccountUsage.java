
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GPRSAccountUsage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GPRSAccountUsage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mGGPRSVolUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mGGPRSDurUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mGGPRSNatRoamingVolUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mGGPRSNatRoamingDurUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mGGPRSIntRoamingVolUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mGGPRSIntRoamingDurUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPRSAccountUsage", propOrder = {
    "mggprsVolUsage",
    "mggprsDurUsage",
    "mggprsNatRoamingVolUsage",
    "mggprsNatRoamingDurUsage",
    "mggprsIntRoamingVolUsage",
    "mggprsIntRoamingDurUsage"
})
public class GPRSAccountUsage {

    @XmlElement(name = "mGGPRSVolUsage")
    protected String mggprsVolUsage;
    @XmlElement(name = "mGGPRSDurUsage")
    protected String mggprsDurUsage;
    @XmlElement(name = "mGGPRSNatRoamingVolUsage")
    protected String mggprsNatRoamingVolUsage;
    @XmlElement(name = "mGGPRSNatRoamingDurUsage")
    protected String mggprsNatRoamingDurUsage;
    @XmlElement(name = "mGGPRSIntRoamingVolUsage")
    protected String mggprsIntRoamingVolUsage;
    @XmlElement(name = "mGGPRSIntRoamingDurUsage")
    protected String mggprsIntRoamingDurUsage;

    /**
     * Obtiene el valor de la propiedad mggprsVolUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSVolUsage() {
        return mggprsVolUsage;
    }

    /**
     * Define el valor de la propiedad mggprsVolUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSVolUsage(String value) {
        this.mggprsVolUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mggprsDurUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSDurUsage() {
        return mggprsDurUsage;
    }

    /**
     * Define el valor de la propiedad mggprsDurUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSDurUsage(String value) {
        this.mggprsDurUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mggprsNatRoamingVolUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSNatRoamingVolUsage() {
        return mggprsNatRoamingVolUsage;
    }

    /**
     * Define el valor de la propiedad mggprsNatRoamingVolUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSNatRoamingVolUsage(String value) {
        this.mggprsNatRoamingVolUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mggprsNatRoamingDurUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSNatRoamingDurUsage() {
        return mggprsNatRoamingDurUsage;
    }

    /**
     * Define el valor de la propiedad mggprsNatRoamingDurUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSNatRoamingDurUsage(String value) {
        this.mggprsNatRoamingDurUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mggprsIntRoamingVolUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSIntRoamingVolUsage() {
        return mggprsIntRoamingVolUsage;
    }

    /**
     * Define el valor de la propiedad mggprsIntRoamingVolUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSIntRoamingVolUsage(String value) {
        this.mggprsIntRoamingVolUsage = value;
    }

    /**
     * Obtiene el valor de la propiedad mggprsIntRoamingDurUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSIntRoamingDurUsage() {
        return mggprsIntRoamingDurUsage;
    }

    /**
     * Define el valor de la propiedad mggprsIntRoamingDurUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSIntRoamingDurUsage(String value) {
        this.mggprsIntRoamingDurUsage = value;
    }

}
