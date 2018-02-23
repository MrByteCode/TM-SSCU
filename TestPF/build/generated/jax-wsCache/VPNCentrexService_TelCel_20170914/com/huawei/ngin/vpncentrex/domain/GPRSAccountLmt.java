
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GPRSAccountLmt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GPRSAccountLmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mGGPRSVolLmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mGGPRSDurLmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mGGPRSIntRoamingVolLmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mGGPRSIntRoamingDurLmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPRSAccountLmt", propOrder = {
    "mggprsVolLmt",
    "mggprsDurLmt",
    "mggprsIntRoamingVolLmt",
    "mggprsIntRoamingDurLmt"
})
public class GPRSAccountLmt {

    @XmlElement(name = "mGGPRSVolLmt")
    protected String mggprsVolLmt;
    @XmlElement(name = "mGGPRSDurLmt")
    protected String mggprsDurLmt;
    @XmlElement(name = "mGGPRSIntRoamingVolLmt")
    protected String mggprsIntRoamingVolLmt;
    @XmlElement(name = "mGGPRSIntRoamingDurLmt")
    protected String mggprsIntRoamingDurLmt;

    /**
     * Obtiene el valor de la propiedad mggprsVolLmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSVolLmt() {
        return mggprsVolLmt;
    }

    /**
     * Define el valor de la propiedad mggprsVolLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSVolLmt(String value) {
        this.mggprsVolLmt = value;
    }

    /**
     * Obtiene el valor de la propiedad mggprsDurLmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSDurLmt() {
        return mggprsDurLmt;
    }

    /**
     * Define el valor de la propiedad mggprsDurLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSDurLmt(String value) {
        this.mggprsDurLmt = value;
    }

    /**
     * Obtiene el valor de la propiedad mggprsIntRoamingVolLmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSIntRoamingVolLmt() {
        return mggprsIntRoamingVolLmt;
    }

    /**
     * Define el valor de la propiedad mggprsIntRoamingVolLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSIntRoamingVolLmt(String value) {
        this.mggprsIntRoamingVolLmt = value;
    }

    /**
     * Obtiene el valor de la propiedad mggprsIntRoamingDurLmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGGPRSIntRoamingDurLmt() {
        return mggprsIntRoamingDurLmt;
    }

    /**
     * Define el valor de la propiedad mggprsIntRoamingDurLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGGPRSIntRoamingDurLmt(String value) {
        this.mggprsIntRoamingDurLmt = value;
    }

}
