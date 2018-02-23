
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para C2CGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="C2CGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callingEnterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calledEnterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c2cGroupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C2CGroup", propOrder = {
    "callingEnterpriseID",
    "calledEnterpriseID",
    "companyCode",
    "c2CGroupDesc"
})
public class C2CGroup {

    protected String callingEnterpriseID;
    protected String calledEnterpriseID;
    protected String companyCode;
    @XmlElement(name = "c2cGroupDesc")
    protected String c2CGroupDesc;

    /**
     * Obtiene el valor de la propiedad callingEnterpriseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingEnterpriseID() {
        return callingEnterpriseID;
    }

    /**
     * Define el valor de la propiedad callingEnterpriseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingEnterpriseID(String value) {
        this.callingEnterpriseID = value;
    }

    /**
     * Obtiene el valor de la propiedad calledEnterpriseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledEnterpriseID() {
        return calledEnterpriseID;
    }

    /**
     * Define el valor de la propiedad calledEnterpriseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledEnterpriseID(String value) {
        this.calledEnterpriseID = value;
    }

    /**
     * Obtiene el valor de la propiedad companyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Define el valor de la propiedad companyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad c2CGroupDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC2CGroupDesc() {
        return c2CGroupDesc;
    }

    /**
     * Define el valor de la propiedad c2CGroupDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC2CGroupDesc(String value) {
        this.c2CGroupDesc = value;
    }

}
