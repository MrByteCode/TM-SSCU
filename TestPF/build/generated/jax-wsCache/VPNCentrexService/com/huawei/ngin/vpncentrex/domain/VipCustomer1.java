
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VipCustomer1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VipCustomer1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldVipCustomerPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vipCustomerPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VipCustomer1", propOrder = {
    "enterpriseID",
    "fullNumber",
    "modifyType",
    "oldVipCustomerPIN",
    "vipCustomerPIN"
})
public class VipCustomer1 {

    protected String enterpriseID;
    protected String fullNumber;
    protected String modifyType;
    protected String oldVipCustomerPIN;
    protected String vipCustomerPIN;

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
     * Obtiene el valor de la propiedad fullNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNumber() {
        return fullNumber;
    }

    /**
     * Define el valor de la propiedad fullNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNumber(String value) {
        this.fullNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyType() {
        return modifyType;
    }

    /**
     * Define el valor de la propiedad modifyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyType(String value) {
        this.modifyType = value;
    }

    /**
     * Obtiene el valor de la propiedad oldVipCustomerPIN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldVipCustomerPIN() {
        return oldVipCustomerPIN;
    }

    /**
     * Define el valor de la propiedad oldVipCustomerPIN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldVipCustomerPIN(String value) {
        this.oldVipCustomerPIN = value;
    }

    /**
     * Obtiene el valor de la propiedad vipCustomerPIN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipCustomerPIN() {
        return vipCustomerPIN;
    }

    /**
     * Define el valor de la propiedad vipCustomerPIN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipCustomerPIN(String value) {
        this.vipCustomerPIN = value;
    }

}
