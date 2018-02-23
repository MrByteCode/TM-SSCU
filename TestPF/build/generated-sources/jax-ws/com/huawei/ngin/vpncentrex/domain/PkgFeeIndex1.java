
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PkgFeeIndex1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PkgFeeIndex1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pkgFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pkgFeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pkgUseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rentFreeFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intraOnNetFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interOnNetFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offNetFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="virtualFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internationalOnNetFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interVirtualFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c2cFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forceIntraFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forceInterFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forceInternationalFeeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgFeeIndex1", propOrder = {
    "pkgFeeType",
    "pkgFeeName",
    "pkgUseFlag",
    "rentFreeFee",
    "intraOnNetFeeIndex",
    "interOnNetFeeIndex",
    "offNetFeeIndex",
    "virtualFeeIndex",
    "internationalOnNetFeeIndex",
    "interVirtualFeeIndex",
    "c2CFeeIndex",
    "forceIntraFeeIndex",
    "forceInterFeeIndex",
    "forceInternationalFeeIndex"
})
public class PkgFeeIndex1 {

    protected String pkgFeeType;
    protected String pkgFeeName;
    protected String pkgUseFlag;
    protected String rentFreeFee;
    protected String intraOnNetFeeIndex;
    protected String interOnNetFeeIndex;
    protected String offNetFeeIndex;
    protected String virtualFeeIndex;
    protected String internationalOnNetFeeIndex;
    protected String interVirtualFeeIndex;
    @XmlElement(name = "c2cFeeIndex")
    protected String c2CFeeIndex;
    protected String forceIntraFeeIndex;
    protected String forceInterFeeIndex;
    protected String forceInternationalFeeIndex;

    /**
     * Obtiene el valor de la propiedad pkgFeeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgFeeType() {
        return pkgFeeType;
    }

    /**
     * Define el valor de la propiedad pkgFeeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgFeeType(String value) {
        this.pkgFeeType = value;
    }

    /**
     * Obtiene el valor de la propiedad pkgFeeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgFeeName() {
        return pkgFeeName;
    }

    /**
     * Define el valor de la propiedad pkgFeeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgFeeName(String value) {
        this.pkgFeeName = value;
    }

    /**
     * Obtiene el valor de la propiedad pkgUseFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgUseFlag() {
        return pkgUseFlag;
    }

    /**
     * Define el valor de la propiedad pkgUseFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgUseFlag(String value) {
        this.pkgUseFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad rentFreeFee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentFreeFee() {
        return rentFreeFee;
    }

    /**
     * Define el valor de la propiedad rentFreeFee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentFreeFee(String value) {
        this.rentFreeFee = value;
    }

    /**
     * Obtiene el valor de la propiedad intraOnNetFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraOnNetFeeIndex() {
        return intraOnNetFeeIndex;
    }

    /**
     * Define el valor de la propiedad intraOnNetFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraOnNetFeeIndex(String value) {
        this.intraOnNetFeeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad interOnNetFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterOnNetFeeIndex() {
        return interOnNetFeeIndex;
    }

    /**
     * Define el valor de la propiedad interOnNetFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterOnNetFeeIndex(String value) {
        this.interOnNetFeeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad offNetFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffNetFeeIndex() {
        return offNetFeeIndex;
    }

    /**
     * Define el valor de la propiedad offNetFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffNetFeeIndex(String value) {
        this.offNetFeeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad virtualFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualFeeIndex() {
        return virtualFeeIndex;
    }

    /**
     * Define el valor de la propiedad virtualFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualFeeIndex(String value) {
        this.virtualFeeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad internationalOnNetFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalOnNetFeeIndex() {
        return internationalOnNetFeeIndex;
    }

    /**
     * Define el valor de la propiedad internationalOnNetFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalOnNetFeeIndex(String value) {
        this.internationalOnNetFeeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad interVirtualFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterVirtualFeeIndex() {
        return interVirtualFeeIndex;
    }

    /**
     * Define el valor de la propiedad interVirtualFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterVirtualFeeIndex(String value) {
        this.interVirtualFeeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad c2CFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC2CFeeIndex() {
        return c2CFeeIndex;
    }

    /**
     * Define el valor de la propiedad c2CFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC2CFeeIndex(String value) {
        this.c2CFeeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad forceIntraFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceIntraFeeIndex() {
        return forceIntraFeeIndex;
    }

    /**
     * Define el valor de la propiedad forceIntraFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceIntraFeeIndex(String value) {
        this.forceIntraFeeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad forceInterFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceInterFeeIndex() {
        return forceInterFeeIndex;
    }

    /**
     * Define el valor de la propiedad forceInterFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceInterFeeIndex(String value) {
        this.forceInterFeeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad forceInternationalFeeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceInternationalFeeIndex() {
        return forceInternationalFeeIndex;
    }

    /**
     * Define el valor de la propiedad forceInternationalFeeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceInternationalFeeIndex(String value) {
        this.forceInternationalFeeIndex = value;
    }

}
