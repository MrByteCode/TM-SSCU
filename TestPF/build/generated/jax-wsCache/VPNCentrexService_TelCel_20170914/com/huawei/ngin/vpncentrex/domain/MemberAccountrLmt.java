
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MemberAccountrLmt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MemberAccountrLmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mVGPRSVolLmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mVGPRSDurLmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mVGPRSIntRoamingVolLmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mVGPRSIntRoamingDurLmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberAccountrLmt", propOrder = {
    "mvgprsVolLmt",
    "mvgprsDurLmt",
    "mvgprsIntRoamingVolLmt",
    "mvgprsIntRoamingDurLmt"
})
public class MemberAccountrLmt {

    @XmlElement(name = "mVGPRSVolLmt")
    protected String mvgprsVolLmt;
    @XmlElement(name = "mVGPRSDurLmt")
    protected String mvgprsDurLmt;
    @XmlElement(name = "mVGPRSIntRoamingVolLmt")
    protected String mvgprsIntRoamingVolLmt;
    @XmlElement(name = "mVGPRSIntRoamingDurLmt")
    protected String mvgprsIntRoamingDurLmt;

    /**
     * Obtiene el valor de la propiedad mvgprsVolLmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSVolLmt() {
        return mvgprsVolLmt;
    }

    /**
     * Define el valor de la propiedad mvgprsVolLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSVolLmt(String value) {
        this.mvgprsVolLmt = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgprsDurLmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSDurLmt() {
        return mvgprsDurLmt;
    }

    /**
     * Define el valor de la propiedad mvgprsDurLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSDurLmt(String value) {
        this.mvgprsDurLmt = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgprsIntRoamingVolLmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSIntRoamingVolLmt() {
        return mvgprsIntRoamingVolLmt;
    }

    /**
     * Define el valor de la propiedad mvgprsIntRoamingVolLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSIntRoamingVolLmt(String value) {
        this.mvgprsIntRoamingVolLmt = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgprsIntRoamingDurLmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGPRSIntRoamingDurLmt() {
        return mvgprsIntRoamingDurLmt;
    }

    /**
     * Define el valor de la propiedad mvgprsIntRoamingDurLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGPRSIntRoamingDurLmt(String value) {
        this.mvgprsIntRoamingDurLmt = value;
    }

}
