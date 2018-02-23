
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FeeIndex1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeeIndex1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feeIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="areaNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chargeRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobileDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roamDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tollDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeIndex1", propOrder = {
    "feeIndex",
    "areaNo",
    "userType",
    "accountType",
    "feeName",
    "chargeRule",
    "mobileDiscount",
    "roamDiscount",
    "tollDiscount"
})
public class FeeIndex1 {

    protected String feeIndex;
    protected String areaNo;
    protected String userType;
    protected String accountType;
    protected String feeName;
    protected String chargeRule;
    protected String mobileDiscount;
    protected String roamDiscount;
    protected String tollDiscount;

    /**
     * Obtiene el valor de la propiedad feeIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeIndex() {
        return feeIndex;
    }

    /**
     * Define el valor de la propiedad feeIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeIndex(String value) {
        this.feeIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad areaNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaNo() {
        return areaNo;
    }

    /**
     * Define el valor de la propiedad areaNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaNo(String value) {
        this.areaNo = value;
    }

    /**
     * Obtiene el valor de la propiedad userType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Define el valor de la propiedad userType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Obtiene el valor de la propiedad accountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Define el valor de la propiedad accountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Obtiene el valor de la propiedad feeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeName() {
        return feeName;
    }

    /**
     * Define el valor de la propiedad feeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeName(String value) {
        this.feeName = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeRule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeRule() {
        return chargeRule;
    }

    /**
     * Define el valor de la propiedad chargeRule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeRule(String value) {
        this.chargeRule = value;
    }

    /**
     * Obtiene el valor de la propiedad mobileDiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileDiscount() {
        return mobileDiscount;
    }

    /**
     * Define el valor de la propiedad mobileDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileDiscount(String value) {
        this.mobileDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad roamDiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoamDiscount() {
        return roamDiscount;
    }

    /**
     * Define el valor de la propiedad roamDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoamDiscount(String value) {
        this.roamDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad tollDiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollDiscount() {
        return tollDiscount;
    }

    /**
     * Define el valor de la propiedad tollDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollDiscount(String value) {
        this.tollDiscount = value;
    }

}
